package ttv.yazqen.bar.service

import org.springframework.stereotype.Service
import ttv.yazqen.bar.model.Cocktail
import ttv.yazqen.bar.model.CocktailRepository

@Service
class CocktailService(
    private val repository: CocktailRepository
) {
    fun getAllCocktails(): List<Cocktail> {
        return repository.findAll()
    }

    fun searchCocktailsByName(name: String): List<Cocktail> {
        return repository.findCocktailsByCocktailNameLike(name)
    }

    fun getCocktailById(id: Long): Cocktail {
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

    fun deleteCocktailById(id: Long) {
        repository.deleteById(id)
    }
}