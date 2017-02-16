package it.bz.idm.carsharing.dto;

import javax.xml.datatype.XMLGregorianCalendar;

import it.bz.idm.carsharing.wsdl.ListVehicleOccupancyByStationRequest;
import it.bz.idm.carsharing.wsdl.UserAuth;

public class MyListVehicleOccupancyByStationRequest {
	String function;
	ListVehicleOccupancyByStationRequest request;

	public MyListVehicleOccupancyByStationRequest(UserAuth technicalUser, XMLGregorianCalendar begin,
			XMLGregorianCalendar end, Integer stationUID, Integer[] vehicleUids) {
		this.request = new ListVehicleOccupancyByStationRequest();
		this.request.setTechnicalUser(technicalUser);
		this.request.setBegin(begin);
		this.request.setEnd(end);
		this.request.setStationUID(stationUID);
		for (Integer vehicleUid : vehicleUids)
			this.request.getVehicleUID().add(vehicleUid);
		this.function = "Api.listVehicleOccupancyByStation";
	}

	public String getFunction() {
		return function;
	}

	public ListVehicleOccupancyByStationRequest getRequest() {
		return request;
	}
}
