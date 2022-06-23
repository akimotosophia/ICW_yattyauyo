package dto;

import java.util.Date;
/**
 * 会員クラス
 * 1人の会員を表すクラス
 * */
public class User {
	/**	アカウントID */
	private String userId;
	/**	氏名 */
	private String name;
	/**	カナ */
	private String kana;
	/**	メールアドレス */
	private String email;
	/** 電話番号 */
	private String phoneNumber;
	/** 郵便番号 */
	private String postalCode;
	/** 都道府県 */
	private String address1;
	/** 住所 */
	private String address2;
	/** パスワード */
	private String password;
	/** 誕生日 */
	private Date birthDate;
	/** 性別 */
	private int gender; // 0 = male, 1 = female, 2 = no
	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return kana
	 */
	public String getKana() {
		return kana;
	}
	/**
	 * @return mail
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @return address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @return address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @return gender
	 */
	public int getGender() {
		return gender;
	}
	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		if(userId == null || !userId.matches("^[0-9]{12}$")) {
			throw new IllegalArgumentException("半角数字12文字を入力してください");
		}
		this.userId = userId;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("名前を入力してください");
		}
		this.name = name;
	}
	/**
	 * @param kana セットする kana
	 */
	public void setKana(String kana) {
		if(kana == null || !kana.matches("^[\\u30A0-\\u30FF]+$")) {
			throw new IllegalArgumentException("全角カナを入力してください");
		}
		this.kana = kana;
	}
	/**
	 * @param mail セットする mail
	 */
	public void setEmail(String email) {
		if(email == null || !email.matches("^[a-zA-Z0-9_.+-]+@([a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]*\\.)+[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("正しい形式のメールアドレスを入力してください");
		}
		this.email = email;
	}
	/**
	 * @param phoneNumber セットする phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || !phoneNumber.matches("^[0-9]{10,11}$")) {
			throw new IllegalArgumentException("10桁または11桁の番号(ハイフンなし)を入力してください");
		}
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @param postalCode セットする postalCode
	 */
	public void setPostalCode(String postalCode) {
		if(postalCode == null || !postalCode.matches("^[0-9]{7}$")) {
			throw new IllegalArgumentException("正しい郵便番号(ハイフンなし)を入力してください");	
		}
		this.postalCode = postalCode;
	}
	/**
	 * @param address1 セットする address1
	 */
	public void setAddress1(String address1) {
		if(address1 == null || !address1.matches("^北海道|青森県|岩手県|宮城県|秋田県|山形県|福島県|茨城県|栃木県|群馬県|埼玉県|千葉県|東京都|神奈川県|新潟県|富山県|石川県|福井県|山梨県|長野県|岐阜県|静岡県|愛知県|三重県|滋賀県|京都府|大阪府|兵庫県|奈良県|和歌山県|鳥取県|島根県|岡山県|広島県|山口県|徳島県|香川県|愛媛県|高知県|福岡県|佐賀県|長崎県|熊本県|大分県|宮崎県|鹿児島県|沖縄県$")) {
			throw new IllegalArgumentException("正しい都道府県を入力してください");	
		}
		this.address1 = address1;
	}
	/**
	 * @param address2 セットする address2
	 */
	public void setAddress2(String address2) {
		if(address2 == null || address2.isBlank()) {
			throw new IllegalArgumentException("正しい住所を入力してください");	
		}
		this.address2 = address2;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		if(password == null || !password.matches("^(?=.*?[a-zA-Z])(?=.*?\\d)[a-zA-Z\\d]{8,12}$")) {
			throw new IllegalArgumentException("正しいパスワードを入力してください");	
		}
		this.password = password;
	}
	/**
	 * @param birthDate セットする birthDate
	 */
	public void setBirthDate(Date birthDate) {
		if(birthDate == null) {
			throw new IllegalArgumentException("正しい日付を入力してください");	
		}
		this.birthDate = birthDate;
	}
	/**
	 * @param gender セットする gender
	 */
	public void setGender(int gender) {
		if(gender < 0 || gender > 2) {
			throw new IllegalArgumentException("正しい日付を入力してください");	
		}
		this.gender = gender;
	}

	
}
