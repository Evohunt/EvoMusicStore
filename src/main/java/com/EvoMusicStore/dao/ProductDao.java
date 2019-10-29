package com.EvoMusicStore.dao;

import com.EvoMusicStore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();

        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender Strat guitar");
        product1.setProductPrice(2100);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitStock(25);
        product1.setProductManufacturer("Fender");

        productList = new ArrayList<Product>();
        productList.add(product1);

        return productList;

    }

}
