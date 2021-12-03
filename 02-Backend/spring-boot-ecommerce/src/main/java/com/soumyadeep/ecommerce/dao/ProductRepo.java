package com.soumyadeep.ecommerce.dao;

import com.soumyadeep.ecommerce.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Long> {

}
