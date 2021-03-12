package com.jslhrd.mapper;

import java.util.List;

import com.jslhrd.domain.PdsVO;



public interface PdsMapper {
	// 전체 게시물 개수
	public int pdsCount();
	
	//전체 게시물 검색
	public List<PdsVO> pdsList();
		
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
