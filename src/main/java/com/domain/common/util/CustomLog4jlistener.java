package com.domain.common.util;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.LoggerContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by zjz on 17/4/5.
 */
public class CustomLog4jlistener implements ServletContextListener {
    public static final String log4jdirkey = "log4jdir";
    public void contextDestroyed(ServletContextEvent servletcontextevent) {
        System.getProperties().remove(log4jdirkey);
    }
    public void contextInitialized(ServletContextEvent servletcontextevent) {
        String log4jdir = servletcontextevent.getServletContext().getRealPath("/");
        System.out.println("log4jdir:"+log4jdir);
        System.setProperty(log4jdirkey, log4jdir);
//        Enumeration e =System.getProperties().propertyNames();
//
//        while(e.hasMoreElements()){
//            String value = (String)e.nextElement();//调用nextElement方法获得元素
//            System.out.println(value);
//        }
        //initLog4j(log4jdir);
    }

//    private void initLog4j(String realPath) {
//        File file = new File(realPath+"WEB-INF/classes/log4j2.xml");
//        try {
//            LoggerContext context =(LoggerContext) LogManager.getContext(false);
//            context.setConfigLocation(file.toURI());
//            //重新初始化Log4j2的配置上下文
//            context.reconfigure();
//        }catch(Exception e){
//            System.out.println("[SYSTEM]==> Log4j2 初始化失败，读取[log4j2]文件失败!");
//        }
//    }
}