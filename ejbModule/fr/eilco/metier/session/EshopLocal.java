package fr.eilco.metier.session;
import javax.ejb.Local;

@Local
public interface EshopLocal {
	
	public String direBonjour(String name);

}
