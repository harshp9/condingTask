//This is a command line application that lets the user input the various needs and the application
// can calculate the total for you with the various discounts offered.

//function used to multiply total cost per fruit
fun multiply(a: Int, b: Double) = a * b

//function used to calculate total of both fruits
fun total(a: Int, b: Double, c: Int, d: Double) = (a * b) + (c * d)

//main function
fun main(args: Array<String>) {
    var deliver: String = "3-5" //hard coded business days
    var stockApples = Integer.valueOf(19) //hard coded stock value for total Apples available
    var stockOranges = Integer.valueOf(28) //hard coded stock value for total Oranges available


    println("How many apples do you need?")
    var totalApples = Integer.valueOf(readLine()) //customer input for number of apples

    if(totalApples > stockApples){
        println("We do not have enough stock.")
        println("We only have $stockApples apples, how many apples do you need?")
        totalApples = Integer.valueOf(readLine()) //customer input for number of apples within stock
    }
    var apples = totalApples //variable used to calculate discounts


    println("How many oranges do you need?")
    var totalOranges = Integer.valueOf(readLine()) //customer input for number of oranges

    if(totalOranges > stockOranges){
        println("We do not have enough stock.")
        println("We only have $stockOranges oranges, how many oranges do you need?")
        totalOranges = Integer.valueOf(readLine()) //customer input for number of oranges within stock
    }
    var oranges = totalOranges //variable used to calculate discounts

    println("You want $totalApples apples and $totalOranges oranges") //confirmation print for total number of fruits

    //checks if you have multiples of 2 for buy one get one free offer
    if (apples > 1 && apples % 2 == 0){
            apples /= 2
    }
    else if (apples > 1 && apples % 2 != 0){
        apples -= 1
        apples /= 2
        apples += 1
    }

    //checks if you have at least 3 oranges to give you 3 for the price of 2 offer
    if (oranges >= 3 && oranges % 3 == 0){
        oranges /= 3
        oranges *= 2
    }
    else if (oranges >= 3 && oranges % 3 == 1){
        oranges -= 1
        oranges /= 3
        oranges *= 2
        oranges += 1
    }
    else if (oranges >= 3 && oranges % 3 == 2){
        oranges -= 2
        oranges /= 3
        oranges *= 2
        oranges += 2
    }


    val costApples = 0.60 //hard coded price value for cost per Apple
    val costOranges = 0.25 //hard coded price value for cost per Orange

    println("Cost of your Apples is : $${multiply(apples, costApples)}")
    println("Cost of your Oranges is : $${multiply(oranges, costOranges)}")
    var totalCostApples = multiply(apples, costApples)
    var totalCostOranges = multiply(oranges, costOranges)
    println("Your total cost is : $${total(apples, costApples, oranges, costOranges)}")
    //Prints confirmation of your total number of fruits, cost, and estimated delivery time.
    println("Your order for $totalApples apples and $totalOranges oranges with total cost of $${total(apples, costApples, oranges, costOranges)} has been placed and should deliver in $deliver business days.")
    var finalTotal = total(apples, costApples, oranges, costOranges)
}
