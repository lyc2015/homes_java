package jp.co.lyc.cms.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.lyc.cms.mapper.EmployeeInfoMapper;
import jp.co.lyc.cms.model.EmployeeModel;

@Component
public class EmployeeInfoService {

	@Autowired
	EmployeeInfoMapper employeeInfoMapper;


	/**
	 * 社員情報を追加
	 * 
	 * @param emp
	 * @return boolean
	 */

    @Transactional(rollbackFor = Exception.class)
    public boolean insertEmployee(EmployeeModel emp) {
        try {
            employeeInfoMapper.insertEmployeeInfo(emp);
            // 可以根据需要添加更多的插入逻辑
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
         }
    }
}