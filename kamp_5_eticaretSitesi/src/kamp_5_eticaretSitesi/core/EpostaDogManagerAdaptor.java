package kamp_5_eticaretSitesi.core;

import kamp_5_eticaretSitesi.epostadogrulama.EpostaDogManager;

public class EpostaDogManagerAdaptor implements EpostaDogService{

	@Override
	public boolean dogrulamaValidation() {
		// TODO Auto-generated method stub
		EpostaDogManager dogManager = new EpostaDogManager();
		dogManager.dogrulama();
		if(dogManager.dogrulama()==true) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
