package simple_proxy_test;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.om2m.core.service.CseService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import simple_proxy_test.ProxyService.adapter;

public class Activator implements BundleActivator {

	private static BundleContext context;
	/** CSE service tracker */
    private ServiceTracker<Object, Object> cseServiceTracker;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		// register a proxy CseService
		CseService hs = new adapter();
		Dictionary<String,Object>properties = new Hashtable<String,Object>();
		properties.put("proxied","true");
		context.registerService(CseService.class, hs, properties);
		
		// FindHook
		Hide hide = new Hide(context, "org.eclipse.om2m.binding.http", "simple_proxy_test");
		hide.open();
		
		// track the SCL service
        cseServiceTracker = new ServiceTracker<Object, Object>(bundleContext, CseService.class.getName(), null) {
            public void removedService(ServiceReference<Object> reference, Object service) {
                try {
                    adapter.setCse(null);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error removing SclService");
                }
            }

            public Object addingService(ServiceReference<Object> reference) {
                CseService cse = (CseService) this.context.getService(reference);
                try {
                	adapter.setCse(cse);
                } catch (Exception e) {
                    System.out.println("Error adding SclService");
                }
                return cse;
            }
        };
        // Open service trackers
        cseServiceTracker.open();		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
