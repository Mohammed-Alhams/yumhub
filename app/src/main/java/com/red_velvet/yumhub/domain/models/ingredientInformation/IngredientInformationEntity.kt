package com.red_velvet.yumhub.domain.models.ingredientInformation

data class IngredientInformationEntity(
    val id: Int?,
    val name: String?,
    val image: String?,
    val categoryPath: List<String>?,
    val nutritionEntity: NutritionEntity?
)







