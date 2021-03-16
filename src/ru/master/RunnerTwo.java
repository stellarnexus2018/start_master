package ru.master;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.obermuhlner.math.big.BigDecimalMath;

public class RunnerTwo {
  public void Run_3() {
    BigDecimal _comparing_val = null;
    Boolean b = _comparing_val.equals(null);
    //Boolean b = BigDecimal.ZERO.compareTo(_comparing_val) == 0;
    System.out.println("проверка: " + b);
  }


  public void Run_2() {
    Map<Long, LocalDate> mp = new HashMap<>();
    LocalDate ld_now = LocalDate.now();
    LocalDate ld_plus20 = ld_now.plusYears(20);
    double days_between = ChronoUnit.DAYS.between(ld_now, ld_plus20);

    for (long i = 0; i <= days_between; i++) {
      LocalDate ld_tmp = ld_now.plusDays(i);
      System.out.println("i: " + i + " ld_tmp: " + ld_tmp);
      mp.put(i, ld_tmp);
    }
    System.out.println("ld_now: " + ld_now);
    System.out.println("ld_plus20: " + ld_plus20);
    System.out.println("Количество: " + mp.size());
  }

  public void Run_1() {
    List<BigDecimal> lst = new ArrayList<>(8000);



    /*BigDecimal gfMultiplicand = BigDecimalMath
        .pow(targetActualPrev, calcDatePowerDecimal, new MathContext(32, RoundingMode.HALF_UP))
        .setScale(8, RoundingMode.HALF_UP);*/
    //  LocalDate dnow = LocalDate.now();
    //  LocalDate dnow_plus_1 = LocalDate.of(2021, 12, 4);
    //  (t-tст)/365
    //  double calcDate = ChronoUnit.DAYS.between(dnow, dnow_plus_1);
    //  double calcDatePower = calcDate/365d;

    LocalDate ld = LocalDate.now();
    LocalDate ld1 = ld.plusYears(20);
    /*while (!ld.isEqual(ld1)) {

    }*/

    double days_between = ChronoUnit.DAYS.between(ld, ld1);
    for (double i = 1; i <= days_between; i++) {
      BigDecimal a1         = BigDecimal.valueOf(4.85d).divide(BigDecimal.valueOf(100d), 8, RoundingMode.HALF_UP);
      BigDecimal exp_pow    = BigDecimal.valueOf(i).divide(BigDecimal.valueOf(365d), 8, RoundingMode.HALF_UP);
      BigDecimal summa      = BigDecimal.ONE.add(a1);
      BigDecimal pow_result = BigDecimalMath.pow(summa, exp_pow, new MathContext(32, RoundingMode.HALF_UP));
      BigDecimal g_f        = BigDecimal.ONE.multiply(pow_result).setScale(8, RoundingMode.HALF_UP);
      lst.add(g_f);
    }

    //System.out.println(g_f);
    System.out.println(lst.size());

    // ГФt = 1 * ((1+A1)^(t/365)),
    // где 1 – котировка ГФ на первый день серии,
    // А1 - значение поля «Целевая доходность» справочника «Серии ИСЖ и ИСЖК» для данной серии,
    // деленное на 100 (А1= planning_profit/100).
    //
    // РезФt = 1 * ((1+A2)^(t/365)),
    // где 1 – котировка РезФ на первый день серии,
    // А2 - значение поля «Гарантированная доходность» справочника «Серии ИСЖ и ИСЖК» для данной серии,
    // деленное на 100 (А2= guaranteed_profit/100).
    //
  }
}