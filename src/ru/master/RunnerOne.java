package ru.master;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Optional;

public class RunnerOne {
  public void Run_1() {

    BigDecimal rf_shares_quantity = BigDecimal.valueOf(3615610.70765505);
    //    BigDecimal rf_shares_quantity = BigDecimal.valueOf(5461.92739092);
//    BigDecimal rf_shares_quantity = BigDecimal.valueOf(3615610.70765505);
    //BigDecimal rf_shares_quantity = BigDecimal.valueOf(5461.92739092);
    BigDecimal fund_quotation = BigDecimal.valueOf(0.0422);
//    BigDecimal fund_quotation = BigDecimal.valueOf(0.093700);
    // BigDecimal fund_quotation = BigDecimal.valueOf(0.0450);
    //BigDecimal fund_quotation = BigDecimal.valueOf(0.093700);


    // котировка = 0,0422 * количество = 3615610,70765505 получается 152 578,77,
    // но в расчет выведено 152 900,5612 – дельта 321,79


    BigDecimal rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4,
            RoundingMode.HALF_DOWN);

    System.out.println("result: " + rf_in_fund_currency);
    System.out.println("precision: " + rf_in_fund_currency.precision());
    System.out.println("signum: " + rf_in_fund_currency.signum());
    System.out.println("unscaledValue: " + rf_in_fund_currency.unscaledValue());
    System.out.println("ulp: " + rf_in_fund_currency.ulp());
    System.out.println("scale: " + rf_in_fund_currency.scale());
    System.out.println("stripTrailingZeros: " + rf_in_fund_currency.stripTrailingZeros().toEngineeringString());










