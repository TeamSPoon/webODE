package es.upm.fi.dia.ontology.webode.OntoClean;

/**
 * 0 -> S�ncrono | 1 -> As�ncrono.
 *
 * @author  Julio C�sar Arp�rez Vega
 * @version 0.5
 */
public interface Predicates 
{
    public static final String[] PREDICATES = {"check_anti_rigid(Y,X).\n",
					       "check_anti_unity(Y,X).\n",
					       "check_carries_unity(Y,X).\n",
					       "check_identity(Y,X).\n",
					       "check_dependent(Y,X).\n"};    
}