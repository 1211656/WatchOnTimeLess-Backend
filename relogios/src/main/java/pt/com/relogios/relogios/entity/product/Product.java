package pt.com.relogios.relogios.entity.product;

import org.springframework.beans.BeanUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import pt.com.relogios.relogios.dtos.ProductDTO;

@Entity
@Table(name = "JP_PRODUTO")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Album album;

    @Column(nullable = false)
    private Brand brand;

    @Column(nullable = false)
    private Stock stock;

    @Column(nullable = false)
    private Description description;

    @Column
    private Price price;

    @Column
    private Comments comments;

    
    public Product(ProductDTO dto){
        BeanUtils.copyProperties(dto, this);
    }

    public Product(){
        
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Album getAlbum() {
        return album;
    }


    public void setAlbum(Album album) {
        this.album = album;
    }


    public Brand getBrand() {
        return brand;
    }


    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    public Stock getStock() {
        return stock;
    }


    public void setStock(Stock stock) {
        this.stock = stock;
    }


    public Description getDescription() {
        return description;
    }


    public void setDescription(Description description) {
        this.description = description;
    }


    public Price getPrice() {
        return price;
    }


    public void setPrice(Price price) {
        this.price = price;
    }


    public Comments getComments() {
        return comments;
    }


    public void setComments(Comments comments) {
        this.comments = comments;
    }

    

    
}
