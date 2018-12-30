//inter-operating with Java

// map from Java --> map from Scala
import java.util

import scala.collection.JavaConverters._


//Scala doesn't not provide a mutable TreeMap
val sources: scala.collection.mutable.Map[String, Int] =
  new util.TreeMap[String, Int]().asScala

//Scala map to Java map

import java.awt.font.TextAttribute._ // Import keys for map below
val attrs = Map(FAMILY -> "Serif", SIZE -> 12) // A Scala map
val font = new java.awt.Font(attrs.asJava) // Expects a Java map








