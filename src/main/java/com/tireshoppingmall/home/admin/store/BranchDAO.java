package com.tireshoppingmall.home.admin.store;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BranchDAO {

	@Autowired
	private SqlSession ss;

	private AdminStoreMapper mapper;

	public void getAllBranch(Model m) {
		mapper = ss.getMapper(AdminStoreMapper.class);
		m.addAttribute("branchs", ss.getMapper(AdminStoreMapper.class).getAllBranch());

	}

	public void regBranch(BranchDTO b, HttpServletRequest req) {

		AdminStoreMapper mm = ss.getMapper(AdminStoreMapper.class);

		String b_id = req.getParameter("b_id");
		String b_area1 = req.getParameter("b_area1");
		String b_area2 = req.getParameter("b_area2");
		String b_area = b_area1 + "\t" + b_area2;
		String b_sortation = req.getParameter("b_sortation");
		String b_addr = req.getParameter("b_addr");
		String b_time = req.getParameter("b_time");
		String b_service = req.getParameter("b_service");
		String b_mapdata = req.getParameter("b_mapdata");
		String b_name = req.getParameter("b_name");
		String b_manager = req.getParameter("b_manager");
		String b_managernumber = req.getParameter("b_managernumber");
		String b_branchnumber = req.getParameter("b_branchnumber");
		String b_branchname = req.getParameter("b_branchname");
		String b_cr = req.getParameter("b_cr");
		String b_email = req.getParameter("b_email");

		b.setB_area(b_area);

		System.out.println(b_id);
		System.out.println(b_sortation);
		System.out.println(b_area);
		System.out.println(b_addr);
		System.out.println(b_name);
		System.out.println(b_time);
		System.out.println(b_service);
		System.out.println(b_mapdata);
		System.out.println(b_manager);
		System.out.println(b_managernumber);
		System.out.println(b_branchname);
		System.out.println(b_branchnumber);
		System.out.println(b_cr);
		System.out.println(b_email);

		if (mm.regBranch(b) == 1) {
			System.out.println("등록성공");
			req.setAttribute("r", "등록성공");
		} else {

			req.setAttribute("r", "등록 실패");
		}

	}

	public void branchSearchbranchname(BranchDTO b, Model m) {
		m.addAttribute("branchs", mapper.branchSearchbranchname(b));

		System.out.println();

	}

	public void getbranch(BranchDTO b, HttpServletRequest req) {
		BranchDTO branch = mapper.getbranch(b);
		req.setAttribute("branch1", branch);

	}

	public void updatebranch(BranchDTO b, HttpServletRequest req) {

		String b_area1 = req.getParameter("b_area1");
		String b_area2 = req.getParameter("b_area2");
		String b_area = b_area1 + "\t" + b_area2;

		b.setB_area(b_area);

		if (mapper.updatebranch(b) == 1) {
			System.out.println("수정완료");
		}

	}

	public void deletebranch(BranchDTO b, HttpServletRequest req) {
		if (mapper.deletebranch(b) == 1) {
			System.out.println("삭제완료");
		}

	}

}
