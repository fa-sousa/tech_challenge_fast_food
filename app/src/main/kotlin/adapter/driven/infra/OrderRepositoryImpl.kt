package adapter.driven.infra

import core.application.repository.OrderRepository
import core.domain.Order

class OrderRepositoryImpl : OrderRepository {
    private val orders = mutableListOf<Order>()

    override fun saveOrder(order: Order): Order {
        orders.add(order)
        return order
    }

    override fun findByOrderId(clientId: String): Order? {
        return orders.find { it.clientId == clientId }
    }

    override fun findAllOrders(): List<Order> {
        return orders.toList()
    }
}