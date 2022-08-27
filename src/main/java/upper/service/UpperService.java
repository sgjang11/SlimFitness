package upper.service;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import upper.dao.UpperDAOInter;
import upper.vo.PageList;
import upper.vo.UpperBoardVO;

@Service
public class UpperService implements UpperServiceInter{

	@Autowired
	UpperDAOInter dao;

	UpperBoardVO uppervo=new UpperBoardVO();
	
	@Override
	public int insert(HttpServletRequest req, HttpServletResponse resp) {
		String save="F:\\JavaProgram\\Project\\work\\SlimFitness\\src\\main\\webapp\\WEB-INF\\static\\file";
		int fileSize=10*1024*1024;
		MultipartRequest multi=null;
		
		try {
		multi=new MultipartRequest(req, save, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		Enumeration files = multi.getFileNames();

		String file1=null;
		String file2=null;
		String filename1=null;
		String filename2=null;
		file1=(String)files.nextElement();
		file2=(String)files.nextElement();
	
		filename1=multi.getFilesystemName(file1);
		filename2=multi.getFilesystemName(file2);
	

		uppervo.setKind(multi.getParameter("kind")); 
		uppervo.setTitle(multi.getParameter("title")); 
		uppervo.setContent(multi.getParameter("content")); 
		uppervo.setFileName1(filename1); 
		uppervo.setFileName2(filename2); 
	
		
		return dao.insert(uppervo);
		}catch (Exception e) {
			System.out.println("insert service 오류");
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public PageList pageList(HttpServletRequest req, HttpServletResponse resp) {
		//전체게시물 수
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
		List<UpperBoardVO> list=null;
		PageList plist=new PageList();

		totalCount=dao.totalCount();
		totalPage=(totalCount/countPerPage)+1;
		if((totalCount%countPerPage)==0) totalPage=(totalCount/countPerPage);
		if(req.getParameter("currentPage")==null) {
			currentPage=1;
		}else if(!req.getParameter("currentPage").equals("")) {
			currentPage=Integer.parseInt(req.getParameter("currentPage"));
		}
		startRow=(currentPage-1)*countPerPage+1;
		endPage=startRow+countPerPage-1;

		list=dao.pageList(req,startRow, endRow, totalPage, currentPage, totalCount);
		if(currentPage<=5) {
			startPage=1;
		}else {
			if(currentPage%5==0) {
				startPage=(currentPage/5)*5;
			}else {
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
		for(UpperBoardVO upper:plist.getList()) {
			System.out.println(upper);
		}
		return plist;
	}

}
