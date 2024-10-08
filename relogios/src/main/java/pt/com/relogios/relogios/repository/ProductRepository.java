package pt.com.relogios.relogios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.com.relogios.relogios.entity.product.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
