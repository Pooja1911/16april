/**
 * 
 */
package customer.CustomerDetails.dao;

import java.util.List;

import customer.CustomerDetails.entities.Customer;

/**
 * @author trainee
 *
 */
public interface ICustomerDao {
	 public void getAll(List<Customer> list);

}
