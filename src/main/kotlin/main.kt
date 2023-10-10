fun main() {

    val price = 7000
    val discountOverage = 100
    val discountLargePercent = 0.05
    val regCustomer = true
    val priceWithDiscount: Int
    val priceRegCustomer: Int

    println("покупка - " + price + " рублей")

    if (price <= 1000) {
        priceWithDiscount = price
    } else if (price > 1000 && price <= 10000) {
        priceWithDiscount = price - discountOverage
        println("после применения скидки в 100 рублей - " + priceWithDiscount + " рублей.")
    } else {
        priceWithDiscount = price - (price * discountLargePercent).toInt()
        println("после применения 5% скидки - " + priceWithDiscount + " рублей.")
    }

    if (regCustomer) {
        priceRegCustomer = priceWithDiscount - (priceWithDiscount * 0.01).toInt()
        println("после применения 1% скидки — " + priceRegCustomer + " рублей.")
    }
}