package com.sangu.java;

class Order {
  private final String itemName;
  private double price;
  private final boolean isDiscounted;

  public Order(String itemName, double price, boolean isDiscounted) {
    this.itemName = itemName;
    this.price = price;
    this.isDiscounted = isDiscounted;
  }

  public double getPrice() {
    return price;
  }

  public boolean isDiscounted() {
    return isDiscounted;
  }

  public void applyDiscount(double discountRate) {
    if (isDiscounted) {
      this.price -= this.price * discountRate;
    }
  }

  @Override
  public String toString() {
    return "com.sangu.kotlin.higherorder.com.sangu.java.Order{" +
        "itemName='" + itemName + '\'' +
        ", price=" + price +
        ", isDiscounted=" + isDiscounted +
        '}';
  }
}
