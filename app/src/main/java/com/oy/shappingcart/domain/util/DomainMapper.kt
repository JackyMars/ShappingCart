package com.oy.shappingcart.domain.util

interface DomainMapper <T,DomainModel> {

    fun mapFromDomainModel(model: T):DomainModel

    fun mapToDomainModel(domainModel: DomainModel):T
}