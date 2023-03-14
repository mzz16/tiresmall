package com.tireshoppingmall.home.admin.tire;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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



	public void calcAllTireCount() {
		TireDTO startEnd = new TireDTO("", "", null, null);
		allTireCount =ss.getMapper(AdminTireMapper.class).getTireCount(startEnd);
	}
	
	
	public void getAllTireGroup(int pageNo, HttpServletRequest req) {
		int count = no.getTireCountPerPage();
		int start = (pageNo - 1) * count + 1;
		int end = start + (count - 1);
		

		TireDTO paging = (TireDTO)req.getSession().getAttribute("tireDTO");
		int tireCount = 0;
		if (paging == null) {
			System.out.println("왜  null일까???");
			paging = new TireDTO();
			paging.setTg_brand("");
			paging.setTg_name("");
			paging.setStart(new BigDecimal(start));
			paging.setEnd(new BigDecimal(end));
			tireCount = allTireCount;
			
		}else {
			paging.setStart(new BigDecimal(start));
			paging.setEnd(new BigDecimal(end));
			tireCount = ss.getMapper(AdminTireMapper.class).getTireCount(paging);
			System.out.println("검색이 왜 안될까?");
		}
		
		List<TireDTO> tires = ss.getMapper(AdminTireMapper.class).getAllTireGroup(paging);
		
		for (TireDTO t : tires) {
			t.setTg_num(ss.getMapper(AdminTireMapper.class).getTireCountByMz(t.getTg_id()));
		}
		
		int pageCount = (int) Math.ceil(tireCount / (double) count);
		req.setAttribute("count", count);
		req.setAttribute("pageCount", pageCount);
		req.setAttribute("tires", tires);
		req.setAttribute("curPage", pageNo);		
	}
	
	public void tirePasing(TireDTO tDTO, HttpServletRequest req) {
		req.getSession().setAttribute("tireDTO", tDTO);
	}
	
}
