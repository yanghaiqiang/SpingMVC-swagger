package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.BaseResultVo;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
//	@RequestMapping("/showUser")
//	public String toIndex(HttpServletRequest request,Model model){
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.getUserById(userId);
//		model.addAttribute("user", user);
//		return "showUser";
//	}
	
	@ResponseBody
    @RequestMapping(
            value = "/showOneUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ApiOperation(value = "显示用户", httpMethod = "POST", response = BaseResultVo.class, notes = "show One User")
    public BaseResultVo showUser(
    		@ApiParam(required = true, name = "userId", value = "用户信息json数据") 
    		@RequestParam int userId)
    {
		User user = this.userService.getUserById(userId);
		
		BaseResultVo vo = new BaseResultVo();
		vo.setResultCode(0);
		vo.setResultData(user);
		vo.setResultMessage("success");
		return vo;
    }
	
	@ResponseBody
    @RequestMapping(
            value = "/showAllUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ApiOperation(value = "显示全部用户", httpMethod = "POST", response = BaseResultVo.class, notes = "show One User")
    public BaseResultVo showAllUser(
    		@ApiParam(required = true, name = "userId", value = "用户信息json数据") 
    		@RequestParam int userId)
    {
		User user = this.userService.getUserById(userId);
		
		BaseResultVo vo = new BaseResultVo();
		vo.setResultCode(0);
		vo.setResultData(user);
		vo.setResultMessage("success");
		return vo;
    }
	
/*	@RequestMapping("/userException")
	public void getException(@RequestParam("yang") int yang){
		
		userService.getException(yang);
	}*/
}
