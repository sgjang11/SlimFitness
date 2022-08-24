package member.dao;

import java.util.List;

import member.vo.MemberVO;

public interface MemberDAOInter {

	public int insert(MemberVO member);
	public List<MemberVO> selectAll(MemberVO member);
	public MemberVO selectOne(MemberVO member);
	public int update(MemberVO member);
	public int delete(String id);
	
}
