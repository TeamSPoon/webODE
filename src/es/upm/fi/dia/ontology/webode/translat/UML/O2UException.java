package es.upm.fi.dia.ontology.webode.translat.UML;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

public abstract class O2UException extends Exception {

  //----------------------------------------------------------------------------
  //-- Data model --------------------------------------------------------------
  //----------------------------------------------------------------------------

  protected String description=null;

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public O2UException(String description) {
    this.description=description;
  }

  public O2UException(String description, Throwable th) {
    super(th);
    this.description=description;
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  public abstract String exceptionModule();
  public abstract Class  throwerClass();

  //-- Interface: Throwable ----------------------------------------------------

  public String toString() {
    return "["+throwerClass().getName()+"] "+
           exceptionModule()+", exception thrown: "+
           description;
  }

  public String getMessage() {
    return description;
  }

}