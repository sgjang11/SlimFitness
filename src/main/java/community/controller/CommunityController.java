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
	@RequestMapping("/board/freeBoard")
	public ModelAndView freeBoard(HttpServletRequest req, HttpServletResponse resp) {
		Object obj= req.getSession().getAttribute("id");
		if(obj!=null) {
			mv.addObject("pagelist",freeservice.pageList(req, resp));
			mv.addObject("page","/community/board/freeBoard.jsp");
			mv.setViewName("index");
		}else {
			mv=new ModelAndView("redirect:/member/login");
		}
		return mv;
	}
	
	@RequestMapping("/board/writeForm")
	public ModelAndView writeForm(HttpServletRequest req) {
		Object obj= req.getSession().getAttribute("id");
		if(obj!=null) {
			mv.addObject("idx",freeservice.callidx()+1);
			mv.addObject("page","/community/board/writeForm.jsp");
			mv.setViewName("index");
		}else {
			mv=new ModelAndView("redirect:/member/login");
		}
		return mv;
	}
	@RequestMapping("/board/writeFormProc")
	public ModelAndView writeFormProc(HttpServletRequest req, HttpServletResponse resp) {
		Object obj= req.getSession().getAttribute("id");
		if(obj!=null) {
			int result=freeservice.insert(req, resp);
			if(result>0) {
				System.out.println("입력완료");
				mv=new ModelAndView("redirect:/community/board/freeBoard");
			}else {
				System.out.println("입력실패");
				mv=new ModelAndView("redirect:/community/board/writeForm");
			}
		}else {
			mv=new ModelAndView("redirect:/member/login");
		}
		return mv;
	}

}