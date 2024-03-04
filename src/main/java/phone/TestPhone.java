package phone;

import java.util.List;

public class TestPhone {
	public static void main(String[] args) {
		PhoneImpl phone = new PhoneImpl();
		List<Smartphone> smarts = phone.getProduitsParMotCle("Nokia");
		for (Smartphone p : smarts)
			System.out.println(p.getMarque());
	}
}
