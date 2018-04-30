package retail.consumerSupplier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.ICustomerService;
import com.cg.service.IGoodsService;
import com.cg.service.ISupplierService;
import com.cg.service.SupplierServiceImpl;

public class ConsumerTest {

	final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	final ICustomerService customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
    final ISupplierService supplierService=ctx.getBean("supplierService",SupplierServiceImpl.class);
    final IGoodsService goodsService=ctx.getBean("goodsService",GoodsServiceImpl.class);
	//@Test
	public void addCustomer() {
		Customer customer = new Customer(1, "sona", "chennai", "credit", "R2");
		long value=customerService.addCustomer(customer);
		assertEquals(1, value);
	}
	
//	@Test 
	public void deleteCustomer()
	{
		Customer customer=new Customer(1,"Pooja","mumbai","debit","R1");
		long value=customerService.removeCustomer(1);
        assertEquals(1, value);
	}
 //  @Test
   public void updateCustomer()
   {
	   Customer customer=new Customer(2,"Pooja","mumbai","debit","R1");
	   //customer.setPaymentMode("credit");
	  long value=customerService.updateCustomer("credit", 1);
	   assertEquals(1, value);
   }
   
   //@Test
   public void addSupplier()
   {
	   Supplier supplier=new Supplier(104,"Sonam","Chennai",20,112,20,"R2");
	   long value=supplierService.addSupplier(supplier);
	   assertEquals(104,value);
	   
   }
   
 //  @Test
   public void updateSupplier()
   {
	  long value= supplierService.updateSupplier(101, 40);
	   assertEquals(1,value);
   }
   
   //@Test
   public void deleteSupplier() {
	   long value=supplierService.deleteSupplier(102);
	   assertEquals(1,value);
	      
   }
  // @Test
   public void addGoods()
   {
	   Goods goods=new Goods(1002,"kitkat",12,30,101);
	   long value=goodsService.addGoods(goods);
	   assertEquals(1002,value);
   }
   
   //@Test
   public void removeGoods()
   {
	   long value=goodsService.removeGoods(1001);
	   assertEquals(1,value);
   }
   
 //  @Test
   public void updateGoods() {
	   long value=goodsService.update(1002, 40);
	   assertEquals(1,value);
   }
}
