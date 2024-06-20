package jp.co.lyc.cms.service;



import jp.co.lyc.cms.model.NationalityMaster;
import jp.co.lyc.cms.model.SalesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import jp.co.lyc.cms.mapper.SalesInfoMapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class SalesInfoService {

	@Autowired
    SalesInfoMapper SalesInfoMapper;

	/**
	 * 売上情報を追加
	 * 
	 * @param emp
	 * @return boolean
	 */

    @Transactional(rollbackFor = Exception.class)
    public boolean insertSalesInfo(SalesModel emp) {
        try {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = sdf.format(date);
            emp.setCreateDate(dateString);
            emp.setUpdateDate(dateString);
            SalesInfoMapper.insertSalesInfo(emp);
            // 可以根据需要添加更多的插入逻辑
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
         }
    }

    public List<SalesModel> getSalesInfo(SalesModel sales) {
        return SalesInfoMapper.selectSalesInfo(sales);
    }
    public String getSalesId() {
        String nextId=SalesInfoMapper.getSalesId();
       if(nextId==null){
           nextId="000001";
       }
        return nextId;
    }
}