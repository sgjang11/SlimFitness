package community.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import community.service.FreeBoardServiceInter;

@Controller
public class CommunityController{
	@Autowired
	FreeBoardServiceInter freeservice;
	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/announcements")
	public ModelAndView announcements() {
		mv.addObject("page","/community/announcements.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/Q&A")
	public ModelAndView QandA() {
		mv.addObject("page","/community/Q&A.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/liveChat")
	public ModelAndView liveChat() {
		mv.addObject("page","/community/liveChat.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/freeBoard")
	public ModelAndView freeBoard(HttpServletRequest req, HttpServletResponse resp) {
		Object obj= req.getSession().getAttribute("id");
		if(obj!=null) {
			freeservice.pageList(req, resp);
			mv.addObject("page","/community/board/freeBoard.jsp");
			mv.setViewName("index");
		}else {
			mv=new ModelAndView("redirect:/member/login");
		}
		return mv;
	}
	
	@RequestMapping("/writeForm")
	public ModelAndView writeForm(HttpServletRequest req) {
		Object obj= req.getSession().getAttribute("id");
		if(obj!=null) {
			mv.addObject("idx",freeservice.maxidx());
			mv.addObject("page","/community/board/writeForm.jsp");
			mv.setViewName("index");
		}else {
			mv=new ModelAndView("redirect:/member/login");
		}
		return mv;
	}

}
