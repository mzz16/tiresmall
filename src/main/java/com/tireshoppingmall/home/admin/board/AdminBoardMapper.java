package com.tireshoppingmall.home.admin.board;

import java.util.List;

import com.tireshoppingmall.home.admin.board.NoticeDTO;
import com.tireshoppingmall.home.admin.board.SearchDTO;

public interface AdminBoardMapper {

	List<NoticeDTO> getAllNotice();

	List<NoticeDTO> searchAllNotice(SearchDTO sDTO);

	int regNotice(NoticeDTO nDTO);

	int updateNotice(NoticeDTO nDTO);

	boolean deleteNotice(NoticeDTO nDTO);

	
}
