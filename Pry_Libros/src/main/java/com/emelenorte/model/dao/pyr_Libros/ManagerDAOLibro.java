package com.emelenorte.model.dao.pyr_Libros;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class ManagerDAOLibro
 */
@Stateless
@LocalBean
public class ManagerDAOLibro {
	
	@PersistenceContext(unitName = "Pry_Libros")
	private EntityManager em;
	

    public void insertar(Object pObjeto) throws Exception {
        if (pObjeto == null)
            throw new Exception("No se puede insertar un objeto null.");
        try {
            em.persist(pObjeto);
            // mostrarLog("Objeto insertado: "+pObjeto.getClass().getSimpleName());
        } catch (Exception e) {
            // mostrarLog("No se pudo insertar el objeto especificado:
            // "+pObjeto.getClass().getSimpleName());
            throw new Exception("No se pudo insertar el objeto especificado: " + e.getMessage());
        }
    
    }
}
