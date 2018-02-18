object Main {
  def main(args: Array[String]): Unit = {
    println("Hello Scala World !")
  }
}

Main.main(Array.empty)

// Companion objects

case class Customer(val name:String)

val thomas = Customer("Thomas")

val thomas2 = new Customer("Thomas")

// Handling exceptions

def parse(numberAsString : String) =
  try {
    Integer.parseInt(numberAsString)
  } catch {
    case nfe : NumberFormatException => println("Wrong format for number " + numberAsString)
    case e : Exception => println("Error when parsing number" + numberAsString)
  }

parse("2345")

parse("23ab")

case class Failure(val reason : String)

def parse2(numberAsString : String) : Either[Failure, Int] =
  try {
    val result = Integer.parseInt(numberAsString)
    Right(result)
  } catch {
    case _ : Throwable => Left(Failure("Error when parsing number"))
  }

val result = parse2("23ab")

result.isRight

result.isLeft

val number = parse2("2345")






