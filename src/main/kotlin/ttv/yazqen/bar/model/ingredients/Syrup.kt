package ttv.yazqen.bar.model.ingredients

class Syrup(
    val category: Category
) : IngredientType {
    enum class Category {
        SUGAR,
        FRUITY,
        FLORAL,
        OTHER
    }
}