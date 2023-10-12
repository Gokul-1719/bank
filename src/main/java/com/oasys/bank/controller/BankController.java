package com.oasys.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.oasys.bank.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankser;
	@GetMapping(value="/getbranch/{branch}")
	public String getifsccode(@PathVariable String branch) {
		return bankser.getifsccode(branch);
	}
}
