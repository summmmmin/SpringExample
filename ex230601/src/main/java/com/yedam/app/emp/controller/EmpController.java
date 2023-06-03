package com.yedam.app.emp.controller;
/*
 * command
 * Pojo : 상속필요없음
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;

@Controller // 객체 생성해서 컨테이너에 빈 등록하고 스프링 디스패처서블릿에서 호출할 수 있도록
			// 커맨드 타입으로 만들어줌
			// @Component 상속받음
public class EmpController {

	@Autowired
	EmpMapper empMapper;

	@GetMapping("empList")
	public String empList(Model model, @ModelAttribute("emp") EmpVO vo) {
		System.out.println(vo);
//		vo.setDepartmentId(request.getParameter("dee"));
		// model.addAttribute("emp",vo);
		model.addAttribute("empList", empMapper.selectList(vo));
		return "emp/empList";
	}

	// 사원등록 페이지로 이동
	@GetMapping("empInsert")
	public String empInsertForm(Model model) {
		model.addAttribute("jobs", empMapper.selectJobs());
		model.addAttribute("depts", empMapper.selectDepts());
		return "emp/empInsert";
	}

	// 사원등록 처리
	@PostMapping("empInsert")
	public String empInsert(EmpVO vo) {
		empMapper.insertEmp(vo);
		return "redirect:empList";
	}

	// 사원수정페이지로이동
	@GetMapping("empUpdate")
	public String empUpdateForm(Model model, int empId) {
		model.addAttribute("emp", empMapper.selectOne(empId));
		model.addAttribute("jobs", empMapper.selectJobs());
		model.addAttribute("depts", empMapper.selectDepts());
		return "emp/empUpdate";
	}

	// 사원수정 처리
	@PostMapping("empUpdate")
	public String empUpdate(EmpVO vo) {
		empMapper.updateEmp(vo);
		return "redirect:empList";
	}

	// 사원삭제처리
	@GetMapping("empDelete")
	public String empDelete(@RequestParam int empId) {
		// int empId = request.getParameter("empId")
		empMapper.deleteEmp(empId);
		return "redirect:empList";
	}
}
