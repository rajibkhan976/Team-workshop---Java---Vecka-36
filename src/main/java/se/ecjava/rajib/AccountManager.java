package se.ecjava.rajib;

import java.util.Arrays;

public class AccountManager {
  private BankAccount[] accounts;

  public AccountManager() {
    this.accounts = new BankAccount[0];
  }

  public void addAccount(BankAccount bankAccount) {
    int offset = accounts.length;
    BankAccount[] newArray = Arrays.copyOf(accounts, offset + 1);
    newArray[offset] = bankAccount;

    this.accounts = newArray;
  }

  public BankAccount[] getAccounts() {
    return accounts;
  }

  public BankAccount findAccount(BankAccount bankAccount) {
    for (BankAccount account : accounts) {
        if (account.equals(bankAccount)) {
          return account;
        }
    }
    return null;
  }
}
