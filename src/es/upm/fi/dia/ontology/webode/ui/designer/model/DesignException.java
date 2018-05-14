package es.upm.fi.dia.ontology.webode.ui.designer.model;

/**
 * Exception to signal a design error condition.
 *
 * @author  Julio C�sar Arp�rez Vega
 * @version 1.0
 */
public class DesignException extends Exception
{
    public DesignException ()
    {
    }

    public DesignException (String msg)
    {
	super (msg);
    }
}
