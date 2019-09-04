package se.ecjava.rajib;

import java.util.Arrays;
import java.util.UUID;

public class Customer {
  private String firstName;
  private String lastName;
  private String email;
  private String id;
  private BankAccount[] accounts;

  public Customer(String firstName, String lastName, String email, BankAccount[] accounts) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.id = UUID.randomUUID().toString();
    this.accounts = accounts;
  }

  public Customer(String firstName, String lastName, String email) {
    this(firstName, lastName, email, new BankAccount[0]);
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

  public void addBankAccount(int saldo) {
    BankAccount account = new BankAccount(saldo, this);

    addAccountToAccounts(account);
  }

  private void addAccountToAccounts(BankAccount account) {
    int offset = accounts.length;
    BankAccount[] newArray = Arrays.copyOf(accounts, offset + 1);
    newArray[offset] = account;

    this.accounts = newArray;
  }

  public BankAccount[] getBankAccounts() {
    return accounts;
  }
}
