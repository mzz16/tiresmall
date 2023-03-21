package com.tireshoppingmall.home.board;

import java.util.List;

import com.tireshoppingmall.home.auth.AuthUserDTO;

public interface BoardMapper {
	// int getAskCount(AskSelector askSearch);
	int getAskCount(AuthUserDTO forU_id);

	// List<AskDTO> readAskAll(AskSelector askSearch);
	List<AskDTO> readAskAll(AuthUserDTO auDTO);

	AskDTO readAskOne(AskDTO a);
	AskReplyDTO readAskReply(AskDTO a);

	int createAsk(AskDTO a);

	int updateAsk(AskDTO a);
	
	int deleteAsk(AskDTO a);
	
	

	List<EventDTO> readEventAll(EventDTO e);
}
