package didiprasetyo.kotlin.restful.api.repository

import didiprasetyo.kotlin.restful.api.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKey, String> {
}