val wallet = Map("USD" -> 10, "EUR" -> 2)

val tenDollars = "USD" -> 10

val tenDollars2 = ("USD", 10)

val updatedWallet = wallet + ("GBP" -> 20)

val someEuros = wallet("EUR")

// val someFounds = wallet("GBP")
// java.util.NoSuchElementException: key not found: GBP
// at scala.collection.immutable.Map$Map2.apply(Introducing Map.sc:125)
// at chapter1.A$A8$A$A8.someFounds$lzycompute(Introducing Map.sc:11)
// at chapter1.A$A8$A$A8.someFounds(Introducing Map.sc:11)
// at #worksheet#.#worksheet#(Introducing Map.sc:11)

// Option construct <- when using .get() method on Map

val maybeSomeEuros = wallet.get("EUR")

val maybeSomePounds = wallet.get("GBP")

// Pattern matching

val status = maybeSomeEuros match {

  case None => "Nothing of that currency"

  case Some(value) => "I have " + value + " Euros"

}


val status2 = maybeSomePounds match {

  case None => "Nothing of that currency"

  case Some(value) => "I have " + value + " Pounds"

}

