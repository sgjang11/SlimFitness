package upper.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import upper.service.UpperServiceInter;

@Controller
public class UpperController{

	@Autowired
	UpperServiceInter service;
	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/uploadForm")
	public ModelAndView uploadForm(String url) {
		mv.addObject("url",url);
		mv.addObject("page","/upper/manager/uploadForm.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/uploadFormProc")
	public String regFormProc(HttpServletRequest req, HttpServletResponse resp) {
		service.insert(req,resp);
		return "redirect:/upper/anatomy/backA";
	}
	
	
							/* anatomy */
	@RequestMapping("/abdomenA")
	public ModelAndView abdomenA(HttpServletRequest req, HttpServletResponse resp) {
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/anatomy/abdomenA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/armA")
	public ModelAndView armA(HttpServletRequest req, HttpServletResponse resp) {
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/anatomy/armA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/backA")
	public ModelAndView backA(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/anatomy/backA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/chestA")
	public ModelAndView chestA(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/anatomy/chestA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/shoulderA")
	public ModelAndView shoulderA(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/anatomy/shoulderA.jsp");
		mv.setViewName("index");
		return mv;
	}
	
									/* stretching */
	@RequestMapping("/abdomenS")
	public ModelAndView abdomenS(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/stretching/abdomenS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/armS")
	public ModelAndView armS(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/stretching/armS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/backS")
	public ModelAndView backS(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/stretching/backS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/chestS")
	public ModelAndView chestS(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/stretching/chestS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/shoulderS")
	public ModelAndView shoulderS(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/stretching/shoulderS.jsp");
		mv.setViewName("index");
		return mv;
	}
	
									/* exercise */
	@RequestMapping("/abdomenE")
	public ModelAndView abdomenE(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/exercise/abdomenE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/armE")
	public ModelAndView armE(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/exercise/armE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/backE")
	public ModelAndView backE(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/exercise/backE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/chestE")
	public ModelAndView chestE(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/exercise/chestE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/shoulderE")
	public ModelAndView shoulderE(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/exercise/shoulderE.jsp");
		mv.setViewName("index");
		return mv;
	}
	
										/* taping */
	@RequestMapping("/abdomenT")
	public ModelAndView abdomenT(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/taping/abdomenT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/armT")
	public ModelAndView armT(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/taping/armT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/backT")
	public ModelAndView backT(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/taping/backT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/chestT")
	public ModelAndView chestT(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/taping/chestT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/shoulderT")
	public ModelAndView shoulderT(HttpServletRequest req, HttpServletResponse resp) {
		String[] uris=req.getRequestURI().split("/");
		mv.addObject("url",uris[3]);
		mv.addObject("pagelist", service.pageList(req,resp));
		mv.addObject("page","/upper/taping/shoulderT.jsp");
		mv.setViewName("index");
		return mv;
	}
		
}