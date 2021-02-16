fun multiply(a: Int, b: Double) = a * b



fun total(a: Int, b: Double, c: Int, d: Double) = (a * b) + (c * d)


fun main(args: Array<String>) {
    println("How many apples do you need?")
    var apples = Integer.valueOf(readLine())
    println("How many oranges do you need?")
    var oranges = Integer.valueOf(readLine())
    println("You want $apples apples and $oranges oranges")

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
        //what about the rest if you bought 10 should be 6+1 = 7
        //works only at exact
        //needs exception when its more than a multiple of 3 and there is room to use discount
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

    println("$apples")
    println("$oranges")


    val costApples = 0.60
    val costOranges = 0.25

    println("Cost of your Apples is : $${multiply(apples, costApples)}")
    println("Cost of your Oranges is : $${multiply(oranges, costOranges)}")
    println("Your total cost is : $${total(apples, costApples, oranges, costOranges)}")

}
