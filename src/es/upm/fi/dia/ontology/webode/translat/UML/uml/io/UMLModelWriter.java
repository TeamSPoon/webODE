package es.upm.fi.dia.ontology.webode.translat.UML.uml.io;

/**
 * <p>Title: Sistema de Importación y Exportación de Ontologías a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontologías</p>
 * @author Miguel Esteban Gutiérrez
 * @version 1.0
 */

import es.upm.fi.dia.ontology.webode.translat.UML.uml.*;

public interface UMLModelWriter {

  //----------------------------------------------------------------------------
  //-- Common bussiness logic --------------------------------------------------
  //----------------------------------------------------------------------------

  public void write(UMLModel model);

}