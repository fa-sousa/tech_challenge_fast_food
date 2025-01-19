package adapter.driven.infra

import core.domain.Payment
import core.domain.PaymentStatus

class PaymentGatewayImpl {
    fun processPayment(payment: Payment): PaymentStatus {
        return PaymentStatus.COMPLETED
    }
}