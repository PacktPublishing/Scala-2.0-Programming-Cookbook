import org.scalatest._ 

import com.cookbook.Adder._ 

class AdderSpec extends FlatSpec with Matchers{

  "The add function " should " take two integers and add them together " in {
              val add1 = add(2,3)
               add1 should be (5) 
     }
}
