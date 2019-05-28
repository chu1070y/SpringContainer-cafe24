package com.cafe24.springcontainer.user;

import java.util.List;

public class User {
	private Long no;
	private String name = "추여눈";
	private Friend friend;
	private List<String> friends;

	//컨테이너는 기본 생성자를 이용하기 때문에 기본 생성자가 꼭 필요허다.
	public User() {
	}
	
	//다음의 생성자를 사용하려면 컨테이너 빈에 constructor-args를 설정해줘야헌다.
	public User(String name) {
		this.name = name;
	}
	
	//다음의 생성자를 사용하려면 컨테이너 빈에 constructor-args를 설정해줘야헌다.
	//컨테이너 안 생성자-args에서 파라미터의 순서를 index를 이용해서 설정할 수 있다.
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}

}
