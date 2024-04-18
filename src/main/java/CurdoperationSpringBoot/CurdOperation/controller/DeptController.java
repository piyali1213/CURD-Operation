package CurdoperationSpringBoot.CurdOperation.controller;

import CurdoperationSpringBoot.CurdOperation.entity.Department;
import CurdoperationSpringBoot.CurdOperation.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/departments")
public class DeptController {
@Autowired
    private DeptService deptService;


//Save Department
@PostMapping("/saveDepartment")
public ResponseEntity<Department>saveDept(@RequestBody Department department)
{
    return new ResponseEntity<> (deptService.saveDept(department) ,HttpStatus.CREATED);
}

//Read All departments
@GetMapping("/getAllDepartment")
public ResponseEntity<List<Department> >getAllDept()
{


     List<Department> departments = deptService.getAllDept();
    return  ResponseEntity.ok(departments);
}

//Read Dept By id
@GetMapping("/{deptId}")
public Optional<Department> getDeptById(@PathVariable Long deptId)
{
   return deptService.DeptById(deptId);
}


@DeleteMapping("/{deptId}")
public ResponseEntity<String> deleteDept(@PathVariable Long deptId)
{
   deptService.deleteDept(deptId);
   return ResponseEntity.ok("The account successfully deleted .");
}
@PutMapping("/department/{deptId}")
public ResponseEntity<Department> updateDept(@RequestBody Department department, @PathVariable Long deptId)
{
           Department department1= deptService.updateDept(department, deptId);
           return ResponseEntity.ok(department1);
}


}

