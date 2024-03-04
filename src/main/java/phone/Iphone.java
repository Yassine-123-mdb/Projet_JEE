package phone;

import java.util.List;


public interface Iphone {

	public List<Smartphone> getProduitsParMotCle(String mc);

	public void addProduit(Smartphone s);
}
