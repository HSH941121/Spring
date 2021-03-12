package com.jslhrd.mapper;

import java.util.List;

import com.jslhrd.domain.PageVO;
import com.jslhrd.domain.PdsVO;



public interface PdsMapper {
	// ��ü �Խù� ����
	public int pdsCount();
	
/*
	//��ü �Խù� �˻�
	public List<PdsVO> pdsList();
*/	
	//��ü ��� (Pageó��) �߰�
	public List<PdsVO> pdsList(PageVO pg);
	
	
	//Ư�� �Խù� �˻�
	public PdsVO pdsSelect(int idx);
	
	//��ȸ�� ����
	public void pdsHits(int idx);
		
	//�Խù� ���
	public int pdsWrite(PdsVO vo);
		
	//�Խù� ����
	public int pdsModify(PdsVO vo);
		
	//�Խù� ����
	public int pdsDelete(PdsVO vo);
}
