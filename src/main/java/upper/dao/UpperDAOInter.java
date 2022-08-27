package upper.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import upper.vo.UpperBoardVO;

public interface UpperDAOInter {

	public int insert(UpperBoardVO upper);

	public List<UpperBoardVO> selectAll(UpperBoardVO upper);
	
	public UpperBoardVO selectOne(int idx);

	public List<UpperBoardVO> search(String search);

	public List<UpperBoardVO> pageList(HttpServletRequest req, int startRow, int endRow, int totalPage, int currentPage,int totalCount); 
	
	public int update(UpperBoardVO upper);

	public int delete(int idx);
	
	public int totalCount();
}
