package se.iths.productservice.product

interface ProductService {
    fun createProduct(name: String): Product
    fun getAllProducts(): List<Product>
}