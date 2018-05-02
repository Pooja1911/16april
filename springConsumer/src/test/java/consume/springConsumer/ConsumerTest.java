package consume.springConsumer;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import java.util.List;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.config.ApplicationConfig;
import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.ICustomerService;
import com.cg.service.IGoodsService;
import com.cg.service.IRetailerService;
import com.cg.service.ISupplierService;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierServiceImpl;

public class ConsumerTest{
	
	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
      IGoodsService goodsService= context.getBean("goodsService",GoodsServiceImpl.class);
      ICustomerService customerService=context.getBean("customerService",CustomerServiceImpl.class);
      ISupplierService supplierService=context.getBean("supplierService",SupplierServiceImpl.class);
      IRetailerService retailerService=context.getBean("retailerService",RetailerServiceImpl.class);

	@Test
	public void addCustomer() {
		
		Customer customer = new Customer(9, "sona", "chennai", "credit", "R2");
		final long value=customerService.addCustomer(customer);
		assertEquals("Data inserted",9, value);
	}
	
	@Test 
	public void deleteCustomer()
	{
		Customer customer=new Customer(7, "sona", "chennai", "credit", "R2");
		long value=customerService.removeCustomer(1);
        assertEquals(1, value);
	}
  @Test
   public void updateCustomer()
   {
	   Customer customer=new Customer(2,"Pooja","mumbai","debit","R1");
	   //customer.setPaymentMode("credit");
	  long value=customerService.updateCustomer("credit", 2);
	   assertEquals(1, value);
   }
   
   @Test
   public void addSupplier()
   {   
	   Supplier supplier=new Supplier(107,"Sonam","Chennai",20,112,20,"R2");
	   long value=supplierService.addSupplier(supplier);
	   assertEquals(107,value);
	   
   }
   
   @Test
   public void updateSupplier()
   {
	  long value= supplierService.updateSupplier(105, 40);
	   assertEquals(1,value);
   }
   
   @Test
   public void deleteSupplier() {
	   long value=supplierService.deleteSupplier(107);
	   assertEquals(1,value);
	      
   }
   @Test
   public void addGoods()
   {
	   Goods goods=new Goods(1005,"kitkat",12,30,101);
	   long value=goodsService.addGoods(goods);
	   assertEquals(1005,value);
   }
   
   @Test
   public void removeGoods()
   {
	   long value=goodsService.removeGoods(1002);
	   assertEquals(1,value);
   }
   
   @Test
   public void updateGoods() {
	   long value=goodsService.update(1005, 40);
	   assertEquals(1,value);
   }
   
   @Test
	public void viewCustomer()
	{
		
		final List<Customer> list=retailerService.viewCustomer("R2");
		assertThat( list,hasItems((new Customer(5,"sona","chennai","credit","R2")),new Customer(3,"sona","chennai","credit","R2")));
		
	}
	
	@Test
	public void viewSupplier()
	{
		final List<Supplier> list=retailerService.viewSupplier("R1");
		assertThat(list,hasItems((new Supplier(103,"Sonam","Chennai",20,112,20,"R1")),(new Supplier(101,"Pooja","Chennai",20,112,40,"R1"))));
	}
	
	@Test
	public void viewGoods()
	{
		final List<Goods> list=retailerService.viewGoods("R1");
		assertThat(list,hasItems(new Goods(1002,"kitkat",12,40,101)));
	}
	@Test
	public void checkidforcustomer()
	{
		long customerId=0;
		Customer customer=new Customer(5, "sona", "chennai", "credit", "R2");
		assertNotEquals("Invalid id",customerId,customer.getCustomerId());
	}
	
	@Test
	public void checkforcustomername()
	{
		String customerName=null;
		Customer customer=new Customer(5, "sona", "chennai", "credit", "R2");
		assertNotEquals("Invalid name",customerName,customer.getCustomerName());
	}
	@Test
	public void checkforcustomeraddress()
	{
		String customerAddress=null;
		Customer customer=new Customer(5, "sona", "chennai", "credit", "R2");
		assertNotEquals("Invalid address",customerAddress,customer.getCustomerAddress());
	}
	
