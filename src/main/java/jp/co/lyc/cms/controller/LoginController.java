package jp.co.lyc.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jp.co.lyc.cms.common.BaseController;
import jp.co.lyc.cms.model.EmployeeModel;
import jp.co.lyc.cms.model.LoginModel;
import jp.co.lyc.cms.model.NationalityMaster;
import jp.co.lyc.cms.service.NationalityMasterService;
import jp.co.lyc.cms.service.LoginService;

import jp.co.lyc.cms.service.EmployeeInfoService;
import jp.co.lyc.cms.util.UtilsCheckMethod;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;

@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	NationalityMasterService nationalityMasterService;

	@Autowired
	LoginService loginService;

	@PostMapping("/init")
	@ResponseBody
	public boolean init() {
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
	
	/**
	 * ログインボタン
	 * 
	 * @param loginModel
	 * @param employeeModel
	 * @return
	 */
    @PostMapping("/login")
	@ResponseBody
    public ResponseEntity<String> login(@RequestBody LoginModel loginModel, HttpSession session) {
        // 验证用户凭证
        boolean isAuthenticated = loginService.authenticate(loginModel.getEmployeeNo(), loginModel.getPassword(), loginModel.getVerificationCode());

        if (isAuthenticated) {
            // 用户验证成功后，创建会话
            session.setAttribute("user", loginModel.getEmployeeNo());
            return ResponseEntity.ok("Login successful");
        } else {
            // 用户验证失败
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
	
}
