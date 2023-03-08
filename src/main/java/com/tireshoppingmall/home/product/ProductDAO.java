package com.tireshoppingmall.home.product;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAO {
	
	@Autowired
	private SqlSession ss;
	
	@Autowired
	private ProductGroupOption pgo;
	
	private int allProductGroupCount;
	
	public int getAllProductGroupCount() {
		return allProductGroupCount;
	}

	public void getProductGroup(int pageNo, HttpServletRequest request) {
		
		int count = pgo.getProductGroupCountPerPage();	// 지금 16
        int start = (pageNo - 1) * count + 1;
        int end = start + (count - 1);

        ProductSelector search = (ProductSelector) request.getSession().getAttribute("search");
        int productGroupCount = 0;

        if (search == null) {
            search = new ProductSelector("", "", new BigDecimal(start), new BigDecimal(end));
            productGroupCount = allProductGroupCount;
        } else {
            search.setStart(new BigDecimal(start));
            search.setEnd(new BigDecimal(end));
            productGroupCount = ss.getMapper(ProductMapper.class).getProductGroupCount(search);
        }

        List<ProductGroupDTO> pGroups = ss.getMapper(ProductMapper.class).getProductGroup(search);

        int pageCount = (int) Math.ceil(productGroupCount / (double) count);
        request.setAttribute("pageCount", pageCount);
        request.setAttribute("theNumber", productGroupCount);
        request.setAttribute("pGroups", pGroups);
        request.setAttribute("curPage", pageNo);
		
	}

	public void searchProductGroup(String b, HttpServletRequest request) {
		ProductSelector search = new ProductSelector("", b, new BigDecimal(0), new BigDecimal(0));
		request.getSession().setAttribute("search", search);
	}
	
	public void calcAllMsgCount() {
		ProductSelector pSel = new ProductSelector("", "", null, null);
		allProductGroupCount = ss.getMapper(ProductMapper.class).getProductGroupCount(pSel);
	}

	public void clearSearch(HttpServletRequest request) {
		request.getSession().setAttribute("search", null);
	}



}
