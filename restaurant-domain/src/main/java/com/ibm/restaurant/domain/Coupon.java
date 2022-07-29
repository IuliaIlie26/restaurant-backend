package com.ibm.restaurant.domain;

public class Coupon {
    private Long id;
    private Client client;
    private double discountValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    private enum couponType{
        percentage,
        value;
    }
    private enum couponStatus{
        active,
        inactive;
    }


}
