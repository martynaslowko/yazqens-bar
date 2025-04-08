package ttv.yazqen.bar.service

import java.util.*

class CocktailNotFoundException(id: UUID) : RuntimeException(
    "Cocktail (id: $id) not found."
)
