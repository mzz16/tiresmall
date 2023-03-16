package com.tireshoppingmall.home.admin.tire;

import java.util.List;

public interface AdminTireMapper {

	int getTireCountByMz(int i);
	
	List<TireDTO> getAllTireGroup(TireDTO paging);

	int getTireCount(TireDTO paging);

	List<TireDTO> getTireBrand();

	int getTireBrandCount(String tb_name);

	int deleteTireBrand(TireDTO tb);

	int deleteTireGroup(TireDTO tg);

	TireDTO getTireGroupforDetail(int tirePK);

}
