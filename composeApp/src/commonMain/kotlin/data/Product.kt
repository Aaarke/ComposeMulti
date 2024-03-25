package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Product(
	@SerialName("image")
	val image: String? = null,
	@SerialName("price")
	val price: Int? = null,
	@SerialName("rating")
	val rating: Rating? = null,
	@SerialName("description")
	val description: String? = null,
	@SerialName("id")
	val id: Int? = null,
	@SerialName("title")
	val title: String? = null,
	@SerialName("category")
	val category: String? = null
)
@Serializable
data class Rating(
	@SerialName("rate")
	val rate: Int? = null,
	@SerialName("count")
	val count: Int? = null
)

