package jp.co.lyc.cms.mapper;

import jp.co.lyc.cms.model.NationalityMaster;
import jp.co.lyc.cms.model.SalesModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesInfoMapper {

	public void insertSalesInfo(SalesModel emp);


	public List<SalesModel> selectSalesInfo(SalesModel emp);
	public String getSalesId();

}