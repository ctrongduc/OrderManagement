package com.amkat.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
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

@NamePattern("%s|id")
@Table(name = "ORDERMANAGER_ORDER_ITEM")
@Entity(name = "ordermanager$OrderItem")
public class OrderItem extends StandardEntity {
    private static final long serialVersionUID = -7262521232034116788L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SHIP_DATE")
    protected Date shipDate;

    @NotNull
    @Column(name = "QUALITY", nullable = false)
    protected Integer quality;

    @Column(name = "SUPPLIER_ORDER_NUMBER")
    protected String supplierOrderNumber;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
    protected Supplier supplier;

    @Column(name = "UNIT_PRICE")
    protected Double unitPrice;

    @Column(name = "TAX")
    protected Double tax;

    @Column(name = "SUPPLIER_SHIPPING_FEE")
    protected Double supplierShippingFee;

    @Column(name = "UNIT_WEIGHT")
    protected Double unitWeight;

    @Column(name = "SHIPPING_WEIGHT")
    protected Double shippingWeight;

    @Column(name = "SHIPPING_RATE")
    protected Double shippingRate;

    @Column(name = "TOTAL_SHIPPING_COST")
    protected Double totalShippingCost;

    @Column(name = "CUSTOM_CHARGE")
    protected Double customCharge;

    @Column(name = "SERVICE_CHARGE")
    protected Double serviceCharge;

    @Column(name = "CURRENCY", length = 10)
    protected String currency;

    @Column(name = "CUSTOMER_CURRENCY", length = 10)
    protected String customerCurrency;

    @Column(name = "EXCHANGE_RATE")
    protected Double exchangeRate;

    @Column(name = "QUOTED_PRICE")
    protected Double quotedPrice;

    @NotNull
    @Column(name = "STATUS", nullable = false, length = 100)
    protected String status;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }


    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setSupplierOrderNumber(String supplierOrderNumber) {
        this.supplierOrderNumber = supplierOrderNumber;
    }

    public String getSupplierOrderNumber() {
        return supplierOrderNumber;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTax() {
        return tax;
    }

    public void setSupplierShippingFee(Double supplierShippingFee) {
        this.supplierShippingFee = supplierShippingFee;
    }

    public Double getSupplierShippingFee() {
        return supplierShippingFee;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Double getUnitWeight() {
        return unitWeight;
    }

    public void setShippingWeight(Double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public Double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingRate(Double shippingRate) {
        this.shippingRate = shippingRate;
    }

    public Double getShippingRate() {
        return shippingRate;
    }

    public void setTotalShippingCost(Double totalShippingCost) {
        this.totalShippingCost = totalShippingCost;
    }

    public Double getTotalShippingCost() {
        return totalShippingCost;
    }

    public void setCustomCharge(Double customCharge) {
        this.customCharge = customCharge;
    }

    public Double getCustomCharge() {
        return customCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCustomerCurrency(String customerCurrency) {
        this.customerCurrency = customerCurrency;
    }

    public String getCustomerCurrency() {
        return customerCurrency;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setQuotedPrice(Double quotedPrice) {
        this.quotedPrice = quotedPrice;
    }

    public Double getQuotedPrice() {
        return quotedPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}