package core.application.repository

import core.domain.Order

interface OrderRepository {
    fun saveOrder(order: Order) : Order
    fun findByOrderId(clientId: String): Order?
    fun findAllOrders() : List<Order>
}