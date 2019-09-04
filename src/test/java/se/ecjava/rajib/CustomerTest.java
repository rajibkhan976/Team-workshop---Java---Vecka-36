package se.ecjava.rajib;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
  @Test
  public void customer() {
    Customer customer = new Customer(
        "John", "Doe", "john.doe@example.com"
    );
    assertNotNull(customer);
    assertNotNull(customer.getId());

    assertEquals("John", customer.getFirstName());
    assertEquals("Doe", customer.getLastName());
    assertEquals("john.doe@example.com", customer.getEmail());
  }
}
