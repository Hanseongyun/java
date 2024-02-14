package com.seongyun.realEstate.repository;
// 리포지토리 이름은 테이블이름과 동일하게 감

import java.sql.SQLException;

public interface EmailAuthenticationRepository {

	boolean existsByEmail(String email) throws SQLException;
	
	void save(String email, String authenticationCode) throws SQLException;
	
	
}
