package kamp_5_eticaretSitesi.business.abstracts;

import kamp_5_eticaretSitesi.entities.concrates.EticaretInfo;

public interface EticaretService {
	void add(EticaretInfo eticaretInfo);
	void delete(EticaretInfo eticaretInfo);
	void update(EticaretInfo eticaretInfo);
	

}
