package com.ibm.training.JDBC_XyzBank;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.ibm.training.JDBC_XyzBank.Customer;

@Component("namedDao")
public class BankDao {

	DataSource dataSource;

	NamedParameterJdbcTemplate namedParam;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

		namedParam = new NamedParameterJdbcTemplate(dataSource);
	}

	public String getCustomerName(int accNum) {
		String qry = "select Name from passbook where AccountNumber = :accNum";

		return namedParam.queryForObject(qry, new MapSqlParameterSource("accNum", accNum), String.class);
	}

	String getCustomerNameByAccountDetails(String accType, Integer accNum) {
		String qry = "select Name from passbook where AccountType = :accType and AccountNumber = :accNum";

		return namedParam.queryForObject(qry, new MapSqlParameterSource("accType", accType).addValue("accNum", accNum),
				String.class);
	}

	String getAllUserDetails(String name, int accNum) {

		String qry = "select * from passbook where Name = :name and AccountNumber = :accNum";

		return namedParam.queryForObject(qry, new MapSqlParameterSource("Name", name).addValue("AccountNumber", accNum),
				String.class);
	}

	public int getBalance(int accNum) {
		String qry = "select Balance from passbook where AccountNumber = :accNum";

		return namedParam.queryForObject(qry, new MapSqlParameterSource("accNum", accNum), int.class);
	}

	public boolean withdraw(int accNum, int amount) {
		int Bal = 0;

		Bal = getBalance(accNum);

		if (Bal >= amount) {

			Bal = Bal - amount;
			String d = "debit";

			String qry1 = "update passbook set Balance =: bal where AccountNumber = :accNum";
			String qry2 = "Insert into transaction values (':accNum', ':d' , ':amount', ':bal')";

			namedParam.queryForObject(qry1, new MapSqlParameterSource("bal", Bal).addValue("AccountNum", accNum),
					void.class);
			return namedParam.queryForObject(qry2, new MapSqlParameterSource("accNum", accNum).addValue("d", d)
					.addValue("amount", amount).addValue("bal", Bal), boolean.class);
		} else
			return false;
	}

	public boolean newDeposit(int accNumber, int amount) throws SQLException {

		int oldBal = 0;
		oldBal = getBalance(accNumber);
		int a = amount;
		String c = "Credit";
		amount = oldBal + amount;

		String qry1 = "update passbook set Balance =: bal where AccountNumber = :accNum";
		String qry2 = "Insert into transaction values (':accNum', ':c' , ':a', ':amount')";

		namedParam.queryForObject(qry1, new MapSqlParameterSource("bal", amount).addValue("AccountNum", accNumber),
				void.class);
		return namedParam.queryForObject(qry2, new MapSqlParameterSource("accNum", accNumber).addValue("c", c)
				.addValue("a", a).addValue("amount", amount), boolean.class);
	}

	class UserMapper implements RowMapper<Customer> {

		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer user = new Customer();
			user.setName(rs.getString("Name"));
			user.setAccountNumber(rs.getInt("AccountNumber"));
			user.setAccountType(rs.getString("userAddress"));
			return user;
		}

	}
}
