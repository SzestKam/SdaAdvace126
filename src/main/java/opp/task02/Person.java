package opp.task02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Person {

  private String name;
  private String address;

  public Person() {
    name = "";
    address = "";
  }

  @Override
  public String toString() {
    return getName() + " -> " + getAddress();
  }
}
