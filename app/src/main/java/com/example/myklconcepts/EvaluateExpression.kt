package com.example.myklconcepts

fun main(){

/*
    val ar = arrayListOf<Any>("12","33","44","554","333","34",34)

for (i in ar.indices){
    println(i)
}
*/

/*
    var roomtemp = 20
    var feltTemp = "cold"
    while (feltTemp== "cold"){
        roomtemp++
        println(roomtemp)

        if(roomtemp>=20) {
            feltTemp = "comfy"
            println("it is comfy now !!")
        }
    }


    for(i in 100 downTo 10){
        println(i)
    }
*/



    // for loop that runs from 0 to 10000
    // once it reached 9001, it should write it is over

/*
   loopbreak@ for(i in 0..10000 step 1 ) {
      if(i==9001) break@loopbreak
       println(i)
    }
    print("it is over now")
*/


    var humidLevel = 90
    var humidity= "humid"
    while (humidity == "humid"){
        humidLevel-=5
        println(humidLevel)
        println("humdity level decreased")
        if(humidLevel<60){
            humidity = "comfy"
            println("it is comfy now $humidity")
            }
    }


    var x= 1
    while(x<=10){
        println(x)
        if(x==4){
            x=10
        }
        x++
    }

    var xy = 1
    for (y in 0..9){
        x+=y
    }
    print("$x")

//        if(i==9001){
//            println("$i: It is over nowwwwwwww.")
//        }

/*
    var num = 100
    while (num>1){
        num-=2
        println(num)
    }
*/

/*
    do{
        println("$num")
        num+=2
    }while (num<=130)
*/
//     println("THis is the value")

//    val age_drive = 15

//   val result =  if(age_drive>18){
//        println("You can drive , as your age is above 16")
//    }
//    else if(age_drive>=16){
//        println("You can drink , as your age is above 16")
//    }
//    else{
//        println("You are suppose to wait till you turn to 18 ")
//       age_drive
//    }
//    println(" Your are just $result only ")
//
//
//     val months = 6
//
//      when(months){
//        in 2..5->{
//            println("it is Spring")
//         }
//          in 2..5->{
//            print("it is Autumn")
//         }in 6..8->{
//            print("it is Summer")
//         }in 9..11->{
//            print("it is Fall")
//         }
//          12,1,2->{
//            print("it is Winter")
//         }
//          else-> print("Option is not there to be evaluated")
//      }
}