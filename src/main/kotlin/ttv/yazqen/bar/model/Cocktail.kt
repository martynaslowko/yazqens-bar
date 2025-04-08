package ttv.yazqen.bar.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ttv.yazqen.bar.model.dto.CocktailEntry
import ttv.yazqen.bar.model.ingredients.Ingredient
import java.net.URI

@Document("cocktails")
data class Cocktail(
    @Id
    val id: Long,
    val imageSource: URI,
    val cocktailName: String,
    val ingredients: List<Ingredient>,
    val recipe: String,
    val glass: String
) {
    fun toCocktailEntry() = CocktailEntry(id, cocktailName, imageSource)
}

