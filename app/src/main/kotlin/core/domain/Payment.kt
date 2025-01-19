package core.domain

data class Payment(
    val orderId: String,
    val amount: Double,
    val status: PaymentStatus
)
enum class PaymentStatus {
    PENDING, COMPLETED, FAILED
}