val numbers = List(1,2,3,4,5,6)

val simpleList = Nil.::(6)

val twoElementsList = List(6).::(5)

val concatenatedList = simpleList ::: twoElementsList

val things = List(0,1, true)

val otherThings = List(0,1,true, "string")

// check https://docs.scala-lang.org/tour/unified-types.html
// for more details

case class SummableMoney(val amount:Int=1, val currency:String="USD"){
  def +(other: SummableMoney) : SummableMoney = SummableMoney(amount + other.amount)
}

val amounts = List(SummableMoney(10, "USD"),
  SummableMoney(2, "EUR"), SummableMoney(20, "GBP"),
  SummableMoney(75, "EUR"), SummableMoney(100, "USD"),
  SummableMoney(50, "USD")
  )

val first = amounts.head

val amountsWithoutFirst = amounts.tail

val euros = amounts.filter(money => money.currency == "EUR")

val euros2 = amounts.filter(x => x.currency == "EUR")

val euros3 = amounts.filter(_.currency == "EUR")

val (a,b) = amounts.partition(amt => amt.currency=="EUR")

a
b

val allAmounts = amounts.partition(amt => amt.currency=="EUR")

allAmounts._1
allAmounts._2








