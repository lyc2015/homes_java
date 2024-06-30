package jp.co.lyc.cms.model;

public class CustomerRegisterModel {

    public String maxCustomerNo;

    public String getMaxCustomerNo() {
        return maxCustomerNo;
    }

    public void setMaxCustomerNo(String maxCustomerNo) {
        this.maxCustomerNo = maxCustomerNo;
    }

    public String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    public int getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(int nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String nationalityName;
    public int nationalityCode;

    public int visaCode;

    public int getVisaCode() {
        return visaCode;
    }

    public void setVisaCode(int visaCode) {
        this.visaCode = visaCode;
    }

    public String getVisaName() {
        return visaName;
    }

    public void setVisaName(String visaName) {
        this.visaName = visaName;
    }

    public String visaName;

    public String customerBase;
    public String customerBaseCode;

    public String getCustomerBase() {
        return customerBase;
    }

    public void setCustomerBase(String customerBase) {
        this.customerBase = customerBase;
    }

    public String getCustomerBaseCode() {
        return customerBaseCode;
    }

    public void setCustomerBaseCode(String customerBaseCode) {
        this.customerBaseCode = customerBaseCode;
    }

    public String getCustomerBaseName() {
        return customerBaseName;
    }

    public void setCustomerBaseName(String customerBaseName) {
        this.customerBaseName = customerBaseName;
    }

    public String customerBaseName;



    public String stationCode;
    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String stationName;

}
