package com.company;

/**
 * Created by Viscus on 9/22/16.
 */
public class CustomerComplaint {
    String name;
    String address;
    String phoneNumber;
    String problem;
    String request;

    public CustomerComplaint(String name, String address, String phoneNumber, String problem, String request) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.problem = problem;
        this.request = request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
