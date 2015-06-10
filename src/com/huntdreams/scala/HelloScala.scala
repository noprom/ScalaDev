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

  def helloscala() {
    println("Hello scala,this is Allen Wang!");
  }

  def add = (x: Int, y: Int) => x + y

  // 常量用val表示
  val sum = (x: Int, y: Int) => x + y

  def main(args: Array[String]) {
    //    println("Hello Scala!");
    //    println(hello("Scala"));
    //    helloscala();

    //    helloscala

    //    println(add(1, 2));

    println(sum(1, 2));
  }
}