package customer.CustomerDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import customer.CustomerDetails.entities.Customer;

/**
 * 
 *
 */
public class App 
{
    public static  void main( String[] args )
    {
    	 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
   
    	 Customer customer1=ctx.getBean(Customer.class);
    	 System.out.println("hello");
    }
}
