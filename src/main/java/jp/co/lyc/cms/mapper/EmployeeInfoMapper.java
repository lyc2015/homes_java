package jp.co.lyc.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.lyc.cms.model.EmployeeModel;

@Mapper
public interface EmployeeInfoMapper {

	/**
	 * 社員情報詳細を追加
	 * 
	 */
	public void insertEmployeeInfo(EmployeeModel emp);

	/**
	 * 社員情報を取得
	 * 
	 * @param sendMap
	 * @return
	 */
	public List<EmployeeModel> getAllEmployees();

	/**
	 * 社員情報を更新
	 * 
	 * @param emp
	 */
	public void updateEmployeeInfo(EmployeeModel emp);
}