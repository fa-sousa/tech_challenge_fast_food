package core.domain

data class Product(
    val id: String,
    val name: String,
    val description: String,
    val price: Double,
    val category: Category,
)

enum class Category {
    LUNCH, SIDE, DRINK, DESSERT
}