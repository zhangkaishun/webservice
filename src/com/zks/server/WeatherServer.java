package com.zks.server;

import javax.xml.ws.Endpoint;

public class WeatherServer {

	public static void main(String[] args) {
		IWeatherInterface weatherInterface=new WeatherInterfaceImpl();
		Endpoint.publish("http://127.0.0.1:12345/weather", weatherInterface);
	}

}
