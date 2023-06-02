package com.yedam.app;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
//		param.setDepartmentId("50");
		param.setFirstName("e");
		List<EmpVO> list = empMapper.selectList(param);
		for(EmpVO emp : list) {
			System.out.println(emp);			
		}
		//assertEquals(list.get(0).getEmployeeId(), "100");
	}
	
//	@Test
//	public void 등록() {
//		EmpVO vo = new EmpVO();
//		vo.setFirstName("go");
//		vo.setLastName("go");
//		vo.setEmail("go@g");
//		assertEquals(empMapper.insertOne(vo), 1);
//	}
	
//	@Test
//	public void 수정() {
//		EmpVO vo = new EmpVO();
//		vo.setFirstName("go");
//		vo.setEmployeeId("281");
//		assertEquals(empMapper.updateOne(vo), 1);
//	}
}
