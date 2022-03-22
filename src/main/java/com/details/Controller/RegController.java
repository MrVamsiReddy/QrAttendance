package com.details.Controller;

import java.util.List;

import com.details.Dto.DetailsDto;
import org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.details.Entity.attendance;
import com.details.Service.Regservice;

@Controller
public class RegController {
	@Autowired
	private Regservice ref;
	
	@RequestMapping("/index")
	public String callindex() {
		return "index";
	}
	@RequestMapping("/saveindex")
	public String savedata(@ModelAttribute("attendance") attendance att , ModelMap modelMap, @RequestParam ("name") String name,@RequestParam("email") String email) {
		ref.saveData(att);
		modelMap.addAttribute("msg", "The Data is Saved!!!!");
		return "index";
	}
	@RequestMapping("/viewdata")
	public String viewdata(ModelMap modelMap){
		List<attendance> Table_Data = ref.ViewData();
		modelMap.addAttribute("tabledata", Table_Data);
		return "viewdata";
	}
	@RequestMapping("/DelReg")
	public String Delete(@RequestParam("id")long id, ModelMap modelMap){
		ref.Delete(id);

		List<attendance> Table_Data = ref.ViewData();
		modelMap.addAttribute("tabledata", Table_Data);
		return "viewdata";
	}
	@RequestMapping("/UpdateReg")
	public String markAtte(@RequestParam("id")long id,ModelMap modelMap){
		attendance tabledata = ref.markAtte(id);
		modelMap.addAttribute("update", tabledata);
		return "UpdateRegistration";
	}
	@RequestMapping("/SaveUpdate")
	public String saveAtt(@ModelAttribute("attendance") attendance att, ModelMap modelMap, DetailsDto Dedto){
		DetailsDto dto = new DetailsDto();
		dto.setId(Dedto.getId());
		dto.setName(Dedto.getName());
		dto.setDepartment(Dedto.getDepartment());
		dto.setYear(Dedto.getYear());
		dto.setAttended(Dedto.getAttended());
		dto.setEmail(Dedto.getEmail());
		dto.setMobile(Dedto.getMobile());
		ref.saveUpdate(att);

		List<attendance> Table_Data = ref.attend();
		modelMap.addAttribute("tabledata", Table_Data);
		return "attendance";
	}
}
