/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class Service {
    private int id;
    private String fullname;
    private String details;
    private float originalPrice;
    private float salePrice;
    private String description;
    private String thumbnailLink;
    private CategoryService category;
    private Date updatedDate;
    private boolean featured;   
    private int status;
    private int quantity;

    public Service() {
    }

    public Service(int id, String fullname ,float salePrice) {
        this.id = id;
        this.fullname = fullname;
        this.salePrice = salePrice;
                
    }

    public Service(int id, String fullname, float salePrice, int status) {
        this.id = id;
        this.fullname = fullname;
        this.salePrice = salePrice;
        this.status = status;
    }
    

    public Service(int id, String fullname, String details, float originalPrice, float salePrice, String description, String thumbnailLink, CategoryService category, Date updatedDate, boolean featured, int status, int quantity) {
        this.id = id;
        this.fullname = fullname;
        this.details = details;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
        this.description = description;
        this.thumbnailLink = thumbnailLink;
        this.category = category;
        this.updatedDate = updatedDate;
        this.featured = featured;
        this.status = status;
        this.quantity = quantity;
    }

    public Service(String fullname) {
        this.fullname = fullname;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnailLink() {
        return thumbnailLink;
    }

    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    public CategoryService getCategory() {
        return category;
    }

    public void setCategory(CategoryService category) {
        this.category = category;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
