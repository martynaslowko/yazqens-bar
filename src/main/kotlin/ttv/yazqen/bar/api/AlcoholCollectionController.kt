package ttv.yazqen.bar.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ttv.yazqen.bar.model.CollectedAlcohol
import ttv.yazqen.bar.model.ingredients.Alcohol
import ttv.yazqen.bar.service.AlcoholCollectionService

@RestController
@RequestMapping("/alcohol-collection")
class AlcoholCollectionController(
    val service: AlcoholCollectionService
) {
    @GetMapping
    fun getAllCollectedAlcohols(): ResponseEntity<List<CollectedAlcohol>> {
        return ResponseEntity.ok(service.getAllCollectedAlcohols())
    }

    @GetMapping("/category/{category}")
    fun getAlcoholsByCategory(@PathVariable category: String): ResponseEntity<List<CollectedAlcohol>> {
        return ResponseEntity.ok(service.getAlcoholsByCategory(Alcohol.Category.valueOf(category.uppercase())))
    }
}