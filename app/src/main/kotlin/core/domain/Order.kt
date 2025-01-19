package core.domain

data class Order(
    val id: String,
    val clientId: String,
    val productList: List<Product>,
    var status: OrderStatus
)
