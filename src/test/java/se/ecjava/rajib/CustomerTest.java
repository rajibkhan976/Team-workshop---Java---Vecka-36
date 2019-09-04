package se.ecjava.rajib;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
  @Test
  public void customer() {
    Customer customer = new Customer(
        "John", "Doe", "john.doe@example.com"
    );
    BankAccount acccount = new BankAccount(0, customer);
    assertNotNull(customer);
    assertNotNull(customer.getId());

    assertEquals("John", customer.getFirstName());
    assertEquals("Doe", customer.getLastName());
    assertEquals("john.doe@example.com", customer.getEmail());
  }

  @Test
  public void addBankAccount() {
    Customer customer = new Customer(
        "John", "Doe", "john.doe@example.com"
    );

    customer.addBankAccount(0);
    assertEquals(1, customer.getBankAccounts().length);
  }
}
