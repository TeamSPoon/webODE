package es.upm.fi.dia.ontology.webode.translat.UML.ode.component;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

public class ODESynonym {

  //----------------------------------------------------------------------------
  //-- Data model --------------------------------------------------------------
  //----------------------------------------------------------------------------

  private String synonymName       =null;
  private String synonymDescription=null;

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public ODESynonym(String synonymName, String synonymDescription) {
    this.synonymName       =synonymName;
    this.synonymDescription=synonymDescription;
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  public String getName() {
    return synonymName;
  }

  public void setName(String synonymName) {
    this.synonymName=synonymName;
  }

  public String getDescription() {
    return synonymDescription;
  }

  public void setDescription(String synonymDescription) {
    this.synonymDescription=synonymDescription;
  }

}