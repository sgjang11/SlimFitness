package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.stereotype.Repository;

import member.vo.MemberVO;

@Repository
public class MemberDAO implements MemberDAOInter{
	Connection conn;
	PreparedStatement pstmt;
	String sql=null;
	 
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "1111");
		} catch (Exception e) {
			System.out.println("connection 오류");
			e.printStackTrace();
		}
	}
	
	@Override
	public int insert(MemberVO member) {
		try {
			sql="insert into member values(?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getNickname());
			int result=pstmt.executeUpdate();
			return result;
		}catch (Exception e) {
			System.out.println("member insert 오류");
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<MemberVO> selectAll(MemberVO member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO selectOne(MemberVO member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(MemberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
