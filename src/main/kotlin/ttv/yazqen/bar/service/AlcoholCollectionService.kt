package ttv.yazqen.bar.service

import org.springframework.stereotype.Service
import ttv.yazqen.bar.model.CollectedAlcohol
import ttv.yazqen.bar.model.CollectedAlcoholRepository
import ttv.yazqen.bar.model.ingredients.Alcohol

@Service
class AlcoholCollectionService(
    val alcoholRepository: CollectedAlcoholRepository
) {
    fun getAllCollectedAlcohols(): List<CollectedAlcohol> {
        return alcoholRepository.findAll()
    }

    fun getAlcoholsByCategory(category: Alcohol.Category) : List<CollectedAlcohol> {
        return alcoholRepository.findAll().filter { it.type.category == category }
    }

    fun saveAlcohol(collectedAlcohol: CollectedAlcohol): CollectedAlcohol {
        return alcoholRepository.save(collectedAlcohol)
    }
}