package ttv.yazqen.bar.model

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CollectedAlcoholRepository : MongoRepository<CollectedAlcohol, String>