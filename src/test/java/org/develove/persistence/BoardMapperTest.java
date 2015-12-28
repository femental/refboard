package org.develove.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emopicture.domain.BoardVO;
import com.emopicture.domain.Criteria;
import com.emopicture.persistence.BoardMapper;
import com.emopicture.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class BoardMapperTest {

	protected static final Logger logger = LoggerFactory.getLogger(BoardMapperTest.class);

	@Autowired
	private BoardService service;
	
	@Autowired
	private BoardMapper mapper;

	@Test
	public void listTest() throws Exception {
		System.out.println(service.listAll());
	}

	@Test
	public void createTest() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("자료실");
		vo.setContent("첨부파일 싫어잉");
		vo.setNickname("운식");
		
		service.create(vo);
	}

	@Test
	public void reply() throws Exception{
		mapper.updatereply(122);
	}
	
	@Test

	public void searchTest() throws Exception {

		Criteria cri = new Criteria();
		cri.setPageNo(2);
		cri.setPerPage(20);
		cri.setKeyword("카페");
		cri.setSearchType("t");
		System.out.println(service.search(cri));

	}
	
	
}
