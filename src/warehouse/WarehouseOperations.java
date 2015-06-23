package warehouse;


/**
* warehouse/WarehouseOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Tuesday, June 23, 2015 11:24:18 o'clock AM EDT
*/

public interface WarehouseOperations 
{
  tools.Item[] getProductsByID (int productID);

  // get the specific product by id, if null/empty, all returned
  tools.Item[] getProductsByType (String productType);

  // get a list of products by product type, if null/mpty,all returned
  tools.Item[] getProductsByRegisteredManufacturers (String manufacturerName);

  //get a list of products by manufacturer name,if null/empty, all returned
  tools.Item[] getProducts (int productID, String manufacturerName);
  boolean registerRetailer (String retailerName);
  boolean unregisterRegailer (String retailerName);
  tools.Item[] shippingGoods (tools.Item[] itemList);
  String getName ();
  void shutdown ();
} // interface WarehouseOperations
