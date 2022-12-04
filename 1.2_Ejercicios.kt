import kotlin.math.*

fun main(){
    println("Which exercise would you like to see? ")
    val askedExercise = readln()
    when (askedExercise){
        "1" -> {
            exercise1()
        } "2" -> {
            exercise2()
        } "3" -> {
            exercise3()
        } "4" -> {
            exercise4()
        } "5" -> {
            exercise5()
        } "6" -> {
            exercise6()
        } "7" -> {
        exercise7()
        } "8" -> {
            exercise8()
        } "9" -> {
            exercise9()
        } "10" -> {
            exercise10()
        } "11" -> {
        exercise11()
        } "12" -> {
            exercise12()
        } "13" -> {
            exercise13()
        } "14" -> {
            exercise14()
        } "15" -> {
            exercise15()
        } "16" -> {
            exercise16()
        } "17" -> {
            exercise17()
        } "18" -> {
            exercise18()
        } "19" -> {
            exercise19()
        } "20" -> {
            exercise20()
        } "21" -> {
            exercise21()
        } "22" -> {
            exercise22()
        } "23" -> {
            exercise23()
        } "24" -> {
            exercise24()
        } "25" -> {
            exercise25()
        } "26" -> {
            exercise26()
        } "27" -> {
            exercise27()
        } else -> {
            println("That exercise number doesn't exist fool!")
        }
    }
}

fun exercise1(){
    println("What's your name?")
    val name = readln()
    println("$name's an asshole!")
}

fun exercise2(){
    println("How many hours do you work a day?")
    val hours = readln().toInt()
    println("How much do they pay you for it?")
    val pay = readln().toInt()
    println("They'll have to pay you ${hours * pay}")
}

fun exercise3(){
    val width = 17
    val height = 12.0
    println(width/2)
    println(height/3)
    println(1+2*5)
}

fun exercise4(){
    println("Please introduce a temperature in celsius degrees")
    val celsiusDegrees = readln().toFloat()
    val fahrenheitDegrees = (celsiusDegrees*9/5)+32
    println("$celsiusDegrees celsius degrees would be $fahrenheitDegrees fahrenheit degrees")
}

fun exercise5(){
    println("Product price with no IVA: ")
    val prodNoIVA = readln().toFloat()
    println("Product price with IVA: ${prodNoIVA+(prodNoIVA*0.21)}")
}

fun exercise6(){
    println("Product price wih IVA: ")
    val prodIVA = readln().toFloat()
    println("Product price without IVA: ${prodIVA-(prodIVA/0.21)}")
}

fun exercise7(){
    println("number")
    val number1 = readln().toFloat()
    println("another")
    val number2 = readln().toFloat()
    println("ANOTHEEEER!")
    val number3 = readln().toFloat()
    println(number1+number2+number3)
}

fun exercise8(){
    println("Same as exercise 7")
}

fun exercise9(){
    println("1+1+1=${1+1+1}")
}

fun exercise10(){
    val firstPart = (3+2)
    val secondPart = (2*5)
    val operationNoPower= firstPart.toFloat()/secondPart.toFloat()
    println("((3+2)/(2*5))^2 = ${operationNoPower.pow(2)}")
}

fun exercise11(){
    println("Give me a number: ")
    val givenNumber = readln().toInt()
    println("The sum of all int numbers from 1 to $givenNumber is ${(givenNumber*(givenNumber+1))/2}")
}

fun exercise12(){
    println("What's your weight?")
    val weight = readln().toFloat()
    println("What's your height?")
    val height = readln().toFloat()
    val bmi = (weight/(height.pow(2)))
    println("Your BMI would be: $bmi")
}

fun exercise13(){
    println("An int number:")
    val number1 = readln().toInt()
    println("Another")
    val  number2 = readln().toInt()
    val rest = number1%number2
    val quotient = number1/number2
    println("The division between $number1 and $number2 has a quotient of $quotient and a rest of $rest")
}

fun exercise14(){
    val clown = 112
    val doll = 75
    println("How many clowns did you sell?")
    val clownNumber = readln().toFloat()
    println("How many dolls did you sell?")
    val dollNumber = readln().toFloat()
    println("The total weight of the package would be ${(clown*clownNumber)+(doll*dollNumber)}")
}

fun exercise15(){
    println("How many money did you deposit on your account?")
    val money = readln().toFloat()
    val interest = 0.04
    val year1Savings = money*(1+interest)
    val year2Savings = year1Savings*(1+interest)
    val year3Savings = year2Savings*(1+interest)
    println("Year 1 savings: $year1Savings€\nYear 2 savings: $year2Savings€\nYear 3 savings: $year3Savings€")
}

fun exercise16(){
    val todayBread = 3.49
    println("How many yesterday bread would you like to buy?")
    val breadAmount = readln().toInt()
    println("A fresh loaf of bread costs $todayBread, you'll buy $breadAmount loafs of bread that are not fresh, due to that, there'll be applied a 60% discount on your buying so the total cost would be ${(3.49*breadAmount)*0.6}€")
}

fun exercise17(){
    println("What's your name?")
    val name = readln()
    println("Give me an int number")
    var number = readln().toInt()
    while(number!=0){
        println(name)
        number -= 1
    }
}

fun exercise18(){
    println("Give me your full name:")
    val name = readln()
    println(name.capitalize())
    println(name.uppercase())
    println(name.lowercase())
}

fun exercise19(){
    println("Your name:")
    val name = readln()
    var letters = 0
    for (letter in name){
        letters += 1
    }
    println("${name.uppercase()} has $letters letters.")
}

fun exercise20(){}

fun exercise21(){
    println("A phrase:")
    val phrase = readln()
    println(phrase.reversed())
}

fun exercise22(){
    println("Phrase:")
    val phrase = readln()
    println("Letter:")
    val letter = readln()
    println(phrase.replace(letter,letter.uppercase()))
}

fun exercise23(){}

fun exercise24(){}

fun exercise25(){}

fun exercise26(){}

fun exercise27(){}