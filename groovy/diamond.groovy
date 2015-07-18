#! /usr/bin/env groovy

trait Named {
  String name
}

trait Casual implements Named {
  void greet() {
    println "Hi, I'm $name"
  }
}

trait Polite implements Named {
  void greet() {
    println "Greetings good sirs, my name is $name"
  }
}

class Dude implements Polite, Casual {}

new Dude(name: 'John').greet() // last trait wins

class Noble implements Polite, Casual {
  void greet() {
    Polite.super.greet()
    println "Indeed."
  }
}

new Noble(name: 'James').greet() // we can selectively call a super method
