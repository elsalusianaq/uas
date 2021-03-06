package com.example.lenovo.retrofit.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GetTup {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private List<tup> result = new ArrayList<tup>();
    @SerializedName("message")
    private String message;
    public GetTup() {}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<tup> getResult() {
        return result;
    }

    public void setResult(List<tup> result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}


