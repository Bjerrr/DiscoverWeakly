package com.dw.DW.json_models.trip;

public class Product {
    public String name = "";
    public String num = "";
    public String catCode = "";
    public String catOutS = "";
    public String catOutL = "";
    public String operatorCode = "";
    public String operator = "";
    public String operatorUrl = "";

    public Product() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", num='").append(num).append('\'');
        sb.append(", catCode='").append(catCode).append('\'');
        sb.append(", catOutS='").append(catOutS).append('\'');
        sb.append(", catOutL='").append(catOutL).append('\'');
        sb.append(", operatorCode='").append(operatorCode).append('\'');
        sb.append(", operator='").append(operator).append('\'');
        sb.append(", operatorUrl='").append(operatorUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
