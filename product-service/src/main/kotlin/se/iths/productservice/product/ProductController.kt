package se.iths.productservice.product

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(private val productService: ProductService) {

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun createProduct(@RequestBody req: CreateProductRequest){
        productService.createProduct(req.name)
    }


}