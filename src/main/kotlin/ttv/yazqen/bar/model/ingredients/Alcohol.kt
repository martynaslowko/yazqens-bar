package ttv.yazqen.bar.model.ingredients

class Alcohol(
    val category: Category,
    val subcategory: Subcategory?
) : IngredientType {

    enum class Category {
        VODKA,
        TEQUILA,
        VERMOUTH,
        GIN,
        WINE,
        LIQUEUR,
        WHISKY,
        RUM,
        SPECIAL_ALCOHOL,
        BEER,
        BRANDY,
        OTHER_ALCOHOLS
    }

    enum class Subcategory(val category: Category) {
        // Vodka
        CLASSIC_VODKA(Category.VODKA),
        FRUIT_VODKA(Category.VODKA),
        OTHER_VODKA(Category.VODKA),

        // Wine
        WHITE_WINE(Category.WINE),
        RED_WINE(Category.WINE),
        OTHER_WINE(Category.WINE),

        // Liqueur
        CREAM_LIQUEUR(Category.LIQUEUR),
        FRUIT_LIQUEUR(Category.LIQUEUR),
        HERBAL_LIQUEUR(Category.LIQUEUR),
        OTHER_LIQUEUR(Category.LIQUEUR),

        // Whisky
        IRISH_WHISKY(Category.WHISKY),
        CANADIAN_WHISKY(Category.WHISKY),
        BLENDED_SCOTCH(Category.WHISKY),
        BOURBON(Category.WHISKY),
        TENNESSEE(Category.WHISKY),
        OTHER_WHISKY(Category.WHISKY),

        // Rum
        WHITE_RUM(Category.RUM),
        GOLD_RUM(Category.RUM),
        DARK_RUM(Category.RUM),
        SPICED_RUM(Category.RUM),
        FLAVORED_RUM(Category.RUM),
        AGED_RUM(Category.RUM),
        OTHER_RUM(Category.RUM)
    }
}
