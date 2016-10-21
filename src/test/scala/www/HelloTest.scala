package www

import utest._

import org.scalajs.jquery.jQuery

/**
  * Created by nuboat on 2016-10-21.
  */
object HelloTest extends TestSuite {

  Hello.setupUI()

  override def tests = TestSuite {
    'HelloWorld {
      assert(jQuery("p:contains('Hello World')").length == 1)
    }
  }

}