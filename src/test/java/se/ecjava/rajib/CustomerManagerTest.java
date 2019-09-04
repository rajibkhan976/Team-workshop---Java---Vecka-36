package se.ecjava.rajib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerManagerTest {
  private CustomerManager cm;
  @Before
  public void setup() {
    this.cm = new CustomerManager();
  }

  @Test
  public void manager() {
    assertNotNull(cm);
  }

  @Test
  public void addCustomer() {
    Customer customer = new Customer("a", "b", "c");

    cm.addCustomer(customer);

    Customer[] expectedOutput = { customer };
    assertArrayEquals(expectedOutput, cm.getCustomers());
  }

  @Test
  public void addCustomerWithExistingEmail() {
    Customer customer = new Customer("a", "b", "c");
    cm.addCustomer(customer);

    cm.addCustomer(customer);

    Customer[] expectedOutput = { customer };
    assertArrayEquals(expectedOutput, cm.getCustomers());
  }

  @Test
  public void findCustomer() {
    Customer customer = new Customer("a", "b", "c");
    cm.addCustomer(customer);

    assertEquals(customer, cm.findCustomer("c"));
  }

  @Test
  public void removeCustomer() {
    Customer customer = new Customer("a", "b", "c");
    cm.addCustomer(customer);

    cm.removeCustomer("c");

    assertEquals(0, cm.getCustomers().length);
  }

  @Test
  public void removeCustomer1() {
    Customer customer = new Customer("a", "b", "c");
    cm.addCustomer(customer);

    cm.removeCustomer("d");

    assertEquals(1, cm.getCustomers().length);
  }
}
