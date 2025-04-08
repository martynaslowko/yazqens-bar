package ttv.yazqen.bar.service

import org.springframework.stereotype.Service
import ttv.yazqen.bar.model.Cocktail
import ttv.yazqen.bar.model.CocktailRepository
import ttv.yazqen.bar.model.dto.CocktailEntry

@Service
class CocktailService(
    private val repository: CocktailRepository
) {
    fun getAllCocktails(): List<CocktailEntry> {
        return repository.findAll().map { it.toCocktailEntry() }
    }

    fun searchCocktailsByName(name: String): List<CocktailEntry> {
        return repository.findCocktailsByCocktailNameLike(name).map { it.toCocktailEntry() }
    }

    fun getCocktailById(id: String): Cocktail {
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

    fun updateCocktail(cocktail: Cocktail): Cocktail {
        return repository.save(cocktail)
    }

    fun deleteCocktailById(id: String) {
        repository.deleteById(id)
    }
}