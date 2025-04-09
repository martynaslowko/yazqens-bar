package ttv.yazqen.bar.model.ingredients

class Beverage(
    val category: Category
) : IngredientType {
    enum class Category {
        JUICE,
        SODA,
        WATER,
        SCHNAPPS,
        OTHER
    }
}