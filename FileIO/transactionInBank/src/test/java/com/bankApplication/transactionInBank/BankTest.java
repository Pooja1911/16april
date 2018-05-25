package com.bankApplication.transactionInBank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
@DataJpaTest
public class BankTest {

	@Test
	public void chkbankAdd() {
		final RestTemplate restTemplate = new RestTemplate();
		final BigDecimal big = new BigDecimal(0);
		final Bank bank = new Bank();
		bank.setAmount(big);
		// Bank bank1=new Bank(1L,big);
		final String uri = "http://localhost:8080/bank/bankCreate";
		final Bank ban = restTemplate.postForObject(uri, bank, Bank.class);
		assertEquals(ban.getAmount(), bank.getAmount());
	}

	@Test
	public void checkBankDetails() {
		final RestTemplate restTemplate = new RestTemplate();
		final String uri = "http://localhost:8080/bank/getBankDetails";
		final BigDecimal big = new BigDecimal(0);
		Bank bank1 = new Bank(1L, big);
		final List<Bank> list1 = new ArrayList();
		list1.add(bank1);
		final ResponseEntity<Bank[]> response = restTemplate.getForEntity(uri, Bank[].class);
    	Bank [] list = response.getBody();
		assertNotEquals(list.length , 0);
	}
	
	@Test
	public void bankDeominationDeposit() throws BankException {
		BigDecimal amount = new BigDecimal(2222);
		Map<BigDecimal,Integer> newMap=new HashMap();
		Random random = new Random();
		List<BigDecimal> list = new ArrayList();
		list.add(new BigDecimal(2000));
		list.add(new BigDecimal(500));
		list.add(new BigDecimal(200));
		list.add(new BigDecimal(100));
		BigDecimal remainder = amount;
		if(amount.intValue()>=0)
		{
			for(int i=0;i<=list.size();i++)
			{
				Integer randomIndex = random.nextInt(list.size());
				BigDecimal randomElement = list.get(randomIndex);
				if ( !(randomElement.compareTo(remainder) >0) ) {
					Integer count=remainder.divide(randomElement).intValue();
					remainder= remainder.remainder( randomElement);			
					
					newMap.put(randomElement,count);
					System.out.println(">>>>>>"+randomElement);
					System.out.println(">>>>>>>>>>>>>>>>>"+count);
					/*Optional<BankDenomination> deno = denominationRepo.findById(randomElement);
					BankDenomination bankDeno = deno.get();
						bankDeno.setNoOfDenomination(bankDeno.getNoOfDenomination() + count.intValue());
						denominationRepo.save(bankDeno);*/
					
					if (remainder.compareTo(BigDecimal.ZERO) ==0) {
						break;
					}
				}
				list.remove(randomIndex);
			
			}
			if (remainder.compareTo(BigDecimal.ZERO) !=0) {
				System.out.println("cant Proceed ");
				//return null;
			}
			
		}
		System.out.println("result >>>>>>"+newMap);
		//return newMap;
	}
	
}