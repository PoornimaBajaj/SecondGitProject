package com.vertafore.service;

import com.vertafore.beans.Product;
import com.vertafore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    @Transactional
    public Product addProduct(Product product) {
       return productRepository.save(product);
    }

    @Override
    @Transactional
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product searchProduct(int ProductID) {

        Optional<Product> opt = productRepository.findById(ProductID);
        if(opt.isPresent())
            return opt.get();
        else
            return  null;
    }
}
