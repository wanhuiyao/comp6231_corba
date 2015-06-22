package warehouse;


/**
* warehouse/WarehousePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Sunday, June 21, 2015 11:04:37 o'clock PM EDT
*/

public abstract class WarehousePOA extends org.omg.PortableServer.Servant
 implements warehouse.WarehouseOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getProductsByID", new java.lang.Integer (0));
    _methods.put ("getProductsByType", new java.lang.Integer (1));
    _methods.put ("getProductsByRegisteredManufacturers", new java.lang.Integer (2));
    _methods.put ("getProducts", new java.lang.Integer (3));
    _methods.put ("registerRetailer", new java.lang.Integer (4));
    _methods.put ("unregisterRegailer", new java.lang.Integer (5));
    _methods.put ("shippingGoods", new java.lang.Integer (6));
    _methods.put ("shutdown", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // warehouse/Warehouse/getProductsByID
       {
         String productID = in.read_string ();
         tools.Item $result[] = null;
         $result = this.getProductsByID (productID);
         out = $rh.createReply();
         tools.ItemListHelper.write (out, $result);
         break;
       }


  // get the specific product by id, if null/empty, all returned
       case 1:  // warehouse/Warehouse/getProductsByType
       {
         String productType = in.read_string ();
         tools.Item $result[] = null;
         $result = this.getProductsByType (productType);
         out = $rh.createReply();
         tools.ItemListHelper.write (out, $result);
         break;
       }


  // get a list of products by product type, if null/mpty,all returned
       case 2:  // warehouse/Warehouse/getProductsByRegisteredManufacturers
       {
         String manufacturerName = in.read_string ();
         tools.Item $result[] = null;
         $result = this.getProductsByRegisteredManufacturers (manufacturerName);
         out = $rh.createReply();
         tools.ItemListHelper.write (out, $result);
         break;
       }


  //get a list of products by manufacturer name,if null/empty, all returned
       case 3:  // warehouse/Warehouse/getProducts
       {
         String productID = in.read_string ();
         String manufacturerName = in.read_string ();
         tools.Item $result[] = null;
         $result = this.getProducts (productID, manufacturerName);
         out = $rh.createReply();
         tools.ItemListHelper.write (out, $result);
         break;
       }

       case 4:  // warehouse/Warehouse/registerRetailer
       {
         String retailerName = in.read_string ();
         boolean $result = false;
         $result = this.registerRetailer (retailerName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // warehouse/Warehouse/unregisterRegailer
       {
         String retailerName = in.read_string ();
         boolean $result = false;
         $result = this.unregisterRegailer (retailerName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 6:  // warehouse/Warehouse/shippingGoods
       {
         tools.Item itemList[] = tools.ItemListHelper.read (in);
         tools.Item $result[] = null;
         $result = this.shippingGoods (itemList);
         out = $rh.createReply();
         tools.ItemListHelper.write (out, $result);
         break;
       }

       case 7:  // warehouse/Warehouse/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:warehouse/Warehouse:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Warehouse _this() 
  {
    return WarehouseHelper.narrow(
    super._this_object());
  }

  public Warehouse _this(org.omg.CORBA.ORB orb) 
  {
    return WarehouseHelper.narrow(
    super._this_object(orb));
  }


} // class WarehousePOA
