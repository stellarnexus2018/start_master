package ru.master;

public class Main {

  public static void main(String[] args) {
    System.out.println("mastering new laptop");
    RunnerOne r_one = new RunnerOne();
    //r_one.Run_2();
    //r_one.Run_1();
    //r_one.Run_3();
    //r_one.Run_4();
    //Boolean b = RunnerOne.isPolicyCurrencyRUB("RUB");
    //r_one.Run_5();

    RunnerTwo r2 = new RunnerTwo();
    //r2.Run_1();
    //r2.Run_2();
    //r2.Run_3();

    //Boolean b = RunnerOne.isPolicyCurrencyNonRUB("RUB");
    //System.out.println(b);

    RunnerThree r3 = new RunnerThree();
    //r3.Run_0();
    //r3.Run_1();
    //r3.Run_2();
    //r3.Run_3();
    r3.Run_4();
  }
}