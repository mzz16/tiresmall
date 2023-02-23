package com.tireshoppingmall.home.admin.store;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminStoreController {

	@Autowired
	private BranchDAO bDAO;
	
	
	//admin.company.go
	@RequestMapping(value = "/admin.company.go", method = RequestMethod.GET)
	public String companyGo(Model m,HttpServletRequest req) {
		
		
		req.setAttribute("contentPage", "store/branch.jsp");
		bDAO.getAllBranch(m);
		return "admin/master";
	}
}
