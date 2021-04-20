package ru.master;

public class Test4 {
  public Integer[] iarr;

  public Test4(){
    iarr = new Integer[] {4,6,8,10};
  }
  public void printArray(Object... args) {
    for (Object o : args) {
      System.out.println("значение " + o);
    }
  }
}
