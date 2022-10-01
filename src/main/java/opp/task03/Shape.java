package opp.task03;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Shape {

  private boolean isFilled;
  private String color;


  @Override
  public String toString() {
    return "Shape with color of " +
        color +
        " and " +
        (isFilled ? "" : "not ") +
        "filled";
  }
}
