package pt.com.relogios.relogios.entity.order;

import org.springframework.beans.BeanUtils;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import pt.com.relogios.relogios.dtos.OrderDTO;

@Entity
@Table(name = "JP_Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Order(OrderDTO dto){
        BeanUtils.copyProperties(dto, this);
    }
    public Order(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
