package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "producers")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long producerId;

    @NotEmpty
    private String producerName;

    @OneToMany(targetEntity = Product.class)
    private List<Product> products;

    public Producer() {
    }

    public Producer(Long producerId, @NotEmpty String producerName, List<Product> products) {
        this.producerId = producerId;
        this.producerName = producerName;
        this.products = products;
    }

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
