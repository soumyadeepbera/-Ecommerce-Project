package com.soumyadeep.ecommerce.dao;

import com.soumyadeep.ecommerce.entity.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
//@RepositoryRestResource ->used to set options on the public Repository interface - it will
// automatically create endpoints as appropriate based on the type of Repository that is being extended
//@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProdctCategoryRepo extends JpaRepository<ProductCategoryEntity,Long> {

}
