package es.upm.fi.dia.ontology.webode.translat.UML.ode.io.writers;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import es.upm.fi.dia.ontology.webode.translat.UML.ode.component.*;

import es.upm.fi.dia.ontology.webode.service.*;

public class ODEAbbreviationWriter {

  //----------------------------------------------------------------------------
  //-- Data model --------------------------------------------------------------
  //----------------------------------------------------------------------------

  private ODEService odeService=null;

  //----------------------------------------------------------------------------
  //-- Auxiliar methods --------------------------------------------------------
  //----------------------------------------------------------------------------

  private ODEAbbreviation read(String model, String componentName) {
    ODEAbbreviation abbreviation=null;

    /**@todo Perform abbreviation search via odeService */

    return abbreviation;
  }

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public ODEAbbreviationWriter(ODEService odeService) {
    this.odeService=odeService;
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  public void read(ODEComponent component) {
    /**@todo Perform abbreviation search and registration */
  }

}