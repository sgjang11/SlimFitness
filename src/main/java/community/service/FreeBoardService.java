package community.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import community.dao.FreeBoardDAOInter;
import community.vo.FreeBoardVO;
import community.vo.PageList;

@Service
public class FreeBoardService implements FreeBoardServiceInter{

	@Autowired
	FreeBoardDAOInter dao;

	@Override
	public PageList pageList(HttpServletRequest req, HttpServletResponse resp) {
				//전체 게시물 수
				int totalCount=0;
				// 페이지당 글의 수
				int countPerPage=10;
				// 전체페이지수
				int totalPage=0;
				// 시작페이지
				int startPage=0;
				// 끝페이지
				int endPage=0;
				//글의 시작번호
				int startRow=0;
				//글의 끝번호
				int endRow=0;
				//현재 페이지 
				int currentPage=1;
				List<FreeBoardVO> list=null;
				PageList plist=new PageList();
			
				totalCount=dao.totalCount();
				totalPage=(totalCount/countPerPage)+1;
				if((totalCount%countPerPage)==0) totalPage=(totalCount/countPerPage);
				
				String _currentPage=req.getParameter("currentPage");
				if( _currentPage==null) currentPage=1; 
				else if(!_currentPage.equals(""))	currentPage=Integer.parseInt(_currentPage); 
				
				startRow=(currentPage-1)*countPerPage+1;
				endRow=startRow+countPerPage-1;
				list=dao.pageList(startRow, endRow, totalPage, currentPage, totalCount);
				
				if(currentPage<=5){
					startPage=1;	
				}else{
					if(currentPage%5==0){
						startPage=(currentPage/5)*5;	
					}else{
						startPage=(currentPage/5)*5+1;  
					}
				}

				endPage=startPage+4;
				if(endPage>totalPage) endPage=totalPage;
			
				plist.setList(list);
				plist.setStartPage(startPage);
				plist.setEndPage(endPage);
				plist.setCurrentPage(currentPage);
				plist.setCountPerPage(countPerPage);
				plist.setTotalCount(totalCount);
				plist.setTotalPage(totalPage);
					
				for(FreeBoardVO board:plist.getList()) {
					System.out.println(board);
				}
				return plist;
	}

	@Override
	public FreeBoardVO findOne(HttpServletRequest req, HttpServletResponse resp) {
				int idx=Integer.parseInt(req.getParameter("idx"));
				FreeBoardVO board = dao.findOne(idx);
				return board;
	}

	@Override
	public int insert(HttpServletRequest req, HttpServletResponse resp) {
		FreeBoardVO board=new FreeBoardVO();
		board.setTitle(req.getParameter("title"));
		board.setContent(req.getParameter("content"));
		board.setWriteID(req.getParameter("writeID"));
		board.setWriteName(req.getParameter("writeName"));
		return dao.insert(board);
	}
	
	

	@Override
	public int update(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object replyInfo(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int replyInsert(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FreeBoardVO maxidx() {
		return dao.maxidx();
	}

	

	
}
