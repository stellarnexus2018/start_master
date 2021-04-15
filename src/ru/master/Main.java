package ru.master;

import static ru.master.utils.PrinterSub.print;

public class Main {

  public static void main(String[] args) {
    /*String s = args[0];
    String d = args[1];
    Test1 t1 = new Test1();
    t1.runnerOne("Игоряша", s, d);*/


    Dog d1 = new Dog();
    d1.name = "Boss";
    d1.says = "ГАААААВ";

    Dog d2 = new Dog();
    d2.name = "Мямля";
    d2.says = "гяяяяявь";

    Dog d3 = d1;

    d1.Gav();
    d2.Gav();

    print("d3==d1 " + (d3==d1));
    print("d3.equals(d1) " + d3.equals(d1));




  }
}