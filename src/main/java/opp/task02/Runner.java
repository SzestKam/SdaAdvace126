package opp.task02;

class Runner {

  public static void main(String[] args) {
    Person p1 = new Person("John", "Brooklyn Av. 12");
    Person s1 = new Student("Suzy", "New York");
    Person s2 = new Student("Suzy", "New York", StudiesType.LICENCJAT,1, 10000);
    Person w1 = new Staff("Tom","Boston","Driver", 1000);
    try {
      Person w2 = new Staff("Ann", "Boston", "Driver", -1000);
      System.out.println();
      System.out.println(w2);
    } catch (RuntimeException e){
      System.out.println("Huston, we have problem");
    }

    System.out.println(p1);
    System.out.println();
    System.out.println(s1);
    System.out.println();
    System.out.println(s2);
    System.out.println();
    System.out.println(w1);
/*
    Student s3 = new Student("Jan", "Polkowiece",
        StudiesType.DOKTORAT, 3, 5_000);
*/

    Studies pod_1 = new Podyplomowe(2.0f, 6000);
    if (pod_1.sufficientBudget(7000)) {
      System.out.println("Is OK");
    } else {
      System.out.println("Not enough $");
    }


  }

}
