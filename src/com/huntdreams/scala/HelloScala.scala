package com.huntdreams.scala

/**
 * @author noprom
 */
class HelloScala {

}

object HelloScala {

  def hello(name: String): String = {
    "Hello" + name;
  }

  def main(args: Array[String]) {
    //    println("Hello Scala!");
    println(hello("Scala"));
  }
}