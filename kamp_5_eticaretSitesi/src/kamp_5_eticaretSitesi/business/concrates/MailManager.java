package kamp_5_eticaretSitesi.business.concrates;


import java.util.ArrayList;
import java.util.List;

import kamp_5_eticaretSitesi.business.abstracts.MailService;
import kamp_5_eticaretSitesi.entities.concrates.EticaretInfo;

public class MailManager implements MailService{
	
	private List<String> emails= new ArrayList<String>();
	@Override
	public boolean mailEmail(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		//String phone = eticaretInfo.getePosta();
				String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			      //Matching the given phone number with regular expression
			      boolean result = eticaretInfo.getePosta().matches(regex);
			      if(result) {
			         //System.out.println("e mail geçerli");
			         return true;
			      } else {
			         return false;
			      }
	}

	@Override
	public boolean emailKullanýmKntrl(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		if(emails.contains(eticaretInfo.getePosta())) {
			System.out.println("Bu email baþka bir kullanýcý tarafýndan kullanýlýyor.");
			return false;
		}
		else {
			emails.add(eticaretInfo.getePosta());
			return true;
		}
		
		
		
	}

}
