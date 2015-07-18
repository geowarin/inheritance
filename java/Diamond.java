interface Named {
  String getName();
}

interface Greeter extends Named {
  default void greet() {
    System.out.println("Hi. I'm " + getName());
  }
}
interface Polite extends Named {
  default void greet() {
    System.out.println("Let me introduce myself: My name is " + getName());
  }
}

class Person implements Greeter, Polite {
  String name;

  // won't compile if the method is not redefined
  public void greet() {
      Polite.super.greet();
      Greeter.super.greet();
  }

  Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Diamond {
  public static void main(String[] args) {
    new Person("Georges").greet();
  }
}
