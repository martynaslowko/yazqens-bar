package ttv.yazqen.bar.service

class CocktailNotFoundException(id: Long) : RuntimeException(
    "Cocktail (id: $id) not found."
)
