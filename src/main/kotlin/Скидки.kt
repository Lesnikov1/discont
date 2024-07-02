fun main() {
    val amount = 10000
    val discount1 = 100
    val discount2 = 5
    val discount3 = 1
    val regularCustomer = true

    var result = if (amount > 1_000 && amount <= 10000) amount - discount1
    else if (amount > 10_000) (amount - amount * discount2 / 100)
    else amount
    if (regularCustomer) result -= result*discount3/100
    println("стоимость покупки - $result руб.")
}