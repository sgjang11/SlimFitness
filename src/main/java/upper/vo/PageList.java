package upper.vo;

import java.util.List;

public class PageList {

	//전체게시물 수
	int totalCount;
	// 페이지당 글의 수
	int countPerPage=10;
	// 전체페이지수
	int totalPage;
	// 시작페이지
	int startPage;
	// 끝페이지
	int endPage;
	//글의 시작번호
	int startRow;
	//글의 끝번호
	int endRow;
	//현재 페이지
	int currentPage;
	List<UpperBoardVO> list;
	
	public PageList() {	}

	public PageList(int totalCount, int countPerPage, int totalPage, int startPage, int endPage, int startRow,
			int endRow, int currentPage, List<UpperBoardVO> list) {
		this.totalCount = totalCount;
		this.countPerPage = countPerPage;
		this.totalPage = totalPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.startRow = startRow;
		this.endRow = endRow;
		this.currentPage = currentPage;
		this.list = list;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCountPerPage() {
		return countPerPage;
	}

	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<UpperBoardVO> getList() {
		return list;
	}

	public void setList(List<UpperBoardVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "PageList [totalCount=" + totalCount + ", countPerPage=" + countPerPage + ", totalPage=" + totalPage
				+ ", startPage=" + startPage + ", endPage=" + endPage + ", startRow=" + startRow + ", endRow=" + endRow
				+ ", currentPage=" + currentPage + "]";
	}
	
}
