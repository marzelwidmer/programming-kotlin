/***
 * Excerpted from "Programming Kotlin",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
***/
//Java code only for comparison purpose
package com.agiledeveloper.todo;

import javax.persistence.*;

@Entity
public class Task {
  @Id @GeneratedValue private Long id;
  private String description;

  public Long getId() { return id; }
  
  public String getDescription() { return description; }
}