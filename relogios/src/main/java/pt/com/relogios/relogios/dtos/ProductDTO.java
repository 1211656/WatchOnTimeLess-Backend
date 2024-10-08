package pt.com.relogios.relogios.dtos;



import org.springframework.beans.BeanUtils;


import pt.com.relogios.relogios.entity.product.Album;
import pt.com.relogios.relogios.entity.product.Brand;
import pt.com.relogios.relogios.entity.product.Comments;
import pt.com.relogios.relogios.entity.product.Description;
import pt.com.relogios.relogios.entity.product.Price;
import pt.com.relogios.relogios.entity.product.Product;
import pt.com.relogios.relogios.entity.product.Stock;

public class ProductDTO {
    
    private Long id;
    private Album album;
    private Brand brand;
    private Stock stock;
    private Description description;
    private Price price;
    private Comments comments;

    public ProductDTO(Product product){
        BeanUtils.copyProperties(product, this);
    }

    public ProductDTO() {}

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
