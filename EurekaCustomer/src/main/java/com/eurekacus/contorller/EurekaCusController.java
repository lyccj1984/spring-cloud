package com.eurekacus.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaCusController {

	@Autowired
	RestTemplate temp;

	@RequestMapping("/cus")
	public String mycus() {

		return temp.getForEntity("http://eurekac/pro", String.class).getBody();

	}
}
