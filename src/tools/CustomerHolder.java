package tools;

/**
* tools/CustomerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Tuesday, June 23, 2015 11:24:18 o'clock AM EDT
*/

public final class CustomerHolder implements org.omg.CORBA.portable.Streamable
{
  public tools.Customer value = null;

  public CustomerHolder ()
  {
  }

  public CustomerHolder (tools.Customer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tools.CustomerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tools.CustomerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tools.CustomerHelper.type ();
  }

}
