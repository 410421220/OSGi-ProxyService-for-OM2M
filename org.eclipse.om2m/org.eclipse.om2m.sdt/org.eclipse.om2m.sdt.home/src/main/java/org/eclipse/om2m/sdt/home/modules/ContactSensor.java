/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.modules;

import java.util.Map;

import org.eclipse.om2m.sdt.DataPoint;
import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.datapoints.BooleanDataPoint;
import org.eclipse.om2m.sdt.home.types.DatapointType;
import org.eclipse.om2m.sdt.home.types.ModuleType;

public class ContactSensor extends AbstractAlarmSensor {
	
	public ContactSensor(final String name, final Domain domain, BooleanDataPoint alarm) {
		super(name, domain, alarm, ModuleType.contactSensor,
				"The detection of the contact occurrence.");
	}

	public ContactSensor(final String name, final Domain domain, Map<String, DataPoint> dps) {
		this(name, domain, (BooleanDataPoint) dps.get(DatapointType.alarm.getShortName()));
	}

}
