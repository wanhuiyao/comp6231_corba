package warehouse;


/**
* warehouse/WarehouseOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from supplyChain.idl
* Sunday, June 21, 2015 1:39:40 o'clock PM EDT
*/

public interface WarehouseOperations 
{
  tools.Item[] getProductsByID (String productID);

  // get the specific product by id, if null/empty, all returned
  tools.Item[] getProductsByType (String productType);

  // get a list of products by product type, if null/mpty,all returned
  tools.Item[] getProductsByRegisteredManufacturers (String manufacturerName);

  //get a list of products by manufacturer name,if null/empty, all returned
  tools.Item[] getProducts (String productID, String manufacturerName);
  boolean registerRetailer (String retailerName);
  boolean unregisterRegailer (String retailerName);
  tools.Item[] shippingGoods (tools.Item[] itemList);
} // interface WarehouseOperations
