package com.example.bank;

public class Branch {
    private String name;
    private String address;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
