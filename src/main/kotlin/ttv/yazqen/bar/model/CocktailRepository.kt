package ttv.yazqen.bar.model

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CocktailRepository : MongoRepository<Cocktail, UUID> {
    fun findCocktailsByCocktailNameLike(name: String): List<Cocktail>
}
