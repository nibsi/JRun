package com.mycompany.common;

public final class Greeter {

  private Greeter() {}

  public static String greet(Object object) {
    return String.format("Hello %s!", object);
  }
}
