package com.zks.server;

import javax.jws.WebService;

@WebService
public interface IWeatherInterface {
	public String queryWeather(String cityName);
}
