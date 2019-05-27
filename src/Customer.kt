class Customer (val id:Int,var name:String,var cash:Double) {

    fun buySnack(amount:Double) {
        this.cash=this.cash.minus(amount)
    }

    fun isBroke ():Boolean {
        return (cash <0)
    }
}