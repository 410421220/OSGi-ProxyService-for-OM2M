/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.devices;

import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.home.modules.ContactSensor;
import org.eclipse.om2m.sdt.home.types.DeviceType;

public class ContactDetector extends GenericSensor {
	
	public ContactDetector(final String id, final String serial, final Domain domain) {
		super(id, serial, DeviceType.deviceContactDetector, domain);
		setDeviceSubModelName("CONTACT");
	}

	public ContactSensor getContactSensor() {
		return (ContactSensor) sensor;
	}

}
