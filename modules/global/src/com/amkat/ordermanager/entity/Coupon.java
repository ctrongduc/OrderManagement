package com.amkat.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|couponCode")
@Table(name = "ORDERMANAGER_COUPON")
@Entity(name = "ordermanager$Coupon")
public class Coupon extends StandardEntity {
    private static final long serialVersionUID = -5933641098885279375L;

    @NotNull
    @Column(name = "COUPON_CODE", nullable = false)
    protected String couponCode;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FROM_DATE")
    protected Date fromDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TO_DATE")
    protected Date toDate;

    @Column(name = "NOTE", length = 2000)
    protected String note;

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }


}