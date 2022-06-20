package dto;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AccountTest {
	Date date;
	Date timestamp;
	
	@Before
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
	void 正常系Account() {
		Account account = new Account("秋元弘太", "アキモトコウタ", "akimoto@ibm.com", "08054971115", "1760002", "dh78aAH", date, 0,timestamp, 0 );
	}
	
	@Test
	void 異常系Account() {
		assertThrows(IllegalArgumentException.class, () -> new Account("", "アキモトコウタ", "akimoto@ibm.com", "08054971115", "1760002", "dh78aAH", date, 0,timestamp, 0 ));
	}

}
