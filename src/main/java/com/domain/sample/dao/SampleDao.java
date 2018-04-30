package com.domain.sample.dao;

import com.domain.sample.service.SampleVO;

import java.util.List;
import java.util.Map;

public interface SampleDao {
    public List<Map<String,String>> getSample() throws Exception;
    public List<SampleVO> getSampleVo() throws Exception;

    public int insertSuccess() throws Exception;
    public int insertFail() throws Exception;
}
