package ttv.yazqen.bar.service

import org.springframework.stereotype.Service
import ttv.yazqen.bar.model.Cocktail
import ttv.yazqen.bar.model.CocktailRepository
import ttv.yazqen.bar.model.dto.CocktailEntry
import java.util.*

@Service
class CocktailService(
    private val repository: CocktailRepository
) {
    fun getAllCocktails(): List<CocktailEntry> {
        return repository.findAll().map { it.toCocktailEntry() }
    }

    fun searchCocktailsByPhrase(phrase: String): List<CocktailEntry> {
        return repository.findCocktailsByCocktailNameLike(phrase).map { it.toCocktailEntry() }
    }

    fun getCocktailById(id: UUID): Cocktail {
        return repository.findById(id).orElseThrow {
            CocktailNotFoundException(id)
        }
    }

    fun getRandomCocktails(batchSize: Long): List<CocktailEntry> {
        return repository.findAll().shuffled()
            .stream()
            .limit(batchSize)
            .toList()
            .map { it.toCocktailEntry() }
    }

    fun saveCocktail(cocktail: Cocktail): Cocktail {
        return repository.save(cocktail)
    }
}