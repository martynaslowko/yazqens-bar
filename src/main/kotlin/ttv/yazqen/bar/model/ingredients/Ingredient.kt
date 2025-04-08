package ttv.yazqen.bar.model.ingredients

data class Ingredient(
    val ingredient: String,
    val type: IngredientType,
    val amount: String?,
    val unit: String?,
)

interface IngredientType
