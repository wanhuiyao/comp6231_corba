package tools;


/**
* tools/Product.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Sunday, June 21, 2015 1:39:40 o'clock PM EDT
*/

public abstract class Product implements org.omg.CORBA.portable.StreamableValue
{
  public int productID = (int)0;
  public String manufacturerName = null;
  public String productType = null;
  public float unitPrice = (float)0;

  private static String[] _truncatable_ids = {
    tools.ProductHelper.id ()
  };

  public String[] _truncatable_ids() {
    return _truncatable_ids;
  }

  public void _read (org.omg.CORBA.portable.InputStream istream)
  {
    this.productID = istream.read_long ();
    this.manufacturerName = istream.read_string ();
    this.productType = istream.read_string ();
    this.unitPrice = istream.read_float ();
  }

  public void _write (org.omg.CORBA.portable.OutputStream ostream)
  {
    ostream.write_long (this.productID);
    ostream.write_string (this.manufacturerName);
    ostream.write_string (this.productType);
    ostream.write_float (this.unitPrice);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tools.ProductHelper.type ();
  }
} // class Product
