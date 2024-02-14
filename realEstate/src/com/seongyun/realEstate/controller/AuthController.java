package com.seongyun.realEstate.controller;

import com.seongyun.realEstate.dto.request.CheckIdRequestDto;
import com.seongyun.realEstate.dto.request.SendCodeRequestDto;
import com.seongyun.realEstate.dto.response.CheckIdResponseDto;
import com.seongyun.realEstate.dto.response.SendCodeResponseDto;

// 인터페이스 - 자동으로 변수 : public static final  메서드 : public abstract
public interface AuthController {

	CheckIdResponseDto checkID(CheckIdRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
	
}
