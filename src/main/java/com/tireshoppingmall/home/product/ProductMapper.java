package com.tireshoppingmall.home.product;

import java.util.List;

public interface ProductMapper {

	List<ProductGroupDTO> getProductGroup(ProductSelector search);

	int getProductGroupCount(ProductSelector search);

	int getProductGroupBrandCount(ProductSelector search);

	List<ProductGroupDTO> getProductBrandGroup(ProductSelector search);

}
