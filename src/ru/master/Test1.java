package ru.master;
//: object/HelloDate.java
import java.lang.*;
import java.util.Date;

/** Простое описание класса
 * выводит дату
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
   * @param _str Входящий параметр
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
}/* Output: (55% match)
Hello, it's:
Wed Oct 05 14:39:36 MDT 2005
*///:~