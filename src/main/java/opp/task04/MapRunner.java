package opp.task04;

import java.util.HashMap;
import java.util.Map;

class MapRunner {

  public static void main(String[] args) {
    Map<Integer, Point2D> square = new HashMap<>();

    square.put(1, new Point2D(0, 0));
    square.put(2, new Point2D(0, 1));
    square.put(3, new Point2D(1, 0));
    square.put(4, new Point2D(1, 1));

    System.out.println("old school");
    for (int key: square.keySet()){
      System.out.println(square.get(key));
    }

    System.out.println("stream");
    square.forEach((idx, point) -> System.out.println(point));

  }

}
