package upper.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import upper.vo.UpperBoardVO;
//@Repository
public class UpperDAO implements UpperDAOInter{

	Connection conn;
	PreparedStatement pstmt;
	String sql=null;
	
	
	public UpperDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "1111");
		} catch (Exception e) {
			System.out.println("connection 오류");
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public int insert(UpperBoardVO upper) {
		try {
			sql="insert into upperboard(idx,kind,title,content,writeDay,fileName1,fileName2,isdel) "
					+ "values(upper_idx_seq.nextval,?,?,?,sysdate,?,?,0)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, upper.getKind());
			pstmt.setString(2, upper.getTitle());
			pstmt.setString(3, upper.getContent());
			pstmt.setString(4, upper.getFileName1());
			pstmt.setString(5, upper.getFileName2());
			int result=pstmt.executeUpdate();
			return result;
		}catch (Exception e) {
			System.out.println("upper insert 오류");
			e.printStackTrace();
			return 0;
		}
		
	}
	
	@Override
	public List<UpperBoardVO> pageList(HttpServletRequest req,int startRow, int endRow, int totalPage, int currentPage, int totalCount) {
		List<UpperBoardVO> list=new ArrayList<UpperBoardVO>();
		sql="select rownum,b.* from (select rownum rn,a.* from (select * from upperboard where kind = ?)a where rownum <= ? order by rownum desc) b where rownum between 1 and ? order by b.rn asc";
		String[] uris=req.getRequestURI().split("/");
		try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, uris[3]);
		pstmt.setInt(2, currentPage*10);
		if(totalPage==currentPage){
			pstmt.setInt(3, totalCount%10);
		}else{
			pstmt.setInt(3, 10);
		}
			ResultSet rs=pstmt.executeQuery();

		while(rs.next()){
			UpperBoardVO upper=new UpperBoardVO();
			upper.setIdx(rs.getInt("idx")); // 글번호
			upper.setKind(rs.getString("kind")); // 글 종류
			upper.setTitle(rs.getString("title")); // 제목
			upper.setContent(rs.getString("content")); // 내용
			upper.setWriteDay(rs.getDate("writeDay"));  // 작성일
			upper.setFileName1(rs.getString("fileName1")); // 파일 
			upper.setFileName2(rs.getString("fileName2")); // 파일 
			upper.setIsdel(rs.getInt("isdel")); // 삭제 되었는지 확인 (0 또는 1)
			list.add(upper);
		}	
		}catch (Exception e) {
			System.out.println("kind select(pageList) 오류");
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int totalCount() {
		int totalCount=0;
		try {
			sql="select count(*) from upperboard";
			pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				totalCount=rs.getInt("count(*)");
			}
		} catch (Exception e) {
			System.out.println("totalCount 오류");
			e.printStackTrace();
		}
		
		return totalCount;
	}


	@Override
	public List<UpperBoardVO> selectAll(UpperBoardVO upper) {
		List<UpperBoardVO> list=new ArrayList<UpperBoardVO>();
		try {
			sql="select * from upperboard";
			pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				upper.setIdx(rs.getInt("idx")); // 글번호
				upper.setKind(rs.getString("kind")); // 글 종류
				upper.setTitle(rs.getString("title")); // 제목
				upper.setContent(rs.getString("content")); // 내용
				upper.setWriteDay(rs.getDate("writeDay"));  // 작성일
				upper.setFileName1(rs.getString("fileName1")); // 파일 
				upper.setFileName2(rs.getString("fileName2")); // 파일 
				upper.setIsdel(rs.getInt("isdel")); // 삭제 되었는지 확인 (0 또는 1)
				list.add(upper);
			}
			return list;
		} catch (Exception e) {
			System.out.println("selectAll 오류");
			e.printStackTrace();
			return null;
		}
		
	}


	@Override
	public UpperBoardVO selectOne(int idx) {
		try {
			sql="select * from upperboard where idx=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				UpperBoardVO upper=new UpperBoardVO();
				upper.setIdx(rs.getInt("idx")); // 글번호
				upper.setKind(rs.getString("kind")); // 글 종류
				upper.setTitle(rs.getString("title")); // 제목
				upper.setContent(rs.getString("content")); // 내용
				upper.setWriteDay(rs.getDate("writeDay"));  // 작성일
				upper.setFileName1(rs.getString("fileName1")); // 파일 
				upper.setFileName2(rs.getString("fileName2")); // 파일 
				upper.setIsdel(rs.getInt("isdel")); // 삭제 되었는지 확인 (0 또는 1)
				return upper;
			}
			return null;
		}catch (Exception e) {
			System.out.println("selectOne(idx) 오류");
			e.printStackTrace();
			return null;
		}
		
	}


	@Override
	public UpperBoardVO selectOne(UpperBoardVO upper) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int update(UpperBoardVO upper) {
		try {
			sql="update upperboard set kind=?, title=?, content=?, writeDay=sysdate, filename1=?, filename2=? where idx=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, upper.getKind());
			pstmt.setString(2, upper.getTitle());
			pstmt.setString(3, upper.getContent());
			pstmt.setString(4, upper.getFileName1());
			pstmt.setString(5, upper.getFileName2());
			pstmt.setInt(6, upper.getIdx());
			return pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("update 오류");
			e.printStackTrace();
			return 0;
		}
		
	}


	@Override
	public int delete(int idx) {
		try {
			sql="update upperboard set isdel=1 where idx=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			return pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("delete(isdel update) 오류");
			e.printStackTrace();
			return 0;
		}
	}


}