package com.red_velvet.yumhub.data.repositories.mappers

import com.red_velvet.yumhub.data.remote.dtos.recipe.RecipeSearchResultResource
import com.red_velvet.yumhub.domain.models.recipes.QuickRecipeEntity
import com.red_velvet.yumhub.domain.utils.orEmpty
import com.red_velvet.yumhub.domain.utils.orZero

fun RecipeSearchResultResource.toQuickRecipeEntity(): QuickRecipeEntity {
    return QuickRecipeEntity(
        id = id.orZero(),
        title = title.orEmpty(),
        image = image.orEmpty(),
        cookingMinutes = cookingMinutes.orZero()
    )
}