fun multiply(a: Int, b: Double) = a * b



fun total(a: Int, b: Double, c: Int, d: Double) = (a * b) + (c * d)


fun main(args: Array<String>) {
    println("How many apples do you need?")
    val apples = Integer.valueOf(readLine())
    println("How many oranges do you need?")
    val oranges = Integer.valueOf(readLine())
    println("You want $apples apples and $oranges oranges")
    val costApples = 0.60
    val costOranges = 0.25

    println("Cost of your Apples is : $${multiply(apples, costApples)}")
    println("Cost of your Oranges is : $${multiply(oranges, costOranges)}")
    println("Your total cost is : $${total(apples, costApples, oranges, costOranges)}")

}
