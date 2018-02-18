class Customer(val name:String, val discountCode:String="N") {

  def discounts() : List[Int] = List(5)
  override def toString() = "Applied discounts: " +
   // Specifying a prefix, separator, and suffix with mkString
    discounts.mkString(" ", "%, ", "% ")

}

trait VIPCustomer extends Customer {
  override def discounts = super.discounts ::: List(10)
}

trait GoldCustomer extends Customer {
  override def discounts =
    if (discountCode.equals("H"))
      super.discounts ::: List(20)

    else super.discounts ::: List(15)
}

object Main {

  def main(args: Array[String]): Unit = {

    val myDiscounts = new Customer("Thomas", "H") with VIPCustomer with GoldCustomer
    println(myDiscounts)
  }
}

Main.main(Array.empty)


