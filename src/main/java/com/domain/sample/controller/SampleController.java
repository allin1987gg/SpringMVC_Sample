package com.domain.sample.controller;

import com.domain.sample.service.SampleService;
import com.domain.sample.service.SampleVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/sample/sample", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest httpServletRequest) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("sample/sample");
        return mav;
    }

    @RequestMapping(value = "/sample/getJson", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> responseBodyGET(HttpServletRequest httpServletRequest) throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("aaa","aaa");
        map.put("bbb","한글");
        map.put("ccc","中文");

        List<Map<String,String>> mapList = sampleService.getSample();
        map.put("mapList",mapList);

        List<SampleVO> sampleVOList = sampleService.getSampleVo();
        map.put("sampleVOList",sampleVOList);

        try {
            int x = sampleService.insert();
        }catch(Exception e){
            e.printStackTrace();
        }


        return map;


    }
}
