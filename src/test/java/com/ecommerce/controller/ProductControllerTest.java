package com.ecommerce.controller;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.http.MediaType;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.Collections;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void testGetAllProducts() throws Exception {
        when(productService.getAllProducts()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/products"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testCreateProduct() throws Exception {
        ProductDTO productDTO = new ProductDTO(1L, "Product 1", "Description 1", 10.0);
        when(productService.createProduct(any(ProductDTO.class))).thenReturn(productDTO);
        mockMvc.perform(post("/api/products")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\"name\":\"Product 1\",\"description\":\"Description 1\",\"price\":10.0}"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }
}