package com.tireshoppingmall.home.admin.tire;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.admin.AdminMenuSession;


@Service
public class TireDAO {
	
	@Autowired
	private SqlSession ss;
	
	@Autowired					// 주입 할려면 SC에서 추가해줘야함
	private TireOption no; 		// 한 페이지에 몇개 보여줄지 
	private int allTireCount;
	public int getAllTireCount() {
		return allTireCount;
	}
	public void setAllTireCount(int allTireCount) {
		this.allTireCount = allTireCount;
	}

	public void menuSession(AdminMenuSession menuSession, HttpServletRequest req) {
		AdminMenuSession menu = (AdminMenuSession) req.getSession().getAttribute("menuSession");

		menu.setMenu("tire");
		menu.setSubMenu(menuSession.getSubMenu());	
	}

	public void calcAllTireCount() {
		TireDTO startEnd = new TireDTO("", "", null, null);
		allTireCount =ss.getMapper(AdminTireMapper.class).getTireCount(startEnd);
	}
	public void getAllTireGroup(int pageNo, HttpServletRequest req) {
		req.setAttribute("tires", ss.getMapper(AdminTireMapper.class).getAllTireGroup());
	}
}
