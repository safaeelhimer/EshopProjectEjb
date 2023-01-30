package fr.eilco.metier.session;

import javax.ejb.Remote;

@Remote
public interface EshopRemote {
	public String direBonjour(String name);

}
