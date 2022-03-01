package didiprasetyo.kotlin.restful.api.config

import didiprasetyo.kotlin.restful.api.entity.ApiKey
import didiprasetyo.kotlin.restful.api.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(private val apiKeyRepository: ApiKeyRepository): ApplicationRunner {

    private val apiKey: String = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)){
            val entity = ApiKey(apiKey)
            apiKeyRepository.save(entity)
        }
    }
}