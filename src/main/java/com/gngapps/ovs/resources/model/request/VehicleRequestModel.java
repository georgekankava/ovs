package com.gngapps.ovs.resources.model.request;

import com.gngapps.ovs.model.filters.VehicleFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VehicleRequestModel implements VehicleFilter {
	private String energySource;
	private String manufacturer;
	private String model;
	private String price;
}