	@Test
	public void checkforcustomerpaymentMode()
	{
		String payment=null;
		Customer customer=new Customer(5, "sona", "chennai", "credit", "R2");
		assertNotEquals("Invalid mode of payment",payment,customer.getPaymentMode());
	}
	@Test
	public void checkforcustomerretailerName()
	{
		String retailer=null;
		Customer customer=new Customer(5, "sona", "chennai", "credit", "R2");
		assertNotEquals("Invalid mode of payment",retailer,customer.getRetailerName());
	}
	@Test
	public void checkforsupplierid()
	{
		long supplierId=0;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid id",supplierId,supplier.getSupplierId());
	}
	
	@Test
	public void checkforsuppliername()
	{
		String supplierName=null;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid name",supplierName,supplier.getSupplierName());
	}
	@Test
	public void checkforsupplieraddress()
	{
		String supplierAddress=null;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid address",supplierAddress,supplier.getSupplierAddress());
	}
	
	@Test
	public void checkforquantityOrder()
	{
		long quantityOrder=0;;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid order quantity",quantityOrder,supplier.getQuantityOrder());
	}
	@Test
	public void checkfororderId()
	{
	    long orderId=0;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid order id",orderId,supplier.getOrderId());
	}
	
	@Test
	public void checkforamount()
	{
		float amount=0;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid amount",amount,supplier.getAmount());
	}
	@Test
	public void checkforsupplierretailer()
	{
		String supplierRetailer=null;
		Supplier supplier=new Supplier(105,"Sonam","Chennai",20,112,20,"R2");
		assertNotEquals("Invalid retailer",supplierRetailer,supplier.getRetailerName());
	}
	@Test
	public void checkforgoodsId()
	{
		long goodsId=0;
		 Goods goods=new Goods(1002,"kitkat",12,30,101);
		assertNotEquals("Invalid id",goodsId,goods.getGoodsId());
	}
	@Test
	public void checkforgoodsName()
	{
		String goodsName=null;
		 Goods goods=new Goods(1002,"kitkat",12,30,101);
		assertNotEquals("Invalid name",goodsName,goods.getGoodsName());
	}
	@Test
	public void checkforgoodsQuantity()
	{
		long goodsQuantity=0;
		 Goods goods=new Goods(1002,"kitkat",12,30,101);
		assertNotEquals("Invalid quantity",goodsQuantity,goods.getGoodsQuantity());
	}
	@Test
	public void checkforgoodsPrice()
	{
		float goodsPrice=0;
		 Goods goods=new Goods(1002,"kitkat",12,30,101);
		assertNotEquals("Invalid price",goodsPrice,goods.getGoodsPrice());
	}
	@Test(expected=DuplicateKeyException.class)
	public void checkprimarykey()
	{
		Customer customer = new Customer(11, "sona", "chennai", "credit", "R2");
		final long value=customerService.addCustomer(customer);
		assertEquals("Data inserted",11, value);
		Customer customer1 = new Customer(11, "sona", "chennai", "credit", "R2");
		final long values=customerService.addCustomer(customer1);
		
	}
	
	@Test(expected=DuplicateKeyException.class)
	public void checkprimarykeySupplier()
	{
		 Supplier supplier=new Supplier(109,"Sonam","Chennai",20,112,20,"R2");
		   long value=supplierService.addSupplier(supplier);
		   assertEquals(109,value);
		   Supplier supplier1=new Supplier(109,"Sonam","Chennai",20,112,20,"R2");
		   long values=supplierService.addSupplier(supplier1);
		   
		   
	}
	@Test(expected=DuplicateKeyException.class)
		public void checkprimarykeyGoods()
		{
		Goods goods=new Goods(1006,"kitkat",12,30,101);
		   long value=goodsService.addGoods(goods);
		   assertEquals(1006,value);
		   Goods goods1=new Goods(1006,"kitkat",12,30,101);
		   long values=goodsService.addGoods(goods1);
		   
		}
		}
	

