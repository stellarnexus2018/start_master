package ru.master;

import java.util.Random;

import static ru.master.utils.PrinterSub.print;

public class ForLoop {
  public void testLoop() {
    Random rnd = new Random();
    for (int i = 1, j = 100, k = 1; i <= 100; i++, j--, k = rnd.nextInt(i)) {
      print("i=" + i + " j=" + j + " k=" + k);
    }
  }

  public void testCharacters() {
    for (char i = 0; i < 128; i++) {
      if (!Character.isLowerCase(i)) {
        print("символ = " + i + " код = " + (int) i);
      }
    }
  }

  public void testMoreChars() {
    for (char i : "Тупорыльно и лохмато".toCharArray()) {
      print(i);
    }
  }


}