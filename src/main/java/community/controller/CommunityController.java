package community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommunityController{
	
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
	public ModelAndView freeBoard() {
		mv.addObject("page","/community/freeBoard.jsp");
		mv.setViewName("index");
		return mv;
	}

}
