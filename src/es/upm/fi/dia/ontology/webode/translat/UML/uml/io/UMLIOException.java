package es.upm.fi.dia.ontology.webode.translat.UML.uml.io;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import es.upm.fi.dia.ontology.webode.translat.UML.uml.*;

public class UMLIOException extends UMLException {

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public UMLIOException(String description, Class throwerClass) {
    super(description,throwerClass);
  }

  public UMLIOException(String description, Class throwerClass, Throwable th) {
    super(description,throwerClass, th);
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  //-- Interface: O2UException -------------------------------------------------

  public String exceptionModule() {
    return "UML O2U Input/Output Module";
  }

}