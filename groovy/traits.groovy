#! /usr/bin/env groovy

trait Named {
  String name

  void greet() {
    println "My name is $name"
  }
}

trait Flying {
  int wings

  void fly() {
    println "I can fly with my $wings wings"
  }
}

class Bird implements Named, Flying {}

def flappy = new Bird(name: 'flappy', wings: 2)
flappy.greet()
flappy.fly()
