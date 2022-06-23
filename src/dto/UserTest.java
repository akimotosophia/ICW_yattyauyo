package dto;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	Date date;
	Date timestamp;
	
	@BeforeEach
	void before() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			date = dateFormat.parse("1997-11-15");
			timestamp = timeStampFormat.parse("2022-06-21 00:19:19");
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	@Test
	void IDに12桁の数字を入力してgetUserIdできる() {
		User user = new User();
		user.setUserId("123456789012");
		assertEquals("123456789012", user.getUserId());
	}
	
	@Test
	void IDに12桁以外の英数字を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setUserId("1234567890a"));
	}
	
	@Test
	void IDにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setUserId(null));
	}
	
	@Test
	void Nameに名前を入力してgetNameできる() {
		User user = new User();
		user.setName("秋元弘太");
		assertEquals("秋元弘太", user.getName());
	}
	
	@Test
	void Nameに名前を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setName(""));
	}
	
	@Test
	void Nameにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setName(null));
	}
	
	@Test
	void Kanaにカナを入力してgetKanaできる() {
		User user = new User();
		user.setKana("アキモトコウタ");
		assertEquals("アキモトコウタ", user.getKana());
	}
	
	@Test
	void Kanaにひらがなを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setKana("あきもとこうた"));
	}
	
	@Test
	void Kanaにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setKana(null));
	}
	
	@Test
	void Mailに正しい形式のメールを入力してgetEmailできる() {
		User user = new User();
		user.setEmail("akimoto@example.com");
		assertEquals("akimoto@example.com", user.getEmail());
	}
	
	@Test
	void Mailに間違った形式のメールアドレスを入力とIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setEmail("akimoto.example.com"));
	}
	
	@Test
	void Mailにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setEmail(null));
	}
	
	@Test
	void PhoneNumberに10桁の数字を入力してgetPhoneNumberできる() {
		User user = new User();
		user.setPhoneNumber("0123456789");
		assertEquals("0123456789", user.getPhoneNumber());
	}
	
	@Test
	void PhoneNumberに9桁の数字を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setPhoneNumber("012345678"));
	}
	
	@Test
	void PhoneNumberにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setPhoneNumber(null));
	}
	
	@Test
	void PostalCodeに7桁の数字を入力してgetPostalCodeできる() {
		User user = new User();
		user.setPostalCode("1111111");
		assertEquals("1111111", user.getPostalCode());
	}
	
	@Test
	void PostalCodeに9桁の数字を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setPostalCode("012345678"));
	}
	
	@Test
	void PostalCodeにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setPostalCode(null));
	}
	
	@Test
	void Address1に都道府県を入力してgetAddress1できる() {
		User user = new User();
		user.setAddress1("東京都");
		assertEquals("東京都", user.getAddress1());
	}
	
	@Test
	void Address1にない県を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setAddress1("ない県"));
	}
	
	@Test
	void Address1にnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setAddress1(null));
	}
	
	@Test
	void Address2に都道府県を入力してgetAddress2できる() {
		User user = new User();
		user.setAddress2("千代田区1-1-1");
		assertEquals("千代田区1-1-1", user.getAddress2());
	}
	
	@Test
	void Address2にnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setAddress2(""));
		assertThrows(IllegalArgumentException.class, () -> user.setAddress2(null));
	}
		
	@Test
	void Passwordに正しいパスワードを入力してgetPasswordできる() {
		User user = new User();
		user.setPassword("abcdef123456");
		assertEquals("abcdef123456", user.getPassword());
	}
	
	@Test
	void Passwordに間違った形式を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setPassword("1111111111111"));
	}
	
	@Test
	void Passwordにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setPassword(null));
	}
	
	@Test
	void BirthDateに正しい日付を入力してgetBirthDateできる() {
		User user = new User();
		user.setBirthDate(date);
		assertEquals(date, user.getBirthDate());
	}
	
	@Test
	void BirthDateに正しいタイムスタンプを入力してgetBirthDateできる() {
		User user = new User();
		user.setBirthDate(timestamp);
		assertEquals(timestamp, user.getBirthDate());
	}
	
	@Test
	void BirthDateにnullを入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setBirthDate(null));
	}
	
	@Test
	void Genderに正しい値を入力してgetPasswordできる() {
		User user = new User();
		user.setGender(0);
		assertEquals(0, user.getGender());
	}
	
	@Test
	void Genderに間違った形式を入力するとIllegalArgumentExceptionを返す() {
		User user = new User();
		assertThrows(IllegalArgumentException.class, () -> user.setGender(3));
		assertThrows(IllegalArgumentException.class, () -> user.setGender(-1));
	}
}
