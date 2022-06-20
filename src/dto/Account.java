package dto;

import java.util.Date;

public class Account {
	private String name;
	private String kana;
	private String mail;
	private String phoneNumber;
	private String postCode;
	private String password;
	private Date birthDate;
	private int gender; // 0 = male, 1 = female, 2 = no
	private Date lastLoginDate;
	private int failCount;
	
	public Account() {}		
			
	public Account(String name, String kana, String mail, String phoneNumber, String postCode, String password,
			Date birthDate, int gender, Date lastLoginDate, int failCount) {
		this.name = name;
		this.kana = kana;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
		this.postCode = postCode;
		this.password = password;
		this.birthDate = birthDate;
		this.gender = gender;
		this.lastLoginDate = lastLoginDate;
		this.failCount = failCount;
	}


	public String getName() {
		return name;
	}

	public String getKana() {
		return kana;
	}

	public String getMail() {
		return mail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getPassword() {
		return password;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getGender() {
		return gender;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public int getFailCount() {
		return failCount;
	}

}
