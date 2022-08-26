package lower.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lower.service.LowerServiceInter;


@Controller
public class LowerController{

	@Autowired(required = false)
	LowerServiceInter service;
	ModelAndView mv=new ModelAndView();
	 
								/*anatomy*/
	@RequestMapping("/ankleA")
	public ModelAndView ankleA() {
		mv.addObject("page","/lower/anatomy/ankleA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/calfA")
	public ModelAndView calfA() {
		mv.addObject("page","/lower/anatomy/calfA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/hipA")
	public ModelAndView hipA() {
		mv.addObject("page","/lower/anatomy/hipA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/kneeA")
	public ModelAndView kneeA() {
		mv.addObject("page","/lower/anatomy/kneeA.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/thighA")
	public ModelAndView thighA() {
		mv.addObject("page","/lower/anatomy/thighA.jsp");
		mv.setViewName("index");
		return mv;
	}
	
									/*stretching*/
	@RequestMapping("/ankleS")
	public ModelAndView ankleS() {
		mv.addObject("page","/lower/stretching/ankleS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/calfS")
	public ModelAndView calfS() {
		mv.addObject("page","/lower/stretching/calfS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/hipS")
	public ModelAndView hipS() {
		mv.addObject("page","/lower/stretching/hipS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/kneeS")
	public ModelAndView kneeS() {
		mv.addObject("page","/lower/stretching/kneeS.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/thighS")
	public ModelAndView thighS() {
		mv.addObject("page","/lower/stretching/thighS.jsp");
		mv.setViewName("index");
		return mv;
	}
	
									/*exercise*/
	@RequestMapping("/ankleE")
	public ModelAndView ankleE() {
		mv.addObject("page","/lower/exercise/ankleE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/calfE")
	public ModelAndView calfE() {
		mv.addObject("page","/lower/exercise/calfE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/hipE")
	public ModelAndView hipE() {
		mv.addObject("page","/lower/exercise/hipE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/kneeE")
	public ModelAndView kneeE() {
		mv.addObject("page","/lower/exercise/kneeE.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/thighE")
	public ModelAndView thighE() {
		mv.addObject("page","/lower/exercise/thighE.jsp");
		mv.setViewName("index");
		return mv;
	}
							
									/*taping*/
	@RequestMapping("/ankleT")
	public ModelAndView ankleT() {
		mv.addObject("page","/lower/taping/ankleT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/calfT")
	public ModelAndView calfT() {
		mv.addObject("page","/lower/taping/calfT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/hipT")
	public ModelAndView hipT() {
		mv.addObject("page","/lower/taping/hipT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/kneeT")
	public ModelAndView kneeT() {
		mv.addObject("page","/lower/taping/kneeT.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/thighT")
	public ModelAndView thighT() {
		mv.addObject("page","/lower/taping/thighT.jsp");
		mv.setViewName("index");
		return mv;
	}

}
