package com.mycompany.slicer;

import java.io.*;

import com.mycompany.common.Greeter;

final class Slicer {

  public static void main(String... args) throws IOException {
    var greeting = Greeter.greet("World");

    System.out.println(greeting);
  }
}
