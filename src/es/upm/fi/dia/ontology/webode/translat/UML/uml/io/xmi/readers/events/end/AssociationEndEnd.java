//Source file: D:\\Trabajo\\xmi\\uml\\io\\xmi\\events\\end\\AssociationEndEnd.java

package es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.events.end;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.events.*;
import es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.*;

public class AssociationEndEnd extends EndElement {

  /**
   * @param uri
   * @param name
   * @param qName
   */
  public AssociationEndEnd(String uri, String name, String qName) {
    super(uri,name,qName);
  }

  /**
   * @param handler
   */
  public void accept(EventHandler handler) throws EventNotSupported {
    handler.handle(this);
  }

  /**
   * @param handler
   * @param binder
   */
  public void accept(RegistrableEventHandler handler,
                     EventHandlerBinder      binder) {
    handler.accept(binder,this);
  }

  /**
   * @return String
   */
  public String toString() {
    return "AssociationEndEnd {"+qName+"}";
  }

  /**
   * @return String
   */
  public String prettyString() {
    return "AssociationEndEnd {uri='"+uri+"', name="+name+"', qName="+qName+"'}";
  }
}