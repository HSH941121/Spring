package com.jslhrd.service;

import java.util.List;

import com.jslhrd.domain.PdsVO;

public interface PdsService {
	// ��ü �Խù� ����
		public int pdsCount();
		
		//��ü �Խù� �˻�
		public List<PdsVO> pdsList();
			
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
