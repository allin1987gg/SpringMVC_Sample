package com.domain.sample.service.impl;

import com.domain.sample.dao.SampleDao;
import com.domain.sample.service.SampleService;
import com.domain.sample.service.SampleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    SampleDao sampleDao;

    @Override
    public List<Map<String,String>> getSample() throws Exception {
        List<Map<String,String>> result = sampleDao.getSample();
        return result;
    }

    @Override
    public List<SampleVO> getSampleVo() throws Exception {
        List<SampleVO> result = sampleDao.getSampleVo();
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int insert() throws Exception {
        int result1 = sampleDao.insertSuccess();
//        int result2 = sampleDao.insertFail();
        return 0;
    }
}
