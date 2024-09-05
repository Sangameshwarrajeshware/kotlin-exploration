package com.sangu.kotlin
// Kotlin: Direct Conversion of com.sangu.kotlin.higherorder.Order Processing Example
data class Order(val itemName: String, var price: Double, val isDiscounted: Boolean) {
  fun applyDiscount(discountRate: Double) {
    if (isDiscounted) {
      price -= price * discountRate
    }
  }
}

fun main() {
  val orders =
      listOf(
          Order("Laptop", 1000.0, true), Order("Phone", 500.0, false), Order("Tablet", 300.0, true))

  // Filter discounted orders
  val discountedOrders = orders.filter { it.isDiscounted }

  // Apply 10% discount to discounted orders
  discountedOrders.forEach { it.applyDiscount(0.10) }

  // Sort orders by price
  val sortedOrders = discountedOrders.sortedBy { it.price }

  // Print processed orders
  sortedOrders.forEach { println(it) }
}
