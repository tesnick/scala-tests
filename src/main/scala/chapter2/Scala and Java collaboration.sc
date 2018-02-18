import java.util.Arrays

val javaList = Arrays.asList(1,2,3,4)

import scala.collection.JavaConverters._

val scalaList = javaList.asScala

val javaListAgain = scalaList.asJava

assert( javaList eq javaListAgain)

