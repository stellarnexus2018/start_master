package ru.master;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnerThree {
  public void Run_0() {
    Collection<String> col_str_1 = Collections.emptyList();
    Collection<String> col_str_2 = Collections.emptyList();

    List<String> lst_policy_isins = Stream.concat(
        col_str_1
            .stream()
            .map(String::toUpperCase),
        col_str_2
            .stream()
            .map(String::toUpperCase)
    )
        .distinct()
        .collect(Collectors.toList());

    System.out.println("col_str_1: " + col_str_1);
    System.out.println("col_str_2: " + col_str_2);
    System.out.println("проверка: " + lst_policy_isins);
    System.out.println("количество: " + lst_policy_isins.size());
  }

  public void Run_1() {
    BigDecimal bd_1 = BigDecimal.ONE;
    //boolean b = BigDecimal.ZERO.compareTo(bd_1) != 0;
    boolean b = BigDecimal.ZERO.compareTo(bd_1) == 0;
    System.out.println("b: " + b);
  }

  public void Run_2() {
    System.out.println("b: " + ErrorTypes.DIDCalcPrevDiff.getErrCode());
  }

  public void Run_3() {
    LocalDate _date_be_compared = LocalDate.of(2021, 1, 21);
    LocalDate _date_from_which_compare = LocalDate.of(2021, 1, 20);
    boolean b = (_date_be_compared.isEqual(_date_from_which_compare) || _date_be_compared.isAfter(_date_from_which_compare));
    System.out.println("результат: " + b);
  }

  public void Run_4() {
    String source = "USD ";
    String b = source
        .trim()
        .equalsIgnoreCase("RUB") ?
        //.equals("RUB") ?
        "жопка"
        :"писька";
    System.out.println("результат: " + b);
  }
}