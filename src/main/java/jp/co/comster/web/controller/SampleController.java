package jp.co.comster.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@RequestMapping("/hogehoge")
	public String hello(@RequestParam(value="name", required=false, defaultValue="fugafuga") String name, Model model) {
		model.addAttribute("name", name);
		return "hoge";
	}

}
