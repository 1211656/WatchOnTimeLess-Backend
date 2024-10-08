package pt.com.relogios.relogios.entity.client;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String addressLine1;
    private String addressLine2;

    public Address(String country, String city, String postalCode, String addressLine1, String addressLine2){
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public Address() {}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
}
