package opp.task04;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class QuestCollectionsTask03 {

  public static void main(String[] args) {

    var myNumbers = new Random()
        .ints(100, 0, 51)
        .toArray();

    System.out.println("Generated list");
    Arrays.stream(myNumbers).sorted().forEach(System.out::println);

    System.out.println("Unique values - stream api");
    Arrays.stream(myNumbers).distinct().forEach(System.out::println);

    System.out.println("Unique values - set");
    var mySet = new HashSet<>();
    Arrays.stream(myNumbers).forEach(mySet::add);

    mySet.forEach(System.out::println);

    Map<Integer, Integer> counter = new HashMap<>();

    Arrays.stream(myNumbers)
        .forEach(el -> {
          if (counter.containsKey(el)) {
            counter.put(el, counter.get(el) + 1);
          } else {
            counter.put(el, 1);
          }
        });

    System.out.println("\nMany times");
    for (int key : counter.keySet()) {
      if (counter.get(key) > 1) {
        System.out.print(key + ", ");
      }
    }

    System.out.println("\nOnly one");
    for (int key : counter.keySet()) {
      if (counter.get(key) == 1) {
        System.out.print(key + ", ");
      }
    }

  }

}
