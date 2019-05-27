class Snack(val id: Int, val name: String, private var quantity: Int, var cost: Double, val vendingId: Vending) {

    fun addSnack(quantity: Int) {
        this.quantity += quantity
    }

    fun buySnack(quantity: Int): Double {
        this.quantity=this.quantity.minus(quantity)
        return quantity.times(cost)
    }

    fun getQuantity():Int {
        return this.quantity
    }

    fun getTotalCost(quantity: Int): Double {
        return 0.0
    }
}