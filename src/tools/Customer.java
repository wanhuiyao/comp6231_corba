package tools;


/**
* tools/Customer.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Monday, June 22, 2015 10:15:34 o'clock PM EDT
*/

public abstract class Customer implements org.omg.CORBA.portable.StreamableValue
{
  public int customerReferenceNumber = (int)0;
  public String name = null;
  public String password = null;
  public String street1 = null;
  public String street2 = null;
  public String city = null;
  public String state = null;
  public String zip = null;
  public String country = null;

  private static String[] _truncatable_ids = {
    tools.CustomerHelper.id ()
  };

  public String[] _truncatable_ids() {
    return _truncatable_ids;
  }

  public void _read (org.omg.CORBA.portable.InputStream istream)
  {
    this.customerReferenceNumber = istream.read_long ();
    this.name = istream.read_string ();
    this.password = istream.read_string ();
    this.street1 = istream.read_string ();
    this.street2 = istream.read_string ();
    this.city = istream.read_string ();
    this.state = istream.read_string ();
    this.zip = istream.read_string ();
    this.country = istream.read_string ();
  }

  public void _write (org.omg.CORBA.portable.OutputStream ostream)
  {
    ostream.write_long (this.customerReferenceNumber);
    ostream.write_string (this.name);
    ostream.write_string (this.password);
    ostream.write_string (this.street1);
    ostream.write_string (this.street2);
    ostream.write_string (this.city);
    ostream.write_string (this.state);
    ostream.write_string (this.zip);
    ostream.write_string (this.country);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tools.CustomerHelper.type ();
  }
} // class Customer
