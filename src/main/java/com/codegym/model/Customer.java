package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private byte age;
    private String address;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    public Customer() {
    }

    public Customer(Long id, String fullName, byte age, String address, String phoneNumber, Province province) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.province = province;
    }

    public Customer(String fullName, byte age, String address, String phoneNumber, Province province) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
