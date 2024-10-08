package pt.com.relogios.relogios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.relogios.relogios.dtos.OrderDTO;
import pt.com.relogios.relogios.services.OrderService;

@RestController
@RequestMapping(value="/order")
@CrossOrigin
public class OrderController {
    
    @Autowired
    private OrderService orderService;


    @PostMapping
    public void inserir(@RequestBody OrderDTO orderDTO) {
        orderService.inserir(orderDTO);
    }

    @GetMapping
    public List<OrderDTO> listarTodos(){
        return orderService.listarTodos();
    }

    @GetMapping("/{id}")
    public OrderDTO buscarPorId(@RequestBody Long id){
        return orderService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public void alterar(OrderDTO dto){
        orderService.alterar(dto);
    }

    @DeleteMapping("/{id}")
    public void excluir(Long id){
        orderService.excluir(id);
    }





}
