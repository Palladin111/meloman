fun main() {

    val price = 7000
    val discontOverage = 100
    val discontLargePercent = 0.05
    val regCustomer = true
    val priceWithDiscont: Int
    val priceRegCustomer: Int

    println("покупка - " + price + " рублей")

    if (price <= 1000) {
        priceWithDiscont = price
    } else if (price > 1000 && price <= 10000) {
        priceWithDiscont = price - discontOverage
        println("после применения скидки в 100 рублей - " + priceWithDiscont + " рублей.")
    } else {
        priceWithDiscont = price - (price * discontLargePercent).toInt()
        println("после применения 5% скидки - " + priceWithDiscont + " рублей.")
    }

    if (regCustomer) {
        priceRegCustomer = priceWithDiscont - (priceWithDiscont * 0.01).toInt()
        println("после применения 1% скидки — " + priceRegCustomer + " рублей.")
    }
}