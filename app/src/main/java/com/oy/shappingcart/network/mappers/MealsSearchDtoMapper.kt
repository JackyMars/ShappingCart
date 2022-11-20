package com.oy.shappingcart.network.mappers


import com.oy.shappingcart.domain.model.MealList
import com.oy.shappingcart.domain.util.DomainMapper
import com.oy.shappingcart.network.model.MealsSearchDto

class MealsSearchDtoMapper:DomainMapper<MealsSearchDto,MealList> {
    override fun mapFromDomainModel(model: MealsSearchDto): MealList {
        return MealList(
            id = model.idMeal,
            name = model.strMeal,
            thumb = model.strMealThumb
        )
    }

    override fun mapToDomainModel(domainModel: MealList): MealsSearchDto {
        return MealsSearchDto(
            idMeal = domainModel.id,
            strMeal = domainModel.name,
            strMealThumb = domainModel.thumb
        )
    }

    fun toDomainList(initial:List<MealsSearchDto>):List<MealList>{
        return initial.map { mapFromDomainModel(it) }
    }

    fun fromDomainList(initial:List<MealList>):List<MealsSearchDto>{
        return initial.map { mapToDomainModel(it) }
    }
}