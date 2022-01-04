package com.bdqn.keep.entity;


import java.sql.Date;

public class GymCard {

    private long id;
    private String username;
    private long cardtypeid;
    private long status;
    private String phone;
    private String balance;
    private Date openDate;
    private CardType type;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getCardtypeid() {
        return cardtypeid;
    }

    public void setCardtypeid(long cardtypeid) {
        this.cardtypeid = cardtypeid;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }








}
