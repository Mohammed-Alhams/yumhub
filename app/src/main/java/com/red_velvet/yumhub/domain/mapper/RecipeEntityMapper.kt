package com.red_velvet.yumhub.domain.mapper


import com.red_velvet.yumhub.domain.utils.orEmpty
import com.red_velvet.yumhub.domain.utils.orZero

//fun RecipeSearchResultDto.toEntity(
//type: String
//): RecipeEntity {
//    return RecipeEntity(
//        id = id.orZero(),
//        title = title.orEmpty(),
//        image = image.orEmpty(),
//        type = type.orEmpty(),
//        imageType = imageType.orEmpty(),
//        servings = servings.orZero()
//    )
//}