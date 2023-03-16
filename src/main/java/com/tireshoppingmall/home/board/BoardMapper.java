package com.tireshoppingmall.home.board;

import java.util.List;

public interface BoardMapper {
	int getAskCount(AskSelector askSearch);

	List<AskDTO> getAskAll(AskSelector askSearch);

	AskDTO getAskOne(AskDTO a);
	AskReplyDTO getAskReply(AskDTO a);

	int createAsk(AskDTO a);

	int updateAsk(AskDTO a);
	
	int deleteAsk(AskDTO a);
}
