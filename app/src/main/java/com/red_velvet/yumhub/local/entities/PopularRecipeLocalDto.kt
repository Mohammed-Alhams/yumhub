package com.red_velvet.yumhub.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class PopularRecipeLocalDto(
    @PrimaryKey val id: Int,
    val title: String,
    val image: String
)
