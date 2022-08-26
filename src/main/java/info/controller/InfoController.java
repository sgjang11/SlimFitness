package info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class InfoController {

	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/siteInfo")
	public ModelAndView siteInfo() {
		mv.addObject("page","/info/siteInfo.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/useInfo")
	public ModelAndView useInfo() {
		mv.addObject("page","/info/useInfo.jsp");
		mv.setViewName("index");
		return mv;
	} 
	
}
