package pt.com.relogios.relogios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.com.relogios.relogios.dtos.OrderDTO;
import pt.com.relogios.relogios.entity.order.Order;
import pt.com.relogios.relogios.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;


    public List<OrderDTO> listarTodos(){
        List<Order> list = orderRepository.findAll();
        return list.stream().map(OrderDTO::new).toList();
    }

    public void inserir(OrderDTO orderDTO) {
        orderRepository.save(new Order(orderDTO));
    }

    public void alterar(OrderDTO orderDTO){
        orderRepository.save(new Order(orderDTO));
    }

    public void excluir(Long id){
        orderRepository.deleteById(id);
    }

    public OrderDTO buscarPorId(Long id){
        return new OrderDTO(orderRepository.findById(id).get());
    }

}
