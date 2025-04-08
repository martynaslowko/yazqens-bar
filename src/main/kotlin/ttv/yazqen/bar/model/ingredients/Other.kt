package ttv.yazqen.bar.model.ingredients

class Other(
    val category: Category
) : IngredientType {
    enum class Category {
        BITTERS,
        SPICE,
        GARNISH,
        OTHER
    }
}