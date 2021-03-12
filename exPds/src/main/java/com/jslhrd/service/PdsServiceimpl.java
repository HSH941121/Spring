package com.jslhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.domain.PdsVO;
import com.jslhrd.mapper.PdsMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class PdsServiceimpl implements PdsService {
	//private static final Logger log = Logger.getLogger(PdsServiceimpl.class);
	
	@Setter(onMethod_=@Autowired)
	private PdsMapper mapper;
	
	@Override
	public int pdsCount() {
		// TODO Auto-generated method stub
		return mapper.pdsCount();
	}

	@Override
	public List<PdsVO> pdsList() {
		// TODO Auto-generated method stub
		return mapper.pdsList();
	}
	
	@Override
	public int pdsWrite(PdsVO vo) {
		// TODO Auto-generated method stub
		return mapper.pdsWrite(vo);
	}
	
	@Override
	public PdsVO pdsSelect(int idx) {
		// TODO Auto-generated method stub
		return mapper.pdsSelect(idx);
	}
	
	@Override
	public void pdsHits(int idx) {
		// TODO Auto-generated method stub
		mapper.pdsHits(idx);
	}
	
	@Override
	public int pdsModify(PdsVO vo) {
		// TODO Auto-generated method stub
		return mapper.pdsModify(vo);
	}
	
	@Override
	public int pdsDelete(PdsVO vo) {
		// TODO Auto-generated method stub
		return mapper.pdsDelete(vo);
	}

	

}
