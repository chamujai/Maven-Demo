package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greets someone with a good morning message.
   *
   * @param someone the person to greet
   * @return a good morning greeting
   */
  public String greet(String someone) {
    return String.format("Good morning, %s!", someone);
  }
}
