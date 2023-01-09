
package com.dw.DW.GENERATED_POJOS.JsonTrip;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icon",
    "name",
    "internalName",
    "displayNumber",
    "num",
    "line",
    "lineId",
    "catOut",
    "catIn",
    "catCode",
    "cls",
    "catOutS",
    "catOutL",
    "operatorCode",
    "operator",
    "admin",
    "routeIdxFrom",
    "routeIdxTo",
    "matchId"
})
@Generated("jsonschema2pojo")
public class Product {

    @SerializedName("icon")
    private Icon icon;
    @SerializedName("name")
    private String name;
    @SerializedName("internalName")
    private String internalName;
    @SerializedName("displayNumber")
    private String displayNumber;
    @SerializedName("num")
    private String num;
    @SerializedName("line")
    private String line;
    @SerializedName("lineId")
    private String lineId;
    @SerializedName("catOut")
    private String catOut;
    @SerializedName("catIn")
    private String catIn;
    @SerializedName("catCode")
    private String catCode;
    @SerializedName("cls")
    private String cls;
    @SerializedName("catOutS")
    private String catOutS;
    @SerializedName("catOutL")
    private String catOutL;
    @SerializedName("operatorCode")
    private String operatorCode;
    @SerializedName("operator")
    private String operator;
    @SerializedName("admin")
    private String admin;
    @SerializedName("routeIdxFrom")
    private Integer routeIdxFrom;
    @SerializedName("routeIdxTo")
    private Integer routeIdxTo;
    @SerializedName("matchId")
    private String matchId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param displayNumber
     * @param catOutL
     * @param catOut
     * @param routeIdxTo
     * @param line
     * @param num
     * @param icon
     * @param routeIdxFrom
     * @param lineId
     * @param admin
     * @param cls
     * @param catOutS
     * @param operatorCode
     * @param operator
     * @param internalName
     * @param catCode
     * @param name
     * @param catIn
     * @param matchId
     */
    public Product(Icon icon, String name, String internalName, String displayNumber, String num, String line, String lineId, String catOut, String catIn, String catCode, String cls, String catOutS, String catOutL, String operatorCode, String operator, String admin, Integer routeIdxFrom, Integer routeIdxTo, String matchId) {
        super();
        this.icon = icon;
        this.name = name;
        this.internalName = internalName;
        this.displayNumber = displayNumber;
        this.num = num;
        this.line = line;
        this.lineId = lineId;
        this.catOut = catOut;
        this.catIn = catIn;
        this.catCode = catCode;
        this.cls = cls;
        this.catOutS = catOutS;
        this.catOutL = catOutL;
        this.operatorCode = operatorCode;
        this.operator = operator;
        this.admin = admin;
        this.routeIdxFrom = routeIdxFrom;
        this.routeIdxTo = routeIdxTo;
        this.matchId = matchId;
    }

    @SerializedName("icon")
    public Icon getIcon() {
        return icon;
    }

    @SerializedName("icon")
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Product withIcon(Icon icon) {
        this.icon = icon;
        return this;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("internalName")
    public String getInternalName() {
        return internalName;
    }

    @SerializedName("internalName")
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public Product withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    @SerializedName("displayNumber")
    public String getDisplayNumber() {
        return displayNumber;
    }

    @SerializedName("displayNumber")
    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }

