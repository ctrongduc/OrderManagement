package com.amkat.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "ORDERMANAGER_CUSTOMER")
@Entity(name = "ordermanager$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -5736797924859039209L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "FB_LINK", length = 2000)
    protected String fbLink;

    @Column(name = "INTEGRAM_LINK", length = 2000)
    protected String integramLink;

    @Column(name = "PHONE", length = 20)
    protected String phone;

    @Column(name = "EMAIL", length = 1000)
    protected String email;

    @Column(name = "ADDRESS", length = 1000)
    protected String address;

    @Column(name = "CITY", length = 300)
    protected String city;

    @Column(name = "NOTE", length = 2000)
    protected String note;

    @Column(name = "OPTIN_ADS")
    protected Boolean optinAds;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setIntegramLink(String integramLink) {
        this.integramLink = integramLink;
    }

    public String getIntegramLink() {
        return integramLink;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setOptinAds(Boolean optinAds) {
        this.optinAds = optinAds;
    }

    public Boolean getOptinAds() {
        return optinAds;
    }


}