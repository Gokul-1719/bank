package com.oasys.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.oasys.bank.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankrepo;

	public String getifsccode(@PathVariable String branch) {
	return bankrepo.getifsccode(branch);
	}

}
