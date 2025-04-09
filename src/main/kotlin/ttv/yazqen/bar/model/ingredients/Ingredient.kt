package ttv.yazqen.bar.model.ingredients

data class Ingredient(
    val name: String,
    val type: IngredientType,
    val amount: Double?,
    val unit: String?,
)

interface IngredientType
