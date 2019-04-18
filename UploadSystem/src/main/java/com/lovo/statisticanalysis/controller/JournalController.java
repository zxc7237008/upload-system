package com.lovo.statisticanalysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.statisticanalysis.entity.JournalEntity;
import com.lovo.statisticanalysis.entity.PageBean;
import com.lovo.statisticanalysis.service.JournalService;



@Controller
public class JournalController {
	@Autowired
	private JournalService ijournalService;
	
	@RequestMapping("goPage")
    public String goToPage(){
        return "showjournalListPage";
    }
		
		@RequestMapping("showjournalListPage")
	    public ModelAndView showUserListPage(){
	        ModelAndView modelAndView = new ModelAndView("journal");
	        int pageNum = 0;
	        int pageSize = 5;
	        int pageAll = ijournalService.getAllPage(pageSize);
	        List<JournalEntity> list = ijournalService.showjournalListPage(pageNum,pageSize);
	        PageBean<JournalEntity> pageBean = new PageBean<>();
	        pageBean.setList(list);
	        pageBean.setPageNum(pageNum);
	        pageBean.setPageAll(pageAll);
	        modelAndView.addObject("pageBean",pageBean);
	        return modelAndView;
	    }
	 
	    @RequestMapping("changePage")
	    public ModelAndView changePage(int pageNum){
	        ModelAndView modelAndView = new ModelAndView();
	        int pageSize = 5;
	        List<JournalEntity> list = ijournalService.showjournalListPage(pageNum,pageSize);
	        modelAndView.setViewName("journal");
	        int pageAll = ijournalService.getAllPage(pageSize);
	        PageBean<JournalEntity> pageBean = new PageBean<>();
	        pageBean.setList(list);
	        pageBean.setPageAll(pageAll);
	        pageBean.setPageNum(pageNum);
	        modelAndView.addObject("pageBean",pageBean);
	        return modelAndView;
	    }
	    	
	    @RequestMapping("to")
	    public ModelAndView to(){
	        ModelAndView modelAndView = new ModelAndView("loginF");
	        return modelAndView;
	    }

}
