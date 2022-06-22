package dto;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
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
	void IDに12桁の数字を入力することができる() {
		Account account = new Account();
		account.setAccountId("123456789012");
	}
	
	@Test
	void IDに12桁以外の英数字を入力とIllegalArgumentExceptionを返す() {
		Account account = new Account();
		assertThrows(IllegalArgumentException.class, () -> account.setAccountId("1234567890a"));
	}

}
