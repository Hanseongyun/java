package com.seongyun.realEstate.controller.implement;

import com.seongyun.realEstate.controller.AuthController;
import com.seongyun.realEstate.dto.request.CheckIdRequestDto;
import com.seongyun.realEstate.dto.request.SendCodeRequestDto;
import com.seongyun.realEstate.dto.response.CheckIdResponseDto;
import com.seongyun.realEstate.dto.response.SendCodeResponseDto;
import com.seongyun.realEstate.interfaces.Code;
import com.seongyun.realEstate.service.AuthService;
import com.seongyun.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {

	private AuthService authService ;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}
	
	@Override
	public CheckIdResponseDto checkID(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
		
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}
