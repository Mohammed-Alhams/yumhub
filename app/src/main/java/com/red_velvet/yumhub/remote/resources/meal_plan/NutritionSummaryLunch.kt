package com.red_velvet.yumhub.remote.resources.meal_plan


import com.google.gson.annotations.SerializedName

data class NutritionSummaryLunch(
    @SerializedName("nutrients")
    val nutrients: List<com.red_velvet.yumhub.remote.resources.meal_plan.Nutrient>? = listOf()
)