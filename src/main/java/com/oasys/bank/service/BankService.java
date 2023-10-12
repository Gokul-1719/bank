package com.oasys.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.oasys.bank.dao.BankDao;

@Service
public class BankService {
	@Autowired
	BankDao bankdao;

	public String getifsccode(@PathVariable String branch) {
		return bankdao.getifsccode(branch);
	}

}
