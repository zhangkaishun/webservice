
package com.zks.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements IWeatherInterface {
	@WebMethod
	@Override
	public String queryWeather(String cityName) {
		System.out.println(cityName);
		return cityName;
	}
}
