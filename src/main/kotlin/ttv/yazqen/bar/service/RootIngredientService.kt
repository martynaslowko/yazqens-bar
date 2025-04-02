package ttv.yazqen.bar.service

import org.springframework.stereotype.Service
import ttv.yazqen.bar.model.RootIngredient
import ttv.yazqen.bar.model.RootIngredientRepository

@Service
class RootIngredientService(
    private val repository: RootIngredientRepository
) {
    fun getAllRootIngredients(): List<RootIngredient> {
        return repository.findAll()
    }

    fun getRootIngredientById(id: Long): RootIngredient? {
        return repository.findById(id).get()
    }

    fun createRootIngredient(rootIngredient: RootIngredient): RootIngredient {
        return repository.save(rootIngredient)
    }
}