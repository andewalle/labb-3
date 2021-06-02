package se.iths.productservice.product

import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(private val repository: ProductRepository): ProductService {
    override fun createProduct(name: String): Product {
        return repository.save(Product(name))
    }

    override fun getAllProducts(): List<Product> {
        return repository.findAll()
    }
}