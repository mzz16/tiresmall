package com.tireshoppingmall.home.product;

import java.util.List;

public class Sizes {
	private List<ProductDTO> sizes;

	public Sizes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sizes(List<ProductDTO> sizes) {
		super();
		this.sizes = sizes;
	}

	public List<ProductDTO> getSizes() {
		return sizes;
	}

	public void setSizes(List<ProductDTO> sizes) {
		this.sizes = sizes;
	}
}
