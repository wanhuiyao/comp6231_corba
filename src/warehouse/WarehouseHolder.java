package warehouse;

/**
* warehouse/WarehouseHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Monday, June 22, 2015 10:15:34 o'clock PM EDT
*/

public final class WarehouseHolder implements org.omg.CORBA.portable.Streamable
{
  public warehouse.Warehouse value = null;

  public WarehouseHolder ()
  {
  }

  public WarehouseHolder (warehouse.Warehouse initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = warehouse.WarehouseHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    warehouse.WarehouseHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return warehouse.WarehouseHelper.type ();
  }

}
