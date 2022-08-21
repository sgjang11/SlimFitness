package upper.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import upper.vo.UpperBoardVO;

public interface UpperDAOInter {

	public int insert(UpperBoardVO upper);

	public int totalCount();

	public List<UpperBoardVO> pageList(HttpServletRequest req, int startRow, int endRow, int totalPage, int currentPage,
			int totalCount); 
}
