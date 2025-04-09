package ttv.yazqen.bar.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ttv.yazqen.bar.model.ingredients.Alcohol

@Document("alcohol-collection")
class CollectedAlcohol(
    @Id
    val name: String,
    val type: Alcohol,
    val available: Boolean = true
)