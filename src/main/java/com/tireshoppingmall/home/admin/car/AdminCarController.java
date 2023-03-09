package com.tireshoppingmall.home.admin.car;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class AdminCarController {
	
	private boolean firstReq;

	@Autowired
	private CarDAO cDAO;
	
	public AdminCarController() {
		firstReq = true;
	}

	
	//admin.car.go
	@RequestMapping(value = "/admin.car.go", method = RequestMethod.GET)
	public String carGo(HttpServletRequest req,Model m) {
	
		if (firstReq) {
			cDAO.calcAllCarCount();
			firstReq = false;
		}
		
		 cDAO.getAllCar(m); 
		
		//SearchCarDTO.clearSearch(req);
	//	cDAO.getCarlist(1, req);
		
		
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car.jsp");
		return "admin/master";
	}
	
	//admin.car.brand.go
	@RequestMapping(value = "/admin.car.brand.go", method = RequestMethod.GET)
	public String carBrandGo(HttpServletRequest req) {
		
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car_brand.jsp");
		return "admin/master";
	}
	
	
	@RequestMapping(value = "/reg.car.do", method = RequestMethod.POST)
	public String carRegdo(Model m,MultipartFile file,CarDTO c, HttpServletRequest req) {
		
		cDAO.regCar(file,c, req);
		
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car_brand.jsp");
		return "admin/master";
	}
	
	@RequestMapping(value = "/admin.car.update.do", method = RequestMethod.POST)
	public String carupdatedo(Model m,MultipartFile file,CarDTO c, HttpServletRequest req) {
		
		cDAO.updateCar(file,c, req);
		
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car_brand.jsp");
		return "admin/master";
	}
	
	
	@RequestMapping(value = "/admin.car.delete.do", method = RequestMethod.GET)
	public String carupdatedo(Model m,CarDTO c, HttpServletRequest req) {
		
		cDAO.deletecar(c,req);
		
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car_brand.jsp");
		return "admin/master";
	}
	
	
	
	
}
