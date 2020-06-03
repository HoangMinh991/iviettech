/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivietech.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author HoangMinh
 */
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
    @Column(unique=true)
    private String name;
    private long priceNew;
    private long priceOld;
    @OneToOne(cascade=CascadeType.REMOVE)
    @PrimaryKeyJoinColumn
    private ProductDetail productDetail;
    @ManyToOne
    private Platforms platforms;
    @ManyToOne(fetch = FetchType.EAGER)
    private Type type;
    private boolean best;
    @OneToMany(mappedBy ="product")
    private List<CodeGiftCard> listCodeGiftCard;
    @OneToMany(mappedBy = "product")
    private List<OrderDetails> listOrderDetail;
    @CreationTimestamp
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdDatetime;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(long priceNew) {
        this.priceNew = priceNew;
    }

    public double getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(long priceOld) {
        this.priceOld = priceOld;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public Platforms getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isBest() {
        return best;
    }

    public void setBest(boolean best) {
        this.best = best;
    }

    public List<CodeGiftCard> getListCodeGiftCard() {
        return listCodeGiftCard;
    }

    public void setListCodeGiftCard(List<CodeGiftCard> listCodeGiftCard) {
        this.listCodeGiftCard = listCodeGiftCard;
    }

    public List<OrderDetails> getListOrderDetail() {
        return listOrderDetail;
    }

    public void setListOrderDetail(List<OrderDetails> listOrderDetail) {
        this.listOrderDetail = listOrderDetail;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
    
}
