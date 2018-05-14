package es.upm.fi.dia.ontology.webode.translat.UML.translation.tools;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import java.io.*;

public class CannotParseDoc extends IOException {

  //----------------------------------------------------------------------------
  //-- Data model --------------------------------------------------------------
  //----------------------------------------------------------------------------

  private String doc=null;

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public CannotParseDoc(String doc) {
    this.doc=doc;
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  public String toString() {
    return "Cannot parse documentation: "+doc;
  }
}

