package com.springlec.base0301;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
	
	
	// @ RequestMapping 을 써주고 위치를 설정 해주고 리턴을 해준다
	@RequestMapping("board/view")
	public String view() {
		return "board/view";
		
	}
	
	@RequestMapping("board/content")
	public String content(Model model) {      //content에 데이터를 주려면 (Model model) 이걸 써준다 안드로이드의 intent와 비슷  // Model은 요즘쓰는 방식
		model.addAttribute("id", 30);
		return "board/content";
	}

	
	@RequestMapping("board/reply")   // Modelandview 는 예전에 쓰던 방식
	//리턴값이 모델엔뷰 이다
	public ModelAndView reply() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", 30);
		modelAndView.setViewName("board/reply");
		return modelAndView;
	}
	
}
