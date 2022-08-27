package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.vo.MemberVO;

public interface MemberServiceInter {
	public int insert(MemberVO member);

	public boolean login(HttpServletRequest req, HttpServletResponse resp);

	public void logout(HttpServletRequest req);
}
