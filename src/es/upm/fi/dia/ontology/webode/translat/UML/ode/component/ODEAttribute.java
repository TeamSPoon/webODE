package es.upm.fi.dia.ontology.webode.translat.UML.ode.component;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

public interface ODEAttribute extends ODEComponent {

  //----------------------------------------------------------------------------
  //-- Common bussiness logic --------------------------------------------------
  //----------------------------------------------------------------------------

  //-- Parent concept management -----------------------------------------------

  public ODEConcept getParentConcept();
  public void       setParentConcept(ODEConcept parentConcept);

  //-- Cardinality management --------------------------------------------------

  public int  getMinimumCardinality();
  public void setMinimumCardinality(int minimumCardinality);

  public int  getMaximumCardinality();
  public void setMaximumCardinality(int maximumCardinality);

  //-- Measurement unit management ---------------------------------------------

  public String getMeasurementUnit();
  public void   setMeasurementUnit(String measurementUnit);

  //-- Precision management ----------------------------------------------------

  public String getPrecision();
  public void   setPrecision(String precision);

  //-- Type management ---------------------------------------------------------

  public int  getValueType();
  public void setValueType(int valueType);

  //-- Value management --------------------------------------------------------

  public String[] getValues();
  public void     setValues(String[] values);
  public void     addValue(String value);
  public void     removeValue(String value);

}