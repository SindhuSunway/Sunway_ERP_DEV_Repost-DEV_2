package erp.inv.entities;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowSet;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 04 20:12:38 AST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvInventoryImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ItemCode,
        SerialNumber,
        Location,
        ProductCategory,
        Brand,
        ProductName,
        ItemType,
        ItemDescription,
        QuantityReceived,
        UnitSalePrice,
        DateReceived,
        SaleByDate,
        Minimum,
        Maximum,
        Notesremarks,
        Variance,
        VarianceReason,
        ProductStatus,
        QuantityOnHande,
        ItemPic,
        Quantitytotransfer,
        Tolocation,
        Transferdate,
        Transfernote,
        Transferreason,
        Transferstatus,
        RetailPrice,
        HrLookupTblView1,
        HrLookupTblView2,
        HrLookupTblView3;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int ITEMCODE = AttributesEnum.ItemCode.index();
    public static final int SERIALNUMBER = AttributesEnum.SerialNumber.index();
    public static final int LOCATION = AttributesEnum.Location.index();
    public static final int PRODUCTCATEGORY = AttributesEnum.ProductCategory.index();
    public static final int BRAND = AttributesEnum.Brand.index();
    public static final int PRODUCTNAME = AttributesEnum.ProductName.index();
    public static final int ITEMTYPE = AttributesEnum.ItemType.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int QUANTITYRECEIVED = AttributesEnum.QuantityReceived.index();
    public static final int UNITSALEPRICE = AttributesEnum.UnitSalePrice.index();
    public static final int DATERECEIVED = AttributesEnum.DateReceived.index();
    public static final int SALEBYDATE = AttributesEnum.SaleByDate.index();
    public static final int MINIMUM = AttributesEnum.Minimum.index();
    public static final int MAXIMUM = AttributesEnum.Maximum.index();
    public static final int NOTESREMARKS = AttributesEnum.Notesremarks.index();
    public static final int VARIANCE = AttributesEnum.Variance.index();
    public static final int VARIANCEREASON = AttributesEnum.VarianceReason.index();
    public static final int PRODUCTSTATUS = AttributesEnum.ProductStatus.index();
    public static final int QUANTITYONHANDE = AttributesEnum.QuantityOnHande.index();
    public static final int ITEMPIC = AttributesEnum.ItemPic.index();
    public static final int QUANTITYTOTRANSFER = AttributesEnum.Quantitytotransfer.index();
    public static final int TOLOCATION = AttributesEnum.Tolocation.index();
    public static final int TRANSFERDATE = AttributesEnum.Transferdate.index();
    public static final int TRANSFERNOTE = AttributesEnum.Transfernote.index();
    public static final int TRANSFERREASON = AttributesEnum.Transferreason.index();
    public static final int TRANSFERSTATUS = AttributesEnum.Transferstatus.index();
    public static final int RETAILPRICE = AttributesEnum.RetailPrice.index();
    public static final int HRLOOKUPTBLVIEW1 = AttributesEnum.HrLookupTblView1.index();
    public static final int HRLOOKUPTBLVIEW2 = AttributesEnum.HrLookupTblView2.index();
    public static final int HRLOOKUPTBLVIEW3 = AttributesEnum.HrLookupTblView3.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvInventoryImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erp.hr.entities.InvInventory");
    }

    /**
     * Gets the attribute value for ItemCode, using the alias name ItemCode.
     * @return the value of ItemCode
     */
    public String getItemCode() {
        return (String) getAttributeInternal(ITEMCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemCode.
     * @param value value to set the ItemCode
     */
    public void setItemCode(String value) {
        setAttributeInternal(ITEMCODE, value);
    }

    /**
     * Gets the attribute value for SerialNumber, using the alias name SerialNumber.
     * @return the value of SerialNumber
     */
    public BigDecimal getSerialNumber() {
        return (BigDecimal) getAttributeInternal(SERIALNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for SerialNumber.
     * @param value value to set the SerialNumber
     */
    public void setSerialNumber(BigDecimal value) {
        setAttributeInternal(SERIALNUMBER, value);
    }

    /**
     * Gets the attribute value for Location, using the alias name Location.
     * @return the value of Location
     */
    public String getLocation() {
        return (String) getAttributeInternal(LOCATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Location.
     * @param value value to set the Location
     */
    public void setLocation(String value) {
        setAttributeInternal(LOCATION, value);
    }

    /**
     * Gets the attribute value for ProductCategory, using the alias name ProductCategory.
     * @return the value of ProductCategory
     */
    public String getProductCategory() {
        return (String) getAttributeInternal(PRODUCTCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductCategory.
     * @param value value to set the ProductCategory
     */
    public void setProductCategory(String value) {
        setAttributeInternal(PRODUCTCATEGORY, value);
    }

    /**
     * Gets the attribute value for Brand, using the alias name Brand.
     * @return the value of Brand
     */
    public String getBrand() {
        return (String) getAttributeInternal(BRAND);
    }

    /**
     * Sets <code>value</code> as the attribute value for Brand.
     * @param value value to set the Brand
     */
    public void setBrand(String value) {
        setAttributeInternal(BRAND, value);
    }

    /**
     * Gets the attribute value for ProductName, using the alias name ProductName.
     * @return the value of ProductName
     */
    public String getProductName() {
        return (String) getAttributeInternal(PRODUCTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductName.
     * @param value value to set the ProductName
     */
    public void setProductName(String value) {
        setAttributeInternal(PRODUCTNAME, value);
    }

    /**
     * Gets the attribute value for ItemType, using the alias name ItemType.
     * @return the value of ItemType
     */
    public String getItemType() {
        return (String) getAttributeInternal(ITEMTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemType.
     * @param value value to set the ItemType
     */
    public void setItemType(String value) {
        setAttributeInternal(ITEMTYPE, value);
    }

    /**
     * Gets the attribute value for ItemDescription, using the alias name ItemDescription.
     * @return the value of ItemDescription
     */
    public String getItemDescription() {
        return (String) getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemDescription.
     * @param value value to set the ItemDescription
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for QuantityReceived, using the alias name QuantityReceived.
     * @return the value of QuantityReceived
     */
    public Integer getQuantityReceived() {
        return (Integer) getAttributeInternal(QUANTITYRECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for QuantityReceived.
     * @param value value to set the QuantityReceived
     * Set the Quantity on hand value which is dependent on QuantityReceived
     */
    public void setQuantityReceived(Integer value) {
        setAttributeInternal(QUANTITYRECEIVED, value);
        Integer quantityOnHand= 0;
                Integer quantityReceived =0; 
                Integer quantityOnHandUpdated= 0;
                quantityReceived=getQuantityReceived();
                quantityOnHand=getQuantityOnHande();
                try
                {
                quantityOnHandUpdated=(quantityReceived + quantityOnHand);
                    System.out.println(" quantityOnHandUpdated based on quantityReceived value");
                }
                catch (Exception e) {
                    System.out.println("Exception is"+e);
                }
                
                setQuantityOnHande(quantityOnHandUpdated);
    }

    /**
     * Gets the attribute value for UnitSalePrice, using the alias name UnitSalePrice.
     * @return the value of UnitSalePrice
     */
    public BigDecimal getUnitSalePrice() {
        return (BigDecimal) getAttributeInternal(UNITSALEPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitSalePrice.
     * @param value value to set the UnitSalePrice
     */
    public void setUnitSalePrice(BigDecimal value) {
        setAttributeInternal(UNITSALEPRICE, value);
    }

    /**
     * Gets the attribute value for DateReceived, using the alias name DateReceived.
     * @return the value of DateReceived
     */
    public Timestamp getDateReceived() {
        return (Timestamp) getAttributeInternal(DATERECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateReceived.
     * @param value value to set the DateReceived
     */
    public void setDateReceived(Timestamp value) {
        setAttributeInternal(DATERECEIVED, value);
    }

    /**
     * Gets the attribute value for SaleByDate, using the alias name SaleByDate.
     * @return the value of SaleByDate
     */
    public Timestamp getSaleByDate() {
        return (Timestamp) getAttributeInternal(SALEBYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SaleByDate.
     * @param value value to set the SaleByDate
     */
    public void setSaleByDate(Timestamp value) {
        setAttributeInternal(SALEBYDATE, value);
    }

    /**
     * Gets the attribute value for Minimum, using the alias name Minimum.
     * @return the value of Minimum
     */
    public BigDecimal getMinimum() {
        return (BigDecimal) getAttributeInternal(MINIMUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Minimum.
     * @param value value to set the Minimum
     */
    public void setMinimum(BigDecimal value) {
        setAttributeInternal(MINIMUM, value);
    }

    /**
     * Gets the attribute value for Maximum, using the alias name Maximum.
     * @return the value of Maximum
     */
    public BigDecimal getMaximum() {
        return (BigDecimal) getAttributeInternal(MAXIMUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Maximum.
     * @param value value to set the Maximum
     */
    public void setMaximum(BigDecimal value) {
        setAttributeInternal(MAXIMUM, value);
    }

    /**
     * Gets the attribute value for Notesremarks, using the alias name Notesremarks.
     * @return the value of Notesremarks
     */
    public String getNotesremarks() {
        return (String) getAttributeInternal(NOTESREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Notesremarks.
     * @param value value to set the Notesremarks
     */
    public void setNotesremarks(String value) {
        setAttributeInternal(NOTESREMARKS, value);
    }

    /**
     * Gets the attribute value for Variance, using the alias name Variance.
     * @return the value of Variance
     */
    public Integer getVariance() {
        return (Integer) getAttributeInternal(VARIANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Variance.
     * @param value value to set the Variance
     * Set the Quantity on hand value which is dependent on  variance value
     */
    public void setVariance(Integer value) {
        setAttributeInternal(VARIANCE, value);
        Integer quantityOnHand= 0;
                Integer variance =0; 
                Integer quantityOnHandUpdated= 0;
                variance=getVariance();
                quantityOnHand=getQuantityOnHande();
                try
                {
                quantityOnHandUpdated=(quantityOnHand - variance);
                    System.out.println(" quantityOnHandUpdated based on variance value");
                }
                catch (Exception e) {
                    System.out.println("Exception is"+e);
                }
                
                setQuantityOnHande(quantityOnHandUpdated);
    }

    /**
     * Gets the attribute value for VarianceReason, using the alias name VarianceReason.
     * @return the value of VarianceReason
     */
    public String getVarianceReason() {
        return (String) getAttributeInternal(VARIANCEREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for VarianceReason.
     * @param value value to set the VarianceReason
     */
    public void setVarianceReason(String value) {
        setAttributeInternal(VARIANCEREASON, value);
    }

    /**
     * Gets the attribute value for ProductStatus, using the alias name ProductStatus.
     * @return the value of ProductStatus
     */
    public String getProductStatus() {
        return (String) getAttributeInternal(PRODUCTSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductStatus.
     * @param value value to set the ProductStatus
     */
    public void setProductStatus(String value) {
        setAttributeInternal(PRODUCTSTATUS, value);
    }

    /**
     * Gets the attribute value for QuantityOnHande, using the alias name QuantityOnHande.
     * @return the value of QuantityOnHande
     */
    public Integer getQuantityOnHande() {
        return (Integer) getAttributeInternal(QUANTITYONHANDE);
    }

    /**
     * Sets <code>value</code> as the attribute value for QuantityOnHande.
     * @param value value to set the QuantityOnHande
     */
    public void setQuantityOnHande(Integer value) {
        setAttributeInternal(QUANTITYONHANDE, value);
    }

    /**
     * Gets the attribute value for ItemPic, using the alias name ItemPic.
     * @return the value of ItemPic
     */
    public BlobDomain getItemPic() {
        return (BlobDomain) getAttributeInternal(ITEMPIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemPic.
     * @param value value to set the ItemPic
     */
    public void setItemPic(BlobDomain value) {
        setAttributeInternal(ITEMPIC, value);
    }

    /**
     * Gets the attribute value for Quantitytotransfer, using the alias name Quantitytotransfer.
     * @return the value of Quantitytotransfer
     */
    public Integer getQuantitytotransfer() {
        return (Integer) getAttributeInternal(QUANTITYTOTRANSFER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantitytotransfer.
     * @param value value to set the Quantitytotransfer
     */
    public void setQuantitytotransfer(Integer value) {
        setAttributeInternal(QUANTITYTOTRANSFER, value);
    }

    /**
     * Gets the attribute value for Tolocation, using the alias name Tolocation.
     * @return the value of Tolocation
     */
    public String getTolocation() {
        return (String) getAttributeInternal(TOLOCATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Tolocation.
     * @param value value to set the Tolocation
     */
    public void setTolocation(String value) {
        setAttributeInternal(TOLOCATION, value);
    }

    /**
     * Gets the attribute value for Transferdate, using the alias name Transferdate.
     * @return the value of Transferdate
     */
    public Timestamp getTransferdate() {
        return (Timestamp) getAttributeInternal(TRANSFERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transferdate.
     * @param value value to set the Transferdate
     */
    public void setTransferdate(Timestamp value) {
        setAttributeInternal(TRANSFERDATE, value);
    }

    /**
     * Gets the attribute value for Transfernote, using the alias name Transfernote.
     * @return the value of Transfernote
     */
    public String getTransfernote() {
        return (String) getAttributeInternal(TRANSFERNOTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transfernote.
     * @param value value to set the Transfernote
     */
    public void setTransfernote(String value) {
        setAttributeInternal(TRANSFERNOTE, value);
    }

    /**
     * Gets the attribute value for Transferreason, using the alias name Transferreason.
     * @return the value of Transferreason
     */
    public String getTransferreason() {
        return (String) getAttributeInternal(TRANSFERREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transferreason.
     * @param value value to set the Transferreason
     */
    public void setTransferreason(String value) {
        setAttributeInternal(TRANSFERREASON, value);
    }

    /**
     * Gets the attribute value for Transferstatus, using the alias name Transferstatus.
     * @return the value of Transferstatus
     */
    public String getTransferstatus() {
        return (String) getAttributeInternal(TRANSFERSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transferstatus.
     * @param value value to set the Transferstatus
     */
    public void setTransferstatus(String value) {
        setAttributeInternal(TRANSFERSTATUS, value);
    }

    /**
     * Gets the attribute value for RetailPrice, using the alias name RetailPrice.
     * @return the value of RetailPrice
     */
    public BigDecimal getRetailPrice() {
        return (BigDecimal) getAttributeInternal(RETAILPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RetailPrice.
     * @param value value to set the RetailPrice
     */
    public void setRetailPrice(BigDecimal value) {
        setAttributeInternal(RETAILPRICE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HrLookupTblView1.
     */
    public RowSet getHrLookupTblView1() {
        return (RowSet) getAttributeInternal(HRLOOKUPTBLVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HrLookupTblView2.
     */
    public RowSet getHrLookupTblView2() {
        return (RowSet) getAttributeInternal(HRLOOKUPTBLVIEW2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HrLookupTblView3.
     */
    public RowSet getHrLookupTblView3() {
        return (RowSet) getAttributeInternal(HRLOOKUPTBLVIEW3);
    }

    /**
     * @param itemCode key constituent
     * @param serialNumber key constituent
     * @param location key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String itemCode, BigDecimal serialNumber, String location) {
        return new Key(new Object[] { itemCode, serialNumber, location });
    }


}

