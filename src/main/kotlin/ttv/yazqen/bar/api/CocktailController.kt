package ttv.yazqen.bar.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ttv.yazqen.bar.model.Cocktail
import ttv.yazqen.bar.model.dto.CocktailEntry
import ttv.yazqen.bar.service.CocktailService

@RestController
@RequestMapping("/cocktails")
class CocktailController (
    private val service: CocktailService
) {
    @GetMapping("/{id}")
    fun getCocktailById(@PathVariable id: String): ResponseEntity<Cocktail> {
        return ResponseEntity.ok(service.getCocktailById(id))
    }

    @GetMapping("/random")
    fun getRandomCocktailsInBatch(@RequestParam batchSize: Long = 10): ResponseEntity<List<CocktailEntry>> {
        return ResponseEntity.ok(service.getRandomCocktails(batchSize))
    }

    @GetMapping
    fun getAllCocktails(): ResponseEntity<List<CocktailEntry>> {
        return ResponseEntity.ok(service.getAllCocktails())
    }
}