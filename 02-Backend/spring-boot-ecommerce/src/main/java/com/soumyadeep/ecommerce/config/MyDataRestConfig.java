package com.soumyadeep.ecommerce.config;

import com.soumyadeep.ecommerce.entity.ProductCategoryEntity;
import com.soumyadeep.ecommerce.entity.ProductEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
//@Configuration ->At the time of scanning spring will pick this up
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] theUnsupportedAction = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};

        //disable Http methods for products ->only Get will works
        config.getExposureConfiguration().forDomainType(ProductEntity.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction)))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction));

        //disable Http methods for productCtaegory
        config.getExposureConfiguration().forDomainType(ProductCategoryEntity.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction)))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction));
    }
}
