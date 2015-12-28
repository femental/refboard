package com.emopicture.persistence;

import java.util.List;

import com.emopicture.domain.BoardVO;
import com.emopicture.domain.Criteria;

public interface BoardMapper extends CRUDMapper<BoardVO, Integer> {

	public List<BoardVO> listpage(int page) throws Exception;
	
	public void viewcnt(Integer bno)throws Exception;
	
	public int totalcount() throws Exception;
	
	public List<BoardVO> search(Criteria cri) throws Exception;
	
	public void updatereply(Integer bno) throws Exception;
	
	public void attyn(Integer bno)throws Exception;
	
	
	

}
