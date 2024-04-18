package CurdoperationSpringBoot.CurdOperation.service;

import CurdoperationSpringBoot.CurdOperation.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DeptService {

    public Department saveDept(Department department);

    public List<Department> getAllDept();
    public Department updateDept(Department department ,Long deptId);
  public Optional<Department> DeptById(Long deptId);
    public void deleteDept(Long deptId);
}
