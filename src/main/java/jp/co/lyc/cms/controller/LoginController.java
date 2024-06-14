package jp.co.lyc.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jp.co.lyc.cms.common.BaseController;
import jp.co.lyc.cms.model.NationalityMaster;
import jp.co.lyc.cms.service.NationalityMasterService;

import jp.co.lyc.cms.service.EmployeeInfoService;
import jp.co.lyc.cms.util.UtilsCheckMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EmployeeInfoService es;

	@Autowired
	NationalityMasterService nationalityMasterService;

	String errorsMessage = "";

	@GetMapping("/init")
	@ResponseBody
	public boolean init() {
		logger.info("LoginController.login:" + "ログイン開始");

		if (UtilsCheckMethod.isNullOrEmpty((String) getSession().getAttribute("employeeNo"))) {
			return false;
		} else {
			return true;
		}
	}

	@GetMapping("/nationalities")
	@ResponseBody
	public List<NationalityMaster> getNationalities() {
		logger.info("National: ログイン開始");
		return nationalityMasterService.getAllNationalities();
	}
	
	@PostMapping("/insertEmployee")
    public ResponseEntity<String> insertEmployee(
            @RequestPart("emp") String emp, 
            @RequestPart(value = "resumeInfo1", required = false) MultipartFile resumeInfo1,
            @RequestPart(value = "resumeInfo2", required = false) MultipartFile resumeInfo2) {

        // 处理 JSON 数据
        // Employee employee = new ObjectMapper().readValue(emp, Employee.class);
        
        // 处理文件
        if (resumeInfo1 != null) {
            // 保存文件或其他处理逻辑
        }
        
        if (resumeInfo2 != null) {
            // 保存文件或其他处理逻辑
        }
        
        // 进一步的处理逻辑
        
        return ResponseEntity.ok("Employee data received successfully");
    }
	
}
