package ru.master;

public class Test2 {
  boolean flag = false;

  public Test2(boolean _flag) {
    flag = _flag;
  }

  public void checkIn() {
    flag = false;
  }

  public void finalize() {
    if(flag)
      System.out.println("fin");
  }
}