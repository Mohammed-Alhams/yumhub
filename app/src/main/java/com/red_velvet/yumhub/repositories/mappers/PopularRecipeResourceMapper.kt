package com.red_velvet.yumhub.repositories.mappers

import com.red_velvet.yumhub.domain.models.recipes.PopularRecipeEntity
import com.red_velvet.yumhub.domain.utils.orEmpty
import com.red_velvet.yumhub.domain.utils.orZero
import com.red_velvet.yumhub.remote.dtos.recipe.RecipeSearchResultResource

fun RecipeSearchResultResource.toPopularEntity(): PopularRecipeEntity {
    return PopularRecipeEntity(
            id = id.orZero(),
            title = title.orEmpty(),
            image = image.orEmpty()
        )
}