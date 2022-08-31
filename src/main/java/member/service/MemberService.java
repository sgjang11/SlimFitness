package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.dao.MemberDAOInter;
import member.vo.MemberVO;

@Service
public class MemberService implements MemberServiceInter{

	@Autowired
	MemberDAOInter dao;

	@Override
	public boolean login(HttpServletRequest req, HttpServletResponse resp) {
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		boolean result=dao.login(id,password);
		if(result==true) { 
			req.getSession().setAttribute("id", req.getParameter("id"));
		}
		return result;
	}
	
	
	@Override
	public int insert(MemberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}