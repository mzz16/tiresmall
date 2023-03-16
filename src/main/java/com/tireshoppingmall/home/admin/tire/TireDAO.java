package com.tireshoppingmall.home.admin.tire;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


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
		}
		
		List<TireDTO> tires = ss.getMapper(AdminTireMapper.class).getAllTireGroup(paging);
		
		for (TireDTO t : tires) {		/*몇개인지 갯수   */
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
	
	
	
	
	
	//타이어 브랜드 작업~~~~~~!!!

	public void getTireBrand(HttpServletRequest req) {
		List<TireDTO> brands =ss.getMapper(AdminTireMapper.class).getTireBrand();
		
		for (TireDTO t : brands) {
			t.setTb_num(ss.getMapper(AdminTireMapper.class).getTireBrandCount(t.getTb_name()));
			System.out.println(t.getTb_name());
			System.out.println(t.getTb_num()+"개");
		}
		req.setAttribute("brands",brands);
		
	}
	public void deleteTireBrand(HttpServletRequest req, TireDTO tb) {
		
		if(ss.getMapper(AdminTireMapper.class).deleteTireBrand(tb)==1) {
			req.setAttribute("r", "삭제성공");
		}else {
			req.setAttribute("r", "삭제실패");
		}
		
	}
	public void deleteTireGroup(HttpServletRequest req, TireDTO tg) {
		if(ss.getMapper(AdminTireMapper.class).deleteTireGroup(tg)==1) {
			req.setAttribute("r", "삭제성공");
		}else {
			req.setAttribute("r", "삭제실패");
		}
		
		
	}
	
	//타이어 등록작업
	public void tireRegDo(TireDTO tDTO, HttpServletRequest req, MultipartFile file, MultipartHttpServletRequest files) {
			
		String fileRealName = file.getOriginalFilename(); //파일명을 얻어낼 수 있는 메서드!
		long size = file.getSize(); //파일 사이즈
		
		System.out.println("파일명 : "  + fileRealName);
		System.out.println("용량크기(byte) : " + size);
		//서버에 저장할 파일이름 fileextension으로 .jsp이런식의  확장자 명을 구함
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."),fileRealName.length());
		String uploadFolder = "resources\\web\\main\\tire";
		
		
		
	}
	public int tirePrintOnOff(TireDTO tg) {
		if(ss.getMapper(AdminTireMapper.class).tirePrintOnOff(tg) == 1) {
				return tg.getTg_print();
		}else {
			return 0;
		}
	}
	public int tireSedanRecommend(TireDTO tg) {
		if(ss.getMapper(AdminTireMapper.class).tireSedanRecommend(tg) == 1) {
			return tg.getTg_sedan();
		}else {
			return 0;
		}
	}
	public int tireSuvRecommend(TireDTO tg) {
		if(ss.getMapper(AdminTireMapper.class).tireSuvRecommend(tg) == 1) {
			return tg.getTg_suv();
		}else {
			return 0;
		}
	}
	
	
}
