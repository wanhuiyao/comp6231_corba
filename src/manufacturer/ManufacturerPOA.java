package manufacturer;


/**
* manufacturer/ManufacturerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Monday, June 22, 2015 10:15:34 o'clock PM EDT
*/

public abstract class ManufacturerPOA extends org.omg.PortableServer.Servant
 implements manufacturer.ManufacturerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("processPurchaseOrder", new java.lang.Integer (0));
    _methods.put ("getProductInfo", new java.lang.Integer (1));
    _methods.put ("receivePayment", new java.lang.Integer (2));
    _methods.put ("getProductList", new java.lang.Integer (3));
    _methods.put ("shutdown", new java.lang.Integer (4));
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
       case 0:  // manufacturer/Manufacturer/processPurchaseOrder
       {
         tools.Item item = tools.ItemHelper.read (in);
         String $result = null;
         $result = this.processPurchaseOrder (item);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // manufacturer/Manufacturer/getProductInfo
       {
         String aProdName = in.read_string ();
         tools.Product $result = null;
         $result = this.getProductInfo (aProdName);
         out = $rh.createReply();
         tools.ProductHelper.write (out, $result);
         break;
       }

       case 2:  // manufacturer/Manufacturer/receivePayment
       {
         String orderNum = in.read_string ();
         float totalPrice = in.read_float ();
         boolean $result = false;
         $result = this.receivePayment (orderNum, totalPrice);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // manufacturer/Manufacturer/getProductList
       {
         tools.Product $result[] = null;
         $result = this.getProductList ();
         out = $rh.createReply();
         tools.ProductListHelper.write (out, $result);
         break;
       }

       case 4:  // manufacturer/Manufacturer/shutdown
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
    "IDL:manufacturer/Manufacturer:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Manufacturer _this() 
  {
    return ManufacturerHelper.narrow(
    super._this_object());
  }

  public Manufacturer _this(org.omg.CORBA.ORB orb) 
  {
    return ManufacturerHelper.narrow(
    super._this_object(orb));
  }


} // class ManufacturerPOA
