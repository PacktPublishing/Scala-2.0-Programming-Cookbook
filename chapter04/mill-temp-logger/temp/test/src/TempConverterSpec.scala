import org.scalatest._ 

import temp.TempConverter._

class TempConverterSpec extends FlatSpec with Matchers{

"The Fahrenheit to Celsius converter  " should "convert Fahrenheit to C  " in {
  val fah1 = fahrenheitToCelsius(50)
  fah1 should be (10.0008)
 }
}


