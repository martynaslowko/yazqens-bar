package ttv.yazqen.bar.model

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CocktailRepository : MongoRepository<Cocktail, String> {
    fun findCocktailsByCocktailNameLike(name: String): List<Cocktail>
}
