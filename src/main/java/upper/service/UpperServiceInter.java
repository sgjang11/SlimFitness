package upper.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import upper.vo.PageList;

public interface UpperServiceInter{

	public int insert(HttpServletRequest req, HttpServletResponse resp);

	public PageList pageList(HttpServletRequest req, HttpServletResponse resp);
 
}