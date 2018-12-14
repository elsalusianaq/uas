package com.example.elsa.tupperwareuser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTupperware {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private List<Tupperware> result = null;

    public GetTupperware(String status, List<Tupperware> result) {
        super();
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetTupperware withStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Tupperware> getResult() {
        return result;
    }

    public void setResult(List<Tupperware> result) {
        this.result = result;
    }

    public GetTupperware withResult(List<Tupperware> result) {
        this.result = result;
        return this;
    }


}
