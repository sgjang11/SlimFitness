package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/login")
	public ModelAndView siteInfo() {
		mv.addObject("page","/member/login.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	
}
