package es.upm.fi.dia.ontology.webode.Inference;


import es.upm.fi.dia.ontology.minerva.server.services.*;


public class InferenceServiceConfiguration extends MinervaServiceConfiguration
{

  public String prologService; /* Traslate prolog service to use */
  public String connections; /* Number connections */
  public String prologPath; /*Ciao Path*/

  public InferenceServiceConfiguration() { super(true); }  //Pon�a false StATELESS

  public InferenceServiceConfiguration(String dbService, String prologService, String connections, String prologPath) {
    super(true);    //Pon�a false StATELESS
    this.prologService = prologService;
    this.connections = connections;
    this.prologPath = prologPath;
  }

}