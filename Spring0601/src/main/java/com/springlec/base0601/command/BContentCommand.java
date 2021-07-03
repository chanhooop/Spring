package com.springlec.base0601.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.springlec.base0601.dao.BDao;
import com.springlec.base0601.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId =request.getParameter("bId");
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		request.setAttribute("content_view", dto);
		
		
//		Map<String, Object> map = model.asMap();
//		HttpServletRequest request = (HttpServletRequest) map.get("request");
//		
//		String strId = request.getParameter("Id");
//		
//		BDao dao = new BDao();
//		dao.contentview(strId);	
	}

}
