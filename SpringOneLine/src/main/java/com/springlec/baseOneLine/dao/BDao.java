package com.springlec.baseOneLine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springlec.baseOneLine.dto.BDto;
import com.springlec.baseOneLine.util.Constant;

public class BDao {
	
	JdbcTemplate template;
	
	public BDao() {
		this.template = Constant.template;
	}

	// 초기화면(검색)
	
		public ArrayList<BDto> list(){
			
			ArrayList<BDto> dtos = null;
			
			String query = "select bid, bName, bTitle, bDate from mvc_board";
			
			
			
		dtos = (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
			
			return dtos;
			
		}   //list
		
		
		
		
		public void delete(final String strID) {
			String query = "delete from mvc_board where bId = ?";
			this.template.update(query,new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
					ps.setString(1, strID);
					
				}
			});
			
		} // delete
		
		
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
		
}  // BDao
