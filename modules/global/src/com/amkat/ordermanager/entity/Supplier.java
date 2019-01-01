package com.amkat.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|supplierName")
@Table(name = "ORDERMANAGER_SUPPLIER")
@Entity(name = "ordermanager$Supplier")
public class Supplier extends StandardEntity {
    private static final long serialVersionUID = 563567044037781949L;

    @NotNull
    @Column(name = "SUPPLIER_NAME", nullable = false)
    protected String supplierName;

    @NotNull
    @Column(name = "LINK", nullable = false, length = 2000)
    protected String link;

    @Column(name = "NOTE", length = 2000)
    protected String note;

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
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


}