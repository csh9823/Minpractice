package com.MInex.ex1;

public class Min {
	// 필드
	private String name;
	private String hp;
	private String company;

	// 생성자
	public Min() {

	}

	public Min(String name, String hp, String company) {

		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	// 메소드 gs

	public String getName() {
		return name;
	}

	public String getHp() {
		return hp;
	}

	public String getCompany() {
		return company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	//메소드

	@Override
	public String toString() {
		return "Min [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
}
