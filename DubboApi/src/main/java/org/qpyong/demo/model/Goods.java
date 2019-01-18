package org.qpyong.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {

    private long id;// id
    private String name;// 产品名称
    private String opgCode;// 产品编码
    private Date productDate;// 生产日期
    private int expiryDate;// 有效期

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpgCode() {
        return opgCode;
    }

    public void setOpgCode(String opgCode) {
        this.opgCode = opgCode;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }
}
