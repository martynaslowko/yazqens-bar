package ttv.yazqen.bar.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("cocktails")
data class Cocktail(
    @Id
    val id: Long,
    val cocktailName: String,
    val ingredients: List<Ingredient>,
    val recipe: String,
    val glass: String
) {
    data class Ingredient(
        val ingredient: String,
        val rootIngredient: RootIngredient,
        val amount: String,
        val unit: String,
        val proportion: String,
    )
}

