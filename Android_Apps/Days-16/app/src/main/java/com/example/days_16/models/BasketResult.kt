package com.example.days_16.models

data class BasketResult (
    val id: Long,
    val products: List<ProductBasket>,
    val total: Long,
    val discountedTotal: Long,
    val userId: Long,
    val totalProducts: Long,
    val totalQuantity: Long
)

data class ProductBasket (
    val id: Long,
    val title: String,
    val price: Long,
    val quantity: Long,
    val total: Long,
    val discountPercentage: Double,
    val discountedPrice: Long
)
