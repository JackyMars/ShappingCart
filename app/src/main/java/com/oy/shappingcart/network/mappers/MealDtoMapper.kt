package com.oy.shappingcart.network.mappers

import com.oy.shappingcart.domain.model.Meal
import com.oy.shappingcart.domain.util.DomainMapper
import com.oy.shappingcart.network.model.MealDto

class MealDtoMapper:DomainMapper<MealDto,Meal> {
    override fun mapFromDomainModel(model: MealDto): Meal {
       return Meal(
           id = model.idMeal,
           name = model.strMeal,
           category = model.strCategory,
           area = model.strArea,
           instructions = model.strInstructions,
           thumb = model.strMealThumb,
           ingredient1 = model.strIngredient1,
           ingredient2 = model.strIngredient2,
           ingredient3 = model.strIngredient3,
           ingredient4 = model.strIngredient4,
           ingredient5 = model.strIngredient5,
           ingredient6 = model.strIngredient6,
           ingredient7 = model.strIngredient7
       )
    }

    override fun mapToDomainModel(domainModel: Meal): MealDto {
        return MealDto(
            idMeal = domainModel.id,
            strMeal = domainModel.name,
            strCategory = domainModel.category,
            strArea = domainModel.area,
            strInstructions = domainModel.instructions,
            strMealThumb = domainModel.thumb,
            strIngredient1 = domainModel.ingredient1,
            strIngredient2 = domainModel.ingredient2,
            strIngredient3 = domainModel.ingredient3,
            strIngredient4 = domainModel.ingredient4,
            strIngredient5 = domainModel.ingredient5,
            strIngredient6 = domainModel.ingredient6,
            strIngredient7 = domainModel.ingredient7
        )
    }
    fun toDomainList(initial:List<MealDto>):List<Meal>{
        return initial.map { mapFromDomainModel(it) }
    }

    fun fromDomainList(initial:List<Meal>):List<MealDto>{
        return initial.map { mapToDomainModel(it) }
    }
}