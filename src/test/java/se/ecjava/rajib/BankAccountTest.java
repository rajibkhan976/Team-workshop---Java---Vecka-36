package se.ecjava.rajib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
  private BankAccount ba;
  private Customer customer;
  @Before
  public void setup(){
    this.customer = new Customer("a", "b", "c");
    this.ba = new BankAccount(0, customer);
  }

  @Test
  public void getId() {
    assertNotNull(ba.getId());
  }

  @Test
  public void getSaldo() {
    assertEquals(0, ba.getSaldo());
  }

  @Test
  public void getAccountOwner() {
    assertEquals(customer,ba.getAccountOwner());
  }

  @Test
  public void addToSaldo(){
    ba.addToSaldo(500);
    assertEquals(500, ba.getSaldo());
  }

  @Test
  public void addToSaldo1(){
    ba.addToSaldo(400);
    assertEquals(400, ba.getSaldo());
  }

  @Test
  public void addToSaldo2(){
    ba.addToSaldo(500);
    ba.addToSaldo(100);
    assertEquals(600, ba.getSaldo());
  }

  @Test
  public void addToSaldo3(){
    ba.addToSaldo(-100);
    assertEquals(0, ba.getSaldo());
  }

  @Test
  public void withdraw(){
    ba.withdraw(-100);
    assertEquals(0, ba.getSaldo());
  }

  @Test
  public void withdraw1(){
    ba.addToSaldo(200);
    ba.withdraw(100);
    assertEquals(100, ba.getSaldo());
  }
}