package es.upm.fi.dia.ontology.webode.translat.UML.ode.component;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

public interface ODEConceptToConceptRelation extends ODERelation {

  //----------------------------------------------------------------------------
  //-- Common bussiness logic --------------------------------------------------
  //----------------------------------------------------------------------------

  //-- Origin concept management -----------------------------------------------

  public ODEConcept getOrigin();
  public void       setOrigin(ODEConcept origin);

  //-- Destination concept management ------------------------------------------

  public ODEConcept getDestination();
  public void       setDestination(ODEConcept destination);

}