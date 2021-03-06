package com.springlec.base0701.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Timestamp;

import javax.management.Query;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springlec.base0701.dto.BDto;
import com.springlec.base0701.util.Constant;

public class BDao {
	
	JdbcTemplate template;
	
	public BDao() {
		this.template = Constant.template;
			
	} // BDao


	// 초기화면(검색)
	
	public ArrayList<BDto> list(){
		String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));

	}  //list----------------------------------------------------------------------------------
	

	//등록
	public void write(final String bName, final String bTitle, final String bContent) {
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String query = "insert into mvc_board (bName, bTitle, bContent, bDate) values (?,?,?,now())";
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setString(1, bName);
				preparedStatement.setString(2, bTitle);
				preparedStatement.setString(3, bContent);
				
				return preparedStatement;
			}
		});		

	} //write ------------------------
	
	
	public BDto contentView(String strID) {
		
		String query = "select * from mvc_board where bId = " + strID;
		return template.queryForObject(query, new BeanPropertyRowMapper<BDto>(BDto.class));
						// queryForObject 는 데이터 한줄짜리 가져올 때 써주고 query는 여러개 가져올 때
		

	}  //contentView --------------

	public void delete(final String strID) {
		String query = "delete from mvc_board where bId = ?";
		this.template.update(query,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, strID);
				
			}
		});
		
	
	}  //delete-------------------
	
	
	
	public void modiefy(final String bId, final String bName, final String bTitle, final String bContent) {
		String query = "update mvc_board set bName = ?, bTitle = ?, bContent = ?, bDate = now() where bId = ?";
		
		this.template.update(query, new PreparedStatementSetter() {
										// 수정은 PreparedStatementSetter 이거고 insert는PreparedStatementCreator
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setString(4, bId);
				
			}
		});
		
	} //modiefy ----------------
	
} //BDao
