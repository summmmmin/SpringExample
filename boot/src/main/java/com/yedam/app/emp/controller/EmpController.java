package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {
	@Autowired
	EmpService empService;
	
	// 전체조회 페이지
	@GetMapping("empList")
	public String empList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";
	}
	
	// 단건조회 페이지
	@GetMapping({"empInfo","empInfo/{employeeId}"})
	public String empInfo(EmpVO empVO, Model model, @PathVariable(required = false) int employeeId) {
		if(employeeId != 0) {
			empVO.setEmployeeId(employeeId);			
		}
		model.addAttribute("empinfo", empService.getEmpInfo(empVO));
		return "emp/empInfo";		
	}
	// 등록 페이지
	@GetMapping("empInsert")
	public String empInsertForm(Model model) {
		model.addAttribute("empVO", new EmpVO());
		return "emp/empInsert";
	}
	
	// 등록 처리
	@PostMapping("empInsert")
	public String empInsert(EmpVO empVO) {
		empService.insertEmpInfo(empVO);
		return "redirect:empList";
	}
	// 등록 페이지
	@GetMapping("empUpdate")
	public String empUpdateForm(Model model,EmpVO vo) {
		model.addAttribute("empVO", empService.getEmpInfo(vo));
		return "emp/empUpdate";
	}
	
	// 등록 처리
	//@PostMapping("empUpdate")
//	public String empUpdate(EmpVO empVO) {
//		empService.updateEmpInfo(empVO);
//		return "redirect:empList";
//	}
	
	@GetMapping("test")
	public String test() {
		return "test1/test";
	}
}
