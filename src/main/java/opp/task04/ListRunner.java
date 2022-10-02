package opp.task04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;

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
    myList.add(22);
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

    System.out.println("Numbers from range 20-100");
    Consumer<Integer> myPrint = el -> System.out.println("Mój element :" + el); // - >
    Predicate<Integer> valuesLowerThan100 = el -> el <= 100;

    myList.stream()
        .filter(new ValuesGreater(20))
        .filter(valuesLowerThan100)
        .distinct()
        .forEach(myPrint);

    Supplier<Integer> mySupp = () -> Integer.MIN_VALUE;

    var r = myList.stream()
        .filter(new ValuesGreater(1_000))
        .findFirst()
        .orElseGet(mySupp);
    System.out.println("Supplier test result: " + r);

  }
}

@AllArgsConstructor
class ValuesGreater implements Predicate<Integer> {

  private final int LOW_BOUND;

  @Override
  public boolean test(Integer element) {
    return LOW_BOUND <= element;
  }
}

// bezpośrednie implementowanie interfejsu funkcyjnego
class MyPrintConsumer implements Consumer<Integer> {

  @Override
  public void accept(Integer el) {
    System.out.println("Mój element :" + el);
  }

}
