package jp.co.lyc.cms.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ManagementCompanyModel implements Serializable {

    private String managementMaxCompanyID;

    public String getManagementMaxCompanyID() {
        return managementMaxCompanyID;
    }

    public void setManagementMaxCompanyID(String managementMaxCompanyID) {
        this.managementMaxCompanyID = managementMaxCompanyID;
    }

    private String phoneNo1;
    private String phoneNo2;
    private String phoneNo3;

    public String getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public String getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(String phoneNo2) {
        this.phoneNo2 = phoneNo2;
    }

    public String getPhoneNo3() {
        return phoneNo3;
    }

    public void setPhoneNo3(String phoneNo3) {
        this.phoneNo3 = phoneNo3;
    }

    private String managementCompanyID;
    private String managementCompanyName;
    private String managementCompanyAddress;
    private String managementCompanyRemark;
    private String managementCompanyMail;
    private String managementCompanyPhoneNo;
    private String managementCompanyURL;
    private String managementCompanyPostCode;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
    private String updateUser;

    public String getManagementCompanyAddress() {
        return managementCompanyAddress;
    }

    public void setManagementCompanyAddress(String managementCompanyAddress) {
        this.managementCompanyAddress = managementCompanyAddress;
    }

    public String getManagementCompanyRemark() {
        return managementCompanyRemark;
    }

    public void setManagementCompanyRemark(String managementCompanyRemark) {
        this.managementCompanyRemark = managementCompanyRemark;
    }

    public String getManagementCompanyID() {
        return managementCompanyID;
    }

    public void setManagementCompanyID(String managementCompanyID) {
        this.managementCompanyID = managementCompanyID;
    }

    public String getManagementCompanyName() {
        return managementCompanyName;
    }

    public void setManagementCompanyName(String managementCompanyName) {
        this.managementCompanyName = managementCompanyName;
    }

    public String getManagementCompanyMail() {
        return managementCompanyMail;
    }

    public void setManagementCompanyMail(String managementCompanyMail) {
        this.managementCompanyMail = managementCompanyMail;
    }

    public String getManagementCompanyPhoneNo() {
        return managementCompanyPhoneNo;
    }

    public void setManagementCompanyPhoneNo(String managementCompanyPhoneNo) {

        this.managementCompanyPhoneNo = this.phoneNo1 + this.phoneNo2 + this.phoneNo3;
    }

    public String getManagementCompanyURL() {
        return managementCompanyURL;
    }

    public void setManagementCompanyURL(String managementCompanyURL) {
        this.managementCompanyURL = managementCompanyURL;
    }

    public String getManagementCompanyPostCode() {
        return managementCompanyPostCode;
    }

    public void setManagementCompanyPostCode(String managementCompanyPostCode) {
        this.managementCompanyPostCode = managementCompanyPostCode;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}
