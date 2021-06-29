/**
 * 
 */
package com.wipro.poc.controller;

import java.time.Instant;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.poc.constants.TomcatServerConstants;

/**
 * @author M Venkata Sai Krishna 
 *
 */
@RestController
public class TomcatController {
	
	@GetMapping(value=TomcatServerConstants.GET_TOMCAT_RESPONSE)
	public static String getTomcatResponse() {
		return "response from Tomcat Server with Url : [ " + TomcatServerConstants.GET_TOMCAT_RESPONSE + " ] with current Time [ " + Date.from(Instant.now()) + " ]";
	}

}
