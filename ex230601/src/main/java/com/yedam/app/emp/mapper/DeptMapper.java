package com.yedam.app.emp.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.app.emp.service.DeptVO;

public interface DeptMapper {
	public List<DeptVO> deptList(DeptVO vo);
	public DeptVO selectDept(int departmentId);
	public int insertDept(DeptVO vo);
	public int updateDept(DeptVO vo);
	public List<Map<String, Object>> selectManagers();
	public List<Map<String, Object>> selectLocations();
}
