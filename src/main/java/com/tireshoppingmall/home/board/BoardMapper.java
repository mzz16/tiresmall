package com.tireshoppingmall.home.board;

import java.util.List;

import com.tireshoppingmall.home.auth.AuthUserDTO;

public interface BoardMapper {
	// int getcountQna(BoardQnaSelector qnaSearch);
	int getQnaCount(AuthUserDTO forU_id);

	// List<QnaDTO> readallQna(BoardQnaSelector qnaSearch);
	List<BoardQnaDTO> readallQna(AuthUserDTO auDTO);

	BoardQnaDTO readoneQna(BoardQnaDTO a);
	BoardQnaReplyDTO readQnaReply(BoardQnaDTO a);

	int createQna(BoardQnaDTO a);

	int updateQna(BoardQnaDTO a);
	
	int deleteQna(BoardQnaDTO a);
	
	

	List<BoardEventDTO> readallEvent(BoardEventDTO e);
}