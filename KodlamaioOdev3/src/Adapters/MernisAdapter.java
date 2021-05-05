package Adapters;

import java.rmi.RemoteException;

import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter {
	@Override
	public boolean IsPerson(User user) {
		KPSPublicSoapProxy tc = new KPSPublicSoapProxy();
		boolean isTrue = false;
		try {
			isTrue = tc.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), user.getBornDate().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return isTrue;
	}
}
