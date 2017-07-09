package com.soapwebservice.sunil;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args){
		
		// enter ip adress of stack overflow 151.101.65.69
		// or 8.8.8.8
		if(args.length !=1){
			System.out.println("you need to pass one IP adress");
		}else{
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap= ipService.getGeoIPServiceSoap();
			GeoIP geoIp =geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("Country Name is :" +geoIp.getCountryName());
			System.out.println("Country Code is :" +geoIp.getCountryCode());
			System.out.println("IP  is :" +geoIp.getIP());
			
		}
		
		
	}
}
