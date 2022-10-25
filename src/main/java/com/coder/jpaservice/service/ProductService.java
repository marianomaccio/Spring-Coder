package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.ProductDto;
import com.coder.jpaservice.model.ProductModel;
import com.coder.jpaservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public ProductDto findProductById(long id) {
        ProductModel productModel = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Invalid Product"));
        ProductDto productDto = ProductDto.from(productModel);
        return productDto;
    }

    public ProductDto updateProductById(long id, ProductDto productDto) {
        ProductModel productModel = new ProductModel();
        productModel.setName(productDto.getName());
        productModel.setPurchasePrice(productDto.getPurchasePrice());
        productModel.setSalePrice(productDto.getSalePrice());
        productModel.setStock(productDto.getStock());
        productModel.setDescription(productDto.getDescription());
        productModel.setState(productDto.getState());
        productModel.setProductSupplierId(productDto.getProductSupplierId());
        productModel.setHeadingModel(productModel.getHeadingModel());
        productModel = productRepository.save(productModel);
        ProductDto product = ProductDto.from(productModel);
        return  product;

    }

    public ProductDto insertProductById(ProductDto productDto) {
        ProductModel productModel = new ProductModel();
        productModel.setName(productDto.getName());
        productModel.setPurchasePrice(productDto.getPurchasePrice());
        productModel.setSalePrice(productDto.getSalePrice());
        productModel.setStock(productDto.getStock());
        productModel.setDescription(productDto.getDescription());
        productModel.setState(productDto.getState());
        productModel.setProductSupplierId(productDto.getProductSupplierId());
        productModel.setHeadingModel(productDto.getHeadingModel());
        productRepository.save(productModel);
        ProductDto product = ProductDto.from(productModel);
        return product;
    }
}
