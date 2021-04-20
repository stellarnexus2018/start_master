package ru.master;

import static ru.master.utils.PrinterSub.print;

public class Main {

  public static void main(String[] args) {



    for (Nums n : Nums.values()
         ) {
      System.out.println("ordinal: " + n.ordinal() + " name: " + n.name());

    }



  }
}