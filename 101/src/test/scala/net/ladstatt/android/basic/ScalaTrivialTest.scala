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
  @Test
  def testTrue(): Unit = assertTrue(true)

  /*
  @Test
  def testFalse(): Unit = {
    assertFalse(!true)
  }

  @Test
  def testEquals(): Unit = {
    assertTrue(true == true)
  }

*/

}