package community.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import community.vo.FreeBoardVO;
import community.vo.PageList;


public interface FreeBoardServiceInter {
	public PageList pageList(HttpServletRequest req, HttpServletResponse resp);
	public FreeBoardVO findOne(HttpServletRequest req, HttpServletResponse resp);
	public int insert(HttpServletRequest req, HttpServletResponse resp);
	public int update(HttpServletRequest req, HttpServletResponse resp);
	public int delete(HttpServletRequest req, HttpServletResponse resp);
	public Object replyInfo(HttpServletRequest req, HttpServletResponse resp);
	public int replyInsert(HttpServletRequest req, HttpServletResponse resp);
	public int callidx();
}