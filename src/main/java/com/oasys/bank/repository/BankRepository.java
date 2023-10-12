package com.oasys.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, String>{
	@Query(value="select*from bank_details where branch like?",nativeQuery=true)
	public String getifsccode(String branch);
	

}
