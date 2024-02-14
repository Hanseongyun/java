package com.seongyun.realEstate.service;

import com.seongyun.realEstate.dto.request.CheckIdRequestDto;
import com.seongyun.realEstate.dto.request.SendCodeRequestDto;
import com.seongyun.realEstate.dto.response.CheckIdResponseDto;
import com.seongyun.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {

	CheckIdResponseDto checkId(CheckIdRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);
}
