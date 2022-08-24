package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/login")
	public ModelAndView loginForm() {
		mv.addObject("page","/member/loginForm.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/createmember")
	public ModelAndView creatememberForm() {
		mv.addObject("page","/member/creatememberForm.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	
}
