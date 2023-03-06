package com.tireshoppingmall.home.admin.auth;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.admin.board.AdminBoardMapper;
import com.tireshoppingmall.home.admin.board.NoticeOption;
import com.tireshoppingmall.home.admin.board.SearchDTO;

@Service
public class AuthDAO {
	
	@Autowired
	private SqlSession ss;
	
	/*@Autowired						// 주입 할려면 SC에서 추가해줘야함
	private NoticeOption no; 		// 한 페이지에 몇개 보여줄지 
	
	private int allNoticeCount;
	
	public int getAllNoticeCount() {
		return allNoticeCount;
	}

	public void setAllNoticeCount(int allNoticeCount) {
		this.allNoticeCount = allNoticeCount;
	}
	
	public void calcAllNoticeCount() {
		SearchDTO sSel = new SearchDTO("","", null, null);
		allNoticeCount = ss.getMapper(AdminAuthMapper.class).getAuthCount(sSel);
		
		
	}*/
	
	
	
	
	
	
	public void getAllAuth(HttpServletRequest req) {
		req.setAttribute("manyAuth", ss.getMapper(AdminAuthMapper.class).getAllAuth());
	
	}

	public void searchAuth(HttpServletRequest req, AuthDTO aDTO) {
		//아이디, 이름, 자동차번호
		req.setAttribute("manyAuth",ss.getMapper(AdminAuthMapper.class).seachAuth(aDTO));
		
	}


	public void authDelete(HttpServletRequest req, AuthDTO aDTO) {
		if(ss.getMapper(AdminAuthMapper.class).authDelete(aDTO)==1) {
			req.setAttribute("r", "삭제 성공");
		}
		
	}


	public void updateAuth(HttpServletRequest req, AuthDTO aDTO) {
		if(ss.getMapper(AdminAuthMapper.class).authUpdate(aDTO)==1) {
			req.setAttribute("r", "수정 성공");
		}else {
			req.setAttribute("r", "수정 실패");
		}
		
	}

	

}
