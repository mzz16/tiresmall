package com.tireshoppingmall.home.admin.store;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tireshoppingmall.home.admin.board.SearchDTO;

@Controller
public class AdminStoreController {
	
	private boolean firstReq;

	@Autowired
	private BranchDAO bDAO;
	
	public AdminStoreController() {
		firstReq = true;
	}

	
	
	//admin.store.go
	@RequestMapping(value = "/admin.store.go", method = RequestMethod.GET)
	public String companyGo(SearchBranchDTO b,Model m,HttpServletRequest req) {
		if (firstReq) {
			bDAO.calcAllBranchCount();
			firstReq = false;
		}
		
		SearchBranchDTO.clearSearch(req);
		bDAO.getBranchlist(1, req);
		/* bDAO.getAllBranch(m); */
		req.setAttribute("contentPage", "store/branch.jsp");
		return "admin/master";
	}
	
	@RequestMapping(value = "/branch.page.change", method = RequestMethod.GET)
	public String PagingBranch(SearchBranchDTO b,HttpServletRequest req, @RequestParam int p) {
		System.out.println(req.getParameter("p"));
		bDAO.getBranchlist(p, req);

		req.setAttribute("contentPage", "store/branch.jsp");
		return "admin/master";
	}
	
	

	@RequestMapping(value = "/admin.store.reg.go", method = RequestMethod.GET)
	public String storeRegGo(Model m, HttpServletRequest req) {

		return "admin/master";

	}

	@RequestMapping(value = "/reg.branch.do", method = RequestMethod.POST)
	public String storeRegDo(Model m,MultipartFile file,BranchDTO b, HttpServletRequest req) {

		bDAO.regBranch(file,b, req);
	//	bDAO.getAllBranch(m);
		req.setAttribute("contentPage", "store/branch.jsp");
		return "admin/master";

	}

	@RequestMapping(value = "/branch.search.branchname", method = RequestMethod.GET)
	public String branchSearchbranchname(SearchBranchDTO b, HttpServletRequest req) {
	
		
		bDAO.branchSearchbranchname(req, b);
		bDAO.getBranchlist(1, req);
		req.setAttribute("contentPage", "store/branch.jsp");
		return "admin/master";

	}
	
//	@RequestMapping(value = "/branch.search.area", method = RequestMethod.GET)
//	public String branchSearcharea(SearchBranchDTO b, Model m, HttpServletRequest req) {
	//	bDAO.getBranchlist(1, req);
	//	req.setAttribute("contentPage", "store/branch.jsp");
	//	return "admin/master";

//	}
	
	



	@RequestMapping(value = "/admin.store.update.do", method = RequestMethod.GET)
	public String branchupdateDo(BranchDTO b, Model m, HttpServletRequest req) {

		bDAO.updatebranch(b, req);
		bDAO.getBranchlist(1, req);
	//	bDAO.getAllBranch(m);


		req.setAttribute("contentPage", "store/branch.jsp");
		return "admin/master";

	}

	@RequestMapping(value = "/admin.store.delete.go", method = RequestMethod.GET)
	public String branchdelete(BranchDTO b, Model m, HttpServletRequest req) {

		bDAO.deletebranch(b, req);
		bDAO.getBranchlist(1, req);
	//	bDAO.getAllBranch(m);

		req.setAttribute("contentPage", "store/branch.jsp");
		return "admin/master";

	}

}
