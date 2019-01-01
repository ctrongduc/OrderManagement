package com.amkat.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|productName")
@Table(name = "ORDERMANAGER_PRODUCT")
@Entity(name = "ordermanager$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 1065611624032117518L;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false, length = 500)
    protected String productName;

    @NotNull
    @Column(name = "LINK", nullable = false, length = 2000)
    protected String link;

    @Column(name = "NOTE", length = 2000)
    protected String note;

    @Column(name = "COUPON_CODE", length = 2000)
    protected String couponCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
    protected Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponCode() {
        return couponCode;
    }


}