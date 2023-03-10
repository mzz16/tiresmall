package com.tireshoppingmall.home.auth;

public interface MemberMapper {

	int regMember(MemberDTO mDTO);

	int checkMember(MemberDTO mDTO);

	int checkIDkko(String kakaoID);

	AuthUserDTO getMember(MemberDTO mDTO);

	AuthUserDTO getSocialMember(String socialID);


}
