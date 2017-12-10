package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OfferService;

@Controller
public class OfferController {
	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping("/offers") // 불러와서 모델에 저장하고 
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers", offers);
		
		return "offers"; // view 쪽으로 넘긴다
	}
	
	@RequestMapping("/crateoffer") // 불러와서 모델에 저장하고 
	public String createOffers(Model model) {
		
		model.addAttribute("offer", new Offer());
		
		return "crateoffer"; // view 쪽으로 넘긴다
	}
}
