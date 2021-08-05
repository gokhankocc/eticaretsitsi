package kamp_5_eticaretSitesi;

import kamp_5_eticaretSitesi.business.abstracts.EticaretService;

import kamp_5_eticaretSitesi.business.concrates.EticaretManager;
import kamp_5_eticaretSitesi.business.concrates.MailManager;
import kamp_5_eticaretSitesi.core.EpostaDogManagerAdaptor;
import kamp_5_eticaretSitesi.dataAccess.concrates.KocholdingEticaretDao;
import kamp_5_eticaretSitesi.entities.concrates.EticaretInfo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EticaretService eticaretService = new EticaretManager(new KocholdingEticaretDao(),new MailManager(),new EpostaDogManagerAdaptor());
		
		EticaretInfo eticaretInfo = new EticaretInfo();
		eticaretInfo.setFirstName("gökhan");
		eticaretInfo.setLastName("koç");
		eticaretInfo.setePosta("gkoc@gmail.com");
		eticaretInfo.setPassword("fggsdfsdfsd");
		
		EticaretInfo eticaretInfo2 = new EticaretInfo();
		eticaretInfo2.setFirstName("zehra");
		eticaretInfo2.setLastName("yoldas");
		eticaretInfo2.setePosta("gkoc5@gmail.com");
		eticaretInfo2.setPassword("fggsdfsdfsd");
		
		eticaretService.add(eticaretInfo);
		//eticaretService.delete(eticaretInfo);
		eticaretService.add(eticaretInfo2);
		//eticaretService.delete(eticaretInfo2);

	}

}
