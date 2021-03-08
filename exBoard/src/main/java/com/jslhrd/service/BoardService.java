package com.jslhrd.service;

import java.util.List;

import com.jslhrd.domain.BoardVO;

public interface BoardService {
		// 게시물 전체 카운트
		public int boardCount();
		
		//전체 게시물 검색
		public List<BoardVO> boardList();
		
		//특정 게시물 검색
		public BoardVO boardSelect(int idx);
		
		//게시물 등록
		public int boardWrite(BoardVO vo);
		
		//게시물 수정
		public int boardUpdate(BoardVO vo);
		
		//게시물 삭제
		public int boardDelete(BoardVO vo);
		
		//조회수 증가
		public void boardHits(int idx);
}
