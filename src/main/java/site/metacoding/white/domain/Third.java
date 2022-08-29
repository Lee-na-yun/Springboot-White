package site.metacoding.white.domain;

public class Third {

	private Integer id;
	private String title;
	private String content;
	
	// putmapping연습
	@Override
	public String toString() {//object가 들고있는것임! 모든것을 문자열로 리턴해주는것
		return "Third [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
	public Third() {
		System.out.println("Third 생성자 실행됨");
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("setId 실행됨");
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("setTitle 실행됨");
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		System.out.println("setContent 실행됨");
		this.content = content;
	}
	
	
}
