package simple_proxy_test;

import java.util.Collection;
import java.util.Iterator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.hooks.service.FindHook;

public class Hide implements FindHook {
	final String hidenBundleName, proxybundleName;
	final BundleContext context;
	ServiceRegistration<?> reg;
	/*
	 * init parameter
	 */
	public Hide(BundleContext context,String hidenBundleName,String proxybundleName){
		this.context = context;
		this.hidenBundleName = hidenBundleName;	// Bundle A
		this.proxybundleName = proxybundleName;	// Proxy Bundle
		System.out.println("Proxy Bundle Name : "+this.proxybundleName);
		System.out.println("hidenBundleName : "+this.hidenBundleName);
	}
	/**
	* start HideHook
	*
	* @throws BundleException
	*/
	public void open()throws BundleException{
		reg=context.registerService(new String[]{FindHook.class.getName()},this,null);
	}
	/**
	* stop HideHook
	*/
	public void close(){
		reg.unregister();
	}
	/**
	* FindHook needs to implement the method
	*/
	@Override
	public void find(BundleContext context,String name,String filter,boolean allServices,Collection<ServiceReference<?>> references) {
		// TODO Auto-generated method stub
		System.out.println(">> FindHook find bundle "+context.getBundle().getSymbolicName());
		if(context.getBundle().getSymbolicName().equals(hidenBundleName)){
			// find hidenBundle(Bundle A) get reference(Service X)
			Iterator<ServiceReference<?>> iterator = references.iterator();
			while (iterator.hasNext()) {
				ServiceReference<?> sr = (ServiceReference<?>) iterator.next();
				System.out.println(">>> getService " + sr);
				if (sr.getProperty("proxied") == null && sr.getBundle().getSymbolicName().equals("org.eclipse.om2m.core")) {
					// remove Service X from Bundle A
                    iterator.remove();
                    System.out.println(">>>> remove " + sr.getBundle().getSymbolicName());
                } else {
                	// let Bundle A get Service X' 
                	System.out.println(">>>> do not remove "+sr.getBundle().getSymbolicName());
                }
			}
		} else if(context.getBundle().getSymbolicName().equals(proxybundleName)){
			// find proxyBundle(Proxy Bundle) get reference(Service X)
			Iterator<ServiceReference<?>> iterator = references.iterator();
			while (iterator.hasNext()) {
				ServiceReference<?> sr = (ServiceReference<?>) iterator.next();
				System.out.println(">>> getService " + sr);
				if (sr.getBundle().getSymbolicName().equals(proxybundleName)) {
					// remove Service X' from Proxy Bundle
                    iterator.remove();
                    System.out.println(">>>> remove " + sr.getBundle().getSymbolicName());
                } else {
                	// let Proxy Bundle get Service X
                	System.out.println(">>>> do not remove "+ sr.getBundle().getSymbolicName());
                }
			}
		}
	}
}