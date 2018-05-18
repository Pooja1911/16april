package com.bankApplication.transactionInBank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.cg.bank.entities.Customer;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class )
@DataJpaTest
public class CustomerTest {
	
	/*@Autowired
	private CustomerRepository custRepo;*/
	//@Test
	public void addCustomer()
	{
		Customer cust=new Customer(1L,"Pooja",2098L);
		//custRepo.save(cust);
	}

}
