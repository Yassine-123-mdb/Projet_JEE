package web;

import java.util.ArrayList;
import java.util.List;

import phone.Smartphone;


public class PhoneModel {
	private String motCle;
	List<Smartphone> phones = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Smartphone> getPhones() {
		return phones;
	}

	public void setPhones(List<Smartphone> phones) {
		this.phones = phones;
	}
}
