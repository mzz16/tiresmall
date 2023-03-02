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

	List<FaqDTO> getAllFaq();

	List<FaqDTO> searchAllFaq(SearchDTO sDTO);

	int regFaq(FaqDTO faqDTO);

	int updateFaq(FaqDTO faqDTO);

	boolean deleteFaq(FaqDTO faqDTO);

	List<QnaDTO> getAllQna();

	List<QnaDTO> searchQnA(QnaSearchDTO qnaSearchDTO);

	int insertQnAReply(QnaReplyDTO qnaReplyDTO);

	QnaReplyDTO getReply(QnaReplyDTO qnaReplyDTO);

	void updateQna(QnaReplyDTO qnaReplyDTO);

	int getNoticeCount(SearchDTO search);

	List<NoticeDTO> getNotice(SearchDTO search);

	int getFaqCount(SearchDTO search);

	List<FaqDTO> getFaq(SearchDTO search);

	

	
}
