fun main() {
    val purchaseAmount = 12000 // Сумма покупки
    val regularCustomer = true // Флаг постоянного клиента (true - да, false - нет)
    val discount = when {
        purchaseAmount in 1001..10000 -> 100 // Скидка 100 рублей, если сумма покупки от 1001 до 10000 рублей
        purchaseAmount >= 10001 -> (purchaseAmount * 0.05).toInt() // Скидка 5%, если сумма покупки больше 10000 рублей
        else -> 0 // Скидка отсутствует, если сумма покупки от 0 до 1000 рублей
    }
    val regularCustomerDiscount = if (regularCustomer) 0.01 else 0.0 // 1% скидка для постоянных клиентов
    val totalDiscount = ((1 - regularCustomerDiscount) * (purchaseAmount - discount)).toInt()
    println("Сумма покупки: $purchaseAmount руб.")
    println("Постоянный клиент: ${if (regularCustomer) "да" else "нет"}")
    println("Скидка: $discount руб.")
    println("Скидка для постоянных клиентов: ${(regularCustomerDiscount * 100).toInt()}%")
    println("Итоговая сумма со скидкой: $totalDiscount руб.")
}
