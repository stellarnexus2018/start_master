package ru.master;
//: object/HelloDate.java

import java.lang.*;
import java.util.Date;
import java.util.Random;

import static ru.master.utils.PrinterSub.*;

/**
 * Простое описание класса
 * выводит дату
 *
 * @author Игоряша
 * @author Главный Игоряша
 * @version 1.0
 */
public class Test1 {
  /**
   * параметр i
   */
  public int i;
  /**
   * parameter j
   */
  public int j;

  /**
   * Запускашка <em>такая</em> хорошая
   * <pre>
   *   ну и пре тут
   * </pre>
   * <ol>
   *   <li>первая</li>
   *   <li>вторая</li>
   *   <li>третья</li>
   *   <li>четвёртая</li>
   * </ol>
   *
   * @param _str    Входящий параметр
   * @param _param1 param1 from arr
   * @param _param2 param2 from arr
   */
  public void runnerOne(String _str, String _param1, String _param2) {
    Integer I = i;
    Integer J = j;

    System.out.println("Проверка взаимодействия: " + _str);
    System.out.println("Проверка parameters1: " + _param1);
    System.out.println("Проверка parameters2: " + _param2);
    System.out.println("i: " + i);
    System.out.println("j: " + j);
    System.out.println("I: " + I);
    System.out.println("J: " + J);
    System.out.println("Date: " + new Date());

    //System.getProperties().list(System.out);
//    System.out.println(System.getProperty("user.name"));
//    System.out.println(System.getProperty("java.library.path"));
  }

  public void runnerTwo() {
    print("рандом");
    Random rnd = new Random();
    print(rnd.nextInt(100));
    print(rnd.nextFloat());
    print(rnd.nextDouble());
  }

  public void calcRange() {
    Random rnd = new Random();

    int speed = rnd.nextInt(50);
    int time = rnd.nextInt(50);
    int range = speed * time;

    print("скорость: " + speed);
    print("время: " + time);
    print("расстояние: " + range);
  }

  public void incrementOne() {
    int speed = 1;

    print("скорость: " + speed);
    print("++speed: " + ++speed);
    print("speed++: " + speed++);
    print("скорость: " + speed);

  }

  public void equalityData() {
    int i = 1;
    int j = 1;

    print("для интов: " + (i == j));

    Integer I = new Integer(1);
    Integer J = new Integer(1);

    print("для интеджеров: " + (I == J));
    print("для интеджеров: " + (I.equals(J)));

    String s1 = "qqq";
    String s2 = "qqq";

    print("для стрингов: " + (s1 == s2));
    print("для стрингов: " + s1.equals(s2));


  }

  public void TestBinStr() {
    int i = 153;
    print(Integer.toBinaryString(i));
    try {
      i = Integer.parseInt("14");
    } catch (NumberFormatException nfe) {
      nfe.printStackTrace();
    }
    print(i);
  }
}