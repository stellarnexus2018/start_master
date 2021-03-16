package ru.master;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ThExecutor extends Thread {
  volatile BigDecimal input_equator;
  public ThExecutor(BigDecimal _input_equator, String _th_name) {
    super(_th_name);
    input_equator = _input_equator;
  }

  public void run() {
    String th_name = Thread.currentThread().getName();
    //System.out.printf("%s is start... \n", th_name);
    BigDecimal rf_shares_quantity = BigDecimal.valueOf(3615610.70765505);
    BigDecimal fund_quotation = BigDecimal.valueOf(0.0422);
    BigDecimal rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4, RoundingMode.HALF_UP);
    if(!rf_in_fund_currency.equals(input_equator)) {
      System.out.println("Th: " + th_name + " не совпадение: " + rf_in_fund_currency + "\n");
    }
    //System.out.printf("%s is done... \n", th_name);
  }
}