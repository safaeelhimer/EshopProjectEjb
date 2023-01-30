package fr.eilco.metier.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.eilco.metier.session.EshopLocal;

@Stateless
@WebService
public class EshopService {
	@EJB
	private EshopLocal metier;

}