    public Product withDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
        return this;
    }

    @SerializedName("num")
    public String getNum() {
        return num;
    }

    @SerializedName("num")
    public void setNum(String num) {
        this.num = num;
    }

    public Product withNum(String num) {
        this.num = num;
        return this;
    }

    @SerializedName("line")
    public String getLine() {
        return line;
    }

    @SerializedName("line")
    public void setLine(String line) {
        this.line = line;
    }

    public Product withLine(String line) {
        this.line = line;
        return this;
    }

    @SerializedName("lineId")
    public String getLineId() {
        return lineId;
    }

    @SerializedName("lineId")
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public Product withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    @SerializedName("catOut")
    public String getCatOut() {
        return catOut;
    }

    @SerializedName("catOut")
    public void setCatOut(String catOut) {
        this.catOut = catOut;
    }

    public Product withCatOut(String catOut) {
        this.catOut = catOut;
        return this;
    }

    @SerializedName("catIn")
    public String getCatIn() {
        return catIn;
    }

    @SerializedName("catIn")
    public void setCatIn(String catIn) {
        this.catIn = catIn;
    }

    public Product withCatIn(String catIn) {
        this.catIn = catIn;
        return this;
    }

    @SerializedName("catCode")
    public String getCatCode() {
        return catCode;
    }

    @SerializedName("catCode")
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public Product withCatCode(String catCode) {
        this.catCode = catCode;
        return this;
    }

    @SerializedName("cls")
    public String getCls() {
        return cls;
    }

    @SerializedName("cls")
    public void setCls(String cls) {
        this.cls = cls;
    }

    public Product withCls(String cls) {
        this.cls = cls;
        return this;
    }

    @SerializedName("catOutS")
    public String getCatOutS() {
        return catOutS;
    }

    @SerializedName("catOutS")
    public void setCatOutS(String catOutS) {
        this.catOutS = catOutS;
    }

    public Product withCatOutS(String catOutS) {
        this.catOutS = catOutS;
        return this;
    }

    @SerializedName("catOutL")
    public String getCatOutL() {
        return catOutL;
    }

    @SerializedName("catOutL")
    public void setCatOutL(String catOutL) {
        this.catOutL = catOutL;
    }

    public Product withCatOutL(String catOutL) {
        this.catOutL = catOutL;
        return this;
    }

    @SerializedName("operatorCode")
    public String getOperatorCode() {
        return operatorCode;
    }

    @SerializedName("operatorCode")
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public Product withOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
        return this;
    }

    @SerializedName("operator")
    public String getOperator() {
        return operator;
    }

    @SerializedName("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Product withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @SerializedName("admin")
    public String getAdmin() {
        return admin;
    }

    @SerializedName("admin")
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Product withAdmin(String admin) {
        this.admin = admin;
        return this;
    }

    @SerializedName("routeIdxFrom")
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
    }

    @SerializedName("routeIdxFrom")
    public void setRouteIdxFrom(Integer routeIdxFrom) {
        this.routeIdxFrom = routeIdxFrom;
    }

    public Product withRouteIdxFrom(Integer routeIdxFrom) {
        this.routeIdxFrom = routeIdxFrom;
        return this;
    }

    @SerializedName("routeIdxTo")
    public Integer getRouteIdxTo() {
        return routeIdxTo;
    }

    @SerializedName("routeIdxTo")
    public void setRouteIdxTo(Integer routeIdxTo) {
        this.routeIdxTo = routeIdxTo;
    }

    public Product withRouteIdxTo(Integer routeIdxTo) {
        this.routeIdxTo = routeIdxTo;
        return this;
    }

    @SerializedName("matchId")
    public String getMatchId() {
        return matchId;
    }

    @SerializedName("matchId")
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Product withMatchId(String matchId) {
        this.matchId = matchId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Product withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("internalName");
        sb.append('=');
        sb.append(((this.internalName == null)?"<null>":this.internalName));
        sb.append(',');
        sb.append("displayNumber");
        sb.append('=');
        sb.append(((this.displayNumber == null)?"<null>":this.displayNumber));
        sb.append(',');
        sb.append("num");
        sb.append('=');
        sb.append(((this.num == null)?"<null>":this.num));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("lineId");
        sb.append('=');
        sb.append(((this.lineId == null)?"<null>":this.lineId));
        sb.append(',');
        sb.append("catOut");
        sb.append('=');
        sb.append(((this.catOut == null)?"<null>":this.catOut));
        sb.append(',');
        sb.append("catIn");
        sb.append('=');
        sb.append(((this.catIn == null)?"<null>":this.catIn));
        sb.append(',');
        sb.append("catCode");
        sb.append('=');
        sb.append(((this.catCode == null)?"<null>":this.catCode));
        sb.append(',');
        sb.append("cls");
        sb.append('=');
        sb.append(((this.cls == null)?"<null>":this.cls));
        sb.append(',');
        sb.append("catOutS");
        sb.append('=');
        sb.append(((this.catOutS == null)?"<null>":this.catOutS));
        sb.append(',');
        sb.append("catOutL");
        sb.append('=');
        sb.append(((this.catOutL == null)?"<null>":this.catOutL));
        sb.append(',');
        sb.append("operatorCode");
        sb.append('=');
        sb.append(((this.operatorCode == null)?"<null>":this.operatorCode));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("admin");
        sb.append('=');
        sb.append(((this.admin == null)?"<null>":this.admin));
        sb.append(',');
        sb.append("routeIdxFrom");
        sb.append('=');
        sb.append(((this.routeIdxFrom == null)?"<null>":this.routeIdxFrom));
        sb.append(',');
        sb.append("routeIdxTo");
        sb.append('=');
        sb.append(((this.routeIdxTo == null)?"<null>":this.routeIdxTo));
        sb.append(',');
        sb.append("matchId");
        sb.append('=');
        sb.append(((this.matchId == null)?"<null>":this.matchId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.displayNumber == null)? 0 :this.displayNumber.hashCode()));
        result = ((result* 31)+((this.catOutL == null)? 0 :this.catOutL.hashCode()));
        result = ((result* 31)+((this.catOut == null)? 0 :this.catOut.hashCode()));
        result = ((result* 31)+((this.routeIdxTo == null)? 0 :this.routeIdxTo.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.num == null)? 0 :this.num.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.routeIdxFrom == null)? 0 :this.routeIdxFrom.hashCode()));
        result = ((result* 31)+((this.lineId == null)? 0 :this.lineId.hashCode()));
        result = ((result* 31)+((this.admin == null)? 0 :this.admin.hashCode()));
        result = ((result* 31)+((this.cls == null)? 0 :this.cls.hashCode()));
        result = ((result* 31)+((this.catOutS == null)? 0 :this.catOutS.hashCode()));
        result = ((result* 31)+((this.operatorCode == null)? 0 :this.operatorCode.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.internalName == null)? 0 :this.internalName.hashCode()));
        result = ((result* 31)+((this.catCode == null)? 0 :this.catCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.catIn == null)? 0 :this.catIn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.matchId == null)? 0 :this.matchId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return (((((((((((((((((((((this.displayNumber == rhs.displayNumber)||((this.displayNumber!= null)&&this.displayNumber.equals(rhs.displayNumber)))&&((this.catOutL == rhs.catOutL)||((this.catOutL!= null)&&this.catOutL.equals(rhs.catOutL))))&&((this.catOut == rhs.catOut)||((this.catOut!= null)&&this.catOut.equals(rhs.catOut))))&&((this.routeIdxTo == rhs.routeIdxTo)||((this.routeIdxTo!= null)&&this.routeIdxTo.equals(rhs.routeIdxTo))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.num == rhs.num)||((this.num!= null)&&this.num.equals(rhs.num))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.routeIdxFrom == rhs.routeIdxFrom)||((this.routeIdxFrom!= null)&&this.routeIdxFrom.equals(rhs.routeIdxFrom))))&&((this.lineId == rhs.lineId)||((this.lineId!= null)&&this.lineId.equals(rhs.lineId))))&&((this.admin == rhs.admin)||((this.admin!= null)&&this.admin.equals(rhs.admin))))&&((this.cls == rhs.cls)||((this.cls!= null)&&this.cls.equals(rhs.cls))))&&((this.catOutS == rhs.catOutS)||((this.catOutS!= null)&&this.catOutS.equals(rhs.catOutS))))&&((this.operatorCode == rhs.operatorCode)||((this.operatorCode!= null)&&this.operatorCode.equals(rhs.operatorCode))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.internalName == rhs.internalName)||((this.internalName!= null)&&this.internalName.equals(rhs.internalName))))&&((this.catCode == rhs.catCode)||((this.catCode!= null)&&this.catCode.equals(rhs.catCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.catIn == rhs.catIn)||((this.catIn!= null)&&this.catIn.equals(rhs.catIn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.matchId == rhs.matchId)||((this.matchId!= null)&&this.matchId.equals(rhs.matchId))));
    }

}
