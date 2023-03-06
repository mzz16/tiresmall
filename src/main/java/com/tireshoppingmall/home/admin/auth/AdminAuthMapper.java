package com.tireshoppingmall.home.admin.auth;

import java.util.List;

public interface AdminAuthMapper {

	List<AuthDTO> getAllAuth();

	List<AuthDTO> seachAuth(AuthDTO aDTO);

	int authDelete(AuthDTO aDTO);

	int authUpdate(AuthDTO aDTO);


}
