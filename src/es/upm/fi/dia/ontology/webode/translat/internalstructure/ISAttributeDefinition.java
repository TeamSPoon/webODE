package es.upm.fi.dia.ontology.webode.translat.internalstructure;

import java.util.Vector;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;




public class ISAttributeDefinition extends ISStructureElement
{
  private String name;

  private String origin;			//This must be changed to VECTOR
  private String type;
  private String minimum_cardinality;
  private String maximum_cardinality;
  private String measurement_unit;
  private String precision;
  private Vector values;
  private Vector related_references;
  private Vector synonyms;
  private Vector abbreviations;
  private Vector related_formulas;
  private Vector inferreds;
  private String value;

  public ISAttributeDefinition (String definition_name,String definition_origin,
                                String definition_type,String definition_maximum_cardinality, String definition_minimum_cardinality)
  {
    name=definition_name;
    origin=definition_origin;
    type=definition_type;
    maximum_cardinality=definition_maximum_cardinality;
    minimum_cardinality=definition_minimum_cardinality;
    related_references= new Vector();
    values = new Vector();
    synonyms = new Vector();
    abbreviations= new Vector();
    related_formulas= new Vector();
    inferreds = new Vector();
  }


  public void setMaxCardinality (String max)
  {
    maximum_cardinality=max;
  }


  public String getMaxCardinality()
  {
    return maximum_cardinality;
  }

  public Node obtainXML (Document owner_document)
  {

    Element definition_element= owner_document.createElement("Attribute-Definition");

  /*
    if (name!=null)
       addElement(owner_document,definition_element,"Name",name);

    if (description!=null)
       addElement(owner_document,definition_element,"Description",description);

    if (origin!=null)
       addElement(owner_document,definition_element,"Origin",origin);

    if (destination!=null)
       addElement(owner_document,definition_element,"Destination",destination);

    if (maximum_cardinality!=null)
    addElement(owner_document,definition_element,"Maximum-Cardinality",maximum_cardinality);

 for (Enumeration e = related_references.elements() ; e.hasMoreElements() ;)
  addElement (owner_document,definition_element,"Related-Reference",(String)(e.nextElement()));

 for (Enumeration e = related_properties.elements() ; e.hasMoreElements() ;)
  addElement (owner_document,definition_element,"Related-Property",(String)(e.nextElement()));

    */
    return definition_element;


  }

  public ISInstanceAttributeDescriptor obtainInstanceAttributeDescriptor ()
  {
    ISInstanceAttributeDescriptor instance_attr;
    instance_attr= (new ISInstanceAttributeDescriptor(name,type,minimum_cardinality,maximum_cardinality));
    instance_attr.setDescription(description);
    return instance_attr;
  }



  public String getName()
  {
    return name;
  }

  public void setName(String definition_name)
  {
    name=definition_name;
  }

  public String getOrigin()
  {
    return origin;
  }

  public void setOrigin(String origin_name)
  {
    origin=origin_name;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String definition_type)
  {
    type=definition_type;
  }
}