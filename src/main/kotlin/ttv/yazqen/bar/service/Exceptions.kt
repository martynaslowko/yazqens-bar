package ttv.yazqen.bar.service

class CocktailNotFoundException(id: String) : RuntimeException(
    "Cocktail (id: $id) not found."
)
