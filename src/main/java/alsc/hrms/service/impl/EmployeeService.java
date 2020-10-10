package alsc.hrms.service.impl;

import alsc.hrms.pojo.entity.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GenshenWang.nomico
 * @date 2018/3/7.
 */
@Service
public class EmployeeService {

    @Resource
    EmployeeMapper employeeMapper;

    public int getEmpCount(){
        return employeeMapper.countEmps();
    }
    public List<Employee> getEmpList(Integer offser, Integer limit){
        return employeeMapper.selectByLimitAndOffset(offser, limit);
    }
    public Employee getEmpById(Integer empId){
        return employeeMapper.selectOneById(empId);
    }
    public Employee getEmpByName(String empName){return employeeMapper.selectOneByName(empName);};
    public int updateEmpById(Integer empId, Employee employee){return employeeMapper.updateOneById(empId, employee);}
    public int deleteEmpById(Integer empId){
        return employeeMapper.deleteOneById(empId);
    }
    public int addEmp(Employee employee){
        return employeeMapper.insertOne(employee);
    }


}
