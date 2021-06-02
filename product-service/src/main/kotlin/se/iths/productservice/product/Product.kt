package se.iths.productservice.product

import javax.persistence.*

@Table(name = "product")
@Entity
class Product (
        @Column(name = "name")
        val name: String,
        @Column(name = "price")
        val price: Double,
        @Column(name = "id")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
)