package phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneImpl implements Iphone {
  public List<Smartphone> getProduitsParMotCle(String mc) {
	List<Smartphone> phones = new ArrayList<Smartphone>();
	Connection conn = TonConnection.getConnection();
	try {
		PreparedStatement ps = conn.prepareStatement("select * from smartphone where marque LIKE ?");
		ps.setString(1, "%" + mc + "%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Smartphone p = new Smartphone();
			p.setId(rs.getLong("id"));
			p.setMarque(rs.getString("marque"));
			p.setCouleur(rs.getString("couleur"));
			p.setPrix(rs.getDouble("prix"));
			p.setRam(rs.getString("ram"));
			p.setStockage(rs.getString("stockage"));
			phones.add(p);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return phones;
}


@Override
public void addProduit(Smartphone s) {
	// TODO Auto-generated method stub
	
}
}