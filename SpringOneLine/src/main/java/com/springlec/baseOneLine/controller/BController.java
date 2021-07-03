package com.springlec.baseOneLine.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.baseOneLine.command.BCommand;
import com.springlec.baseOneLine.command.BDeleteCommand;
import com.springlec.baseOneLine.command.BListCommand;
import com.springlec.baseOneLine.command.BWriteCommand;
import com.springlec.baseOneLine.util.Constant;

@Controller
public class BController {
	BCommand command = null;
	
	private JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
		
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(model);
	
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		
			System.out.println("write_view");
			
		return "write_view";
	}
	
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	
	
}