    /*<rf_shares_quantity>3615610.70765505</rf_shares_quantity>
  <rf_in_fund_currency>152900.5612</rf_in_fund_currency>
  <did_coupon>null</did_coupon>
  <guaranteed_coupon>null</guaranteed_coupon>
  <rf_notes_quantity>3615.61070766</rf_notes_quantity>
  <fund_quotation>0.0422</fund_quotation>
*/


  }

  public void Run_2() {
    // котировка = 0.0422 * количество = 3615610.70765505 получается 152578.7719,
    // но в расчет выведено 152900.5612 – дельта 321,79
    BigDecimal rf_shares_quantity = BigDecimal.valueOf(3615610.70765505);
    BigDecimal fund_quotation = BigDecimal.valueOf(0.0422);
    BigDecimal rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4, RoundingMode.HALF_UP);
    System.out.println("Эталонный результат: " + rf_in_fund_currency);  //152578.7719

    // Начинаем считать многопоточно
    System.out.println("Enroller started...");
    for (int i = 1; i < 6000; i++)
      new ThExecutor(rf_in_fund_currency, "ThExecutor " + i).start();
    System.out.println("Enroller finished...");
  }

  public void Run_3() {

//    BigDecimal bd = new BigDecimal(1.49);
    BigDecimal bd = BigDecimal.TEN;
//    bd.setScale(2, RoundingMode.HALF_UP);

//    System.out.println(bd.toString());

    System.out.println("result: " + bd);
    System.out.println("precision: " + bd.precision());
    System.out.println("signum: " + bd.signum());
    System.out.println("unscaledValue: " + bd.unscaledValue());
    System.out.println("ulp: " + bd.ulp());
    System.out.println("scale: " + bd.scale());
    System.out.println("stripTrailingZeros: " + bd.stripTrailingZeros().toEngineeringString());


  }

  public void Run_4() {

//    String curr_val = "  RUB   TUGR               EUR    GBF   ";
//    String curr_val = "  EEE   TUGR               EUR    GBF   ";
    String curr_val = "RUB___USD";
//    String curr_val = "rub usd";
//    String curr_val = "  RUB  ";
//    String curr_val = "  USD  ";
//    String curr_val = "    ";

//    String curr_val_repl = curr_val.replace("  ", " ");
//    String curr_val_repl = curr_val.replaceAll("  ", " ");

//    int len = curr_val_repl.length();

//    String[] str_arr2 = curr_val_repl.split("\\s");
//    String[] str_arr2 = curr_val.trim().split("\\s+");
    String[] str_arr2 = curr_val.trim().split("\\_+");

    Optional<String> currency = Arrays.stream(str_arr2).filter(m -> !m.toUpperCase().equals("RUB")).findFirst();

//    String curr_token = currency.orElse("FIGOVINA");
    String curr_token = currency.orElse("").toUpperCase();




    System.out.println("что получилось: " + curr_token);
  }

  public static Boolean isPolicyCurrencyRUB(String _currency_str_val) {
    return _currency_str_val.trim().toUpperCase().equals("RUB");
  }

  public static Boolean isPolicyCurrencyNonRUB(String _currency_str_val) {
    Boolean result = false;
    String input_currency = _currency_str_val.trim().toUpperCase();


    boolean b1 = !input_currency.equals("RUB");
    boolean b2 = input_currency.length() < 4;




    if(!input_currency.equals("RUB") /*&& input_currency.length() < 4*/) {
      // полис не рублёвый и не мультивалютный
      result = true;
    }
    return result;
  }





  public void Run_5() {
    BigDecimal rf_shares_quantity = null;
    BigDecimal fund_quotation = null;
    BigDecimal rf_in_fund_currency = null;

    /*7663985414
    7663985320
    7663985508
    7663985778
    7663986395*/




    /*0.0890
    0.0890
    0.0775
    0.0360
    0.0902
*/



    /*
    2020-12-01 11:22:30.109  INFO 29774 --- [ntainer#1-2-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:db744d1a-21b5-490b-9588-373e5ab789ef Полис ID: 7663985414 УСПЕШНО РФ, количество номинала: 79665.40900723
    2020-12-01 11:22:30.115  INFO 29774 --- [ntainer#1-0-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:1b41a9ad-d094-4dd2-8728-d4e574b2051f Полис ID: 7663985320 УСПЕШНО РФ, количество номинала: 119498.11351084
    2020-12-01 11:22:30.127  INFO 29774 --- [ntainer#1-1-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:70b817d3-085a-4992-95b0-7e00287f3e08 Полис ID: 7663985508 УСПЕШНО РФ, количество номинала: 57310.60102476
    2020-12-01 11:22:30.311  INFO 29774 --- [ntainer#1-1-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:70b817d3-085a-4992-95b0-7e00287f3e08 Полис ID: 7663985778 УСПЕШНО РФ, количество номинала: 596960.15817308
    2020-12-01 11:22:30.319  INFO 29774 --- [ntainer#1-3-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:f175143f-b8ed-4455-9cb4-4eee6ac152c3 Полис ID: 7663986395 УСПЕШНО РФ, количество номинала: 36546.40903919

    2020-12-01 11:22:30.109  INFO 29774 --- [ntainer#1-2-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:db744d1a-21b5-490b-9588-373e5ab789ef Полис ID: 7663985414 УСПЕШНО Котировка фонда на дату расчета: 0.089028
    2020-12-01 11:22:30.115  INFO 29774 --- [ntainer#1-0-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:1b41a9ad-d094-4dd2-8728-d4e574b2051f Полис ID: 7663985320 УСПЕШНО Котировка фонда на дату расчета: 0.089028
    2020-12-01 11:22:30.127  INFO 29774 --- [ntainer#1-1-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:70b817d3-085a-4992-95b0-7e00287f3e08 Полис ID: 7663985508 УСПЕШНО Котировка фонда на дату расчета: 0.077560
    2020-12-01 11:22:30.311  INFO 29774 --- [ntainer#1-1-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:70b817d3-085a-4992-95b0-7e00287f3e08 Полис ID: 7663985778 УСПЕШНО Котировка фонда на дату расчета: 0.036080
    2020-12-01 11:22:30.319  INFO 29774 --- [ntainer#1-3-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:f175143f-b8ed-4455-9cb4-4eee6ac152c3 Полис ID: 7663986395 УСПЕШНО Котировка фонда на дату расчета: 0.090201

    2020-12-01 11:22:30.109  INFO 29774 --- [ntainer#1-2-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:db744d1a-21b5-490b-9588-373e5ab789ef Полис ID: 7663985414 УСПЕШНО РФ на дату (в валюте фонда): 7092.4520
    2020-12-01 11:22:30.115  INFO 29774 --- [ntainer#1-0-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:1b41a9ad-d094-4dd2-8728-d4e574b2051f Полис ID: 7663985320 УСПЕШНО РФ на дату (в валюте фонда): 10638.6780
    2020-12-01 11:22:30.127  INFO 29774 --- [ntainer#1-1-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:70b817d3-085a-4992-95b0-7e00287f3e08 Полис ID: 7663985508 УСПЕШНО РФ на дату (в валюте фонда): 4445.0102
    2020-12-01 11:22:30.311  INFO 29774 --- [ntainer#1-1-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:70b817d3-085a-4992-95b0-7e00287f3e08 Полис ID: 7663985778 УСПЕШНО РФ на дату (в валюте фонда): 21538.3225
    2020-12-01 11:22:30.320  INFO 29774 --- [ntainer#1-3-C-1] r.s.i.s.impl.DidClassicCalcServiceImpl   : UID:f175143f-b8ed-4455-9cb4-4eee6ac152c3 Полис ID: 7663986395 УСПЕШНО РФ на дату (в валюте фонда): 3296.5226
    */

    rf_shares_quantity = BigDecimal.valueOf(79665.40900723);
    fund_quotation = BigDecimal.valueOf(0.0890);
    rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4,
            RoundingMode.HALF_UP);
    System.out.println("result: " + rf_in_fund_currency);


    rf_shares_quantity = BigDecimal.valueOf(119498.11351084);
    fund_quotation = BigDecimal.valueOf(0.0890);
    rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4,
            RoundingMode.HALF_UP);
    System.out.println("result: " + rf_in_fund_currency);

    rf_shares_quantity = BigDecimal.valueOf(57310.60102476);
    fund_quotation = BigDecimal.valueOf(0.0775);
    rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4,
            RoundingMode.HALF_UP);
    System.out.println("result: " + rf_in_fund_currency);

    rf_shares_quantity = BigDecimal.valueOf(596960.15817308);
    fund_quotation = BigDecimal.valueOf(0.0360);
    rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4,
            RoundingMode.HALF_UP);
    System.out.println("result: " + rf_in_fund_currency);

    rf_shares_quantity = BigDecimal.valueOf(36546.40903919);
    fund_quotation = BigDecimal.valueOf(0.0902);
    rf_in_fund_currency = rf_shares_quantity
        .multiply(fund_quotation)
        .setScale(4,
            RoundingMode.HALF_UP);
    System.out.println("result: " + rf_in_fund_currency);








    /*System.out.println("precision: " + rf_in_fund_currency.precision());
    System.out.println("signum: " + rf_in_fund_currency.signum());
    System.out.println("unscaledValue: " + rf_in_fund_currency.unscaledValue());
    System.out.println("ulp: " + rf_in_fund_currency.ulp());
    System.out.println("scale: " + rf_in_fund_currency.scale());
    System.out.println("stripTrailingZeros: " + rf_in_fund_currency.stripTrailingZeros().toEngineeringString());*/




  }




}