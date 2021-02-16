//
fun multiply(a: Int, b: Double) = a * b

fun total(a: Int, b: Double, c: Int, d: Double) = (a * b) + (c * d)

fun main(args: Array<String>) {
    var deliver: String = "3-5" //business days
    var stockApples = Integer.valueOf(19)
    var stockOranges = Integer.valueOf(28)

    println("How many apples do you need?")
    var totalApples = Integer.valueOf(readLine())

    if(totalApples > stockApples){
        println("We do not have enough stock.")
        println("We only have $stockApples apples, how many apples do you need?")
        totalApples = Integer.valueOf(readLine())
    }
    var apples = totalApples


    println("How many oranges do you need?")
    var totalOranges = Integer.valueOf(readLine())

    if(totalOranges > stockOranges){
        println("We do not have enough stock.")
        println("We only have $stockOranges oranges, how many oranges do you need?")
        totalOranges = Integer.valueOf(readLine())
    }

    var oranges = totalOranges

    println("You want $totalApples apples and $totalOranges oranges")

    if (apples > 1 && apples % 2 == 0){
            apples /= 2
    }
    else if (apples > 1 && apples % 2 != 0){
        apples -= 1
        apples /= 2
        apples += 1
    }

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


    val costApples = 0.60
    val costOranges = 0.25

    println("Cost of your Apples is : $${multiply(apples, costApples)}")
    println("Cost of your Oranges is : $${multiply(oranges, costOranges)}")
    println("Your total cost is : $${total(apples, costApples, oranges, costOranges)}")
    println("Your order for $totalApples apples and $totalOranges oranges with total cost of $${total(apples, costApples, oranges, costOranges)} has been placed and should deliver in $deliver business days.")

}
