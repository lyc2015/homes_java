package jp.co.lyc.cms.model;

import java.time.LocalDateTime;
import java.io.Serializable;

public class EmployeeModel implements Serializable {
	private String employeeNo;
	private String employeeFirstName;
	private String employeeLastName;
	private String password;
	private Integer authorityCode;
	private String genderStatus;
	private String birthday;
	private String japaneseCalendar;
	private String alphabetName;
	private String furigana;
	private Integer nationalityCode;
	private String intoCompanyYearAndMonth;
	private Integer employeeFormCode;
	private String retirementResonClassification;
	private String retirementYearAndMonth;
	private String comeToJapanYearAndMonth;
	private String graduationUniversity;
	private String graduationYearAndMonth;
	private Integer residenceCode;
	private String companyMail;
	private String phoneNo;
	private Integer stationCode;
	private String employmentInsuranceStatus;
	private String socialInsuranceStatus;
	private String yearsOfExperience;
	private Integer retirementResonClassificationCode;
	private Integer departmentCode;
	private Integer homesAgentCode;
	private LocalDateTime updateTime;
	private LocalDateTime createTime;
	private String updateUser;
	private String picInfo;
	private String birthplace;
	private String postalCode;
	private String firstHalfAddress;
	private String lastHalfAddress;
	private String employmentInsuranceNo;
	private String socialInsuranceNo;

    public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstHalfAddress() {
		return firstHalfAddress;
	}

	public void setFirstHalfAddress(String firstHalfAddress) {
		this.firstHalfAddress = firstHalfAddress;
	}

	public String getLastHalfAddress() {
		return lastHalfAddress;
	}

	public void setLastHalfAddress(String lastHalfAddress) {
		this.lastHalfAddress = lastHalfAddress;
	}

	public String getEmploymentInsuranceNo() {
		return employmentInsuranceNo;
	}

	public void setEmploymentInsuranceNo(String employmentInsuranceNo) {
		this.employmentInsuranceNo = employmentInsuranceNo;
	}

	public String getSocialInsuranceNo() {
		return socialInsuranceNo;
	}

	public void setSocialInsuranceNo(String socialInsuranceNo) {
		this.socialInsuranceNo = socialInsuranceNo;
	}

	// Getters and Setters

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getemployeeFirstName() {
		return employeeFirstName;
	}

	public void setemployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAuthorityCode() {
		return authorityCode;
	}

	public void setAuthorityCode(int authorityCode) {
		this.authorityCode = authorityCode;
	}

	public String getGenderStatus() {
		return genderStatus;
	}

	public void setGenderStatus(String genderStatus) {
		this.genderStatus = genderStatus;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getJapaneseCalendar() {
		return japaneseCalendar;
	}

	public void setJapaneseCalendar(String japaneseCalendar) {
		this.japaneseCalendar = japaneseCalendar;
	}

	public String getAlphabetName() {
		return alphabetName;
	}

	public void setAlphabetName(String alphabetName) {
		this.alphabetName = alphabetName;
	}

	public String getFurigana() {
		return furigana;
	}

	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}

	public Integer getNationalityCode() {
		return nationalityCode;
	}

	public void setNationalityCode(Integer nationalityCode) {
		this.nationalityCode = nationalityCode;
	}

	public String getIntoCompanyYearAndMonth() {
		return intoCompanyYearAndMonth;
	}

	public void setIntoCompanyYearAndMonth(String intoCompanyYearAndMonth) {
		this.intoCompanyYearAndMonth = intoCompanyYearAndMonth;
	}

	public Integer getEmployeeFormCode() {
		return employeeFormCode;
	}

	public void setEmployeeFormCode(Integer employeeFormCode) {
		this.employeeFormCode = employeeFormCode;
	}

	public String getRetirementResonClassification() {
		return retirementResonClassification;
	}

	public void setRetirementResonClassification(String retirementResonClassification) {
		this.retirementResonClassification = retirementResonClassification;
	}

	public String getRetirementYearAndMonth() {
		return retirementYearAndMonth;
	}

	public void setRetirementYearAndMonth(String retirementYearAndMonth) {
		this.retirementYearAndMonth = retirementYearAndMonth;
	}

	public String getComeToJapanYearAndMonth() {
		return comeToJapanYearAndMonth;
	}

	public void setComeToJapanYearAndMonth(String comeToJapanYearAndMonth) {
		this.comeToJapanYearAndMonth = comeToJapanYearAndMonth;
	}

	public String getGraduationUniversity() {
		return graduationUniversity;
	}

	public void setGraduationUniversity(String graduationUniversity) {
		this.graduationUniversity = graduationUniversity;
	}

	public String getGraduationYearAndMonth() {
		return graduationYearAndMonth;
	}

	public void setGraduationYearAndMonth(String graduationYearAndMonth) {
		this.graduationYearAndMonth = graduationYearAndMonth;
	}

	public Integer getResidenceCode() {
		return residenceCode;
	}

	public void setResidenceCode(Integer residenceCode) {
		this.residenceCode = residenceCode;
	}

	public String getCompanyMail() {
		return companyMail;
	}

	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmploymentInsuranceStatus() {
		return employmentInsuranceStatus;
	}

	public void setEmploymentInsuranceStatus(String employmentInsuranceStatus) {
		this.employmentInsuranceStatus = employmentInsuranceStatus;
	}

	public String getSocialInsuranceStatus() {
		return socialInsuranceStatus;
	}

	public void setSocialInsuranceStatus(String socialInsuranceStatus) {
		this.socialInsuranceStatus = socialInsuranceStatus;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Integer getRetirementResonClassificationCode() {
		return retirementResonClassificationCode;
	}

	public void setRetirementResonClassificationCode(Integer retirementResonClassificationCode) {
		this.retirementResonClassificationCode = retirementResonClassificationCode;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Integer getHomesAgentCode() {
		return homesAgentCode;
	}

	public void setHomesAgentCode(Integer homesAgentCode) {
		this.homesAgentCode = homesAgentCode;
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

	public String getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(String picInfo) {
        this.picInfo = picInfo;
    }

	public Integer getStationCode() {
		return stationCode;
	}

	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}

	public String getBirthplace() {
        return birthplace;
    }

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

}