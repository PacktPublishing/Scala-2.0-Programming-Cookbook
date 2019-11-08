import org.scalatest._

import org.scalatest.FunSuite
import cookbook.Main._ 

class AddSuite extends FunSuite {

  test("The Add function should add 2 numbers") {
    val add = Add(4,2) 
    assert(add == 6)
  }
}