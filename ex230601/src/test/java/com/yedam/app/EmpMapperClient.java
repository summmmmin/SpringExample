package com.yedam.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperClient {
	@Autowired
	EmpMapper empMapper;		// 인터페이스를 상속받은 구현 클래스를 주입받음
	
	@Ignore
	public void getEmpInfo() {
		EmpVO findEmp = empMapper.selectOne(100);
		assertEquals(findEmp.getFirstName(), "Steven");
	}
	
	@Test
	public void 전체조회() {
		EmpVO param = new EmpVO();
		param.setDepartmentId("50,90");
		
		//param.setFirstName("e");
		param.setOrderColumn("department_id, first_name");
		List<EmpVO> list = empMapper.selectList(param);
		int cnt = empMapper.selectCount(param);
		for(EmpVO emp : list) {
			System.out.println(emp);			
		}
		//assertEquals(list.get(0).getEmployeeId(), "100");
	}
	
	//@Test
	public void 등록() {
		EmpVO vo = new EmpVO();
		vo.setFirstName("go");
		vo.setLastName("go");
		vo.setEmail("go@ggeg");
		//assertEquals(empMapper.insertOne(vo), 1);
		empMapper.insertEmp(vo);
		//등록 후에 id를 사용하고자 할 경우 selectKey 이용
		System.out.println(vo.getEmployeeId());
	}
	
//	@Test
//	public void 수정() {
//		EmpVO vo = new EmpVO();
//		vo.setFirstName("go");
//		vo.setEmployeeId("281");
//		assertEquals(empMapper.updateOne(vo), 1);
//	}
	
	@Test
	public void selectJobs() {
		List<Map<String,Object>> list = empMapper.selectJobs();
		assertNotNull(list);
	}
}
