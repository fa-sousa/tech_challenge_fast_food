package core.application.usecase

import core.application.repository.OrderRepository
import core.domain.Payment
import core.domain.PaymentStatus

class ProcessPaymentUseCase (private val orderRepository: OrderRepository) {
    fun execute(payment: Payment) : Payment {
        val order = orderRepository.findByOrderId(payment.orderId)
        return if (order != null) {
            payment.copy(status = PaymentStatus.COMPLETED)
        } else payment.copy(status = PaymentStatus.FAILED)
    }
}