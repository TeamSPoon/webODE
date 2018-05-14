package es.upm.fi.dia.ontology.webode.translat.UML.ode.component.impl;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */


import es.upm.fi.dia.ontology.webode.translat.UML.ode.component.*;

public class ODEClassAttributeImpl extends    ODEAttributeHandler
                                   implements ODEClassAttribute {

  //----------------------------------------------------------------------------
  //-- Constructor -------------------------------------------------------------
  //----------------------------------------------------------------------------

  public ODEClassAttributeImpl(String attributeName) {
    this(null,attributeName);
  }

  public ODEClassAttributeImpl(ODEConcept odeConcept, String attributeName) {
    super(odeConcept,attributeName);
  }

  //----------------------------------------------------------------------------
  //-- Bussiness logic ---------------------------------------------------------
  //----------------------------------------------------------------------------

  public String toString() {
    String mySelf=new String();

    mySelf+="ODEClassAttribute {";
    mySelf+=getName()+", ";
    mySelf+=getDescription()+", ";
    mySelf+=getParentConcept().getName()+", ";
    mySelf+=getMinimumCardinality()+", ";
    mySelf+=getMaximumCardinality()+", ";
    mySelf+=getMeasurementUnit()+", ";
    mySelf+=getPrecision()+", ";
    mySelf+=AttributeValueTypes.toString(getValueType());
    mySelf+="}";

    return mySelf;
  }

}