/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.om2m.commons.resource;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.om2m.commons.constants.ShortName;
import org.eclipse.om2m.commons.resource.flexcontainerspec.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AbstractFlexContainerAnnc extends AnnouncedResource {

	@XmlTransient
	private String shortName;

	@XmlTransient
	private String longName;

	@XmlElement(name = ShortName.STATETAG, required = true, namespace="")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger stateTag;

	@XmlElement(name = ShortName.CREATOR, required = true, namespace="")
	protected String creator;

	@XmlSchemaType(name = "anyURI")
	@XmlElement(name = ShortName.ONTOLOGY_REF, namespace="")
	protected String ontologyRef;

	@XmlSchemaType(name = "anyURI")
	@XmlElement(name = ShortName.CONTAINER_DEFINITION, namespace="")
	protected String containerDefinition;

	@XmlSchemaType(name = "anyURI")
	@XmlElement(name = ShortName.NODE_LINK, required = false, namespace="")
	protected String nodeLink;

	@XmlElement(name = ShortName.CHILD_RESOURCE, namespace="")
	protected List<ChildResourceRef> childResource;

	@XmlElements({
		@XmlElement(name = ShortName.CNT, namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
		@XmlElement(name = ShortName.SUB, namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
		@XmlElement(name = ShortName.FCNT, namespace = "http://www.onem2m.org/xml/protocols", type = AbstractFlexContainer.class),
		@XmlElement(name = ShortName.FCNTA, namespace = "http://www.onem2m.org/xml/protocols", type = AbstractFlexContainerAnnc.class),
	    @XmlElement(name = DeviceThreeDPrinterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceThreeDPrinterFlexContainerAnnc.class),
	    @XmlElement(name = DeviceAirConditionerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceAirConditionerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceAirPurifierFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceAirPurifierFlexContainerAnnc.class),
	    @XmlElement(name = DeviceAirQualityMonitorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceAirQualityMonitorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceAudioReceiverFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceAudioReceiverFlexContainerAnnc.class),
	    @XmlElement(name = DeviceBloodPressureMonitorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceBloodPressureMonitorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceCameraFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceCameraFlexContainerAnnc.class),
	    @XmlElement(name = DeviceClothesDryerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceClothesDryerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceClothesWasherFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceClothesWasherFlexContainerAnnc.class),
	    @XmlElement(name = DeviceClothesWasherDryerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceClothesWasherDryerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceCoffeeMachineFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceCoffeeMachineFlexContainerAnnc.class),
	    @XmlElement(name = DeviceCookerHoodFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceCookerHoodFlexContainerAnnc.class),
	    @XmlElement(name = DeviceCooktopFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceCooktopFlexContainerAnnc.class),
	    @XmlElement(name = DeviceDehumidifierFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceDehumidifierFlexContainerAnnc.class),
	    @XmlElement(name = DeviceDishWasherFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceDishWasherFlexContainerAnnc.class),
	    @XmlElement(name = DeviceDoorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceDoorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceDoorLockFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceDoorLockFlexContainerAnnc.class),
	    @XmlElement(name = DeviceElectricVehicleChargerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceElectricVehicleChargerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceFanFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceFanFlexContainerAnnc.class),
	    @XmlElement(name = DeviceFoodProbeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceFoodProbeFlexContainerAnnc.class),
	    @XmlElement(name = DeviceFreezerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceFreezerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceGlucosemeterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceGlucosemeterFlexContainerAnnc.class),
	    @XmlElement(name = DeviceHeartRateMonitorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceHeartRateMonitorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceHomeCCTVFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceHomeCCTVFlexContainerAnnc.class),
	    @XmlElement(name = DeviceHumidifierFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceHumidifierFlexContainerAnnc.class),
	    @XmlElement(name = DeviceKettleFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceKettleFlexContainerAnnc.class),
	    @XmlElement(name = DeviceLightFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceLightFlexContainerAnnc.class),
	    @XmlElement(name = DeviceMicrogenerationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceMicrogenerationFlexContainerAnnc.class),
	    @XmlElement(name = DeviceMultiFunctionPrinterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceMultiFunctionPrinterFlexContainerAnnc.class),
	    @XmlElement(name = DeviceOutdoorLampFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceOutdoorLampFlexContainerAnnc.class),
	    @XmlElement(name = DeviceOvenFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceOvenFlexContainerAnnc.class),
	    @XmlElement(name = DevicePrinterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DevicePrinterFlexContainerAnnc.class),
	    @XmlElement(name = DevicePulseOximeterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DevicePulseOximeterFlexContainerAnnc.class),
	    @XmlElement(name = DeviceRefrigeratorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceRefrigeratorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceRobotCleanerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceRobotCleanerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceScannerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceScannerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSecurityPanelFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSecurityPanelFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSetTopBoxFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSetTopBoxFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSmartElectricMeterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSmartElectricMeterFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSmartPlugFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSmartPlugFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSteamClosetFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSteamClosetFlexContainerAnnc.class),
	    @XmlElement(name = DeviceStorageBatteryFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceStorageBatteryFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSwitchFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSwitchFlexContainerAnnc.class),
	    @XmlElement(name = DeviceTelevisionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceTelevisionFlexContainerAnnc.class),
	    @XmlElement(name = DeviceThermometerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceThermometerFlexContainerAnnc.class),
	    @XmlElement(name = DeviceThermostatFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceThermostatFlexContainerAnnc.class),
	    @XmlElement(name = DeviceWaterHeaterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceWaterHeaterFlexContainerAnnc.class),
	    @XmlElement(name = DeviceWaterValveFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceWaterValveFlexContainerAnnc.class),
	    @XmlElement(name = DeviceWeightScaleAndBodyCompositionAnalyserFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceWeightScaleAndBodyCompositionAnalyserFlexContainerAnnc.class),
	    @XmlElement(name = DeviceWindowShadeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceWindowShadeFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSwitchFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSwitchFlexContainerAnnc.class),
	    @XmlElement(name = DeviceSmokeDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceSmokeDetectorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceContactDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceContactDetectorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceMotionDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceMotionDetectorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceFloodDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceFloodDetectorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceTemperatureDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceTemperatureDetectorFlexContainerAnnc.class),
	    @XmlElement(name = DeviceWeatherStationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceWeatherStationFlexContainerAnnc.class),
	    @XmlElement(name = DeviceGasValveFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceGasValveFlexContainerAnnc.class),
	    @XmlElement(name = DeviceKettleFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceKettleFlexContainerAnnc.class),
	    @XmlElement(name = DeviceWarningFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DeviceWarningFlexContainerAnnc.class),
	    @XmlElement(name = LiquidLevelFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = LiquidLevelFlexContainerAnnc.class),
	    @XmlElement(name = TemperatureAlarmFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TemperatureAlarmFlexContainerAnnc.class),
	    @XmlElement(name = ContactSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ContactSensorFlexContainerAnnc.class),
	    @XmlElement(name = ClothesDryerJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ClothesDryerJobModeFlexContainerAnnc.class),
	    @XmlElement(name = OximeterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OximeterFlexContainerAnnc.class),
	    @XmlElement(name = TurboFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TurboFlexContainerAnnc.class),
	    @XmlElement(name = AirConJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirConJobModeFlexContainerAnnc.class),
	    @XmlElement(name = EnergyGenerationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = EnergyGenerationFlexContainerAnnc.class),
	    @XmlElement(name = KeypadFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = KeypadFlexContainerAnnc.class),
	    @XmlElement(name = MotionSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = MotionSensorFlexContainerAnnc.class),
	    @XmlElement(name = SmokeSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SmokeSensorFlexContainerAnnc.class),
	    @XmlElement(name = MediaSelectFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = MediaSelectFlexContainerAnnc.class),
	    @XmlElement(name = ElectricVehicleConnectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ElectricVehicleConnectorFlexContainerAnnc.class),
	    @XmlElement(name = AlarmSpeakerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AlarmSpeakerFlexContainerAnnc.class),
	    @XmlElement(name = LockFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = LockFlexContainerAnnc.class),
	    @XmlElement(name = AirPurifierJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirPurifierJobModeFlexContainerAnnc.class),
	    @XmlElement(name = GlucometerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = GlucometerFlexContainerAnnc.class),
	    @XmlElement(name = RemoteControlEnableFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RemoteControlEnableFlexContainerAnnc.class),
	    @XmlElement(name = HeightFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = HeightFlexContainerAnnc.class),
	    @XmlElement(name = SpinLevelFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SpinLevelFlexContainerAnnc.class),
	    @XmlElement(name = AudioVolumeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AudioVolumeFlexContainerAnnc.class),
	    @XmlElement(name = FoamingFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FoamingFlexContainerAnnc.class),
	    @XmlElement(name = OvercurrentSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OvercurrentSensorFlexContainerAnnc.class),
	    @XmlElement(name = WeightFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = WeightFlexContainerAnnc.class),
	    @XmlElement(name = SecurityModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SecurityModeFlexContainerAnnc.class),
	    @XmlElement(name = BodyCompositionAnalyserFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BodyCompositionAnalyserFlexContainerAnnc.class),
	    @XmlElement(name = ClockFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ClockFlexContainerAnnc.class),
	    @XmlElement(name = ClothesWasherDryerJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ClothesWasherDryerJobModeFlexContainerAnnc.class),
	    @XmlElement(name = FilterInfoFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FilterInfoFlexContainerAnnc.class),
	    @XmlElement(name = PushButtonFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PushButtonFlexContainerAnnc.class),
	    @XmlElement(name = ClothesWasherJobModeOptionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ClothesWasherJobModeOptionFlexContainerAnnc.class),
	    @XmlElement(name = KeepWarmFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = KeepWarmFlexContainerAnnc.class),
	    @XmlElement(name = PersonSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PersonSensorFlexContainerAnnc.class),
	    @XmlElement(name = ColourSaturationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ColourSaturationFlexContainerAnnc.class),
	    @XmlElement(name = ImpactSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ImpactSensorFlexContainerAnnc.class),
	    @XmlElement(name = ClothesWasherJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ClothesWasherJobModeFlexContainerAnnc.class),
	    @XmlElement(name = RunStateFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunStateFlexContainerAnnc.class),
	    @XmlElement(name = TextMessageFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TextMessageFlexContainerAnnc.class),
	    @XmlElement(name = BioElectricalImpedanceAnalysisFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BioElectricalImpedanceAnalysisFlexContainerAnnc.class),
	    @XmlElement(name = OpenLevelFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OpenLevelFlexContainerAnnc.class),
	    @XmlElement(name = CredentialsFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = CredentialsFlexContainerAnnc.class),
	    @XmlElement(name = HotWaterSupplyFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = HotWaterSupplyFlexContainerAnnc.class),
	    @XmlElement(name = AirFlowFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirFlowFlexContainerAnnc.class),
	    @XmlElement(name = BatteryFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BatteryFlexContainerAnnc.class),
	    @XmlElement(name = PulsemeterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PulsemeterFlexContainerAnnc.class),
	    @XmlElement(name = RobotCleanerJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RobotCleanerJobModeFlexContainerAnnc.class),
	    @XmlElement(name = LiquidRemainingFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = LiquidRemainingFlexContainerAnnc.class),
	    @XmlElement(name = AirQualitySensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirQualitySensorFlexContainerAnnc.class),
	    @XmlElement(name = PhoneCallFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PhoneCallFlexContainerAnnc.class),
	    @XmlElement(name = WaterFlowFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = WaterFlowFlexContainerAnnc.class),
	    @XmlElement(name = TimerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TimerFlexContainerAnnc.class),
	    @XmlElement(name = BrewingFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BrewingFlexContainerAnnc.class),
	    @XmlElement(name = DishWasherJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DishWasherJobModeFlexContainerAnnc.class),
	    @XmlElement(name = OperationModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OperationModeFlexContainerAnnc.class),
	    @XmlElement(name = FaultDetectionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FaultDetectionFlexContainerAnnc.class),
	    @XmlElement(name = BoilerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BoilerFlexContainerAnnc.class),
	    @XmlElement(name = UvSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = UvSensorFlexContainerAnnc.class),
	    @XmlElement(name = BinarySwitchFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitchFlexContainerAnnc.class),
	    @XmlElement(name = WaterSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = WaterSensorFlexContainerAnnc.class),
	    @XmlElement(name = AcousticSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AcousticSensorFlexContainerAnnc.class),
	    @XmlElement(name = TemperatureFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TemperatureFlexContainerAnnc.class),
	    @XmlElement(name = NumberValueFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = NumberValueFlexContainerAnnc.class),
	    @XmlElement(name = DehumidifierJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DehumidifierJobModeFlexContainerAnnc.class),
	    @XmlElement(name = EnergyConsumptionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = EnergyConsumptionFlexContainerAnnc.class),
	    @XmlElement(name = RecorderFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RecorderFlexContainerAnnc.class),
	    @XmlElement(name = SphygmomanometerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SphygmomanometerFlexContainerAnnc.class),
	    @XmlElement(name = GrinderFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = GrinderFlexContainerAnnc.class),
	    @XmlElement(name = PlayerControlFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PlayerControlFlexContainerAnnc.class),
	    @XmlElement(name = OzoneMeterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OzoneMeterFlexContainerAnnc.class),
	    @XmlElement(name = PrintQueueFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PrintQueueFlexContainerAnnc.class),
	    @XmlElement(name = SessionDescriptionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SessionDescriptionFlexContainerAnnc.class),
	    @XmlElement(name = SignalStrengthFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SignalStrengthFlexContainerAnnc.class),
	    @XmlElement(name = BinaryObjectFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinaryObjectFlexContainerAnnc.class),
	    @XmlElement(name = BarometerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BarometerFlexContainerAnnc.class),
	    @XmlElement(name = HeatingZoneFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = HeatingZoneFlexContainerAnnc.class),
	    @XmlElement(name = CookerHoodJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = CookerHoodJobModeFlexContainerAnnc.class),
	    @XmlElement(name = ColourFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ColourFlexContainerAnnc.class),
	    @XmlElement(name = BrightnessFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BrightnessFlexContainerAnnc.class),
	    @XmlElement(name = RefrigerationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RefrigerationFlexContainerAnnc.class),
	    @XmlElement(name = AutoDocumentFeederFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AutoDocumentFeederFlexContainerAnnc.class),
	    @XmlElement(name = TelevisionChannelFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TelevisionChannelFlexContainerAnnc.class),
	    @XmlElement(name = ThreeDPrinterFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ThreeDPrinterFlexContainerAnnc.class),
	    @XmlElement(name = GeoLocationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = GeoLocationFlexContainerAnnc.class),
	    @XmlElement(name = DoorStatusFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DoorStatusFlexContainerAnnc.class),
	    @XmlElement(name = RelativeHumidityFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RelativeHumidityFlexContainerAnnc.class),
	    @XmlElement(name = SteamClosetJobModeFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SteamClosetJobModeFlexContainerAnnc.class),
	    @XmlElement(name = AnemometerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AnemometerFlexContainerAnnc.class),
	    @XmlElement(name = PowerSaveFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PowerSaveFlexContainerAnnc.class),
	})
	protected List<Resource> flexContainerOrContainerOrSubscription;

	@XmlAnyElement()
	protected List<CustomAttribute> customAttributes;


	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}


	public List<CustomAttribute> getCustomAttributes() {
		if (customAttributes == null) {
			customAttributes = new ArrayList<CustomAttribute>();
		}
		return customAttributes;
	}

	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	@XmlTransient
	public List<String> getCustomAttributeNames() {
		List<String> names = new ArrayList<String>();
		for (CustomAttribute ca : getCustomAttributes()) {
			names.add(ca.getShortName());
		}
		return names;
	}

	@XmlTransient
	public CustomAttribute getCustomAttribute(String name) {
		for (CustomAttribute ca : getCustomAttributes()) {
			if (ca.getShortName().equals(name)) {
				return ca;
			}
		}
		return null;
	}

	/**
	 * Gets the value of the stateTag property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getStateTag() {
		return stateTag;
	}

	/**
	 * Sets the value of the stateTag property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setStateTag(BigInteger value) {
		this.stateTag = value;
	}

	/**
	 * Gets the value of the creator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Sets the value of the creator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreator(String value) {
		this.creator = value;
	}

	/**
	 * Gets the value of the ontologyRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOntologyRef() {
		return ontologyRef;
	}

	/**
	 * Sets the value of the ontologyRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOntologyRef(String value) {
		this.ontologyRef = value;
	}

	/**
	 * Gets the value of the containerDefinition property.
	 * 
	 * @return object is {@link String}
	 */
	public String getContainerDefinition() {
		return containerDefinition;
	}

	/**
	 * Sets the value of the containerDefinition property.
	 * 
	 * @param value
	 *            allowed object is {@link String}
	 */
	public void setContainerDefinition(String value) {
		this.containerDefinition = value;
	}

	/**
	 * Gets the value of the childResource property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the childResource property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChildResource().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ChildResourceRef }
	 * 
	 * 
	 */
	public List<ChildResourceRef> getChildResource() {
		if (childResource == null) {
			childResource = new ArrayList<ChildResourceRef>();
		}
		return this.childResource;
	}

	/**
	 * Gets the value of the flexContainerOrContainerOrSubscription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the flexContainerOrContainerOrSubscription
	 * property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFlexContainerOrContainerOrSubscription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AbstractFlexContainer } {@link Container } {@link Subscription }
	 * 
	 * 
	 */
	public List<Resource> getFlexContainerOrContainerOrSubscription() {
		if (flexContainerOrContainerOrSubscription == null) {
			flexContainerOrContainerOrSubscription = new ArrayList<Resource>();
		}
		return this.flexContainerOrContainerOrSubscription;
	}

	/**
	 * Gets the value of the nodeLink property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNodeLink() {
		return nodeLink;
	}

	/**
	 * Sets the value of the nodeLink property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNodeLink(String value) {
		this.nodeLink = value;
	}

	public void finalizeSerialization() {
		// do nothing
		// should be overwrote 
	}

	public Resource getResourceByName(String name) {
		for(Resource r : getFlexContainerOrContainerOrSubscription()) {
			if (r instanceof AbstractFlexContainer) {
				AbstractFlexContainer absFcnt = (AbstractFlexContainer) r ;
				if (absFcnt.getShortName().equals(name)) {
					return absFcnt;
				}
			} else if (r instanceof AbstractFlexContainerAnnc) {
				AbstractFlexContainerAnnc absFcntAnnc = (AbstractFlexContainerAnnc) r ;
				if (absFcntAnnc.getShortName().equals(name)) {
					return absFcntAnnc;
				}
			}
		}
		return null;
	}
}
