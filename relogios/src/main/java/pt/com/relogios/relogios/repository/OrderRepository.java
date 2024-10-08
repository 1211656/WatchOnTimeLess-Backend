package pt.com.relogios.relogios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.com.relogios.relogios.entity.order.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
    
}
