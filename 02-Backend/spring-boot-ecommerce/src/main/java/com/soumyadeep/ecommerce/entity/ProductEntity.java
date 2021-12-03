package com.soumyadeep.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
//@Data from lombork
@Data
public class ProductEntity {

    //jpa mapping between fields and colum
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "category_id" , nullable = false)
    private ProductCategoryEntity category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unit_price;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int units_in_stock;

    @Column(name = "date_created")
    // @CreationTimestamp hibernate will update the time we don't need to update it manually
    @CreationTimestamp
    private Date date_created;

    @Column(name = "last_updated")
    // @UpdateTimestamp hibernate will update the time we don't need to update it manually
    @UpdateTimestamp
    private Date last_updated;

    @Column(name = "category_id",insertable = false,updatable = false)
    private long category_id;



}
