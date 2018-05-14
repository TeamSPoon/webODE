package es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

public class EventNotSupported extends Exception {

  private EventHandler handler=null;
  private Event        event  =null;

  public EventNotSupported(EventHandler handler, Event event) {
    super();
    this.handler=handler;
    this.event=event;
  }

  public String toString() {
    return "The "+handler+" doesn't support event "+event;
  }
}