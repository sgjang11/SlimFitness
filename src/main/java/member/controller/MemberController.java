package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.service.MemberServiceInter;
import member.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberServiceInter service;
	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/login")
	public ModelAndView loginForm() {
		mv.addObject("page","/member/loginForm.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/loginProc")
	public ModelAndView loginProc(HttpServletRequest req, HttpServletResponse resp) {
		boolean result=service.login(req,resp);
		if(result==true) {
			mv.addObject("id",req.getSession().getAttribute("id"));
			mv=new ModelAndView("redirect:/index");
		}else {
			mv.addObject("id", "loginFail");
			mv=new ModelAndView("redirect:/member/login"); 
		}
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest req) {
		req.getSession().invalidate();
		mv=new ModelAndView("redirect:/member/login");
		return mv;
	}
	@RequestMapping("/createmember")
	public ModelAndView creatememberForm() {
		mv.addObject("page","/member/creatememberForm.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/creatememberProc")
	public ModelAndView creatememberProc(MemberVO member) {
		service.insert(member);
		mv=new ModelAndView("redirect:/member/login");
		return mv;
	}
	
}