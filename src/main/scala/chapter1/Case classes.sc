case class Money(amount:Int = 1, currency:String = "USD")

val defaultAmount = Money()

defaultAmount

val fifteenDollars = Money(15, "USD")

fifteenDollars

val fifteenDollars2 = Money(15)

fifteenDollars2

val someEuros = Money(currency="EUR")

val twentyEuros = Money(amount=20, currency="EUR")

val tenEuros = twentyEuros.copy(10)

val twentyDollars = twentyEuros.copy(currency = "USD")

// Summing method

case class SummableMoney(val amount:Int=1, val currency:String="USD"){
  def +(other: SummableMoney) : SummableMoney = SummableMoney(amount + other.amount)
}

SummableMoney(12) + SummableMoney(34)

// Manipulating Collections

val numbers  = List(1,2,5)

for (n <- numbers) println("Number " + n)

// Lambdas

numbers.foreach{ n:Int => println("Number " + n)}





