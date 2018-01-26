package com.sbs.spring.cloud.security.springcloudsecurity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbs.spring.cloud.vo.Order;

@SpringBootApplication
@EnableResourceServer
@RestController
public class SpringCloudSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityApplication.class, args);
	}
	
	
	Map<String, Order> ordMap = new HashMap<String, Order>();

	@RequestMapping(value = "/ords", method = RequestMethod.GET)
	public Collection<Order> getAllEmpoyee() {
		ordMap.put("1", new Order("1", "70.00"));
		ordMap.put("2", new Order("2", "50.00"));
		ordMap.put("3", new Order("3", "26.99"));

		return ordMap.values();
	}
}
