case class SummableMoney(val amount:Int=1, val currency:String="USD"){
  def +(other: SummableMoney) : SummableMoney = SummableMoney(amount + other.amount)
}

val amounts = List(SummableMoney(10, "USD"),
  SummableMoney(2, "EUR"), SummableMoney(20, "GBP"),
  SummableMoney(75, "EUR"), SummableMoney(100, "USD"),
  SummableMoney(50, "USD")
)

// Transform a collection into a Map
val sortedAmounts = amounts groupBy(_.currency)

val numbers = List(1,2,3,4,5,6)

val sumOfNumbers = numbers.foldLeft(0) {

  (total, element) => total + element

}

val sumOfNumbers2 = numbers.sum

