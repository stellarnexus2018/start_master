package ru.master;

import static ru.master.utils.PrinterSub.print;

public class Dog {
  public String name;
  public String says;
  public void Gav() {
    print(name + " гавкает " + says);
  }
}