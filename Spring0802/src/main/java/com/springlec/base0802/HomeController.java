package com.springlec.base0802;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springlec.base0802.command.BCommand;
import com.springlec.base0802.command.BListCommand;
import com.springlec.base0802.dao.IDao;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	

	@Autowired
	private SqlSession sqlSession;
	
	BCommand command = null;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
//		IDao dao = SqlSession.getMapper(IDao.class);
//		model.addAttribute("list", dao.listDao());		
		command = new BListCommand();
		command.execute(sqlSession,  model);		
		return "list";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model ) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.writeDao(request.getParameter("mName"), request.getParameter("mTelno"),request.getParameter("mAddress"),request.getParameter("mEmail"),request.getParameter("mRelation"));
		return "redirect:list";
	}
	
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.viewDao(request.getParameter("seqno"));
		return "view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.viewDao(request.getParameter("seqno"));
		return "view";
	}
	
	@RequestMapping("/listQuery")
	public String listQuery(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.listQuery(request.getParameter("query"), request.getParameter("content")));
		return "/list";
	}
	
}
















