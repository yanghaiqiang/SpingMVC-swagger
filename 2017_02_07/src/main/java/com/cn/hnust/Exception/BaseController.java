package com.cn.hnust.Exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


public class BaseController {
	/** 基于@ExceptionHandler异常处理 */  
    @ExceptionHandler(BusinessException.class)  
    public Map<Object,String> exp(HttpServletRequest request, Exception ex) {  
    	System.out.println("yanghaiqiang");   
    	Map<Object,String> map = new HashMap<Object,String>();
    	map.put("returnCode", "1");
    	map.put("returnMsg","sdasd");
    	
    	return map;  
    }
    
    @ExceptionHandler(CarException.class)
    public ModelAndView expwe(HttpServletRequest request, Exception ex) {  
        System.out.println("yanghaiqiang2222");  
        ModelAndView mov = new ModelAndView();
        mov.addObject("message",ex.getMessage());
        mov.addObject("id",2);
        mov.setViewName("carException");
    	return mov;
    }
}
