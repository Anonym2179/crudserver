package de.crud.server.repository;

import de.crud.server.model.Product;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductService extends JpaRepository<Product, Integer> {

}
