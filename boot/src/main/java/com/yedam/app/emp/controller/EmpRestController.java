package com.yedam.app.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@RestController
public class EmpRestController {
	
	@Autowired
	EmpService empService;
	
	// 전체조회
	@GetMapping("employees")
	public List<EmpVO> empList() {
		return empService.getEmpList();
	}
	
	// 단건조회
	@GetMapping("employees/{employeeId}")
	public EmpVO empList(@PathVariable int employeeId, EmpVO vo) {
		vo.setEmployeeId(employeeId);
		return empService.getEmpInfo(vo);
	}
	
	// 등록
	@PostMapping("employees")
	public EmpVO empInsert(EmpVO vo) {
		empService.insertEmpInfo(vo);
		return vo;
	}
	
	// 수정
	@PutMapping("employees")
	public EmpVO empUpdate(@RequestBody EmpVO vo) {
		System.out.println(vo);
		//empService.updateEmpInfo(vo);
		return vo;
	}	
	
	// 삭제
	@DeleteMapping("employees/{id}")
	public String empDelete(@PathVariable(name="id") String empid) {
		System.out.println(empid);
		//empService.deleteEmpInfo(id);
		return empid;
	}
}
