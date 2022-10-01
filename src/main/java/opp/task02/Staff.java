package opp.task02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Staff extends Person {

  private String specialization;
  private float salary;

  public Staff(String name, String address, String specialization, float salary) {
    super(name, address);
    this.specialization = specialization;
    setSalary(salary);
    this.salary = salary;
  }

  public void setSalary(float salary) {
    if (salary <= 0) {
      throw new IllegalArgumentException("Not acceptable salary!!!");
    }
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Staff: %s\nspecialization: %s\nsalary: %.2f",
        super.toString(),
        specialization,
        salary);
  }
}
