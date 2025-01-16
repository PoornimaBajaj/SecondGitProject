package com.vertafore.service;

import com.vertafore.beans.Product;

public interface ProductService {
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public Product searchProduct(int ProductID);
}
