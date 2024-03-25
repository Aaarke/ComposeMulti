import apiClient.httpClient
import data.Product
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.flow

class HomeRepository {
    suspend fun apiGetProduct():List<Product>{
        val response= httpClient.get("${BASE_URL}/products")
        return response.body()
    }

    fun getProducts()= flow {
        emit(apiGetProduct())
    }

    companion object{
        private const val BASE_URL="https://fakestoreapi.com"
    }
}