package opp.task02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student extends Person {

  private StudiesType type;
  private int year;
  private float cost;

  public Student(String name, String address, StudiesType type, int year, float cost) {
    super(name, address);

    studyValidator(year, type, cost);

    this.type = type;
    this.year = year;
    this.cost = cost;
  }

  private void studyValidator(int year, StudiesType type, float cost){
    if (year<=0){
      throw new IllegalArgumentException("Negative year");
    }
    if (type.getDuration() < year) {
      throw new IllegalArgumentException("Over bound");
    }

    if (!type.suficiantBudget(cost)) {
      throw new RuntimeException("To low budget");
    }

  }

  public Student(String name, String address) {
    super(name, address);
    this.type = StudiesType.MAGISTERKA;
    this.year = 1;
    this.cost = 0;
  }

  @Override
  public String toString() {

    return String.format("Student: %s\ntype: %s\nyear: %d\ncost: %.2f",
        super.toString(),
        type,
        year,
        cost);
  }

}
