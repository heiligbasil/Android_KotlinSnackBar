fun main(args: Array<String>) {
    var customer1:Customer=Customer(1,"Jane",45.25)
    var customer2:Customer=Customer(2,"Bob",33.14)
    var vending1:Vending=Vending(101,"Food")
    var vending2:Vending=Vending(102,"Drink")
    var vending3:Vending=Vending(103,"Office")
    var chips:Snack=Snack(1001,"Chips",36,1.75,vending1)
    var chocolates:Snack=Snack(1002,"Chocolate Bar",36,1.00,vending1)
    var pretzels:Snack=Snack(1003,"Pretzel",30,2.00,vending1)
    var sodas:Snack=Snack(1004,"Soda",24,2.50,vending2)
    var water:Snack=Snack(1005,"Water",20,2.75,vending2)

    customer1.buySnack(sodas.buySnack(3))
    println(customer1.cash)
    println(sodas.getQuantity())

    customer1.buySnack(pretzels.buySnack(1))
    println(customer1.cash)
    println(pretzels.getQuantity())

    customer2.buySnack(sodas.buySnack(2))
    println(customer2.cash)
    println(sodas.getQuantity())

    customer1.cash+=10
    println(customer1.cash)

    customer1.buySnack(chocolates.buySnack(1))
    println(customer1.cash)
    println(chocolates.getQuantity())

    pretzels.addSnack(3)
    println(pretzels.getQuantity())

    customer2.buySnack(pretzels.buySnack(3))
    println(customer2.cash)
    println(pretzels.getQuantity())
}