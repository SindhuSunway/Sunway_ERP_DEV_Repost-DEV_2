package erp.inv.views;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 19 11:08:22 AST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvInventoryViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_INVINVENTORY = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ItemCode,
        SerialNumber,
        Location,
        Category,
        Brand,
        ProductName,
        ItemType,
        ItemDescription,
        QuantityReceived,
        QuantityOnHande,
        RetailPrice,
        UnitSalePrice,
        DateReceived,
        SaleByDate,
        Minimum,
        Maximum,
        Notesremarks,
        Variance,
        VarianceReason,
        InvTransfersView,
        InvSalesView,
        InvSaleItemsView,
        InvOrdersView,
        InvInventoryView1,
        InvInventoryView2;
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
    public static final int CATEGORY = AttributesEnum.Category.index();
    public static final int BRAND = AttributesEnum.Brand.index();
    public static final int PRODUCTNAME = AttributesEnum.ProductName.index();
    public static final int ITEMTYPE = AttributesEnum.ItemType.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int QUANTITYRECEIVED = AttributesEnum.QuantityReceived.index();
    public static final int QUANTITYONHANDE = AttributesEnum.QuantityOnHande.index();
    public static final int RETAILPRICE = AttributesEnum.RetailPrice.index();
    public static final int UNITSALEPRICE = AttributesEnum.UnitSalePrice.index();
    public static final int DATERECEIVED = AttributesEnum.DateReceived.index();
    public static final int SALEBYDATE = AttributesEnum.SaleByDate.index();
    public static final int MINIMUM = AttributesEnum.Minimum.index();
    public static final int MAXIMUM = AttributesEnum.Maximum.index();
    public static final int NOTESREMARKS = AttributesEnum.Notesremarks.index();
    public static final int VARIANCE = AttributesEnum.Variance.index();
    public static final int VARIANCEREASON = AttributesEnum.VarianceReason.index();
    public static final int INVTRANSFERSVIEW = AttributesEnum.InvTransfersView.index();
    public static final int INVSALESVIEW = AttributesEnum.InvSalesView.index();
    public static final int INVSALEITEMSVIEW = AttributesEnum.InvSaleItemsView.index();
    public static final int INVORDERSVIEW = AttributesEnum.InvOrdersView.index();
    public static final int INVINVENTORYVIEW1 = AttributesEnum.InvInventoryView1.index();
    public static final int INVINVENTORYVIEW2 = AttributesEnum.InvInventoryView2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvInventoryViewRowImpl() {
    }

    /**
     * Gets InvInventory entity object.
     * @return the InvInventory
     */
    public EntityImpl getInvInventory() {
        return (EntityImpl) getEntity(ENTITY_INVINVENTORY);
    }

    /**
     * Gets the attribute value for ITEM_CODE using the alias name ItemCode.
     * @return the ITEM_CODE
     */
    public String getItemCode() {
        return (String) getAttributeInternal(ITEMCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_CODE using the alias name ItemCode.
     * @param value value to set the ITEM_CODE
     */
    public void setItemCode(String value) {
        setAttributeInternal(ITEMCODE, value);
    }

    /**
     * Gets the attribute value for SERIAL_NUMBER using the alias name SerialNumber.
     * @return the SERIAL_NUMBER
     */
    public BigDecimal getSerialNumber() {
        return (BigDecimal) getAttributeInternal(SERIALNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for SERIAL_NUMBER using the alias name SerialNumber.
     * @param value value to set the SERIAL_NUMBER
     */
    public void setSerialNumber(BigDecimal value) {
        setAttributeInternal(SERIALNUMBER, value);
    }

    /**
     * Gets the attribute value for LOCATION using the alias name Location.
     * @return the LOCATION
     */
    public String getLocation() {
        return (String) getAttributeInternal(LOCATION);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION using the alias name Location.
     * @param value value to set the LOCATION
     */
    public void setLocation(String value) {
        setAttributeInternal(LOCATION, value);
    }

    /**
     * Gets the attribute value for PRODUCT_CATEGORY using the alias name Category.
     * @return the PRODUCT_CATEGORY
     */
    public String getCategory() {
        return (String) getAttributeInternal(CATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_CATEGORY using the alias name Category.
     * @param value value to set the PRODUCT_CATEGORY
     */
    public void setCategory(String value) {
        setAttributeInternal(CATEGORY, value);
    }

    /**
     * Gets the attribute value for BRAND using the alias name Brand.
     * @return the BRAND
     */
    public String getBrand() {
        return (String) getAttributeInternal(BRAND);
    }

    /**
     * Sets <code>value</code> as attribute value for BRAND using the alias name Brand.
     * @param value value to set the BRAND
     */
    public void setBrand(String value) {
        setAttributeInternal(BRAND, value);
    }

    /**
     * Gets the attribute value for PRODUCT_NAME using the alias name ProductName.
     * @return the PRODUCT_NAME
     */
    public String getProductName() {
        return (String) getAttributeInternal(PRODUCTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_NAME using the alias name ProductName.
     * @param value value to set the PRODUCT_NAME
     */
    public void setProductName(String value) {
        setAttributeInternal(PRODUCTNAME, value);
    }

    /**
     * Gets the attribute value for ITEM_TYPE using the alias name ItemType.
     * @return the ITEM_TYPE
     */
    public String getItemType() {
        return (String) getAttributeInternal(ITEMTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_TYPE using the alias name ItemType.
     * @param value value to set the ITEM_TYPE
     */
    public void setItemType(String value) {
        setAttributeInternal(ITEMTYPE, value);
    }

    /**
     * Gets the attribute value for ITEM_DESCRIPTION using the alias name ItemDescription.
     * @return the ITEM_DESCRIPTION
     */
    public String getItemDescription() {
        return (String) getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_DESCRIPTION using the alias name ItemDescription.
     * @param value value to set the ITEM_DESCRIPTION
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for QUANTITY_RECEIVED using the alias name QuantityReceived.
     * @return the QUANTITY_RECEIVED
     */
    public BigDecimal getQuantityReceived() {
        return (BigDecimal) getAttributeInternal(QUANTITYRECEIVED);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY_RECEIVED using the alias name QuantityReceived.
     * @param value value to set the QUANTITY_RECEIVED
     */
    public void setQuantityReceived(BigDecimal value) {
        setAttributeInternal(QUANTITYRECEIVED, value);
    }

    /**
     * Gets the attribute value for QUANTITY_ON_HANDE using the alias name QuantityOnHande.
     * @return the QUANTITY_ON_HANDE
     */
    public String getQuantityOnHande() {
        return (String) getAttributeInternal(QUANTITYONHANDE);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY_ON_HANDE using the alias name QuantityOnHande.
     * @param value value to set the QUANTITY_ON_HANDE
     */
    public void setQuantityOnHande(String value) {
        setAttributeInternal(QUANTITYONHANDE, value);
    }

    /**
     * Gets the attribute value for RETAIL_PRICE using the alias name RetailPrice.
     * @return the RETAIL_PRICE
     */
    public String getRetailPrice() {
        return (String) getAttributeInternal(RETAILPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for RETAIL_PRICE using the alias name RetailPrice.
     * @param value value to set the RETAIL_PRICE
     */
    public void setRetailPrice(String value) {
        setAttributeInternal(RETAILPRICE, value);
    }

    /**
     * Gets the attribute value for UNIT_SALE_PRICE using the alias name UnitSalePrice.
     * @return the UNIT_SALE_PRICE
     */
    public BigDecimal getUnitSalePrice() {
        return (BigDecimal) getAttributeInternal(UNITSALEPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_SALE_PRICE using the alias name UnitSalePrice.
     * @param value value to set the UNIT_SALE_PRICE
     */
    public void setUnitSalePrice(BigDecimal value) {
        setAttributeInternal(UNITSALEPRICE, value);
    }

    /**
     * Gets the attribute value for DATE_RECEIVED using the alias name DateReceived.
     * @return the DATE_RECEIVED
     */
    public Timestamp getDateReceived() {
        return (Timestamp) getAttributeInternal(DATERECEIVED);
    }

    /**
     * Sets <code>value</code> as attribute value for DATE_RECEIVED using the alias name DateReceived.
     * @param value value to set the DATE_RECEIVED
     */
    public void setDateReceived(Timestamp value) {
        setAttributeInternal(DATERECEIVED, value);
    }

    /**
     * Gets the attribute value for SALE_BY_DATE using the alias name SaleByDate.
     * @return the SALE_BY_DATE
     */
    public Timestamp getSaleByDate() {
        return (Timestamp) getAttributeInternal(SALEBYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SALE_BY_DATE using the alias name SaleByDate.
     * @param value value to set the SALE_BY_DATE
     */
    public void setSaleByDate(Timestamp value) {
        setAttributeInternal(SALEBYDATE, value);
    }

    /**
     * Gets the attribute value for MINIMUM using the alias name Minimum.
     * @return the MINIMUM
     */
    public BigDecimal getMinimum() {
        return (BigDecimal) getAttributeInternal(MINIMUM);
    }

    /**
     * Sets <code>value</code> as attribute value for MINIMUM using the alias name Minimum.
     * @param value value to set the MINIMUM
     */
    public void setMinimum(BigDecimal value) {
        setAttributeInternal(MINIMUM, value);
    }

    /**
     * Gets the attribute value for MAXIMUM using the alias name Maximum.
     * @return the MAXIMUM
     */
    public BigDecimal getMaximum() {
        return (BigDecimal) getAttributeInternal(MAXIMUM);
    }

    /**
     * Sets <code>value</code> as attribute value for MAXIMUM using the alias name Maximum.
     * @param value value to set the MAXIMUM
     */
    public void setMaximum(BigDecimal value) {
        setAttributeInternal(MAXIMUM, value);
    }

    /**
     * Gets the attribute value for NOTESREMARKS using the alias name Notesremarks.
     * @return the NOTESREMARKS
     */
    public String getNotesremarks() {
        return (String) getAttributeInternal(NOTESREMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTESREMARKS using the alias name Notesremarks.
     * @param value value to set the NOTESREMARKS
     */
    public void setNotesremarks(String value) {
        setAttributeInternal(NOTESREMARKS, value);
    }

    /**
     * Gets the attribute value for VARIANCE using the alias name Variance.
     * @return the VARIANCE
     */
    public BigDecimal getVariance() {
        return (BigDecimal) getAttributeInternal(VARIANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for VARIANCE using the alias name Variance.
     * @param value value to set the VARIANCE
     */
    public void setVariance(BigDecimal value) {
        setAttributeInternal(VARIANCE, value);
    }

    /**
     * Gets the attribute value for VARIANCE_REASON using the alias name VarianceReason.
     * @return the VARIANCE_REASON
     */
    public String getVarianceReason() {
        return (String) getAttributeInternal(VARIANCEREASON);
    }

    /**
     * Sets <code>value</code> as attribute value for VARIANCE_REASON using the alias name VarianceReason.
     * @param value value to set the VARIANCE_REASON
     */
    public void setVarianceReason(String value) {
        setAttributeInternal(VARIANCEREASON, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvTransfersView.
     */
    public RowIterator getInvTransfersView() {
        return (RowIterator) getAttributeInternal(INVTRANSFERSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvSalesView.
     */
    public RowIterator getInvSalesView() {
        return (RowIterator) getAttributeInternal(INVSALESVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvSaleItemsView.
     */
    public RowIterator getInvSaleItemsView() {
        return (RowIterator) getAttributeInternal(INVSALEITEMSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvOrdersView.
     */
    public RowIterator getInvOrdersView() {
        return (RowIterator) getAttributeInternal(INVORDERSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> InvInventoryView1.
     */
    public RowSet getInvInventoryView1() {
        return (RowSet) getAttributeInternal(INVINVENTORYVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> InvInventoryView2.
     */
    public RowSet getInvInventoryView2() {
        return (RowSet) getAttributeInternal(INVINVENTORYVIEW2);
    }
}

