package opp.task02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Podyplomowe implements Studies {

  private final float duration;
  private final int totalCost;

  @Override
  public float getDuration() {
    return duration;
  }

  @Override
  public int getTotalCost() {
    return totalCost;
  }
}
