package jp.co.lyc.cms.service;

import jp.co.lyc.cms.mapper.NationalityMasterMapper;
import jp.co.lyc.cms.model.NationalityMaster;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalityMasterService {

    private final NationalityMasterMapper nationalityMasterMapper;

    public NationalityMasterService(NationalityMasterMapper nationalityMasterMapper) {
        this.nationalityMasterMapper = nationalityMasterMapper;
    }

    public List<NationalityMaster> getAllNationalities() {
        return nationalityMasterMapper.getAllNationalities();
    }
}
