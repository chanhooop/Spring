package com.springlec.base0502;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //컨트롤러 되려면 이걸 써줘야한다
public class RedirectController {

	@RequestMapping("studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOK";      //redirect는 키워드이다 문자열이 아니라 컨트롤이름!!! 
				
		}
		return "redirect:studentNG"; // studentNG 로 들어왔을때 studentNG 매핑으로 이동시켜준다  
		
	}
	
	@RequestMapping("studentOK")
	public String ok(Model model) {
		return "student/studentOK";
	}
	
	@RequestMapping("studentNG")
	public String ng(Model model) {
		return "student/studentNG";
	}
	
	
	
}
