package es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.writers;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import es.upm.fi.dia.ontology.webode.translat.UML.tools.*;

import es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.writers.containers.*;

public interface XMIWriter {

  //----------------------------------------------------------------------------
  //-- Common bussiness logic --------------------------------------------------
  //----------------------------------------------------------------------------

  public void setTabulator(Tabulator tabulator);
  public void write(XMITaggedValue taggedValue);
  public void write(XMIStereotype stereotype);
  public void write(XMIDataType dataType);
  public void write(XMIGeneralization generalization);


}