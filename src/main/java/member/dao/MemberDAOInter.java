package member.dao;

import java.util.List;

import member.vo.MemberVO;

public interface MemberDAOInter {

	public int insert(MemberVO member);
	public List<MemberVO> selectAll(MemberVO member);
	public boolean login(String id, String password);
	public int checkID(String id);
	//public String findPassword(String id);
	public int update(MemberVO member);
	public int delete(String id);
	 
}