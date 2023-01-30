package fr.eilco.metier.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="BoutiqueJNDI")
public class EshopImp implements EshopLocal, EshopRemote{
	
	public EshopImp() {
		 // TODO Auto-generated constructor stub
		 }
	@PersistenceContext(unitName = "EshopProjectEjb")
	EntityManager entityManager;
	
	
	public String direBonjour(String name){
		 System.out.println("Preparation du message pour dire bonjour " + name);
		 return "Bonjour " + name;
		 }
}
