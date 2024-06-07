package jp.co.lyc.cms.mapper;

import jp.co.lyc.cms.model.NationalityMaster;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NationalityMasterMapper {
    @Select("SELECT * FROM M001NationalityMaster")
    List<NationalityMaster> getAllNationalities();
}
