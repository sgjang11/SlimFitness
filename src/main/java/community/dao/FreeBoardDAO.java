package community.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import community.vo.FreeBoardVO;


@Repository
public class FreeBoardDAO implements FreeBoardDAOInter{
	Connection conn;
	PreparedStatement pstmt;
	String sql=null;
	 
	public FreeBoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "1111");
		} catch (Exception e) {
			System.out.println("connection 오류");
			e.printStackTrace();
		}
	}
	@Override
	public List<FreeBoardVO> pageList(int startRow, int endRow, int totalPage, int currentPage, int totalCount) {
		sql="select rownum,b.* from ";
		sql+="(select rownum rn,a.* from ";
		sql+="(select * from freeboard start with groupID=0 ";
		sql+="connect by prior idx=groupID ";
		sql+="order siblings by idx desc) a ";
		sql+="where rownum <=? ";
		sql+="order by rownum desc) b ";
		sql+="where rownum between 1 and ? ";
		sql+="order by b.rn asc";
		List<FreeBoardVO> list=new ArrayList<FreeBoardVO>();
		try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, currentPage*10);
		if(totalPage==currentPage){
			pstmt.setInt(2, totalCount%10);
		}else{
			pstmt.setInt(2, 10);
		}
			ResultSet rs=pstmt.executeQuery();

		while(rs.next()){
			FreeBoardVO board=new FreeBoardVO();
			board.setKind(rs.getString("kind")); // 글 종류
			board.setIdx(rs.getInt("idx")); // 글번호
			board.setTitle(rs.getString("title")); // 제목
			board.setContent(rs.getString("content")); // 내용
			board.setDepth(rs.getInt("depth")); // 깊이
			board.setWriteID(rs.getString("writeID")); // 작성자 아이디
			board.setWriteName(rs.getString("writeName")); // 작성자 닉네임
			board.setWriteDay(rs.getDate("writeDay"));  // 작성일
			board.setReadCount(rs.getInt("readCount")); // 조회수
			board.setIsdel(rs.getInt("isdel")); // 삭제 되었는지 확인 (0 또는 1)
			list.add(board);
		}	
		}catch (Exception e) {
			System.out.println("freeboard pagelist 오류");
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public int totalCount() {
		int totalCount=0;
		try {
		sql="select count(*) from freeboard";
		pstmt=conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			totalCount=rs.getInt("count(*)");
		}
		}catch (Exception e) {
			System.out.println("freeboard count 오류");
			e.printStackTrace();
		}
		return totalCount;
	}

	
	@Override
	public int insert(FreeBoardVO board) {
		try {
			sql="insert into freeboard(kind,idx,title,content,readCount,groupID,depth,groupSeq"
					+ ",writeID,writeName,writeDay,isdel) "
					+ "values('일반게시판',free_idx_seq.nextval,?,?,0,0,0,1"
					+ ",?,?,sysdate,0)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriteID());
			pstmt.setString(4, board.getWriteName());
			int result=pstmt.executeUpdate();
			return result;
		}catch (Exception e) {
			System.out.println("freeboard insert 오류");
			e.printStackTrace();
			return 0;
		}
	}


	@Override
	public FreeBoardVO findOne(int idx) {
		try {
			sql="select * from freeboard where idx=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				FreeBoardVO board=new FreeBoardVO();
				board.setIdx(rs.getInt("idx")); // 글번호
				board.setTitle(rs.getString("title")); // 제목
				board.setContent(rs.getString("content")); //내용
				board.setDepth(rs.getInt("depth")); // 깊이
				board.setWriteID(rs.getString("writeID")); // 작성자 아이디
				board.setWriteName(rs.getString("writeName")); // 작성자 닉네임
				board.setWriteDay(rs.getDate("writeDay"));  // 작성일
				board.setReadCount(rs.getInt("readCount")); // 조회수
				return board;
			}
			return null;
			}catch(Exception e) {
				System.out.println("freeboard findOne 오류");
				e.printStackTrace();
				return null;
			}
	}
	


	@Override
	public int update(FreeBoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int replyInsert(FreeBoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int readCountUp(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int isdelupdate(int idx) {
		try {
			sql="update freeboard set isdel=1 where idx=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			int result=pstmt.executeUpdate();
			return result;
		}catch (Exception e) {
			System.out.println("freeboard isdel update 오류");
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public FreeBoardVO maxidx() {
		try {
			sql="select max(idx) from freeboard";
			pstmt=conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				FreeBoardVO board=new FreeBoardVO();
				board.setIdx(rs.getInt("idx"));
				return board;
			}
		} catch (Exception e) {
			System.out.println("idx max값 불러오기 오류");
			e.printStackTrace();
		}
		return null;
	}

	

	
}