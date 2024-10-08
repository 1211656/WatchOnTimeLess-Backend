package pt.com.relogios.relogios.entity.product;

import jakarta.persistence.Embeddable;

@Embeddable
public class Stock {

    private Long stock;

    public Stock(Long stock) {
        this.stock = stock;
    }

    public Stock() {}

    public Long getStock() {
        return stock;
    }
    public void setStock(Long stock) {
        this.stock = stock;
    }
    
}
