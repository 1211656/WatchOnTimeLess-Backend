package pt.com.relogios.relogios.dtos;

import org.springframework.beans.BeanUtils;

import pt.com.relogios.relogios.entity.order.Order;

public class OrderDTO{
    private Long id;

    public OrderDTO(Order order){
        BeanUtils.copyProperties(order, this);
    }

    public OrderDTO(){}

    
}