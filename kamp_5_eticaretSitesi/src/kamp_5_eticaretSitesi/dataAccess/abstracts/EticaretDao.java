package kamp_5_eticaretSitesi.dataAccess.abstracts;

import java.util.List;

import kamp_5_eticaretSitesi.entities.concrates.EticaretInfo;

public interface EticaretDao {
	void add(EticaretInfo eticaretInfo);
	void delete(EticaretInfo eticaretInfo);
	void update(EticaretInfo eticaretInfo);
	List<EticaretInfo> getAll(EticaretInfo eticaretInfo);
	boolean getEmail(EticaretInfo eticaretInfo);

}
