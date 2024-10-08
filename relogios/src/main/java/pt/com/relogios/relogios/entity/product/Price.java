package pt.com.relogios.relogios.entity.product;

import jakarta.persistence.Embeddable;


@Embeddable
public class Price {
    private Long price;
   

    public Price(Long price, Currency currency) {
        this.price = price;
        
    }
    public Price(){}

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }


    

    
}
