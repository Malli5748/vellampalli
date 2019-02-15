package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.model.UserPeople;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private IUserService service;
   @RequestMapping(value="/register",method=RequestMethod.GET) 
	  public String userReg()
   {
	  
		/*
		 * UserPeople user=new UserPeople(); map.addAttribute("model",user);
		 */
	  
	  return "Register"; 
	  }
	  
	  @RequestMapping(value="/saveuser", method=RequestMethod.POST) 
	  public String saveUser(@ModelAttribute("model")UserPeople user,ModelMap map) throws IOException { 
		  Integer id=service.saveUser(user);
	  map.addAttribute("message","save"+id+"successfully"); 
	  map.addAttribute("model",new UserPeople());
	  return "Register"; 
	  }
	  
	  //user data
	  @RequestMapping("/showUserData")
	  public String getUserDet(ModelMap map)
	  {
		  List<UserPeople> data=service.getAllUser();
		  map.addAttribute("data",data);
		 return "Userdata"; 
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //upload data
	  @RequestMapping("/upload")
	  public String uploadData(@RequestParam("file")CommonsMultipartFile file,ModelMap map)
	  {
		  Document doc=new Document();
		  doc.setFileName(file.getOriginalFilename());
		  doc.setFile(file.getBytes());
		  Integer id=service.uploadData(doc);
		  map.addAttribute("message","save\t"+id+"\tsuccessfully");
		  return "Register";
	  }
	  //show saved data
	  @RequestMapping("/showfiledata")
	  public String showFileData(ModelMap map)
	  {
		  List<Object[]> data=service.getIdAndName();
		  map.addAttribute("data",data);
		  return "DocData";
	  }
	  
	  //download
	  @RequestMapping("/download")
	  public void downloadDoc(@RequestParam("id")Integer id,HttpServletResponse resp)
	  {
		  
		 Document doc=service.getOneData(id);
		 //header param
		 resp.addHeader("Content-Disposition","attachment;filename="+doc.getFileName());
		 //get data into http body
		 
		 try
		 {
			 FileCopyUtils.copy(doc.getFile(), resp.getOutputStream());
	  }
		 catch (IOException e) {
			// TODO: handle exception
			 e.getStackTrace();
		}
	  
	  }
	  
	  
	  
	  
}
	


