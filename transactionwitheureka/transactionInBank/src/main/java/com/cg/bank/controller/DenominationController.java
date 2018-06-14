package com.cg.bank.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.Exception.BankException;
import com.cg.bank.service.IAtmDenoService;
import com.cg.bank.service.IBankDenominationService;
import com.cg.bank.service.IRefServcie;
import com.cg.bank.vo.CreateDenominationRequest;

@RestController
public class DenominationController {

	@Autowired
	private IRefServcie refService;
	
	@Autowired
	private IBankDenominationService bankDeno;
	@Autowired
	private IAtmDenoService atmDenoService;
	
	
	@PostMapping("/addDenominations")
	public void addDenomination(@RequestBody CreateDenominationRequest createDenomination)
	{
		
		try {
			refService.createDenomination(createDenomination.getList());
		} catch (BankException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			bankDeno.bankDenominationCreate(createDenomination.getList(),createDenomination.getBankId());
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			atmDenoService.atmDenominationCreate(createDenomination.getList(), createDenomination.getAtmId());
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
