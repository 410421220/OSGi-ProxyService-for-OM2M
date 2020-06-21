package simple_proxy_test.ProxyService;

import org.eclipse.om2m.commons.resource.RequestPrimitive;
import org.eclipse.om2m.commons.resource.ResponsePrimitive;
import org.eclipse.om2m.core.service.CseService;

public class adapter implements CseService {

	private static CseService cse;
	@Override
	public ResponsePrimitive doRequest(RequestPrimitive request) {
		// TODO Auto-generated method stub
		System.out.println("=======> Proxy module (QoS module) <======S");
		ResponsePrimitive response = null;
		// do something
		System.out.println("=======>    send to cseService !   <=======");
		response = cse.doRequest(request);
		System.out.println("=======> Proxy module (QoS module) <======E");
		return response;
	}

	public static void setCse(CseService cse) {
		// TODO Auto-generated method stub
		adapter.cse = cse;
		System.out.println("adapter >> setCSE "+cse);
	}

}
