package kamp_5_eticaretSitesi.business.abstracts;

import kamp_5_eticaretSitesi.entities.concrates.EticaretInfo;

public interface MailService {
	boolean mailEmail(EticaretInfo eticaretInfo);
	boolean emailKullanýmKntrl(EticaretInfo eticaretInfo);

}
