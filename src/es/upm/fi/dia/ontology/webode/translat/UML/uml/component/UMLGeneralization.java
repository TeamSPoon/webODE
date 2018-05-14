package es.upm.fi.dia.ontology.webode.translat.UML.uml.component;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

public interface UMLGeneralization extends UMLComponent {

  //----------------------------------------------------------------------------
  //-- Common bussiness logic --------------------------------------------------
  //----------------------------------------------------------------------------

  //-- Base class management ---------------------------------------------------

  public UMLClass getBaseClass();
  public void     setBaseClass(UMLClass baseClass);

 //-- Derived class management -------------------------------------------------

  public UMLClass getDerivedClass();
  public void     setDerivedClass(UMLClass derivedClass);

}