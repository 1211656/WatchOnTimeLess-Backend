package pt.com.relogios.relogios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import pt.com.relogios.relogios.dtos.ProductDTO;
import pt.com.relogios.relogios.entity.product.Product;
import pt.com.relogios.relogios.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> listarTodos(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductDTO::new).toList();
    }

    public void inserir(ProductDTO product) {
        Product entity = new Product(product);
        productRepository.save(entity);
    }

    public ProductDTO alterar(ProductDTO product) {
        Product entity = new Product(product);
        return new ProductDTO(productRepository.save(entity));
    }

    public void excluir(Long id) {
        productRepository.deleteById(id);
    }

    public ProductDTO buscarPorId(Long id){
        return new ProductDTO(productRepository.findById(id).get());
    }
    
}
