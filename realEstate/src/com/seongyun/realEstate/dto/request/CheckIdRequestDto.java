package com.seongyun.realEstate.dto.request;

// input-output >  request-response 

public class CheckIdRequestDto {

	private String id;				// 캡슐화 > 외부접근x private
	
	public String getId() {				// getter 메서드	
		return id;
	}
	
	public void setId(String id) {			// 값을 주입하는방법 : 생성자, setter, 직접입력
		this.id = id;
	}
	
	public boolean validId() {
		boolean valid = id.length() <= 20;
		return valid;
	}
	
}
