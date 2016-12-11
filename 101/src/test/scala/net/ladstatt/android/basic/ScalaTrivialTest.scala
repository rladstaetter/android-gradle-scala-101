package net.ladstatt.android.basic

import org.junit.Test
import org.junit.Assert._


/**
  * Shows a simple unit test written in scala
  */
class ScalaTrivialTest {

  /**
    * "@Test" is an annotation that marks the following method definition to be a 'test method'.
    *
    * The test will be executed.
    */
  @Test def testThatAdditionOfAAndBWorks(): Unit = {
    val a = 0
    val b = 10
    assertTrue(a + b == 10)
  }




}