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

    fun searchCocktailsByName(name: String): List<Cocktail> {
        return repository.findCocktailsByCocktailNameLike(name)
    }

    fun getCocktailById(id: String): Cocktail {
        return repository.findById(id).orElseThrow {
            CocktailNotFoundException(id)
        }
    }

    fun getRandomCocktail(): Cocktail {
        return repository.findAll().random()
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