package test.dto;

public class FDto {
	//멤버 필드 정의하기
	private int num;
	private String name;
	private String phone;
	private String addr;
	
	//생성자
	public FDto() {}

	public FDto(int num, String name, String phone, String addr) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}