package kr.ac.hansung.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.NewOfferDAO;
import kr.ac.hansung.dao.OfferDAO;
import kr.ac.hansung.model.Offer;

@Service
public class NewOfferService {

	@Autowired
	private NewOfferDAO newofferDao;
	
	public List<Offer> getCurrent() {
		return newofferDao.getOffers();
	}

	public void insert(Offer newoffer) {
		newofferDao.insert(newoffer);
	}

}
