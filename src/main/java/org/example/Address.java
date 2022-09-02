package org.example;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Address {

    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address(@Value("#{'Miami'}")String city,@Value("#{'Florida'}") String state, @Value("#{'US'}")String country, @Value("#{'745894'}")String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
