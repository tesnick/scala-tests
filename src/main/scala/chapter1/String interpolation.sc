val many = 10000.2345

// s interpolator

val amount = s"$many euros"

// f interpolator

val amount2 = f"$many%12.2feuros"

val amount3 = s"${many*2} euros"

case class SummableMoney(val amount:Int=1, val currency:String="USD"){
  def +(other: SummableMoney) : SummableMoney = SummableMoney(amount + other.amount)
}

val amounts = List(SummableMoney(10, "USD"),
  SummableMoney(2, "EUR"), SummableMoney(20, "GBP"),
  SummableMoney(75, "EUR"), SummableMoney(100, "USD"),
  SummableMoney(50, "USD")
)

val printedAmounts = amounts map(m=>s"${m.amount} ${m.currency}")

