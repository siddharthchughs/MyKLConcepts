package com.example.myklconcepts

import kotlin.math.absoluteValue

fun main(){

 // TODO : ADD SOME MORE FUNCTIONALITY
 //var can overridden or reassigned
 var myName = "Siddharth"
 myName = "Mr.Chugh"

 //val can't overridden or reassigned
 val myNumber = "Siddharth"
 var isShown = true

//character

 val myUser  = "Si"
 val lenght  = myUser.length
 val result = myUser.length-1
// println(lenght)
// println(result)
//
// for (elem in myUser.indices) {
//
//  println("${elem} :: ${myUser[elem]}")
//
// }


// val rs =0
//
// for (rev in myUser.indices){
//  print("${rev} :: ${myUser[rev]}:: \n")
//  for (anrev in rs.toString())
//  print("${anrev} :::: \n")
// }

// for (myUser in myUser.indices) {
//  print(myUser)
//   val rs = myUser-1
//  println(":"+rs)
// }
// println("\n")

// val rs = myUser[myUser.length-1]
 for (el in myUser.indices) {
  println("${el}:: ${myUser[el]}")
 }
 // the test concepts

 var myString :String= "ANdroid"
 var myFLoat :Float= 13.34F
 val myDouble : Double= 3.144434
 var myByte : Byte= 25
 var myShort : Short= 2022
 var myInt :Int= 2323423
 var myBolleab: Boolean = true
 var myChar : Char= 'a'

 println(myName)
 println(myFLoat)
 println(myDouble)
 println(myBolleab)
 println(myShort)


 println("Hello World : "+ myNumber)



}