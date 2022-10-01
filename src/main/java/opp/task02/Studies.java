package opp.task02;

public interface Studies {
  float getDuration();
  int getTotalCost();


   default boolean sufficientBudget(float budget) {
    return getTotalCost()<= budget;
  }

}
