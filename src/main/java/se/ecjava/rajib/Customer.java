package se.ecjava.rajib;

import java.util.UUID;

public class Customer {
  private String firstName;
  private String lastName;
  private String email;
  private String id;

  public Customer(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.id = UUID.randomUUID().toString();
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getId() {
    return id;
  }
}
