package com.ecommerce.service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("test")
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        when(productRepository.findAll()).thenReturn(Collections.emptyList());
        assertEquals(Collections.emptyList(), productService.getAllProducts());
    }

    @Test
    public void testCreateProduct() {
        ProductDTO productDTO = new ProductDTO(1L, "Product 1", "Description 1", 10.0);
        Product product = new Product(1L, "Product 1", "Description 1", 10.0);
        when(productRepository.save(any(Product.class))).thenReturn(product);
        assertEquals(productDTO, productService.createProduct(productDTO));
    }
}