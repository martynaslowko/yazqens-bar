package ttv.yazqen.bar.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ttv.yazqen.bar.model.Cocktail
import ttv.yazqen.bar.model.dto.CocktailEntry
import ttv.yazqen.bar.service.CocktailService

@RestController
@RequestMapping("/cocktails")
class CocktailController (
    private val service: CocktailService
) {
    @GetMapping("/{id}")
    fun getCocktailById(@PathVariable id: Long): ResponseEntity<Cocktail> {
        return ResponseEntity.ok(service.getCocktailById(id))
    }

    @GetMapping("/random")
    fun getRandomCocktail(): ResponseEntity<Cocktail> {
        return ResponseEntity.ok(service.getRandomCocktail())
    }

    @GetMapping
    fun getAllCocktails(): ResponseEntity<List<CocktailEntry>> {
        return ResponseEntity.ok(service.getAllCocktails())
    }
}