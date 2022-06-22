package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBConn;
import dto.Account;

public class AccountDAO {
	public List<Account> find() {
		String sql = "SELECT b.id, c.id as category_id, c.name as category_name, b.name, b.author, b.price, b.comment "
				+ "FROM book b "
				+ "LEFT OUTER JOIN category c ON b.category_id = c.id "
				+ "WHERE b.name like ? "
				+ "AND (c.id = ANY (?) "
				+ "OR 1 = ?)";
		List<Account> accounts = new ArrayList<>();
		Connection conn = null;
		try {
			conn = DBConn.getConn();
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			final ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Account account = null;
				try {
					account.setAccountId(rs.getString("ID"));;
				} catch (SQLException e) {
					e.printStackTrace();
					return new ArrayList<>();
				}
				accounts.add(account);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				DBConn.close(conn);
			}
		}
		return accounts;
	}

}
