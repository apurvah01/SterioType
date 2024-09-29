package com.BikkadIT.SterioTypeAnnotations.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	
	public BankDao() {
		super();
		System.out.println("Bank Dao Constructor");
	}
	

}
