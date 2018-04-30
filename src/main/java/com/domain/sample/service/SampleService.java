package com.domain.sample.service;

import java.util.List;
import java.util.Map;

public interface SampleService {

    public List<Map<String,String>> getSample() throws Exception;
    public List<SampleVO> getSampleVo() throws Exception;

    public int insert() throws Exception;
}
