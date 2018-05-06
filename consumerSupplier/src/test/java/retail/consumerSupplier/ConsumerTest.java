package retail.consumerSupplier;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

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
import com.cg.service.IRetailerService;
import com.cg.service.ISupplierService;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierServiceImpl;

public class ConsumerTest {

	final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	final ICustomerService customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
	final ISupplierService supplierService = ctx.getBean("supplierService", SupplierServiceImpl.class);
	final IGoodsService goodsService = ctx.getBean("goodsService", GoodsServiceImpl.class);
	final IRetailerService retailerService = ctx.getBean("retailerService", RetailerServiceImpl.class);

	// @Test
	public void addCustomer() {
		final Customer customer = new Customer(1, "sona", "chennai", "credit", "R2");
		final long value = customerService.addCustomer(customer);
		assertEquals(1, value);
	}

	// @Test
	public void deleteCustomer() {
		final Customer customer = new Customer(1, "Pooja", "mumbai", "debit", "R1");
		final long value = customerService.removeCustomer(1);
		assertEquals(1, value);
	}

	// @Test
	public void updateCustomer() {
		final Customer customer = new Customer(2, "Pooja", "mumbai", "debit", "R1");
		// customer.setPaymentMode("credit");
		final long value = customerService.updateCustomer("credit", 1);
		assertEquals(1, value);
	}

	// @Test
	public void addSupplier() {
		final Supplier supplier = new Supplier(104, "Sonam", "Chennai", 20, 112, 20, "R2");
		final long value = supplierService.addSupplier(supplier);
		assertEquals(104, value);

	}

	// @Test
	public void updateSupplier() {
		final long value = supplierService.updateSupplier(101, 40);
		assertEquals(1, value);
	}

	// @Test
	public void deleteSupplier() {
		final long value = supplierService.deleteSupplier(102);
		assertEquals(1, value);

	}

	// @Test
	public void addGoods() {
		final Goods goods = new Goods(1002, "kitkat", 12, 30, 101);
		final long value = goodsService.addGoods(goods);
		assertEquals(1002, value);
	}

	// @Test
	public void removeGoods() {
		final long value = goodsService.removeGoods(1001);
		assertEquals(1, value);
	}

	// @Test
	public void updateGoods() {
		final long value = goodsService.update(1002, 40);
		assertEquals(1, value);
	}

	@Test
	public void viewCustomer()
	{
		
		final List<Customer> list=retailerService.viewCustomer("R2");
		assertThat( list,hasItems((new Customer(1,"sona","chennai","credit","R2")),new Customer(3,"sona","chennai","credit","R2")));
		
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
}
