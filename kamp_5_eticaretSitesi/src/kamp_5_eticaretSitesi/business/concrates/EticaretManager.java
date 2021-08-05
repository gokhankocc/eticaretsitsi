package kamp_5_eticaretSitesi.business.concrates;


import kamp_5_eticaretSitesi.business.abstracts.EticaretService;
import kamp_5_eticaretSitesi.business.abstracts.MailService;
import kamp_5_eticaretSitesi.core.EpostaDogService;
import kamp_5_eticaretSitesi.dataAccess.abstracts.EticaretDao;
import kamp_5_eticaretSitesi.entities.concrates.EticaretInfo;

public class EticaretManager implements EticaretService{
	
	private EticaretDao dao;
	private MailService mail;
	private EpostaDogService dogService;
	int sayi=1;

	public EticaretManager(EticaretDao dao,MailService mail,EpostaDogService dogService) {
		super();
		this.dao = dao;
		this.mail=mail;
		this.dogService=dogService;
	}

	@Override
	public void add(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		if(eticaretInfo.getPassword().length()<6) {
			System.out.println("parola en az 6 karakter olmalýdýr...");
			return;
		}
		if(eticaretInfo.getFirstName().length()<3) {
			System.out.println("isim en az 3 karakter olmalý...");
			return;
		}
		if(eticaretInfo.getLastName().length()<3) {
			System.out.println("soyisim en az 3 karakter olmali...");
			return;
		}
		if(mail.mailEmail(eticaretInfo)==false) {
			System.out.println("e mail hatalý...");
			return;
		}
		if(mail.emailKullanýmKntrl(eticaretInfo)==false) {
			return;
			
		}
		if(dogService.dogrulamaValidation()==false) {
			System.out.println("dogrulamada hata");
			return;
		}
		sayi =2;
		this.dao.add(eticaretInfo);
		this.dao.getEmail(eticaretInfo);
		
		
		
	}

	@Override
	public void delete(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		if(sayi==2) {
			System.out.println("giriþ basarýlý");
			sayi =1;
		}
	}

	@Override
	public void update(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
	}

	

}
