package dto;

import java.util.Date;
/**
 * 会員クラス
 * 1人の会員を表すクラス
 * */
public class Account {
	/**	アカウントID */
	private String accountId;
	/**	氏名 */
	private String name;
	/**	カナ */
	private String kana;
	/**	メールアドレス */
	private String mail;
	/** 電話番号 */
	private String phoneNumber;
	/** 郵便番号 */
	private String postalCode;
	/** パスワード */
	private String password;
	/** 誕生日 */
	private Date birthDate;
	/** 性別 */
	private int gender; // 0 = male, 1 = female, 2 = no
	/** 最終ログイン日時 */
	private Date lastLoginDate;
	/** ログイン失敗回数 */
	private int failCount;
	/**
	 * @return accountId
	 */
	public String getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId セットする accountId
	 */
	public void setAccountId(String accountId) throws IllegalArgumentException{
		if(accountId == null || accountId.matches("^[0-9]{12}$") == false) {
			throw new IllegalArgumentException("半角数字12文字を入力してください");
		}
		this.accountId = accountId;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return kana
	 */
	public String getKana() {
		return kana;
	}
	/**
	 * @param kana セットする kana
	 */
	public void setKana(String kana) {
		this.kana = kana;
	}
	/**
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail セットする mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber セットする phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode セットする postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate セットする birthDate
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return gender
	 */
	public int getGender() {
		return gender;
	}
	/**
	 * @param gender セットする gender
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}
	/**
	 * @return lastLoginDate
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	/**
	 * @param lastLoginDate セットする lastLoginDate
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	/**
	 * @return failCount
	 */
	public int getFailCount() {
		return failCount;
	}
	/**
	 * @param failCount セットする failCount
	 */
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}
	
	
	

}
