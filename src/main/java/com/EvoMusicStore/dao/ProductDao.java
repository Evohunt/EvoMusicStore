package com.EvoMusicStore.dao;

import com.EvoMusicStore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductId("124543");
        product1.setProductName("Fender Stratocaster");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender Strat guitar");
        product1.setProductPrice(2100);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitStock(11);
        product1.setProductManufacturer("Fender");

        Product product2 = new Product();
        product2.setProductId("456464");
        product2.setProductName("Gibson Les Paul");
        product2.setProductCategory("Instrument");
        product2.setProductDescription("This is a Gibson Les Paul guitar");
        product2.setProductPrice(8100);
        product2.setProductCondition("New");
        product2.setProductStatus("Active");
        product2.setUnitStock(5);
        product2.setProductManufacturer("Gibson");

        Product product3 = new Product();
        product3.setProductId("546546");
        product3.setProductName("BOSS GT-1000");
        product3.setProductCategory("Guitar effects");
        product3.setProductDescription("This is a BOSS GT-1000 guitar processor");
        product3.setProductPrice(29);
        product3.setProductCondition("New");
        product3.setProductStatus("Active");
        product3.setUnitStock(8);
        product3.setProductManufacturer("BOSS");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;

    }

    public Product getProductById(String productId) throws IOException {

        for (Product product : getProductList()) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found");

    }
}
