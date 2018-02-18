class Company(var name:String)

val sun = new Company("Sun Microsystems")

sun.name

sun.name = "Oracle"

sun.name

import scala.beans.BeanProperty

class Company2(@BeanProperty var name:String)

val sun2 = new Company2("Sun Microsystems")

sun2.getName()

sun2.setName("Oracle")

sun2.getName()

sun2.name

sun2.getName




