package ttv.yazqen.bar.model.dto

import java.net.URI

data class CocktailEntry(
    val id: Long,
    val name: String,
    val imageSource: URI
)
