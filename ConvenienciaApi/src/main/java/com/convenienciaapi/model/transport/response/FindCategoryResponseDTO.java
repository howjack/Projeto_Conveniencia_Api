package com.convenienciaapi.model.transport.response;

import com.convenienciaapi.model.persistence.Category;
import com.convenienciaapi.model.persistence.Product;

import java.util.Set;
import java.util.UUID;

public class FindCategoryResponseDTO {

    private String name;

    private UUID uuid;

    private Boolean isActive = true;

    private Set<Product> products;

    public FindCategoryResponseDTO() {
    }

    public FindCategoryResponseDTO(String name, UUID uuid, Boolean isActive, Set<Product> products) {
        this.name = name;
        this.uuid = uuid;
        this.isActive = isActive;
        this.products = products;
    }

    public FindCategoryResponseDTO(String name, UUID uuid, Boolean isActive) {
        this.name = name;
        this.uuid = uuid;
        this.isActive = isActive;
    }

    public FindCategoryResponseDTO(Category category) {
        this.name = category.getName();
        this.uuid = category.getUuid();
        this.isActive = category.getIsActive();
        this.products = category.getProducts();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "FindCategoryResponseDTO{" +
                "name='" + name + '\'' +
                ", uuid=" + uuid +
                ", isActive=" + isActive +
                '}';
    }
}
