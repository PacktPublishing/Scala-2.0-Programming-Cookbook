
//currency case class 
case class Currency(country: String, countryCode: String)


//currency companion object
object Currency {
  private val currencyList = Set[Currency]()

  def add(c: Currency) = currencyList :+ c 
  def getCurrencies = currencyList 
}


//having mutliple apply method in the currency companion object. 
class Currency2(countryCode: String, currencyCode: String)

object Currency2{
  def apply(s: String): Currency2
  def apply(countryCode:String, currencyCode:String): Currency2 = 
      new Currency(c.countryCode, c.currencyCode)
}

