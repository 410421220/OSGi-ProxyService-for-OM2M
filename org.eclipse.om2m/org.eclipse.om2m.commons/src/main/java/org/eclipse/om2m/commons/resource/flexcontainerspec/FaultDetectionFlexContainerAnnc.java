/*
********************************************************************************
 * Copyright (c) 2014, 2018 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ********************************************************************************

ModuleClass : FaultDetectionAnnc

This ModuleClass provides information about whether a fault has occurred in a device.

Created: 2018-06-29 17:19:52
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;

@XmlRootElement(name = FaultDetectionFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = FaultDetectionFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class FaultDetectionFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "faultDetectionAnnc";
	public static final String SHORT_NAME = "fauDnAnnc";
	
	public FaultDetectionFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + FaultDetectionFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
		
	public void finalizeSerialization() {
	}
	
	public void finalizeDeserialization() {
	}
	
	
}
