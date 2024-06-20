package jp.co.lyc.cms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.lyc.cms.common.BaseController;
import jp.co.lyc.cms.model.EmployeeModel;
import jp.co.lyc.cms.service.EmployeeInfoService;

@RestController
@RequestMapping("/employee")
public class EmployeeInfoController extends BaseController {


    @Autowired
    private EmployeeInfoService employeeService;
    /*
     * 社員情報を追加
     * @param emp
     * @return boolean
     */
    @PostMapping("/insertEmployee")
    public Map<String, Object> insertEmployee(@RequestBody EmployeeModel emp) {
        Map<String, Object> resultMap = new HashMap<>();
        
        // 验证输入数据
        // String errorsMessage = validateEmployee(emp);
        // if (!errorsMessage.isEmpty()) {
        //     resultMap.put("errorsMessage", errorsMessage);
        //     return resultMap;
        // }

        // 插入数据到数据库
        boolean result = employeeService.insertEmployee(emp);
        resultMap.put("result", result);
        return resultMap;
    }

    private String validateEmployee(EmployeeModel emp) {
        StringBuilder errorsMessage = new StringBuilder();
        
        if (emp.getNationalityCode() == null) {
            errorsMessage.append("国籍を入力してください。");
        }
        if (emp.getIntoCompanyYearAndMonth() == null || emp.getIntoCompanyYearAndMonth().isEmpty()) {
            errorsMessage.append("入社年月を入力してください。");
        }
        if (emp.getGenderStatus() == null || emp.getGenderStatus().isEmpty()) {
            errorsMessage.append("性別を入力してください。");
        }
        if (emp.getAlphabetName() == null || emp.getAlphabetName().isEmpty()) {
            errorsMessage.append("ローマ字を入力してください。");
        // }
        // if (emp.getEmployeeFirstName() == null || emp.getEmployeeFirstName().isEmpty()
        //         || emp.getEmployeeLastName() == null || emp.getEmployeeLastName().isEmpty()) {
        //     errorsMessage.append("社員名を入力してください。");
        }
        
        return errorsMessage.toString();
    }

    /*
     * 
     */
    @GetMapping("/all")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        List<EmployeeModel> employees = employeeService.getAllEmployees();
        if (employees != null && !employees.isEmpty()) {
            return ResponseEntity.ok(employees);
        } else {
            return ResponseEntity.noContent().build();
        }   
    }

    /*
     * 
     */
    @PostMapping("/updateEmployee")
    public String updateEmployee(@RequestBody EmployeeModel employee) {
        boolean isUpdated = employeeService.updateEmployee(employee);
        if (isUpdated) {
            return "更新しました";
        } else {
            return "更新失敗";
        }
    }
    
}