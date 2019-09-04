package se.ecjava.rajib;

import java.util.Objects;
import java.util.UUID;

public class BankAccount {
  private String id;
  private int saldo;
  private Customer accountOwner;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount that = (BankAccount) o;
    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public BankAccount(int saldo, Customer accountOwner) {
    this.saldo = saldo;
    this.accountOwner = accountOwner;
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }

  public int getSaldo() {
    return saldo;
  }

  public Customer getAccountOwner() {
    return accountOwner;
  }

  public void addToSaldo(int deposit) {
    if (invalidDeposit(deposit)){
      return;
    }
    this.saldo = this.saldo + deposit;

  }

  private boolean invalidDeposit(int deposit){
    return deposit < 0;
  }

  public void withdraw(int amount) {
    if (invalidWithdraw(amount)){
      return;
    }
    this.saldo = this.saldo - amount;
  }

  private boolean invalidWithdraw(int withdraw){
    return withdraw > this.saldo || withdraw < 0;
  }
}
