package com.sangu.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderProcessor {
  public static void main(String[] args) {
    List<Order> orders = new ArrayList<>();
    orders.add(new Order("Laptop", 1000, true));
    orders.add(new Order("Phone", 500, false));
    orders.add(new Order("Tablet", 300, true));

    // Filter discounted orders
    List<Order> discountedOrders = new ArrayList<>(orders.stream()
        .filter(Order::isDiscounted)
        .toList());

    // Apply 10% discount to discounted orders
    discountedOrders.forEach(order -> order.applyDiscount(0.10));

    // Sort orders by price
    discountedOrders.sort(Comparator.comparingDouble(Order::getPrice));

    // Print processed orders
    discountedOrders.forEach(System.out::println);
  }
}

