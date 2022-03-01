package didiprasetyo.kotlin.restful.api.repository

import didiprasetyo.kotlin.restful.api.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {
}