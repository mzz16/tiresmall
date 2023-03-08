$(function() {
	//카카오 소셜 로그인전 초기화
	Kakao.init('c3f4cc657cabdccefb3382de579626a3');
	Kakao.isInitialized();
	
	
	
})

function loginWithKakao() {
  Kakao.Auth.authorize({
	  redirectUri: 'http://localhost/home/login.type_kakao'
	});
  }
