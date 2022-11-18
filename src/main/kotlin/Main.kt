fun main(args: Array<String>) {
    println("Hello World!")
    val name:String = "Varun Goel"
    println("name is $name")
    val number:Int = 45
    println("number is ${name} and ${number}")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    add()

    val greetings = "Hello There"
    println("[$greetings] Length of the greeting string is ${greetings.length}")
    var letter1 = greetings.get(2)
    val letter2 = greetings[1]
    println("${letter1}")
    println("${letter2}")

    val compare1 = "beta"
    val compare2 = "alpha"
    println("${compare1.compareTo(compare2)}")

    val sub = greetings.subSequence(6,9)
    println("sub = $sub")

    for(single in greetings) {
        print("$single ")
    }
}
fun add() {
    val num1:Int = 34
    val num2:Int = 44
    val result = num1 + num2
    println("$result")
    println("num1 is less than num2 ${num1<num2}")
}