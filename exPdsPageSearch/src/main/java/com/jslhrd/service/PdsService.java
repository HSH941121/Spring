package com.jslhrd.service;

import java.util.List;

import com.jslhrd.domain.PageVO;
import com.jslhrd.domain.PdsVO;

public interface PdsService {
	// 전체 게시물 개수
		public int pdsCount();
/*
		//전체 게시물 검색
		public List<PdsVO> pdsList();
*/		
		// 검색한 게시물 개수
		public int pdsCountSearch(PageVO pg);
		
		//전체 게시물 검색 페이지 처리
		public List<PdsVO> pdsList(PageVO pg);
		
		//전체 목록 (Page처리 + 검색) 추가
		public List<PdsVO> pdsListSearch(PageVO pg);
		
		//특정 게시물 검색
		public PdsVO pdsSelect(int idx);
		
		//조회수 증가
		public void pdsHits(int idx);
			
		//게시물 등록
		public int pdsWrite(PdsVO vo);
			
		//게시물 수정
		public int pdsModify(PdsVO vo);
			
		//게시물 삭제
		public int pdsDelete(PdsVO vo);
}
