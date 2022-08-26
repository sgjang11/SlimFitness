package member.vo;

public class MemberVO {

	private String id;
	private String password;
	private String email;
	private String nickname;
	 
	public MemberVO() {	}
	public MemberVO(String id, String password, String email, String nickname) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", email=" + email + ", nickname=" + nickname + "]";
	}
	
}
