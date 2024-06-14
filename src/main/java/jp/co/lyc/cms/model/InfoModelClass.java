package jp.co.lyc.cms.model;

import java.io.Serializable;

public class InfoModelClass implements Serializable {

	private static final long serialVersionUID = -2028159323401651353L;


	private String id;
	private String firstName;
	private String lastName;
	private String brokerageFeeName;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBrokerageFeeName() {
		return brokerageFeeName;
	}

	public void setBrokerageFeeName(String brokerageFeeName) {
		this.brokerageFeeName = brokerageFeeName;
	}


}
