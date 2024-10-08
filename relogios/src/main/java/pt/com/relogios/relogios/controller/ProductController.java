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

import pt.com.relogios.relogios.dtos.ProductDTO;
import pt.com.relogios.relogios.services.ProductService;

@RestController
@RequestMapping(value="/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<ProductDTO> listarTodos(){
        return productService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody ProductDTO product) {
        System.out.println("Cheguei\n");
        productService.inserir(product);
    }

    @PutMapping
    public void alterar(@RequestBody ProductDTO productDTO){
        productService.alterar(productDTO);
    }

    @DeleteMapping("/{id}")
    public void excluir(Long id){
        productService.excluir(id);
    }

    @GetMapping("/{id}")
    public ProductDTO buscarPorId(Long id){
        return productService.buscarPorId(id);
    }
}
