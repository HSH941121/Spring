package com.jslhrd.mapper;

import java.util.List;

import com.jslhrd.domain.BoardVO;

public interface BoardMapper {
	
	// �Խù� ��ü ī��Ʈ
	public int boardCount();
	
	//��ü �Խù� �˻�
	public List<BoardVO> boardList();
	
	//Ư�� �Խù� �˻�
	public BoardVO boardSelect(int idx);
	
	//�Խù� ���
	public int boardWrite(BoardVO vo);
	
	//�Խù� ����
	public int boardUpdate(BoardVO vo);
	
	//�Խù� ����
	public int boardDelete(BoardVO vo);
	
	//��ȸ�� ����
	public void boardHits(int idx);
	
	
}
