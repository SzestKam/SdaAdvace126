package opp.task02;

import lombok.Getter;

@Getter
enum StudiesType {
  // dla uproszczenia nazwy pochodzą z j. polskiego
  LICENCJAT(1.5f, 2_000),
  INZYNIERKA(3.5f, 3_000),
  MAGISTERKA(4, 7000),
  PODYPLOMOWE(2, 1000),
  DOKTORAT(10, 10_000);

  private final float duration;
  private final int totalCost;

  StudiesType(float duration, int totalCost) {
    this.duration = duration;
    this.totalCost = totalCost;
  }

  boolean suficiantBudget(float budget){
    return getTotalCost() <= budget;
  }
}
