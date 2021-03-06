package com.convenienciaapi.model.transport;

import com.convenienciaapi.model.persistence.Category;

import java.util.UUID;

public class CategoryDTO {
    private String name;

    private UUID uuid;

    private Boolean isActive = true;

    public CategoryDTO() {
    }

    public CategoryDTO(String name, UUID uuid, Boolean isActive) {
        this.name = name;
        this.uuid = uuid;
        this.isActive = isActive;
    }

    public CategoryDTO(Category category) {
        this.name = category.getName();
        this.uuid = category.getUuid();
        this.isActive = category.getIsActive();
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

    @Override
    public String toString() {
        return "FindCategoryResponseDTO{" +
                "name='" + name + '\'' +
                ", uuid=" + uuid +
                ", isActive=" + isActive +
                '}';
    }
}
