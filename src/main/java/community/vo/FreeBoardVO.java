package community.vo;

import java.util.Date;

public class FreeBoardVO {

	//게시판 분류 : 
	private String kind;
	//글 입력 번호 : 
	private int idx; // - sequence
	//글 제목 : 
	private String title;
	//글 내용 : 
	private String content;
	//조회수 : 
	private int readCount;
	//그룹번호 : 
	private int groupID;
	//댓글깊이(tab) : 
	private int depth;
	// 그룹 내의 글 번호 : 
	private int groupSeq;
	//글 쓴 사람 아이디 : 
	private String writeID;
	//글 쓴 사람 닉네임 : 
	private String writeName; 
	//글 쓴 날짜 : 
	private Date writeDay;
	//글 삭제 여부 : 
	private int isdel;
	
	public FreeBoardVO() {	}

	public FreeBoardVO(String kind, int idx, String title, String content, int readCount, int groupID, int depth,
			int groupSeq, String writeID, String writeName, Date writeDay, int isdel) {
		this.kind = kind;
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.readCount = readCount;
		this.groupID = groupID;
		this.depth = depth;
		this.groupSeq = groupSeq;
		this.writeID = writeID;
		this.writeName = writeName;
		this.writeDay = writeDay;
		this.isdel = isdel;
	}
	
	public FreeBoardVO(String title, String content) {
		this.title = title;
		this.content = content;
	}


	public FreeBoardVO(int idx, String title, String content, String writeID, String writeName) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writeID = writeID;
		this.writeName = writeName;
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

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getGroupSeq() {
		return groupSeq;
	}

	public void setGroupSeq(int groupSeq) {
		this.groupSeq = groupSeq;
	}

	public String getWriteID() {
		return writeID;
	}

	public void setWriteID(String writeID) {
		this.writeID = writeID;
	}

	public String getWriteName() {
		return writeName;
	}

	public void setWriteName(String writeName) {
		this.writeName = writeName;
	}

	public Date getWriteDay() {
		return writeDay;
	}

	public void setWriteDay(Date writeDay) {
		this.writeDay = writeDay;
	}


	public int getIsdel() {
		return isdel;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "FreeBoardVO [kind=" + kind + ", idx=" + idx + ", title=" + title + ", content=" + content
				+ ", readCount=" + readCount + ", groupID=" + groupID + ", depth=" + depth + ", groupSeq=" + groupSeq
				+ ", writeID=" + writeID + ", writeName=" + writeName + ", writeDay=" + writeDay + ", isdel=" + isdel
				+ "]";
	}

	
	
}