package org.eclipse.om2m.core.service;

import org.eclipse.om2m.commons.resource.RequestPrimitive;
import org.eclipse.om2m.commons.resource.ResponsePrimitive;

public interface CseService {
	public ResponsePrimitive doRequest(RequestPrimitive request);
}
