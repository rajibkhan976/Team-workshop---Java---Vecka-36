package se.ecjava.rajib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountManagerTest {
  private AccountManager am;
  @Before
  public void setup(){
    this.am = new AccountManager();
  }

  @Test
  public void newAmSucess(){
    assertNotNull(am);
  }

  @Test
  public void addAccount(){
    Customer customer = new Customer("a", "b", "c");
    BankAccount bankAccount = new BankAccount(0,customer);
    am.addAccount(bankAccount);
    assertEquals(1, am.getAccounts().length);
  }
  @Test
  public void findAccount(){
    Customer customer = new Customer("a", "b", "c");
    BankAccount bankAccount = new BankAccount(0,customer);
    am.addAccount(bankAccount);

    BankAccount found = am.findAccount(bankAccount);
    assertEquals(found, bankAccount);
  }

}