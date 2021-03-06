package com.springlec.base0802.dao;

import java.util.ArrayList;

import com.springlec.base0802.dto.ContentDto;

public interface IDao {
	
	//전체 검색
	public ArrayList<ContentDto> listDao();
	
	// 입력
	public void writeDao(String mName, String mTelno, String mAddress, String mEmail, String mRelation);
	
	// 수정창
	public void viewDao(String mSeqno);
	
	// 수정
	
	
	//조건검색
	public ArrayList<ContentDto> listQuery(String query, String content);
}
