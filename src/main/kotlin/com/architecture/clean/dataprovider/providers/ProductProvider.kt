package com.architecture.clean.dataprovider.providers

import com.architecture.clean.dataprovider.repository.product.ProductDataBase
import com.architecture.clean.dataprovider.repository.mapper.MapperDataToEntity
import com.architecture.clean.dataprovider.repository.mapper.MapperEntityToData
import com.architecture.clean.entities.ProductEntity
import com.architecture.clean.usecases.ProviderFindByIdProduct
import com.architecture.clean.usecases.ProviderListProduct
import com.architecture.clean.usecases.ProviderSaveProduct
import com.architecture.clean.usecases.ProviderUpdateProduct
import org.springframework.stereotype.Component

@Component
class ProductProvider(
    private val dataBase: ProductDataBase,
    private val mapperEntityToData: MapperEntityToData,
    private val mapperDataToEntity: MapperDataToEntity
) : ProviderListProduct, ProviderSaveProduct, ProviderFindByIdProduct, ProviderUpdateProduct {

    override fun findAll(): List<ProductEntity> {
        val data = dataBase.findAll();
        return data.map { d -> mapperDataToEntity.map(d) }
    }

    override fun save(entity: ProductEntity): ProductEntity {
        val data = dataBase.save(mapperEntityToData.map(entity));
        return mapperDataToEntity.map(data);
    }

    override fun findById(id: Long?): ProductEntity {
        val data = dataBase.findById(id);
        return mapperDataToEntity.map(data);
    }

    override fun update(entity: ProductEntity): ProductEntity {
        val data = dataBase.save(mapperEntityToData.map(entity));
        return mapperDataToEntity.map(data);
    }
}