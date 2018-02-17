List(1,2,3,4).map(x => x+1)

def increment = (x:Int) => x + 1

List(1,2,3,4).map(increment)

List(1,2,3,4) map increment

case class SummableMoney(val amount:Int=1, val currency:String="USD"){
  def +(other: SummableMoney) : SummableMoney = SummableMoney(amount + other.amount)
}

val amounts = List(SummableMoney(10, "USD"),
  SummableMoney(2, "EUR"), SummableMoney(20, "GBP"),
  SummableMoney(75, "EUR"), SummableMoney(100, "USD"),
  SummableMoney(50, "USD")
)

val printedAmounts = amounts map(m => m.amount + " " + m.currency)



