package es.upm.fi.dia.ontology.webode.translat.UML.ode.io.readers;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import es.upm.fi.dia.ontology.webode.service.*;

import es.upm.fi.dia.ontology.webode.translat.UML.ode.component.*;

public class ODESynonymReader {

  //----------------------------------------------------------------------------
  //-- Data model --------------------------------------------------------------
  //----------------------------------------------------------------------------

  private ODEService odeService=null;

  //----------------------------------------------------------------------------
  //-- Auxiliar methods --------------------------------------------------------
  //----------------------------------------------------------------------------

  private ODESynonym read(String model, String componentName) {
    ODESynonym synonym=null;

    /**@todo Perform synonym search via odeService */

    return synonym;
  }

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public ODESynonymReader(ODEService odeService) {
    this.odeService=odeService;
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  public void read(ODEComponent component) {
    /**@todo Perform synonym search and registration */
  }

}