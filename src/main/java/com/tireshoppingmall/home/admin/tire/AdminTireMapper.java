package com.tireshoppingmall.home.admin.tire;

import java.util.List;

public interface AdminTireMapper {

	int getTireCountByMz(int i);
	
	List<TireDTO> getAllTireGroup(TireDTO paging);

	int getTireCount(TireDTO paging);

	TireDTO getTireGroupforDetail(int tirePK);

}
