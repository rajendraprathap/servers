import java.text.SimpleDateFormat;

import com.model.Account;
import com.repositroy.AccountDao;
import com.repositroy.AccountDaoFactory;

public class test {

	public static void main(String[] args) {
          AccountDao ad=AccountDaoFactory.getInstance();
		Account acc=new Account();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		
		acc.setUsername("raju");
		acc.setPassword("raju");
		acc.setEmail("raju@gamil.com");
		acc.setAddress("hyderabad");
		acc.setFname("rajendra");
     
		ad.SaveAccount(acc);
	}

}
