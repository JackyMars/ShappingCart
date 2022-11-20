package com.oy.shappingcart.network.mappers

import com.oy.shappingcart.domain.model.Category
import com.oy.shappingcart.domain.util.DomainMapper
import com.oy.shappingcart.network.model.CategoriesDto

class CategoriesDtoMapper:DomainMapper<CategoriesDto,Category> {
    override fun mapFromDomainModel(model: CategoriesDto): Category {
        return Category(
            id = model.idCategory,
            name = model.strCategory,
            thumb = model.strCategoryThumb
        )
    }

    override fun mapToDomainModel(domainModel: Category): CategoriesDto {
        return CategoriesDto(
            idCategory = domainModel.id,
            strCategory = domainModel.name,
            strCategoryThumb = domainModel.thumb
        )
    }

    fun toDomainList(initial:List<CategoriesDto>):List<Category>{
        return initial.map { mapFromDomainModel(it) }
    }

    fun fromDomainList(initial:List<Category>):List<CategoriesDto>{
        return initial.map { mapToDomainModel(it) }
    }
}