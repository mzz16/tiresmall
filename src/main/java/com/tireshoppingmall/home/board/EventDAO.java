package com.tireshoppingmall.home.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventDAO {
	@Autowired
	private SqlSession ss;

	public void readEvent(EventDTO e, HttpServletRequest req) {
		List<EventDTO> events = ss.getMapper(BoardMapper.class).readEventAll(e);
		req.setAttribute("events", events);
	}
}
