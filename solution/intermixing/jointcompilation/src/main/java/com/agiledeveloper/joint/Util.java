/***
 * Excerpted from "Programming Kotlin",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
***/
package com.agiledeveloper.joint;

public class Util {
  public double f2c(double fahrenheit) {
    return (fahrenheit - new Constants().getFreezingPointInF()) * 5 / 9.0;
  }
}