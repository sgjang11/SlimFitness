package lower.vo;

import java.util.Date;

public class LowerBoardVO {

//	kind varchar2(50) not null,
//	idx number primary key, 
//	title varchar2(100) not null,
//	content clob, 
//	writeDay date not null,
//	fileName1 varchar2(260),
//	fileName2 varchar2(260),
//	fileName3 varchar2(260),
//	fileName4 varchar2(260),
//	isdel number(1) check(isdel in(0,1))
	
	private String kind;
	private int idx;
	private String title;
	private String content;
	private Date writeDay;
	private String fileName1;
	private String fileName2;
	private String fileName3;
	private String fileName4;
	private int isdel;
	
	public LowerBoardVO() {	}

	public LowerBoardVO(String kind, int idx, String title, String content, Date writeDay, String fileName1,
			String fileName2, String fileName3, String fileName4, int isdel) {
		this.kind = kind;
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writeDay = writeDay;
		this.fileName1 = fileName1;
		this.fileName2 = fileName2;
		this.fileName3 = fileName3;
		this.fileName4 = fileName4;
		this.isdel = isdel;
	}
	
	public LowerBoardVO(String title, String content, String fileName1,
			String fileName2, String fileName3, String fileName4) {
		this.title = title;
		this.content = content;
		this.fileName1 = fileName1;
		this.fileName2 = fileName2;
		this.fileName3 = fileName3;
		this.fileName4 = fileName4;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDay() {
		return writeDay;
	}

	public void setWriteDay(Date writeDay) {
		this.writeDay = writeDay;
	}

	public String getFileName1() {
		return fileName1;
	}

	public void setFileName1(String fileName1) {
		this.fileName1 = fileName1;
	}

	public String getFileName2() {
		return fileName2;
	}

	public void setFileName2(String fileName2) {
		this.fileName2 = fileName2;
	}

	public String getFileName3() {
		return fileName3;
	}

	public void setFileName3(String fileName3) {
		this.fileName3 = fileName3;
	}

	public String getFileName4() {
		return fileName4;
	}

	public void setFileName4(String fileName4) {
		this.fileName4 = fileName4;
	}

	public int getIsdel() {
		return isdel;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "UpperBoardVO [kind=" + kind + ", idx=" + idx + ", title=" + title + ", content=" + content
				+ ", writeDay=" + writeDay + ", fileName1=" + fileName1 + ", fileName2=" + fileName2 + ", fileName3="
				+ fileName3 + ", fileName4=" + fileName4 + ", isdel=" + isdel + "]";
	}
	
	
	
}
