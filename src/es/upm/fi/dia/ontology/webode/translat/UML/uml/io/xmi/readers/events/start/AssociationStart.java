//Source file: D:\\Trabajo\\xmi\\uml\\io\\xmi\\events\\start\\AssociationStart.java

package es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.events.start;

/**
 * <p>Title: Sistema de Importaci�n y Exportaci�n de Ontolog�as a UML</p>
 * <p>Description: Trabajo Fin de Carrera</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Laboratorio de Inteligencia Artificial - Grupo de Ontolog�as</p>
 * @author Miguel Esteban Guti�rrez
 * @version 1.0
 */

import org.xml.sax.*;

//import o2u.*;

import es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.events.*;
import es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.*;
import es.upm.fi.dia.ontology.webode.translat.UML.uml.io.xmi.readers.tools.*;

public class AssociationStart extends StartElement {

  /**
   * @param uri
   * @param name
   * @param qName
   * @param atts
   */
  public AssociationStart(String uri, String name, String qName, Attributes atts) {
    super(uri,name,qName,atts);
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
    return "AssociationStart {"+qName+"}";
  }

  /**
   * @return String
   */
  public String prettyString() {
    return "AssociationStart {uri='"+uri+
                      "', name='"+name+
                      "', qName='"+qName+
                      "', atts="+new AttributePrettyPrinter(atts)+"}";
  }
}
