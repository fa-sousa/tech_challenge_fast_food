package adapter.driver.api

import core.application.usecase.CreateOrderUseCase
import core.domain.Order

class OrderController(private val createOrder: CreateOrderUseCase) {
    fun createOrder(order: Order): Order {
        return createOrder(order)
    }
}