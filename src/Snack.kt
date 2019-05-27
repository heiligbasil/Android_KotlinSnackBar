class Snack(val id: Int, val name: String, private var quantity: Int, var cost: Double, val vendingId: Int) {

    fun addQuantity(quantity: Int) {
        this.quantity += quantity
    }

    fun buySnack(quantity: Int): Double {
        return quantity.times(cost)
    }

    fun getTotalCost(quantity: Int): Double {
        return 0.0
    }
}