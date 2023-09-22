/*
* A simple table to show the use of "And/Or" operators
 */

fun main(array:Array<String>){

    var trueOrFalseText1  = false
    var trueOrFalseText2  = false

    println("\nThis is And/&& table->")

    for (i in 0..1){
        for(j in 0..1) {
            trueOrFalseText1 = i != 0
            trueOrFalseText2 = j != 0

            println("${trueOrFalseText1.toString().uppercase()} && ${trueOrFalseText2.toString().uppercase()}\t: " +
                    "${trueOrFalseText1 && trueOrFalseText2}")
        }
    }

    println("\nThis is Or/|| table->" )

    for (i in 0..1){
        for(j in 0..1){
            trueOrFalseText1 = i != 0
            trueOrFalseText2 = j != 0

            println("${trueOrFalseText1.toString().uppercase()} || ${trueOrFalseText2.toString().uppercase()}\t: " +
                    "${trueOrFalseText1 || trueOrFalseText2}")
        }
    }
}

