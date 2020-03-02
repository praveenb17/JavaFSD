package com.ibm.training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate template;

	public List<User> getUsers() {
		
		return template.query("select * from passbook", new UserMapper());
	}

	public User getUserById(int accNum) {
		return template.queryForObject("select * from passbook where AccountNumber = ?",
				new Object[] {accNum},
				new UserMapper());
	}
	
	class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			
			user.setName(rs.getString("Name"));
			user.setAccountType(rs.getString("AccountType"));
			user.setAccountNumber(rs.getInt("AccountNumber"));
			user.setBalance(rs.getInt("Balance"));
			return user;
		}
		
	}

	public void updateBalance(int accNum, User user) {
		template.update("UPDATE passbook SET Balance=?, Name = ? WHERE AccountNumber = ?",
				new Object[] {user.getBalance(), user.getName(), user.getAccountNumber()}
				);
	}

	public void deleteAcount(int accNum) {
		template.update("DELETE  from passbook WHERE AccountNumber = ?",
			new Object[] {accNum});
		
	}
}
