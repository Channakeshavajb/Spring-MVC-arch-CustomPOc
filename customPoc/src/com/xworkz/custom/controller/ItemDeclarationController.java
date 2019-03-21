package com.xworkz.custom.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.custom.constants.ApplicationCanstants;
import com.xworkz.custom.dto.ItemDeclarationDTO;
import com.xworkz.custom.exception.ControllerException;
import com.xworkz.custom.exception.ServiceException;
import com.xworkz.custom.service.ItemDeclarationService;
import com.xworkz.custom.util.ApplicationUtil;

@Controller
@RequestMapping("/")
public class ItemDeclarationController {

	@Autowired
	private ItemDeclarationService itemDeclarationService;

	public ItemDeclarationController() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String itemProcessing(ItemDeclarationDTO dto) throws ControllerException{
		try {
		System.out.println("invoked itemProcessing\t " + dto);

		itemDeclarationService.save(dto);
		return ApplicationCanstants.ITEM_DECLARATION_PAGE;

	}catch (Exception e) {
		System.err.println("exception in controller\t"+e.getMessage());
		throw new ControllerException("exception thrown in controller\t"+e.getMessage());
	}
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		ApplicationUtil.getSimpleDateFormat().setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(ApplicationUtil.getSimpleDateFormat(), false));
	}
}
