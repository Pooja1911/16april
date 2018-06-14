package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
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

	public Map<BigDecimal, Integer> getDenominatioValues(final BigDecimal amount , final List<BigDecimal> list) throws BankException {
		final Map<BigDecimal,Integer> newMap=new HashMap();
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
				return null ;
			}
			
		}
		return newMap;
	}

	
	
	public Map<BigDecimal,Integer> getcountDenomination(BigDecimal amount, List<BigDecimal> list) throws BankException
	{
		Map<BigDecimal, Integer> newMap = new HashMap();

		List<BigDecimal> selectedList = new ArrayList();
	
		for (BigDecimal denom : list) {
			if (denom.compareTo(amount) <= 0) {
				selectedList.add(denom);
			} 
		}
		if(selectedList.isEmpty())
		{
				throw new BankException("selected list is empty");
		}
		for (int i = 0; i <= selectedList.size(); i++) {
			final BigDecimal maxDen = Collections.max(selectedList);
			final Integer count = amount.divide(maxDen).intValue();
			amount = amount.remainder(maxDen);
			newMap.put(maxDen, count);

			if (amount.compareTo(BigDecimal.ZERO) == 0) {
				break;
			}
			selectedList.remove(maxDen);
		}
	
		if (amount.compareTo(BigDecimal.ZERO) != 0) {
			throw new BankException("amount cannot be withdrawn");
		}
	return newMap;	
	}
}
