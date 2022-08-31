package community.dao;

import java.util.List;

import community.vo.FreeBoardVO;

public interface FreeBoardDAOInter {

	public int insert(FreeBoardVO board);
	public int replyInsert(FreeBoardVO board);
	public List<FreeBoardVO> pageList(int startRow, int endRow, int totalPage, int currentPage, int totalCount);
	public int totalCount();
	public FreeBoardVO findOne(int idx);
	public int readCountUp(int idx);
	public int update(FreeBoardVO board);
	public int isdelupdate(int idx);
	public int callidx();
	
}