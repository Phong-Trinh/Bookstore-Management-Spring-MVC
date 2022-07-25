package ptit.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
public class ForgetPasswordController {
	@RequestMapping("forget-password")
	public String index() {
		return "forget-password";
	}
}
