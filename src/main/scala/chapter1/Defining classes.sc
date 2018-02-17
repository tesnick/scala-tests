//class Money(amount:Int)

//val notMuch = new Money(2)

// amount is not accessible,
// to make amount a field accessible of the Money class
//class Money(val amount:Int)

//val notMuch = new Money(2)

//notMuch.amount

//notMuch.amount = 3
// "Error: reassignament to val"


class Money(var amount:Int)

val notMuch = new Money(2)

notMuch.amount = 3

notMuch.amount

