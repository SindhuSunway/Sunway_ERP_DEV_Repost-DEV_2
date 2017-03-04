package erp.hr.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class InvInventoryViewSDOImpl extends SDODataObject implements InvInventoryViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 18;

   public InvInventoryViewSDOImpl() {}

   public java.lang.String getItemCode() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setItemCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getSerialNumber() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setSerialNumber(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLocation() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLocation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getCategory() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setCategory(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getBrand() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setBrand(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getProductName() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setProductName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getItemType() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setItemType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getItemDescription() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setItemDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getQuantityReceived() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setQuantityReceived(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getQuantityOnHande() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setQuantityOnHande(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getRetailPrice() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setRetailPrice(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getUnitSalePrice() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setUnitSalePrice(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.sql.Timestamp getDateReceived() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 12);
   }

   public void setDateReceived(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.sql.Timestamp getSaleByDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 13);
   }

   public void setSaleByDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.math.BigDecimal getMinimum() {
      return getBigDecimal(START_PROPERTY_INDEX + 14);
   }

   public void setMinimum(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.math.BigDecimal getMaximum() {
      return getBigDecimal(START_PROPERTY_INDEX + 15);
   }

   public void setMaximum(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getNotesremarks() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setNotesremarks(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.math.BigDecimal getVariance() {
      return getBigDecimal(START_PROPERTY_INDEX + 17);
   }

   public void setVariance(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.String getVarianceReason() {
      return getString(START_PROPERTY_INDEX + 18);
   }

   public void setVarianceReason(java.lang.String value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }


}

