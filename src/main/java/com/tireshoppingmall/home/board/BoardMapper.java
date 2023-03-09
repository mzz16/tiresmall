package com.tireshoppingmall.home.board;

import java.util.List;

public interface BoardMapper {
	int getAskCount(AskSelector search);

	List<AskDTO> getAsk(AskSelector search);

	List<AskReplyDTO> getAskReply(AskDTO a);
}
