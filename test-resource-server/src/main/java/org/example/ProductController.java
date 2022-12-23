package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

        @GetMapping("/products")
        public List<String> getProducts() {
            return Arrays.asList(
                    "One",
                    "Two",
                    "Three"
            );

    }
}
