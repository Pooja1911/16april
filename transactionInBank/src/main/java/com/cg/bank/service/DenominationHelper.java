package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.RefMoney;

@Component
public class DenominationHelper {

	public Map<BigDecimal, Integer> getDenominatioValues(BigDecimal amount , List<BigDecimal> list) throws BankException {
		Map<BigDecimal,Integer> newMap=new HashMap();
		Random random = new Random();
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
				
					if (remainder.compareTo(BigDecimal.ZERO) ==0) {
						break;
					}
				}
				list.remove(randomIndex);
			
			}
			if (remainder.compareTo(BigDecimal.ZERO) !=0) {
				System.out.println("cant Proceed ");
				return null;
			}
			
		}
		return newMap;
	}

}
