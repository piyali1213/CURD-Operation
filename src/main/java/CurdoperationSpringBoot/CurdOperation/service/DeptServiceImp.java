package CurdoperationSpringBoot.CurdOperation.service;

import CurdoperationSpringBoot.CurdOperation.entity.Department;
import CurdoperationSpringBoot.CurdOperation.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeptServiceImp implements DeptService {
    @Autowired
    private DeptRepo deptRepo;

    @Override
    public Department saveDept(Department department) {
        return deptRepo.save(department);
    }

    @Override



    public List<Department> getAllDept() {

        return (List<Department>)
                deptRepo.findAll();
    }

    @Override
    public Department updateDept(Department department, Long deptId) {
        return deptRepo.findById(deptId).get(); // optional class from java8
    }

    @Override
    public Optional<Department> DeptById(Long deptId) {  // optional class from java 8
        return deptRepo.findById(deptId);

    }

    @Override
    public void deleteDept(Long deptId) {
        deptRepo.deleteById(deptId);

    }
}
