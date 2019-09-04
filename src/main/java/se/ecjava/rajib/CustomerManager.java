package se.ecjava.rajib;

import java.util.Arrays;

public class CustomerManager {
  private Customer[] customers;

  public CustomerManager() {
    this.customers = new Customer[0];
  }

  public void addCustomer(Customer customer) {
    if (validCustomer(customer)) {
      addCustomerToArray(customer);
    }
  }

  private boolean validCustomer(Customer customer) {
    return (findCustomer(customer.getEmail()) == null &&
        customer.getBankAccounts().length > 0);
  }

  public Customer findCustomer(String email) {
    for (int i = 0; i < customers.length; i++) {
      Customer c = customers[i];
      if (c.getEmail() == email) {
        return c;
      }
    }
    return null;
  }

  public void removeCustomer(String email) {
    Customer c = findCustomer(email);
    int index = findIndexOfCustomer(c);

    removeCustomerFromArray(index);
  }

  private void removeCustomerFromArray(int index) {
    if (customers == null || index < 0 || index >= customers.length) {
      return;
    }

    Customer[] newArray = new Customer[customers.length -1];

    // Copy the elements except the index
    // from original array to the other array
    for (int i = 0, k = 0; i < customers.length; i++) {
      // if the index is
      // the removal element index
      if (i == index) {
        continue;
      }

      // if the index is not
      // the removal element index
      newArray[k++] = customers[i];
    }

    this.customers = newArray;
  }

  private int findIndexOfCustomer(Customer customer) {
    for (int i = 0; i < customers.length; i++) {
      if (customers[i] == customer) {
        return i;
      }
    }
    return -1;
  }

  public Customer[] getCustomers() {
    return customers;
  }

  /**
   * Adds customer to customers array
   * @param customer
   */
  private void addCustomerToArray(Customer customer) {
    int offset = customers.length;
    Customer[] newArray = Arrays.copyOf(customers, offset + 1);
    newArray[offset] = customer;

    this.customers = newArray;
  }
}
