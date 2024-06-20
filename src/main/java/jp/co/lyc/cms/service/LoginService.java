package jp.co.lyc.cms.service;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    // 模拟用户数据库验证
    public boolean authenticate(String employeeNo, String password, String verificationCode) {
        // 这里你可以添加实际的用户验证逻辑，如查询数据库
        if ("lyc001".equals(employeeNo) && "1".equals(password) && "".equals(verificationCode)) {
            return true;
        }
        return false;
    }
}
