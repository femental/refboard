package com.emopicture.persistence;

import java.util.List;

import com.emopicture.domain.Criteria;


public interface ReplyMapper<ReplyVO, Integer> {

	public List<ReplyVO> list(Integer bno) throws Exception;
	
	public void create(ReplyVO vo) throws Exception;

	public void update(ReplyVO vo) throws Exception;
	
	public void delete(Integer rno) throws Exception;
	
	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception;
	
	public int count(Integer bno) throws Exception;
 }
