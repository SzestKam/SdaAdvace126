package opp.task04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListRunner {

  public static void main(String[] args) {

    List<Integer> myList = new ArrayList<>();

/*    byte -> Byte;
    short -> Short;
    char -> Character;
    int -> Integer;
    long -> Long;
    float -> Float;
    double -> Double;
    boolean -> Boolean;

    byte aB = 2;
    Byte bB  = 2;
*/
    myList.add(2);
    myList.add(5);
    myList.add(50);
    myList.add(50);
    myList.add(50);
    myList.add(-5);
    myList.add(800);

    System.out.println("---Old fashion / deprecated---");
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    System.out.println("---Enhanced list iteration---");
    for (int el : myList) {
      System.out.println(el);
    }

    System.out.println("---Stream iteration---");
    myList.forEach(System.out::println);

    Set<Integer> mySet = new HashSet<>();
    mySet.add(12);
    mySet.add(22);
    mySet.addAll(myList);
    System.out.println("---Stream iteration from SET---");
    mySet.forEach(System.out::println);



  }
}
