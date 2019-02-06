package com.bit.sts01;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts01.model.JavaDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	JavaDao proxyFactoryBean;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		try {
			String result=proxyFactoryBean.func01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proxyFactoryBean.func02();
		proxyFactoryBean.func03();
		
		return "home";
	}
	
}
