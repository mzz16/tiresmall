package com.tireshoppingmall.home.admin.tire;

import java.util.List;

public interface AdminTireMapper {

	int getTireCount(TireDTO startEnd);

	List<TireDTO> getAllTireGroup();

	TireDTO getTireGroupforDetail(int tirePK);

}
