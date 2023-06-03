package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.emp.mapper.DeptMapper;
import com.yedam.app.emp.service.DeptVO;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class DeptController {

	@Autowired
	DeptMapper deptMapper;

	@GetMapping("deptList")
	public String deptList(Model model, @ModelAttribute("dept") DeptVO vo) {
		model.addAttribute("deptList", deptMapper.deptList(vo));
		return "dept/deptList";
	}

	@GetMapping("deptInsert")
	public String deptInsertForm(Model model) {
		model.addAttribute("locations", deptMapper.selectLocations());
		model.addAttribute("managers", deptMapper.selectManagers());
		return "dept/deptInsert";
	}

	@PostMapping("deptInsert")
	public String deptInsert(DeptVO vo) {
		deptMapper.insertDept(vo);
		return "redirect:deptList";
	}
	
	@GetMapping("deptUpdate")
	public String deptUpdateForm(Model model, int deptId) {
		model.addAttribute("dept", deptMapper.selectDept(deptId));
		model.addAttribute("locations", deptMapper.selectLocations());
		model.addAttribute("managers", deptMapper.selectManagers());
		return "dept/deptUpdate";
	}

	@PostMapping("deptUpdate")
	public String deptUpdate(DeptVO vo) {
		deptMapper.updateDept(vo);
		return "redirect:deptList";
	}
}