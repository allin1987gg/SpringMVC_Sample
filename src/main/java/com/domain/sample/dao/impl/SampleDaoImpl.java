package com.domain.sample.dao.impl;

import com.domain.sample.dao.SampleDao;
import com.domain.sample.service.SampleVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class SampleDaoImpl implements SampleDao {

    @Autowired
//    @Resource(name="TEST")
    private SqlSession sqlSession;

    @Override
    public List<Map<String,String>> getSample() throws Exception {
        SampleDao sampleDao = sqlSession.getMapper(SampleDao.class);
        List<Map<String,String>> result = sampleDao.getSample();
        return result;
    }

    @Override
    public List<SampleVO> getSampleVo() throws Exception {
        SampleDao sampleDao = sqlSession.getMapper(SampleDao.class);
        List<SampleVO> result = sampleDao.getSampleVo();
        return result;
    }

    @Override
    public int insertSuccess() throws Exception {
        SampleDao sampleDao = sqlSession.getMapper(SampleDao.class);
        int result = sampleDao.insertSuccess();
        return 0;
    }

    @Override
    public int insertFail() throws Exception {
        SampleDao sampleDao = sqlSession.getMapper(SampleDao.class);
        int result = sampleDao.insertFail();
        return 0;
    }
}
