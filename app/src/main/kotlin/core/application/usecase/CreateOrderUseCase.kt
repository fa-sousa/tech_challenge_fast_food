package core.application.usecase

import core.application.repository.OrderRepository
import core.domain.Order

class CreateOrderUseCase(private val orderRepository: OrderRepository) {
    fun execute(order: Order): Order {
        return orderRepository.saveOrder(order)
    }
}