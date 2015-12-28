package com.emopicture.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.emopicture.domain.BoardVO;
import com.emopicture.domain.Criteria;

@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {

	@Override
	public List<BoardVO> listpage(int page) throws Exception {

		return session.selectList(namespace+".listpage",page);
	}

	@Override
	public void viewcnt(Integer bno) throws Exception {
		
		session.update(namespace+".viewcnt",bno);
		
	}

	@Override
	public int totalcount() throws Exception {
		return session.selectOne(namespace+".totalcount");
		
	}

	@Override
	public List<BoardVO> search(Criteria cri) throws Exception {
		return session.selectList(namespace+".search",cri);
	}

	@Override
	public void updatereply(Integer bno) throws Exception {
		session.update(namespace+".updatereply", bno);
		
	}

	@Override
	public void attyn(Integer bno) throws Exception {
		session.update(namespace+ ".attyn", bno);
		
	}





}
