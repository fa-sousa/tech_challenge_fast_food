package core.application.repository

import core.domain.Category
import core.domain.Product

interface ProductRepository{
    fun findByCategory(category: Category) : List<Product>
    fun save(product: Product) : Product
    fun deleteById(id: String)
}