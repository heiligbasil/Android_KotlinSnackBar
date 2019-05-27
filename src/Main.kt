import java.util.Scanner
import kotlin.random.Random

fun main(args: Array<String>) {
    var customer1: Customer = Customer(1, "Jane", 45.25)
    var customer2: Customer = Customer(2, "Bob", 33.14)
    var vending1: Vending = Vending(101, "Food")
    var vending2: Vending = Vending(102, "Drink")
    var vending3: Vending = Vending(103, "Office")
    var snack1: Snack = Snack(1001, "Chips", 36, 1.75, vending1)
    var snack2: Snack = Snack(1002, "Chocolate Bar", 36, 1.00, vending1)
    var snack3: Snack = Snack(1003, "Pretzel", 30, 2.00, vending1)
    var snack4: Snack = Snack(1004, "Soda", 24, 2.50, vending2)
    var snack5: Snack = Snack(1005, "Water", 20, 2.75, vending2)

    customer1.buySnack(snack4.buySnack(3))
    println(customer1.cash)
    println(snack4.getQuantity())

    customer1.buySnack(snack3.buySnack(1))
    println(customer1.cash)
    println(snack3.getQuantity())

    customer2.buySnack(snack4.buySnack(2))
    println(customer2.cash)
    println(snack4.getQuantity())

    customer1.cash += 10
    println(customer1.cash)

    customer1.buySnack(snack2.buySnack(1))
    println(customer1.cash)
    println(snack2.getQuantity())

    snack3.addSnack(3)
    println(snack3.getQuantity())

    customer2.buySnack(snack3.buySnack(3))
    println(customer2.cash)
    println(snack3.getQuantity())

    val scanner = Scanner(System.`in`)
    print("What is your name? ")
    val userName: String = scanner.next()
    print("\nHow much cash do you have? ")
    val userCash: Double = scanner.nextDouble()
    var customer3: Customer = Customer(Random.nextInt(), userName, userCash)
    println("Hello ${customer3.name} who has \$${customer3.cash}! Your id is ${customer3.id}")
    do {
        println("\n================================================")
        println("Vending machine ${vending1.name} has ${snack1.getQuantity()} ${snack1.name}(1), ${snack2.getQuantity()} ${snack2.name}(2), and ${snack3.getQuantity()} ${snack3.name}(3)")
        println("Vending machine ${vending2.name} has ${snack4.getQuantity()} ${snack4.name}(4) and ${snack5.getQuantity()} ${snack5.name}(5)")
        println("If you want to quit, : q")
        print("You have \$${customer3.cash}... What do you want to buy? ")
        val snackChoice = scanner.next()
        print("\nHow many? ")
        val snackQuantity = scanner.nextInt()
        when (snackChoice) {
            "1" -> customer3.buySnack(snack1.buySnack(snackQuantity))
            "2" -> customer3.buySnack(snack2.buySnack(snackQuantity))
            "3" -> customer3.buySnack(snack3.buySnack(snackQuantity))
            "4" -> customer3.buySnack(snack4.buySnack(snackQuantity))
            "5" -> customer3.buySnack(snack5.buySnack(snackQuantity))
        }
    } while (!(snackChoice.equals("q") || customer3.isBroke()))
    println()
    println("Goodbye ${customer3.name}! You have \$${customer3.cash}")
}