package ttv.yazqen.bar.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document("rootIngredients")
data class RootIngredient(
    @Id
    val id: Long,
    val name: String,
    val type: Type
) {
    enum class Type {
        ALCOHOL,
        LIQUID,
        SPICE,
        GARNISH,
        BITTERS,
        OTHER
    }
}
