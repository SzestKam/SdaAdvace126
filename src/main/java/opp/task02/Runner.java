package opp.task02;

class Runner {

  public static void main(String[] args) {
    Person p1 = new Person("John", "Brooklyn Av. 12");
    Person s1 = new Student("Suzy", "New York");
    Person s2 = new Student("Suzy", "New York", "REGULAR",3, 100);
    Person w1 = new Staff("Tom","Boston","Driver", 1000);

    System.out.println(p1);
    System.out.println();
    System.out.println(s1);
    System.out.println();
    System.out.println(s2);
    System.out.println();
    System.out.println(w1);
  }

}
