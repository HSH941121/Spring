package com.jslhrd.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.mapper.BoardMapper;

import lombok.Setter;

@Service
public class BoardServiceimpl implements BoardService {
	
	private static final Logger log = LoggerFactory.getLogger(BoardServiceimpl.class); 
	
	@Setter(onMethod_=@Autowired)  //@Inject -> ¡÷¿‘
	private BoardMapper mapper;
	
	@Override
	public int boardCount() {
		// TODO Auto-generated method stub
		log.info("Service : boardCount() Call .....");
		return mapper.boardCount();
	}
	
	@Override
	public List<BoardVO> boardList() {
		// TODO Auto-generated method stub
		return mapper.boardList();
	}
	
	@Override
	public BoardVO boardSelect(int idx) {
		// TODO Auto-generated method stub
		return mapper.boardSelect(idx);
	}
	
	@Override
	public int boardWrite(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.boardWrite(vo);
	}
	
	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.boardUpdate(vo);
	}
	
	@Override
	public int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.boardDelete(vo);
	}
	
	@Override
	public void boardHits(int idx) {
		// TODO Auto-generated method stub
		mapper.boardHits(idx);
	}
	
	
	
}
