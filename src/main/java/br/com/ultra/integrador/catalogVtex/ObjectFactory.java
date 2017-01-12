
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.testevtex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfIntegrationWarehouseDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfIntegrationWarehouseDTO");
    private final static QName _ArrayOfOrderInvoiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderInvoiceDTO");
    private final static QName _FieldDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FieldDTO");
    private final static QName _ProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductDTO");
    private final static QName _OrderStatusDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderStatusDTO");
    private final static QName _DistributionCenterDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DistributionCenterDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfOrderItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderItemDTO");
    private final static QName _ArrayOfStockKeepingUnitEanDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitEanDTO");
    private final static QName _ArrayOfIntegrationInterfaceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfIntegrationInterfaceDTO");
    private final static QName _ArrayOfOrderDeliveryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderDeliveryDTO");
    private final static QName _ArrayOfFreightStockKeepingUnitContextDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfFreightStockKeepingUnitContextDTO");
    private final static QName _OrderInteractionDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderInteractionDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfGiftListMemberDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfGiftListMemberDTO");
    private final static QName _DateTimeOffset_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "DateTimeOffset");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfFreightScheduledDateOptionDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfFreightScheduledDateOptionDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _GiftListTypeDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListTypeDTO");
    private final static QName _GiftCardTransactionItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardTransactionItemDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _CategoryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CategoryDTO");
    private final static QName _StockKeepingUnitEanDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitEanDTO");
    private final static QName _PaymentDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentDTO");
    private final static QName _ArrayOfClientDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfClientDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _GiftListStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListStockKeepingUnitDTO");
    private final static QName _FreightScheduledDateOptionDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightScheduledDateOptionDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _IntegrationDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IntegrationDTO");
    private final static QName _ProductFieldIdDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductFieldIdDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _IntegrationWarehouseDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IntegrationWarehouseDTO");
    private final static QName _ArrayOfFreightDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfFreightDTO");
    private final static QName _IntegrationErrorDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IntegrationErrorDTO");
    private final static QName _ArrayOfStockKeepingUnitKitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitKitDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ArrayOfProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfProductDTO");
    private final static QName _ArrayOfGiftListDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfGiftListDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _OrderDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderDTO");
    private final static QName _StockKeepingUnitKitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitKitDTO");
    private final static QName _ZipCodeDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ZipCodeDTO");
    private final static QName _StockKeepingUnitComplementDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitComplementDTO");
    private final static QName _ArrayOfIntegrationErrorDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfIntegrationErrorDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _TransactionAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TransactionAction");
    private final static QName _BrandDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "BrandDTO");
    private final static QName _ArrayOfOrderDiscountDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderDiscountDTO");
    private final static QName _ArrayOfOrderInvoiceStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderInvoiceStockKeepingUnitDTO");
    private final static QName _AddressDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressDTO");
    private final static QName _StockKeepingUnitFieldNameDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitFieldNameDTO");
    private final static QName _ArrayOfPaymentDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfPaymentDTO");
    private final static QName _AddressOrderDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressOrderDTO");
    private final static QName _StockKeepingUnitQuantityDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitQuantityDTO");
    private final static QName _ArrayOfGiftListStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfGiftListStockKeepingUnitDTO");
    private final static QName _OrderInvoiceStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderInvoiceStockKeepingUnitDTO");
    private final static QName _ArrayOfOrderDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderDTO");
    private final static QName _ErrorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ErrorType");
    private final static QName _ArrayOfImageDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfImageDTO");
    private final static QName _ServicePriceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ServicePriceDTO");
    private final static QName _OrderPaymentDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderPaymentDTO");
    private final static QName _StockKeepingUnitComplementDTOComplementTypeEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitComplementDTO.ComplementTypeEnum");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _OrderDiscountDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderDiscountDTO");
    private final static QName _ArrayOfOrderInteractionDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderInteractionDTO");
    private final static QName _NewsletterDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "NewsletterDTO");
    private final static QName _OrderItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderItemDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ArrayOfOrderPaymentDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderPaymentDTO");
    private final static QName _AddressDTO2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressDTO2");
    private final static QName _ArrayOfServicePriceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfServicePriceDTO");
    private final static QName _StoreDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StoreDTO");
    private final static QName _ArrayOfOrderItemServiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderItemServiceDTO");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _StockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitDTO");
    private final static QName _GiftListMemberDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListMemberDTO");
    private final static QName _ArrayOfOrderStatusDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderStatusDTO");
    private final static QName _OrderInvoiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderInvoiceDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfWareHouseIStockableDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfWareHouseIStockableDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _GiftListDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListDTO");
    private final static QName _OrderItemServiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderItemServiceDTO");
    private final static QName _ArrayOfOrderItemDiscountDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfOrderItemDiscountDTO");
    private final static QName _FreightStockKeepingUnitContextDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightStockKeepingUnitContextDTO");
    private final static QName _ArrayOfStoreDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStoreDTO");
    private final static QName _OrderInteractionDTOStatusIdEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderInteractionDTO.StatusIdEnum");
    private final static QName _FreightStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightStockKeepingUnitDTO");
    private final static QName _ArrayOfStockKeepingUnitServiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitServiceDTO");
    private final static QName _ServiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ServiceDTO");
    private final static QName _ArrayOfNewsletterDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfNewsletterDTO");
    private final static QName _ArrayOfProductFieldIdDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfProductFieldIdDTO");
    private final static QName _ClientDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ClientDTO");
    private final static QName _ArrayOfFreightStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfFreightStockKeepingUnitDTO");
    private final static QName _FreightDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightDTO");
    private final static QName _ImageDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ImageDTO");
    private final static QName _ArrayOfStockKeepingUnitFieldNameDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitFieldNameDTO");
    private final static QName _StockKeepingUnitServiceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitServiceDTO");
    private final static QName _ArrayOfFieldDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfFieldDTO");
    private final static QName _ArrayOfAddressDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfAddressDTO");
    private final static QName _OrderDeliveryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderDeliveryDTO");
    private final static QName _GiftCardDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardDTO");
    private final static QName _ArrayOfStockKeepingUnitQuantityDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitQuantityDTO");
    private final static QName _ArrayOfAddressDTO2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfAddressDTO2");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _IntegrationInterfaceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IntegrationInterfaceDTO");
    private final static QName _ProductFieldNameDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductFieldNameDTO");
    private final static QName _ArrayOfProductFieldNameDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfProductFieldNameDTO");
    private final static QName _ArrayOfStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitDTO");
    private final static QName _OrderItemDiscountDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderItemDiscountDTO");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WareHouseIStockableDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WareHouseIStockableDTO");
    private final static QName _ProductGetAllFromUpdatedDateAndIdResponseProductGetAllFromUpdatedDateAndIdResult_QNAME = new QName("http://tempuri.org/", "ProductGetAllFromUpdatedDateAndIdResult");
    private final static QName _ServicePriceInsertUpdateResponseServicePriceInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "ServicePriceInsertUpdateResult");
    private final static QName _ServicePriceInsertUpdateResponseServicePriceId_QNAME = new QName("http://tempuri.org/", "servicePriceId");
    private final static QName _BrandGetResponseBrandGetResult_QNAME = new QName("http://tempuri.org/", "BrandGetResult");
    private final static QName _ProductEspecificationInsertByListListProductFieldName_QNAME = new QName("http://tempuri.org/", "listProductFieldName");
    private final static QName _CategoryInsertUpdateResponseCategoryInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "CategoryInsertUpdateResult");
    private final static QName _IntegrationSettingsResponseIntegrationSettingsResult_QNAME = new QName("http://tempuri.org/", "IntegrationSettingsResult");
    private final static QName _StockKeepingUnitInsertUpdateResponseStockKeepingUnitInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitInsertUpdateResult");
    private final static QName _ServicePriceListResponseServicePriceListResult_QNAME = new QName("http://tempuri.org/", "ServicePriceListResult");
    private final static QName _StockKeepingUnitImageRemoveByNameImageName_QNAME = new QName("http://tempuri.org/", "imageName");
    private final static QName _StoreDTOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Name");
    private final static QName _StoreDTOId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Id");
    private final static QName _StoreDTOIsActive_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsActive");
    private final static QName _ServicePriceInsertUpdateServicePrice_QNAME = new QName("http://tempuri.org/", "servicePrice");
    private final static QName _GiftListGetTypeResponseGiftListGetTypeResult_QNAME = new QName("http://tempuri.org/", "GiftListGetTypeResult");
    private final static QName _GiftListGetByGiftedResponseGiftListGetByGiftedResult_QNAME = new QName("http://tempuri.org/", "GiftListGetByGiftedResult");
    private final static QName _IntegrationErrorGetAllByErrorTypeAndIdResponseIntegrationErrorGetAllByErrorTypeAndIdResult_QNAME = new QName("http://tempuri.org/", "IntegrationErrorGetAllByErrorTypeAndIdResult");
    private final static QName _ClientGetByEmailV3ResponseClientGetByEmailV3Result_QNAME = new QName("http://tempuri.org/", "ClientGetByEmailV3Result");
    private final static QName _GiftListInsertUpdateGiftList_QNAME = new QName("http://tempuri.org/", "giftList");
    private final static QName _BrandGetByNameNameBrand_QNAME = new QName("http://tempuri.org/", "nameBrand");
    private final static QName _ImageServiceInsertUpdateUrlImage_QNAME = new QName("http://tempuri.org/", "urlImage");
    private final static QName _ImageServiceInsertUpdateFileId_QNAME = new QName("http://tempuri.org/", "fileId");
    private final static QName _StoreListResponseStoreListResult_QNAME = new QName("http://tempuri.org/", "StoreListResult");
    private final static QName _OrderPaymentGetAllResponseOrderPaymentGetAllResult_QNAME = new QName("http://tempuri.org/", "OrderPaymentGetAllResult");
    private final static QName _StockKeepingUnitKitInsertUpdateStockKeepingUnitKit_QNAME = new QName("http://tempuri.org/", "stockKeepingUnitKit");
    private final static QName _WareHouseIStockableUpdateV3WareHouseId_QNAME = new QName("http://tempuri.org/", "wareHouseId");
    private final static QName _OrderGetByStatusResponseOrderGetByStatusResult_QNAME = new QName("http://tempuri.org/", "OrderGetByStatusResult");
    private final static QName _OrderGetByStatusByQuantityStatusOrder_QNAME = new QName("http://tempuri.org/", "statusOrder");
    private final static QName _GiftListGetAllFromCreatedDateAndIdResponseGiftListGetAllFromCreatedDateAndIdResult_QNAME = new QName("http://tempuri.org/", "GiftListGetAllFromCreatedDateAndIdResult");
    private final static QName _IntegrationDTOAbacosWebService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AbacosWebService");
    private final static QName _IntegrationDTOIVDecryptKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IVDecryptKey");
    private final static QName _IntegrationDTOAbacosDecryptKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AbacosDecryptKey");
    private final static QName _IntegrationDTOAbacosKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AbacosKey");
    private final static QName _IntegrationDTOPaymentIdWithoutTaxes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentIdWithoutTaxes");
    private final static QName _IntegrationDTOIntegrationWarehouse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IntegrationWarehouse");
    private final static QName _IntegrationDTOClientName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ClientName");
    private final static QName _IntegrationDTOOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderStatus");
    private final static QName _IntegrationDTOVtexDecryptKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "VtexDecryptKey");
    private final static QName _GiftCardDTOEmissionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EmissionDate");
    private final static QName _GiftCardDTOStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StatusId");
    private final static QName _GiftCardDTOOwnerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OwnerId");
    private final static QName _GiftCardDTOExpiringDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ExpiringDate");
    private final static QName _GiftCardDTORedeptionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RedeptionCode");
    private final static QName _GiftListSkuDeleteByListSkuQuantity_QNAME = new QName("http://tempuri.org/", "skuQuantity");
    private final static QName _StockKeepingUnitGetByRefIdRefId_QNAME = new QName("http://tempuri.org/", "refId");
    private final static QName _AddressGetByClientIdV2ResponseAddressGetByClientIdV2Result_QNAME = new QName("http://tempuri.org/", "AddressGetByClientIdV2Result");
    private final static QName _ProductGetByRefIdResponseProductGetByRefIdResult_QNAME = new QName("http://tempuri.org/", "ProductGetByRefIdResult");
    private final static QName _StockKeepingUnitKitInsertUpdateResponseStockKeepingUnitKitId_QNAME = new QName("http://tempuri.org/", "stockKeepingUnitKitId");
    private final static QName _StockKeepingUnitKitInsertUpdateResponseStockKeepingUnitKitInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitKitInsertUpdateResult");
    private final static QName _StockKeepingUnitEspecificationListBySkuIdResponseStockKeepingUnitEspecificationListBySkuIdResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitEspecificationListBySkuIdResult");
    private final static QName _OrderChangeTrackingNumberV3InvoiceNumber_QNAME = new QName("http://tempuri.org/", "invoiceNumber");
    private final static QName _OrderChangeTrackingNumberV3TrackingNumber_QNAME = new QName("http://tempuri.org/", "trackingNumber");
    private final static QName _FreightCalculateV3ResponseFreightCalculateV3Result_QNAME = new QName("http://tempuri.org/", "FreightCalculateV3Result");
    private final static QName _StockKeepingUnitGetAllFromUpdatedDateAndIdStartingStockKeepingUnitId_QNAME = new QName("http://tempuri.org/", "startingStockKeepingUnitId");
    private final static QName _OrderDiscountDTOOrderId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderId");
    private final static QName _OrderDiscountDTOSkuId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "SkuId");
    private final static QName _OrderDiscountDTODiscountId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DiscountId");
    private final static QName _OrderGetResponseOrderGetResult_QNAME = new QName("http://tempuri.org/", "OrderGetResult");
    private final static QName _IntegrationInterfaceGetAllResponseIntegrationInterfaceGetAllResult_QNAME = new QName("http://tempuri.org/", "IntegrationInterfaceGetAllResult");
    private final static QName _StockKeepingUnitGetResponseStockKeepingUnitGetResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetResult");
    private final static QName _ClientGetByCPFResponseClientGetByCPFResult_QNAME = new QName("http://tempuri.org/", "ClientGetByCPFResult");
    private final static QName _ImageListByStockKeepingUnitIdResponseImageListByStockKeepingUnitIdResult_QNAME = new QName("http://tempuri.org/", "ImageListByStockKeepingUnitIdResult");
    private final static QName _ClientGetAllFromCreatedDateAndIdStartingClientId_QNAME = new QName("http://tempuri.org/", "startingClientId");
    private final static QName _GiftListStockKeepingUnitDTOInsertedByProfileSystemUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InsertedByProfileSystemUserId");
    private final static QName _GiftListStockKeepingUnitDTOOrderMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderMessage");
    private final static QName _GiftListStockKeepingUnitDTOWishedByProfileSystemUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WishedByProfileSystemUserId");
    private final static QName _GiftListStockKeepingUnitDTOItemValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ItemValue");
    private final static QName _GiftListStockKeepingUnitDTODatePurchased_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DatePurchased");
    private final static QName _GiftListStockKeepingUnitDTOInsertedByClientId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InsertedByClientId");
    private final static QName _GiftListStockKeepingUnitDTOOmsOrderId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OmsOrderId");
    private final static QName _GiftListStockKeepingUnitDTOIsOrderFinished_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "_IsOrderFinished");
    private final static QName _GiftListStockKeepingUnitDTOOrderMessageTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderMessageTo");
    private final static QName _GiftListStockKeepingUnitDTODateCreated_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateCreated");
    private final static QName _GiftListStockKeepingUnitDTOOrderResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderResponseMessage");
    private final static QName _GiftListStockKeepingUnitDTOFreightAndServicesValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightAndServicesValue");
    private final static QName _GiftListStockKeepingUnitDTOGiftListId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListId");
    private final static QName _GiftListStockKeepingUnitDTOGiftListSkuId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListSkuId");
    private final static QName _GiftListStockKeepingUnitDTOWishedByClientId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WishedByClientId");
    private final static QName _GiftListStockKeepingUnitDTOOrderMessageFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderMessageFrom");
    private final static QName _FreightCalculateV3ZipCode_QNAME = new QName("http://tempuri.org/", "zipCode");
    private final static QName _FreightCalculateV3FreightSkuContext_QNAME = new QName("http://tempuri.org/", "freightSkuContext");
    private final static QName _GiftCardTransactionItemInsertGiftCardTransactionItem_QNAME = new QName("http://tempuri.org/", "giftCardTransactionItem");
    private final static QName _GiftListGetAllBetweenEventDateIntervalAndIdResponseGiftListGetAllBetweenEventDateIntervalAndIdResult_QNAME = new QName("http://tempuri.org/", "GiftListGetAllBetweenEventDateIntervalAndIdResult");
    private final static QName _CategoryDTOLomadeeCampaignCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "LomadeeCampaignCode");
    private final static QName _CategoryDTOTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Title");
    private final static QName _CategoryDTOAdWordsRemarketingCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AdWordsRemarketingCode");
    private final static QName _CategoryDTODescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Description");
    private final static QName _CategoryDTOKeywords_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Keywords");
    private final static QName _CategoryDTOFatherCategoryId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FatherCategoryId");
    private final static QName _ClientGetByGuidV3Guid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _StockKeepingUnitFieldNameDTOFieldValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "fieldValues");
    private final static QName _StockKeepingUnitFieldNameDTOFieldName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "fieldName");
    private final static QName _BrandInsertUpdateResponseBrandInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "BrandInsertUpdateResult");
    private final static QName _UpdateNotifyShippingOrderInvoice_QNAME = new QName("http://tempuri.org/", "OrderInvoice");
    private final static QName _ProductInsertUpdateResponseProductInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "ProductInsertUpdateResult");
    private final static QName _AddressGetByClientIdV2ClientIdV2_QNAME = new QName("http://tempuri.org/", "clientIdV2");
    private final static QName _GiftListSearchWithSurnameResponseGiftListSearchWithSurnameResult_QNAME = new QName("http://tempuri.org/", "GiftListSearchWithSurnameResult");
    private final static QName _OrderDeliveryDTODateExpectedDelivery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateExpectedDelivery");
    private final static QName _OrderDeliveryDTOOrderStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderStatusId");
    private final static QName _OrderDeliveryDTODistributionCenter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DistributionCenter");
    private final static QName _OrderDeliveryDTOScheduledShift_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ScheduledShift");
    private final static QName _OrderDeliveryDTOInvoiceNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InvoiceNumber");
    private final static QName _OrderDeliveryDTODaysForFreightDelivery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysForFreightDelivery");
    private final static QName _OrderDeliveryDTOManagementId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ManagementId");
    private final static QName _OrderDeliveryDTOStatusAdministratorId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StatusAdministratorId");
    private final static QName _OrderDeliveryDTOFreightName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightName");
    private final static QName _OrderDeliveryDTODaysForDistributionCenterProcessing_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysForDistributionCenterProcessing");
    private final static QName _OrderDeliveryDTOStausChangeDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StausChangeDate");
    private final static QName _OrderDeliveryDTODaysForStockProcessing_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysForStockProcessing");
    private final static QName _OrderDeliveryDTOFreightIdV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightIdV3");
    private final static QName _OrderDeliveryDTODeliveryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DeliveryDate");
    private final static QName _OrderDeliveryDTOFreightTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightTypeId");
    private final static QName _OrderDeliveryDTOScheduledDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ScheduledDate");
    private final static QName _OrderDeliveryDTOFreightId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightId");
    private final static QName _OrderDeliveryDTOTrackingNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TrackingNumber");
    private final static QName _OrderDeliveryDTOOrderItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderItems");
    private final static QName _FreightScheduledDateOptionDTOAvailablePeriods_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AvailablePeriods");
    private final static QName _StockKeepingUnitPriceUpdateByRefIdStockKeepintUnitRefId_QNAME = new QName("http://tempuri.org/", "stockKeepintUnitRefId");
    private final static QName _PaymentDTOType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Type");
    private final static QName _OrderItemDTORefId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RefId");
    private final static QName _OrderItemDTOOrderDeliveryId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderDeliveryId");
    private final static QName _OrderItemDTOCupomValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CupomValue");
    private final static QName _OrderItemDTOGiftDiscountId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftDiscountId");
    private final static QName _OrderItemDTOIsKit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsKit");
    private final static QName _OrderItemDTOIsGift_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsGift");
    private final static QName _OrderItemDTOCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Cost");
    private final static QName _OrderItemDTOItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ItemId");
    private final static QName _OrderItemDTOParentOrderItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ParentOrderItemId");
    private final static QName _OrderItemDTOListPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ListPrice");
    private final static QName _OrderItemDTOCupomValueOff_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CupomValueOff");
    private final static QName _OrderItemDTODiscounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Discounts");
    private final static QName _OrderItemDTOIsStockImpact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsStockImpact");
    private final static QName _OrderItemDTOProductId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductId");
    private final static QName _OrderItemDTOProductRefId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductRefId");
    private final static QName _OrderItemDTOShippingCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ShippingCost");
    private final static QName _OrderItemDTOOrderItemServices_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderItemServices");
    private final static QName _OrderItemDTOCostOff_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CostOff");
    private final static QName _OrderItemDTOStockLikelyIdV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockLikelyIdV3");
    private final static QName _OrderItemDTOStockLikelyId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockLikelyId");
    private final static QName _OrderItemDTOBuyTogetherDiscountId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "BuyTogetherDiscountId");
    private final static QName _OrderItemDTOMeasurementUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MeasurementUnit");
    private final static QName _OrderItemDTOShippingCostOff_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ShippingCostOff");
    private final static QName _OrderItemDTOUnitMultiplier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "UnitMultiplier");
    private final static QName _GiftListGetByClientCpfResponseGiftListGetByClientCpfResult_QNAME = new QName("http://tempuri.org/", "GiftListGetByClientCpfResult");
    private final static QName _OrderInteractionDTOClientId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ClientId");
    private final static QName _OrderInteractionDTOText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Text");
    private final static QName _ZipCodeGetResponseZipCodeGetResult_QNAME = new QName("http://tempuri.org/", "ZipCodeGetResult");
    private final static QName _GiftListGetByClientEmailClientEmail_QNAME = new QName("http://tempuri.org/", "clientEmail");
    private final static QName _ClientGetByGuidV3ResponseClientGetByGuidV3Result_QNAME = new QName("http://tempuri.org/", "ClientGetByGuidV3Result");
    private final static QName _OrderGetV3OrderId_QNAME = new QName("http://tempuri.org/", "orderId");
    private final static QName _StockKeepingUnitKitDTOStockKeepingUnitParent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitParent");
    private final static QName _StockKeepingUnitKitDTOAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Amount");
    private final static QName _StockKeepingUnitKitDTOStockKeepingUnitId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitId");
    private final static QName _StockKeepingUnitKitDTOUnitPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "UnitPrice");
    private final static QName _GiftListGetResponseGiftListGetResult_QNAME = new QName("http://tempuri.org/", "GiftListGetResult");
    private final static QName _StockKeepingUnitServiceInsertUpdateStockKeepingUnitService_QNAME = new QName("http://tempuri.org/", "stockKeepingUnitService");
    private final static QName _CategoryGetResponseCategoryGetResult_QNAME = new QName("http://tempuri.org/", "CategoryGetResult");
    private final static QName _GiftCardGetResponseGiftCardGetResult_QNAME = new QName("http://tempuri.org/", "GiftCardGetResult");
    private final static QName _StockKeepingUnitEanDTOEan_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Ean");
    private final static QName _OrderStatusGetAllResponseOrderStatusGetAllResult_QNAME = new QName("http://tempuri.org/", "OrderStatusGetAllResult");
    private final static QName _GiftListSearchEventCity_QNAME = new QName("http://tempuri.org/", "eventCity");
    private final static QName _GiftListSearchEventLocation_QNAME = new QName("http://tempuri.org/", "eventLocation");
    private final static QName _GiftListSearchClientName_QNAME = new QName("http://tempuri.org/", "clientName");
    private final static QName _GiftListSearchEventDate_QNAME = new QName("http://tempuri.org/", "eventDate");
    private final static QName _GiftListGetAllFromModifiedDateAndIdResponseGiftListGetAllFromModifiedDateAndIdResult_QNAME = new QName("http://tempuri.org/", "GiftListGetAllFromModifiedDateAndIdResult");
    private final static QName _ClientInsertUpdateV3Client_QNAME = new QName("http://tempuri.org/", "client");
    private final static QName _OrderDTOClient_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Client");
    private final static QName _OrderDTOListOrderDiscount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ListOrderDiscount");
    private final static QName _OrderDTOOrderInvoices_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderInvoices");
    private final static QName _OrderDTOCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "_Cost");
    private final static QName _OrderDTOSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Source");
    private final static QName _OrderDTOTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Tax");
    private final static QName _OrderDTOOrderDeliveries_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderDeliveries");
    private final static QName _OrderDTOTelemarketingStoreLocatorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TelemarketingStoreLocatorName");
    private final static QName _OrderDTOAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Address");
    private final static QName _OrderDTOTelemarketingObservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TelemarketingObservation");
    private final static QName _OrderDTOTelemarketingLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TelemarketingLogin");
    private final static QName _OrderDTOGiftListStockKeepingUnits_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListStockKeepingUnits");
    private final static QName _OrderDTOTelemarketingId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TelemarketingId");
    private final static QName _OrderDTOCostFinal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "_CostFinal");
    private final static QName _OrderDTOPurchaseDateUtc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PurchaseDateUtc");
    private final static QName _OrderDTOIdV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IdV3");
    private final static QName _OrderDTOPurchaseDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PurchaseDate");
    private final static QName _OrderDTOCampaign_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Campaign");
    private final static QName _OrderDTOClientIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ClientIP");
    private final static QName _OrderDTOOrderPayments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderPayments");
    private final static QName _OrderDTOMedia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Media");
    private final static QName _OrderDTOTelemarketingStoreLocatorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TelemarketingStoreLocatorCode");
    private final static QName _OrderDTOStoreName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StoreName");
    private final static QName _OrderDTOAffiliateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AffiliateId");
    private final static QName _OrderDTOCoupon_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Coupon");
    private final static QName _ProductGetSimilarCategoryResponseProductGetSimilarCategoryResult_QNAME = new QName("http://tempuri.org/", "ProductGetSimilarCategoryResult");
    private final static QName _ServiceInsertUpdateResponseServiceInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "ServiceInsertUpdateResult");
    private final static QName _ServiceInsertUpdateResponseServiceId_QNAME = new QName("http://tempuri.org/", "serviceId");
    private final static QName _StockKeepingUnitServiceInsertUpdateResponseStockKeepingUnitServiceId_QNAME = new QName("http://tempuri.org/", "stockKeepingUnitServiceId");
    private final static QName _StockKeepingUnitServiceInsertUpdateResponseStockKeepingUnitServiceInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitServiceInsertUpdateResult");
    private final static QName _ProductEspecificationInsertFieldName_QNAME = new QName("http://tempuri.org/", "fieldName");
    private final static QName _ProductEspecificationInsertFieldValues_QNAME = new QName("http://tempuri.org/", "fieldValues");
    private final static QName _StockKeepingUnitInsertUpdateStockKeepingUnitVO_QNAME = new QName("http://tempuri.org/", "stockKeepingUnitVO");
    private final static QName _GiftListGetByClientEmailResponseGiftListGetByClientEmailResult_QNAME = new QName("http://tempuri.org/", "GiftListGetByClientEmailResult");
    private final static QName _StockKeepingUnitComplementDTOStockKeepingUnitComplements_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitComplements");
    private final static QName _OrderGetV3ResponseOrderGetV3Result_QNAME = new QName("http://tempuri.org/", "OrderGetV3Result");
    private final static QName _GiftListGetAllBetweenEventDateIntervalAndIdStartingGiftListId_QNAME = new QName("http://tempuri.org/", "startingGiftListId");
    private final static QName _StockKeepingUnitKitListBySkuIdResponseStockKeepingUnitKitListBySkuIdResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitKitListBySkuIdResult");
    private final static QName _AddressOrderDTOReceiverName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ReceiverName");
    private final static QName _AddressOrderDTOAddressType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressType");
    private final static QName _AddressOrderDTOCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Country");
    private final static QName _AddressOrderDTOStreet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Street");
    private final static QName _AddressOrderDTONumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Number");
    private final static QName _AddressOrderDTOReferencePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ReferencePoint");
    private final static QName _AddressOrderDTOPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Phone");
    private final static QName _AddressOrderDTOState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "State");
    private final static QName _AddressOrderDTOMore_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "More");
    private final static QName _AddressOrderDTOAddressName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressName");
    private final static QName _AddressOrderDTONeighborhood_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Neighborhood");
    private final static QName _AddressOrderDTONumberV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "NumberV3");
    private final static QName _AddressOrderDTOCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "City");
    private final static QName _AddressOrderDTOZipCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ZipCode");
    private final static QName _AddressOrderDTOCelPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CelPhone");
    private final static QName _AddressOrderDTOOfficePhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OfficePhone");
    private final static QName _NewsletterGetAllByDateResponseNewsletterGetAllByDateResult_QNAME = new QName("http://tempuri.org/", "NewsletterGetAllByDateResult");
    private final static QName _CategoryGetByNameResponseCategoryGetByNameResult_QNAME = new QName("http://tempuri.org/", "CategoryGetByNameResult");
    private final static QName _StockKeepingUnitServiceDTOServiceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ServiceId");
    private final static QName _StockKeepingUnitServiceDTOServicePrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ServicePrice");
    private final static QName _StockKeepingUnitServiceDTOServicePriceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ServicePriceId");
    private final static QName _IntegrationLogEventMessage_QNAME = new QName("http://tempuri.org/", "message");
    private final static QName _WareHouseIStockableGetByStockKeepingUnitResponseWareHouseIStockableGetByStockKeepingUnitResult_QNAME = new QName("http://tempuri.org/", "WareHouseIStockableGetByStockKeepingUnitResult");
    private final static QName _StockKeepingUnitGetAllFromUpdatedDateAndIdResponseStockKeepingUnitGetAllFromUpdatedDateAndIdResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetAllFromUpdatedDateAndIdResult");
    private final static QName _GiftListInsertUpdateResponseGiftListInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "GiftListInsertUpdateResult");
    private final static QName _GiftListSearchResponseGiftListSearchResult_QNAME = new QName("http://tempuri.org/", "GiftListSearchResult");
    private final static QName _OrderGetNext50FromIdV3ResponseOrderGetNext50FromIdV3Result_QNAME = new QName("http://tempuri.org/", "OrderGetNext50FromIdV3Result");
    private final static QName _ServicePriceDTOService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Service");
    private final static QName _ServicePriceDTOPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Price");
    private final static QName _ProductEspecificationInsertByListFieldIdsListStockKeepingUnitEspecificationFieldId_QNAME = new QName("http://tempuri.org/", "listStockKeepingUnitEspecificationFieldId");
    private final static QName _OrderPaymentDTOPaymentAuthorizationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentAuthorizationId");
    private final static QName _OrderPaymentDTOIsValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsValid");
    private final static QName _OrderPaymentDTOInterest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Interest");
    private final static QName _OrderPaymentDTOCardYear_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardYear");
    private final static QName _OrderPaymentDTOUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Url");
    private final static QName _OrderPaymentDTOPaymentUniqueSerialNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentUniqueSerialNumber");
    private final static QName _OrderPaymentDTOPlots_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Plots");
    private final static QName _OrderPaymentDTOComplement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Complement");
    private final static QName _OrderPaymentDTOCardFirst6Numbers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardFirst6Numbers");
    private final static QName _OrderPaymentDTOCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardNumber");
    private final static QName _OrderPaymentDTOGiftCardRedemptionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardRedemptionCode");
    private final static QName _OrderPaymentDTOPaymentTransactionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentTransactionId");
    private final static QName _OrderPaymentDTOCardLast4Numbers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardLast4Numbers");
    private final static QName _OrderPaymentDTOCardName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardName");
    private final static QName _OrderPaymentDTOHostUniqueSerialNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "HostUniqueSerialNumber");
    private final static QName _OrderPaymentDTOPaymentUniqueSerialNumberSettle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentUniqueSerialNumberSettle");
    private final static QName _OrderPaymentDTOOrderPaymentStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderPaymentStatusId");
    private final static QName _OrderPaymentDTOGiftCardIdV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardIdV3");
    private final static QName _OrderPaymentDTOCostWithInterest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CostWithInterest");
    private final static QName _OrderPaymentDTOInstallmentValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InstallmentValue");
    private final static QName _OrderPaymentDTOCardSecurityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardSecurityCode");
    private final static QName _OrderPaymentDTODate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Date");
    private final static QName _OrderPaymentDTOPaymentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "PaymentId");
    private final static QName _OrderPaymentDTOCardMonth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CardMonth");
    private final static QName _OrderPaymentDTOGiftCardId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardId");
    private final static QName _ClientInsertUpdateV3ResponseClientInsertUpdateV3Result_QNAME = new QName("http://tempuri.org/", "ClientInsertUpdateV3Result");
    private final static QName _AddressByAddressClientResponseAddressByAddressClientResult_QNAME = new QName("http://tempuri.org/", "AddressByAddressClientResult");
    private final static QName _OrderGetByClientCpfCpfCnpj_QNAME = new QName("http://tempuri.org/", "cpfCnpj");
    private final static QName _ServiceInsertUpdateService_QNAME = new QName("http://tempuri.org/", "service");
    private final static QName _DistributionCenterDTOTaxID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TaxID");
    private final static QName _DistributionCenterDTOHandlingTimeCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "HandlingTimeCost");
    private final static QName _DistributionCenterDTOPriority_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Priority");
    private final static QName _DistributionCenterDTODistributionCenterID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DistributionCenterID");
    private final static QName _GiftListGetByGiftedGifted_QNAME = new QName("http://tempuri.org/", "gifted");
    private final static QName _GiftListSkuInsertResponseGiftListSkuInsertResult_QNAME = new QName("http://tempuri.org/", "GiftListSkuInsertResult");
    private final static QName _BrandGetByNameResponseBrandGetByNameResult_QNAME = new QName("http://tempuri.org/", "BrandGetByNameResult");
    private final static QName _CategoryGetByNameNameCategory_QNAME = new QName("http://tempuri.org/", "nameCategory");
    private final static QName _ImageListByStockKeepingUnitIdArchiveTypeId_QNAME = new QName("http://tempuri.org/", "ArchiveTypeId");
    private final static QName _WareHouseIStockableDTOAvailableQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AvailableQuantity");
    private final static QName _WareHouseIStockableDTOReservedQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ReservedQuantity");
    private final static QName _WareHouseIStockableDTOWareHouseIdV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WareHouseIdV3");
    private final static QName _WareHouseIStockableDTOWareHouseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WareHouseName");
    private final static QName _WareHouseIStockableDTOTotalQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TotalQuantity");
    private final static QName _WareHouseIStockableDTOWareHouseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WareHouseId");
    private final static QName _ClientGetResponseClientGetResult_QNAME = new QName("http://tempuri.org/", "ClientGetResult");
    private final static QName _GiftCardGetByRedeptionCodeResponseGiftCardGetByRedeptionCodeResult_QNAME = new QName("http://tempuri.org/", "GiftCardGetByRedeptionCodeResult");
    private final static QName _GiftListMemberDTOSurname_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Surname");
    private final static QName _GiftListMemberDTOGiftListMemberId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListMemberId");
    private final static QName _GiftListMemberDTOText1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Text1");
    private final static QName _GiftListMemberDTOText2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Text2");
    private final static QName _GiftListMemberDTOProfileSystemUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProfileSystemUserId");
    private final static QName _GiftListMemberDTOMail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Mail");
    private final static QName _GiftListMemberDTOIsAdmin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsAdmin");
    private final static QName _OrderGetInteractionsResponseOrderGetInteractionsResult_QNAME = new QName("http://tempuri.org/", "OrderGetInteractionsResult");
    private final static QName _StockKeepingUnitEspecificationInsertByListListStockKeepingUnitName_QNAME = new QName("http://tempuri.org/", "listStockKeepingUnitName");
    private final static QName _GiftListDTOGiftListMembers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListMembers");
    private final static QName _GiftListDTOUrlFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "UrlFolder");
    private final static QName _GiftListDTODateModified_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateModified");
    private final static QName _GiftListDTOFileId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FileId");
    private final static QName _GiftListDTOVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Version");
    private final static QName _GiftListDTOClientAddressId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ClientAddressId");
    private final static QName _GiftListDTOGiftListTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftListTypeId");
    private final static QName _GiftListDTOIsPublic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsPublic");
    private final static QName _GiftListDTOProfileSystemUserAddressName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProfileSystemUserAddressName");
    private final static QName _GiftListDTOGifted_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Gifted");
    private final static QName _GiftListDTOEventCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EventCity");
    private final static QName _GiftListDTOMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Message");
    private final static QName _GiftListDTOEventLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EventLocation");
    private final static QName _GiftListDTOEventState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EventState");
    private final static QName _GiftListDTOEventDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EventDate");
    private final static QName _GiftListSkuInsertGiftListSku_QNAME = new QName("http://tempuri.org/", "giftListSku");
    private final static QName _StockKeepingUnitServiceGetResponseStockKeepingUnitServiceGetResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitServiceGetResult");
    private final static QName _GiftListGetByModifiedDateResponseGiftListGetByModifiedDateResult_QNAME = new QName("http://tempuri.org/", "GiftListGetByModifiedDateResult");
    private final static QName _OrderInvoiceDTOCourier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Courier");
    private final static QName _OrderInvoiceDTOStockKeepingUnits_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnits");
    private final static QName _OrderInvoiceDTOTrackingUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TrackingUrl");
    private final static QName _OrderInvoiceDTOIssuanceDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IssuanceDate");
    private final static QName _OrderInvoiceDTOEmbeddedInvoice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EmbeddedInvoice");
    private final static QName _OrderInvoiceDTOInvoiceUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InvoiceUrl");
    private final static QName _OrderInvoiceDTOOrderIdV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderIdV3");
    private final static QName _ClientGetByEmailV3Email_QNAME = new QName("http://tempuri.org/", "Email");
    private final static QName _IntegrationInterfaceDTODateLastSuccess_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateLastSuccess");
    private final static QName _IntegrationInterfaceDTODateLastError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateLastError");
    private final static QName _IntegrationInterfaceDTOInterfaceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InterfaceName");
    private final static QName _IntegrationInterfaceDTOInterfaceEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InterfaceEnum");
    private final static QName _IntegrationErrorCheckInstanceExistsInstance_QNAME = new QName("http://tempuri.org/", "instance");
    private final static QName _FreightGetAllResponseFreightGetAllResult_QNAME = new QName("http://tempuri.org/", "FreightGetAllResult");
    private final static QName _ProductEspecificationListByProductIdResponseProductEspecificationListByProductIdResult_QNAME = new QName("http://tempuri.org/", "ProductEspecificationListByProductIdResult");
    private final static QName _ClientGetV3IdClientV3_QNAME = new QName("http://tempuri.org/", "idClientV3");
    private final static QName _GiftListMemberInsertUpdateGiftListMember_QNAME = new QName("http://tempuri.org/", "giftListMember");
    private final static QName _StockKeepingUnitGetByManufacturerCodeManufacturer_QNAME = new QName("http://tempuri.org/", "manufacturer");
    private final static QName _StockKeepingUnitGetAllFromUpdatedDateResponseStockKeepingUnitGetAllFromUpdatedDateResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetAllFromUpdatedDateResult");
    private final static QName _GiftListMemberInsertUpdateResponseGiftListMemberInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "GiftListMemberInsertUpdateResult");
    private final static QName _StockKeepingUnitComplementInsertUpdateObjStockKeepingUnitComplementDTO_QNAME = new QName("http://tempuri.org/", "objStockKeepingUnitComplementDTO");
    private final static QName _NewsletterDTOData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Data");
    private final static QName _NewsletterDTOEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Email");
    private final static QName _StockKeepingUnitGetByEanResponseStockKeepingUnitGetByEanResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetByEanResult");
    private final static QName _ClientDTOIsSMSNewsReceiver_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsSMSNewsReceiver");
    private final static QName _ClientDTOPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Password");
    private final static QName _ClientDTORewardGiftCardId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RewardGiftCardId");
    private final static QName _ClientDTOAge_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Age");
    private final static QName _ClientDTOCompanyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CompanyName");
    private final static QName _ClientDTOCreateDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CreateDate");
    private final static QName _ClientDTOIsCorporate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsCorporate");
    private final static QName _ClientDTOIsFraud_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsFraud");
    private final static QName _ClientDTOGender_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Gender");
    private final static QName _ClientDTOIsStateInscriptionImmune_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsStateInscriptionImmune");
    private final static QName _ClientDTOStateInscription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StateInscription");
    private final static QName _ClientDTOUserGUID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "UserGUID");
    private final static QName _ClientDTOLastLogonDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "LastLogonDate");
    private final static QName _ClientDTOLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "LastName");
    private final static QName _ClientDTOIsNewsReceiver_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsNewsReceiver");
    private final static QName _ClientDTONickName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "NickName");
    private final static QName _ClientDTODateBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateBirth");
    private final static QName _ClientDTOChangeDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ChangeDate");
    private final static QName _ClientDTOFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FirstName");
    private final static QName _ClientDTOCompanyNickName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CompanyNickName");
    private final static QName _ClientDTOCpfCnpj_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CpfCnpj");
    private final static QName _ClientDTOAddressClientId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressClientId");
    private final static QName _OrderItemServiceDTOStockKeepingUnitServiceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitServiceId");
    private final static QName _OrderItemServiceDTOOrderItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "OrderItemId");
    private final static QName _OrderItemServiceDTOArchiveId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArchiveId");
    private final static QName _OrderItemServiceDTOGiftCardFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardFrom");
    private final static QName _OrderItemServiceDTOGiftCardMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardMessage");
    private final static QName _OrderItemServiceDTOStockKeepingUnitService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitService");
    private final static QName _OrderItemServiceDTOGiftCardTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardTo");
    private final static QName _ImageDTOWidth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Width");
    private final static QName _ImageDTOTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Tag");
    private final static QName _ImageDTOArchiveParentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArchiveParentId");
    private final static QName _ImageDTOArchiveTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArchiveTypeId");
    private final static QName _ImageDTOHeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Height");
    private final static QName _ImageDTOFileLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FileLocation");
    private final static QName _ImageDTOHeightUnitMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "HeightUnitMeasure");
    private final static QName _ImageDTODateLastModified_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateLastModified");
    private final static QName _ImageDTOWidthUnitMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WidthUnitMeasure");
    private final static QName _ImageDTOIsMain_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsMain");
    private final static QName _ImageDTOLabel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Label");
    private final static QName _ImageDTOArchiveFormatId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArchiveFormatId");
    private final static QName _FreightStockKeepingUnitDTOFreightAdditionalInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightAdditionalInfo");
    private final static QName _FreightStockKeepingUnitDTOFreightType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightType");
    private final static QName _FreightStockKeepingUnitDTOFreightScheduledDateOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightScheduledDateOptions");
    private final static QName _GiftCardGetByRedeptionCodeRedeptionCode_QNAME = new QName("http://tempuri.org/", "redeptionCode");
    private final static QName _IntegrationWarehouseDTOWarehouseAbacosKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WarehouseAbacosKey");
    private final static QName _AddressInsertUpdateV3Address_QNAME = new QName("http://tempuri.org/", "address");
    private final static QName _ProductInsertUpdateProductVO_QNAME = new QName("http://tempuri.org/", "productVO");
    private final static QName _GiftCardInsertUpdateGiftcard_QNAME = new QName("http://tempuri.org/", "giftcard");
    private final static QName _IntegrationLogErrorInsertUpdateErrorDetail_QNAME = new QName("http://tempuri.org/", "errorDetail");
    private final static QName _IntegrationLogErrorInsertUpdateError_QNAME = new QName("http://tempuri.org/", "error");
    private final static QName _FieldDTOIsStockKeepingUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsStockKeepingUnit");
    private final static QName _FieldDTOFieldTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FieldTypeId");
    private final static QName _FieldDTOFieldId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FieldId");
    private final static QName _FieldDTOFieldValueId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FieldValueId");
    private final static QName _FieldDTOFieldTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FieldTypeName");
    private final static QName _FieldDTOCategoryId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CategoryId");
    private final static QName _FieldDTOIsRequired_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsRequired");
    private final static QName _StockKeepingUnitServiceListResponseStockKeepingUnitServiceListResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitServiceListResult");
    private final static QName _AddressDTORecipientName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RecipientName");
    private final static QName _AddressDTOAddressGUID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressGUID");
    private final static QName _AddressDTOAddressNameV3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AddressNameV3");
    private final static QName _GiftListSearchWithSurnameClientSurname_QNAME = new QName("http://tempuri.org/", "clientSurname");
    private final static QName _StoreGetResponseStoreGetResult_QNAME = new QName("http://tempuri.org/", "StoreGetResult");
    private final static QName _ProductDTOIsVisible_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsVisible");
    private final static QName _ProductDTOShowWithoutStock_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ShowWithoutStock");
    private final static QName _ProductDTOLinkId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "LinkId");
    private final static QName _ProductDTODepartmentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DepartmentId");
    private final static QName _ProductDTOTaxCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TaxCode");
    private final static QName _ProductDTOSupplierId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "SupplierId");
    private final static QName _ProductDTODescriptionShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DescriptionShort");
    private final static QName _ProductDTOListStoreId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ListStoreId");
    private final static QName _ProductDTOBrandId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "BrandId");
    private final static QName _ProductDTOKeyWords_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "KeyWords");
    private final static QName _ProductDTOReleaseDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ReleaseDate");
    private final static QName _ProductDTOMetaTagDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MetaTagDescription");
    private final static QName _CategoryInsertUpdateCategory_QNAME = new QName("http://tempuri.org/", "category");
    private final static QName _GiftListGetByCreatedDateResponseGiftListGetByCreatedDateResult_QNAME = new QName("http://tempuri.org/", "GiftListGetByCreatedDateResult");
    private final static QName _AddressGetByClientIdV3ResponseAddressGetByClientIdV3Result_QNAME = new QName("http://tempuri.org/", "AddressGetByClientIdV3Result");
    private final static QName _ClientGetByCPFCpfCnpj_QNAME = new QName("http://tempuri.org/", "CpfCnpj");
    private final static QName _StockKeepingUnitGetAllByProductResponseStockKeepingUnitGetAllByProductResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetAllByProductResult");
    private final static QName _ServiceDTOIsGiftCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsGiftCard");
    private final static QName _ServiceDTOIsVisibleOnProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsVisibleOnProduct");
    private final static QName _ServiceDTOIsVisibleOnCart_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsVisibleOnCart");
    private final static QName _ServiceDTOIsVisibleOnService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsVisibleOnService");
    private final static QName _ServiceDTOIsFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsFile");
    private final static QName _StockKeepingUnitKitListByParentResponseStockKeepingUnitKitListByParentResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitKitListByParentResult");
    private final static QName _GiftListSkuGetResponseGiftListSkuGetResult_QNAME = new QName("http://tempuri.org/", "GiftListSkuGetResult");
    private final static QName _ImageInsertUpdateImage_QNAME = new QName("http://tempuri.org/", "image");
    private final static QName _OrderGetByStatusByQuantityResponseOrderGetByStatusByQuantityResult_QNAME = new QName("http://tempuri.org/", "OrderGetByStatusByQuantityResult");
    private final static QName _ZipCodeDTOStateFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StateFullName");
    private final static QName _ZipCodeDTOValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Value");
    private final static QName _GiftListTypeDTODaysToEventMin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysToEventMin");
    private final static QName _GiftListTypeDTOMemberMax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MemberMax");
    private final static QName _GiftListTypeDTOIsMessageAvailable_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsMessageAvailable");
    private final static QName _GiftListTypeDTODaysToExpireToMembers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysToExpireToMembers");
    private final static QName _GiftListTypeDTOGiftCardRechargeSkuId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "GiftCardRechargeSkuId");
    private final static QName _GiftListTypeDTOMemberTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MemberTitle");
    private final static QName _GiftListTypeDTOIsUnique_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsUnique");
    private final static QName _GiftListTypeDTODaysToExpireToVisitors_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysToExpireToVisitors");
    private final static QName _GiftListTypeDTOShipToListOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ShipToListOwner");
    private final static QName _GiftListTypeDTODaysToEventMax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DaysToEventMax");
    private final static QName _GiftListTypeDTOTextTitle1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TextTitle1");
    private final static QName _GiftListTypeDTOMemberMin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MemberMin");
    private final static QName _GiftListTypeDTOTextTitle2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TextTitle2");
    private final static QName _GiftListTypeDTOIsProtected_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsProtected");
    private final static QName _AddressGetByClientIdV3ClientIdV3_QNAME = new QName("http://tempuri.org/", "clientIdV3");
    private final static QName _ProductGetAllFromUpdatedDateAndIdProductid_QNAME = new QName("http://tempuri.org/", "productid");
    private final static QName _OrderGetByClientCpfResponseOrderGetByClientCpfResult_QNAME = new QName("http://tempuri.org/", "OrderGetByClientCpfResult");
    private final static QName _StockKeepingUnitGetByRefIdResponseStockKeepingUnitGetByRefIdResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetByRefIdResult");
    private final static QName _StockKeepingUnitDTOCostPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CostPrice");
    private final static QName _StockKeepingUnitDTOIsAvaiable_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsAvaiable");
    private final static QName _StockKeepingUnitDTOModalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ModalId");
    private final static QName _StockKeepingUnitDTORealHeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealHeight");
    private final static QName _StockKeepingUnitDTORewardValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RewardValue");
    private final static QName _StockKeepingUnitDTOEstimatedDateArrival_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EstimatedDateArrival");
    private final static QName _StockKeepingUnitDTOManufacturerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ManufacturerCode");
    private final static QName _StockKeepingUnitDTOProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductName");
    private final static QName _StockKeepingUnitDTOStockKeepingUnitEans_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitEans");
    private final static QName _StockKeepingUnitDTOCubicWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CubicWeight");
    private final static QName _StockKeepingUnitDTOLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Length");
    private final static QName _StockKeepingUnitDTOWeightKg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WeightKg");
    private final static QName _StockKeepingUnitDTORealWidth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealWidth");
    private final static QName _StockKeepingUnitDTORealLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealLength");
    private final static QName _StockKeepingUnitDTOInternalNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InternalNote");
    private final static QName _StockKeepingUnitDTORealWeightKg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealWeightKg");
    private final static QName _StockKeepingUnitDTOCommercialConditionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CommercialConditionId");
    private final static QName _StockKeepingUnitDTODateUpdated_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateUpdated");
    private final static QName _StockKeepingUnitDTOModalType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ModalType");
    private final static QName _GiftListV2FiltersResponseGiftListV2FiltersResult_QNAME = new QName("http://tempuri.org/", "GiftListV2FiltersResult");
    private final static QName _StockKeepingUnitGetByEanEAN13_QNAME = new QName("http://tempuri.org/", "EAN13");
    private final static QName _WareHouseIStockableGetByStockKeepingUnitV3ResponseWareHouseIStockableGetByStockKeepingUnitV3Result_QNAME = new QName("http://tempuri.org/", "WareHouseIStockableGetByStockKeepingUnitV3Result");
    private final static QName _StockKeepingUnitGetByManufacturerCodeResponseStockKeepingUnitGetByManufacturerCodeResult_QNAME = new QName("http://tempuri.org/", "StockKeepingUnitGetByManufacturerCodeResult");
    private final static QName _ServicePriceGetResponseServicePriceGetResult_QNAME = new QName("http://tempuri.org/", "ServicePriceGetResult");
    private final static QName _OrderItemDiscountDTODiscountName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DiscountName");
    private final static QName _OrderItemDiscountDTOIsPercentual_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsPercentual");
    private final static QName _GiftCardInsertUpdateResponseGiftCardInsertUpdateResult_QNAME = new QName("http://tempuri.org/", "GiftCardInsertUpdateResult");
    private final static QName _GiftListGetByClientCpfClientCpfCnpj_QNAME = new QName("http://tempuri.org/", "clientCpfCnpj");
    private final static QName _ProductEspecificationTextInsertByFieldIdDescription_QNAME = new QName("http://tempuri.org/", "Description");
    private final static QName _FreightDTOFreightTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightTypeID");
    private final static QName _FreightDTOFreightID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "FreightID");
    private final static QName _FreightDTOModalID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ModalID");
    private final static QName _IntegrationErrorDTOIdIntegrationError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IdIntegrationError");
    private final static QName _IntegrationErrorDTOAwareDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AwareDate");
    private final static QName _IntegrationErrorDTOError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Error");
    private final static QName _IntegrationErrorDTOInterfaceClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InterfaceClass");
    private final static QName _IntegrationErrorDTOInstance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Instance");
    private final static QName _IntegrationErrorDTOErrorDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ErrorDetail");
    private final static QName _OrderInvoiceStockKeepingUnitDTOQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Quantity");
    private final static QName _GiftListV2FiltersGiftListTypeId_QNAME = new QName("http://tempuri.org/", "giftListTypeId");
    private final static QName _GiftListV2FiltersClientId_QNAME = new QName("http://tempuri.org/", "clientId");
    private final static QName _GiftListV2FiltersEventDateUntil_QNAME = new QName("http://tempuri.org/", "eventDateUntil");
    private final static QName _GiftListV2FiltersEventDateSince_QNAME = new QName("http://tempuri.org/", "eventDateSince");
    private final static QName _GiftListV2FiltersGiftListId_QNAME = new QName("http://tempuri.org/", "giftListId");
    private final static QName _GiftListV2FiltersIsActive_QNAME = new QName("http://tempuri.org/", "isActive");
    private final static QName _AddressInsertUpdateV3ResponseAddressInsertUpdateV3Result_QNAME = new QName("http://tempuri.org/", "AddressInsertUpdateV3Result");
    private final static QName _BrandInsertUpdateBrand_QNAME = new QName("http://tempuri.org/", "brand");
    private final static QName _IntegrationSettingsClientName_QNAME = new QName("http://tempuri.org/", "ClientName");
    private final static QName _GiftCardTransactionItemDTORedemptionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RedemptionCode");
    private final static QName _ServiceGetResponseServiceGetResult_QNAME = new QName("http://tempuri.org/", "ServiceGetResult");
    private final static QName _ClientGetAllFromCreatedDateAndIdResponseClientGetAllFromCreatedDateAndIdResult_QNAME = new QName("http://tempuri.org/", "ClientGetAllFromCreatedDateAndIdResult");
    private final static QName _IntegrationErrorGetAllByErrorTypeAndIdIntegrationErrorId_QNAME = new QName("http://tempuri.org/", "integrationErrorId");
    private final static QName _ClientGetV3ResponseClientGetV3Result_QNAME = new QName("http://tempuri.org/", "ClientGetV3Result");
    private final static QName _ProductGetResponseProductGetResult_QNAME = new QName("http://tempuri.org/", "ProductGetResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.testevtex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GiftListInsertUpdate }
     * 
     */
    public GiftListInsertUpdate createGiftListInsertUpdate() {
        return new GiftListInsertUpdate();
    }

    /**
     * Create an instance of {@link GiftListDTO }
     * 
     */
    public GiftListDTO createGiftListDTO() {
        return new GiftListDTO();
    }

    /**
     * Create an instance of {@link ProductGetSimilarCategoryResponse }
     * 
     */
    public ProductGetSimilarCategoryResponse createProductGetSimilarCategoryResponse() {
        return new ProductGetSimilarCategoryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link IntegrationErrorCheckInstanceExists }
     * 
     */
    public IntegrationErrorCheckInstanceExists createIntegrationErrorCheckInstanceExists() {
        return new IntegrationErrorCheckInstanceExists();
    }

    /**
     * Create an instance of {@link IntegrationErrorGetAllByErrorTypeAndIdResponse }
     * 
     */
    public IntegrationErrorGetAllByErrorTypeAndIdResponse createIntegrationErrorGetAllByErrorTypeAndIdResponse() {
        return new IntegrationErrorGetAllByErrorTypeAndIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationErrorDTO }
     * 
     */
    public ArrayOfIntegrationErrorDTO createArrayOfIntegrationErrorDTO() {
        return new ArrayOfIntegrationErrorDTO();
    }

    /**
     * Create an instance of {@link AddressByAddressClient }
     * 
     */
    public AddressByAddressClient createAddressByAddressClient() {
        return new AddressByAddressClient();
    }

    /**
     * Create an instance of {@link OrderStatusGetAll }
     * 
     */
    public OrderStatusGetAll createOrderStatusGetAll() {
        return new OrderStatusGetAll();
    }

    /**
     * Create an instance of {@link NewsletterGetAllByDate }
     * 
     */
    public NewsletterGetAllByDate createNewsletterGetAllByDate() {
        return new NewsletterGetAllByDate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitComplementInsertUpdateResponse }
     * 
     */
    public StockKeepingUnitComplementInsertUpdateResponse createStockKeepingUnitComplementInsertUpdateResponse() {
        return new StockKeepingUnitComplementInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ClientGetByCPF }
     * 
     */
    public ClientGetByCPF createClientGetByCPF() {
        return new ClientGetByCPF();
    }

    /**
     * Create an instance of {@link GiftListSkuGet }
     * 
     */
    public GiftListSkuGet createGiftListSkuGet() {
        return new GiftListSkuGet();
    }

    /**
     * Create an instance of {@link OrderPaymentGetAll }
     * 
     */
    public OrderPaymentGetAll createOrderPaymentGetAll() {
        return new OrderPaymentGetAll();
    }

    /**
     * Create an instance of {@link OrderGetNext50FromIdV3Response }
     * 
     */
    public OrderGetNext50FromIdV3Response createOrderGetNext50FromIdV3Response() {
        return new OrderGetNext50FromIdV3Response();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDTO }
     * 
     */
    public ArrayOfOrderDTO createArrayOfOrderDTO() {
        return new ArrayOfOrderDTO();
    }

    /**
     * Create an instance of {@link ServiceInsertUpdate }
     * 
     */
    public ServiceInsertUpdate createServiceInsertUpdate() {
        return new ServiceInsertUpdate();
    }

    /**
     * Create an instance of {@link ServiceDTO }
     * 
     */
    public ServiceDTO createServiceDTO() {
        return new ServiceDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationInsertByList }
     * 
     */
    public StockKeepingUnitEspecificationInsertByList createStockKeepingUnitEspecificationInsertByList() {
        return new StockKeepingUnitEspecificationInsertByList();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitFieldNameDTO }
     * 
     */
    public ArrayOfStockKeepingUnitFieldNameDTO createArrayOfStockKeepingUnitFieldNameDTO() {
        return new ArrayOfStockKeepingUnitFieldNameDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitListByParentResponse }
     * 
     */
    public StockKeepingUnitKitListByParentResponse createStockKeepingUnitKitListByParentResponse() {
        return new StockKeepingUnitKitListByParentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitKitDTO }
     * 
     */
    public ArrayOfStockKeepingUnitKitDTO createArrayOfStockKeepingUnitKitDTO() {
        return new ArrayOfStockKeepingUnitKitDTO();
    }

    /**
     * Create an instance of {@link OrderChangeStatus }
     * 
     */
    public OrderChangeStatus createOrderChangeStatus() {
        return new OrderChangeStatus();
    }

    /**
     * Create an instance of {@link OrderGet }
     * 
     */
    public OrderGet createOrderGet() {
        return new OrderGet();
    }

    /**
     * Create an instance of {@link AddressInsertUpdateV3Response }
     * 
     */
    public AddressInsertUpdateV3Response createAddressInsertUpdateV3Response() {
        return new AddressInsertUpdateV3Response();
    }

    /**
     * Create an instance of {@link AddressDTO }
     * 
     */
    public AddressDTO createAddressDTO() {
        return new AddressDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceList }
     * 
     */
    public StockKeepingUnitServiceList createStockKeepingUnitServiceList() {
        return new StockKeepingUnitServiceList();
    }

    /**
     * Create an instance of {@link GiftListSkuInsertResponse }
     * 
     */
    public GiftListSkuInsertResponse createGiftListSkuInsertResponse() {
        return new GiftListSkuInsertResponse();
    }

    /**
     * Create an instance of {@link GiftListStockKeepingUnitDTO }
     * 
     */
    public GiftListStockKeepingUnitDTO createGiftListStockKeepingUnitDTO() {
        return new GiftListStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link ZipCodeGet }
     * 
     */
    public ZipCodeGet createZipCodeGet() {
        return new ZipCodeGet();
    }

    /**
     * Create an instance of {@link ProductInsertUpdateResponse }
     * 
     */
    public ProductInsertUpdateResponse createProductInsertUpdateResponse() {
        return new ProductInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link GiftListGetByGifted }
     * 
     */
    public GiftListGetByGifted createGiftListGetByGifted() {
        return new GiftListGetByGifted();
    }

    /**
     * Create an instance of {@link IntegrationLogResponse }
     * 
     */
    public IntegrationLogResponse createIntegrationLogResponse() {
        return new IntegrationLogResponse();
    }

    /**
     * Create an instance of {@link ProductGetSimilarCategory }
     * 
     */
    public ProductGetSimilarCategory createProductGetSimilarCategory() {
        return new ProductGetSimilarCategory();
    }

    /**
     * Create an instance of {@link OrderGetByStatusByQuantity }
     * 
     */
    public OrderGetByStatusByQuantity createOrderGetByStatusByQuantity() {
        return new OrderGetByStatusByQuantity();
    }

    /**
     * Create an instance of {@link GiftListSkuInsert }
     * 
     */
    public GiftListSkuInsert createGiftListSkuInsert() {
        return new GiftListSkuInsert();
    }

    /**
     * Create an instance of {@link ImageInsertUpdate }
     * 
     */
    public ImageInsertUpdate createImageInsertUpdate() {
        return new ImageInsertUpdate();
    }

    /**
     * Create an instance of {@link ImageDTO }
     * 
     */
    public ImageDTO createImageDTO() {
        return new ImageDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationListBySkuId }
     * 
     */
    public StockKeepingUnitEspecificationListBySkuId createStockKeepingUnitEspecificationListBySkuId() {
        return new StockKeepingUnitEspecificationListBySkuId();
    }

    /**
     * Create an instance of {@link BrandGet }
     * 
     */
    public BrandGet createBrandGet() {
        return new BrandGet();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceListResponse }
     * 
     */
    public StockKeepingUnitServiceListResponse createStockKeepingUnitServiceListResponse() {
        return new StockKeepingUnitServiceListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitServiceDTO }
     * 
     */
    public ArrayOfStockKeepingUnitServiceDTO createArrayOfStockKeepingUnitServiceDTO() {
        return new ArrayOfStockKeepingUnitServiceDTO();
    }

    /**
     * Create an instance of {@link ServicePriceInsertUpdateResponse }
     * 
     */
    public ServicePriceInsertUpdateResponse createServicePriceInsertUpdateResponse() {
        return new ServicePriceInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ServicePriceDTO }
     * 
     */
    public ServicePriceDTO createServicePriceDTO() {
        return new ServicePriceDTO();
    }

    /**
     * Create an instance of {@link CategoryGet }
     * 
     */
    public CategoryGet createCategoryGet() {
        return new CategoryGet();
    }

    /**
     * Create an instance of {@link AddressGetByClientIdV2 }
     * 
     */
    public AddressGetByClientIdV2 createAddressGetByClientIdV2() {
        return new AddressGetByClientIdV2();
    }

    /**
     * Create an instance of {@link AddressGetByClientIdV3 }
     * 
     */
    public AddressGetByClientIdV3 createAddressGetByClientIdV3() {
        return new AddressGetByClientIdV3();
    }

    /**
     * Create an instance of {@link ProductGetAllFromUpdatedDateAndIdResponse }
     * 
     */
    public ProductGetAllFromUpdatedDateAndIdResponse createProductGetAllFromUpdatedDateAndIdResponse() {
        return new ProductGetAllFromUpdatedDateAndIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductDTO }
     * 
     */
    public ArrayOfProductDTO createArrayOfProductDTO() {
        return new ArrayOfProductDTO();
    }

    /**
     * Create an instance of {@link GiftListSkuDelete }
     * 
     */
    public GiftListSkuDelete createGiftListSkuDelete() {
        return new GiftListSkuDelete();
    }

    /**
     * Create an instance of {@link IntegrationLogErrorInsertUpdateResponse }
     * 
     */
    public IntegrationLogErrorInsertUpdateResponse createIntegrationLogErrorInsertUpdateResponse() {
        return new IntegrationLogErrorInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link WareHouseIStockableGetByStockKeepingUnit }
     * 
     */
    public WareHouseIStockableGetByStockKeepingUnit createWareHouseIStockableGetByStockKeepingUnit() {
        return new WareHouseIStockableGetByStockKeepingUnit();
    }

    /**
     * Create an instance of {@link ImageServiceInsertUpdate }
     * 
     */
    public ImageServiceInsertUpdate createImageServiceInsertUpdate() {
        return new ImageServiceInsertUpdate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationInsertResponse }
     * 
     */
    public StockKeepingUnitEspecificationInsertResponse createStockKeepingUnitEspecificationInsertResponse() {
        return new StockKeepingUnitEspecificationInsertResponse();
    }

    /**
     * Create an instance of {@link ClientGetByCPFResponse }
     * 
     */
    public ClientGetByCPFResponse createClientGetByCPFResponse() {
        return new ClientGetByCPFResponse();
    }

    /**
     * Create an instance of {@link ClientDTO }
     * 
     */
    public ClientDTO createClientDTO() {
        return new ClientDTO();
    }

    /**
     * Create an instance of {@link GiftListMemberDelete }
     * 
     */
    public GiftListMemberDelete createGiftListMemberDelete() {
        return new GiftListMemberDelete();
    }

    /**
     * Create an instance of {@link GiftCardGetByRedeptionCode }
     * 
     */
    public GiftCardGetByRedeptionCode createGiftCardGetByRedeptionCode() {
        return new GiftCardGetByRedeptionCode();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceInsertUpdate }
     * 
     */
    public StockKeepingUnitServiceInsertUpdate createStockKeepingUnitServiceInsertUpdate() {
        return new StockKeepingUnitServiceInsertUpdate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceDTO }
     * 
     */
    public StockKeepingUnitServiceDTO createStockKeepingUnitServiceDTO() {
        return new StockKeepingUnitServiceDTO();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsert }
     * 
     */
    public ProductEspecificationInsert createProductEspecificationInsert() {
        return new ProductEspecificationInsert();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ProductGetAllFromUpdatedDateAndId }
     * 
     */
    public ProductGetAllFromUpdatedDateAndId createProductGetAllFromUpdatedDateAndId() {
        return new ProductGetAllFromUpdatedDateAndId();
    }

    /**
     * Create an instance of {@link WareHouseIStockableGetByStockKeepingUnitResponse }
     * 
     */
    public WareHouseIStockableGetByStockKeepingUnitResponse createWareHouseIStockableGetByStockKeepingUnitResponse() {
        return new WareHouseIStockableGetByStockKeepingUnitResponse();
    }

    /**
     * Create an instance of {@link WareHouseIStockableDTO }
     * 
     */
    public WareHouseIStockableDTO createWareHouseIStockableDTO() {
        return new WareHouseIStockableDTO();
    }

    /**
     * Create an instance of {@link OrderChangeStatusResponse }
     * 
     */
    public OrderChangeStatusResponse createOrderChangeStatusResponse() {
        return new OrderChangeStatusResponse();
    }

    /**
     * Create an instance of {@link GiftListInsertUpdateResponse }
     * 
     */
    public GiftListInsertUpdateResponse createGiftListInsertUpdateResponse() {
        return new GiftListInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationInsertByListResponse }
     * 
     */
    public StockKeepingUnitEspecificationInsertByListResponse createStockKeepingUnitEspecificationInsertByListResponse() {
        return new StockKeepingUnitEspecificationInsertByListResponse();
    }

    /**
     * Create an instance of {@link ProductSetSimilarCategory }
     * 
     */
    public ProductSetSimilarCategory createProductSetSimilarCategory() {
        return new ProductSetSimilarCategory();
    }

    /**
     * Create an instance of {@link GiftListSearchWithSurnameResponse }
     * 
     */
    public GiftListSearchWithSurnameResponse createGiftListSearchWithSurnameResponse() {
        return new GiftListSearchWithSurnameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGiftListDTO }
     * 
     */
    public ArrayOfGiftListDTO createArrayOfGiftListDTO() {
        return new ArrayOfGiftListDTO();
    }

    /**
     * Create an instance of {@link CategoryGetByName }
     * 
     */
    public CategoryGetByName createCategoryGetByName() {
        return new CategoryGetByName();
    }

    /**
     * Create an instance of {@link WareHouseIStockableGetByStockKeepingUnitV3Response }
     * 
     */
    public WareHouseIStockableGetByStockKeepingUnitV3Response createWareHouseIStockableGetByStockKeepingUnitV3Response() {
        return new WareHouseIStockableGetByStockKeepingUnitV3Response();
    }

    /**
     * Create an instance of {@link ArrayOfWareHouseIStockableDTO }
     * 
     */
    public ArrayOfWareHouseIStockableDTO createArrayOfWareHouseIStockableDTO() {
        return new ArrayOfWareHouseIStockableDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitPriceUpdate }
     * 
     */
    public StockKeepingUnitPriceUpdate createStockKeepingUnitPriceUpdate() {
        return new StockKeepingUnitPriceUpdate();
    }

    /**
     * Create an instance of {@link ServiceGet }
     * 
     */
    public ServiceGet createServiceGet() {
        return new ServiceGet();
    }

    /**
     * Create an instance of {@link GiftListGet }
     * 
     */
    public GiftListGet createGiftListGet() {
        return new GiftListGet();
    }

    /**
     * Create an instance of {@link OrderPaymentGetAllResponse }
     * 
     */
    public OrderPaymentGetAllResponse createOrderPaymentGetAllResponse() {
        return new OrderPaymentGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentDTO }
     * 
     */
    public ArrayOfPaymentDTO createArrayOfPaymentDTO() {
        return new ArrayOfPaymentDTO();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertByFieldId }
     * 
     */
    public ProductEspecificationInsertByFieldId createProductEspecificationInsertByFieldId() {
        return new ProductEspecificationInsertByFieldId();
    }

    /**
     * Create an instance of {@link GiftCardInsertUpdate }
     * 
     */
    public GiftCardInsertUpdate createGiftCardInsertUpdate() {
        return new GiftCardInsertUpdate();
    }

    /**
     * Create an instance of {@link GiftCardDTO }
     * 
     */
    public GiftCardDTO createGiftCardDTO() {
        return new GiftCardDTO();
    }

    /**
     * Create an instance of {@link GiftListV2Filters }
     * 
     */
    public GiftListV2Filters createGiftListV2Filters() {
        return new GiftListV2Filters();
    }

    /**
     * Create an instance of {@link CategoryInsertUpdateResponse }
     * 
     */
    public CategoryInsertUpdateResponse createCategoryInsertUpdateResponse() {
        return new CategoryInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link CategoryDTO }
     * 
     */
    public CategoryDTO createCategoryDTO() {
        return new CategoryDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitInsertUpdate }
     * 
     */
    public StockKeepingUnitKitInsertUpdate createStockKeepingUnitKitInsertUpdate() {
        return new StockKeepingUnitKitInsertUpdate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitDTO }
     * 
     */
    public StockKeepingUnitKitDTO createStockKeepingUnitKitDTO() {
        return new StockKeepingUnitKitDTO();
    }

    /**
     * Create an instance of {@link ClientGet }
     * 
     */
    public ClientGet createClientGet() {
        return new ClientGet();
    }

    /**
     * Create an instance of {@link CategoryGetResponse }
     * 
     */
    public CategoryGetResponse createCategoryGetResponse() {
        return new CategoryGetResponse();
    }

    /**
     * Create an instance of {@link IntegrationLogErrorResponse }
     * 
     */
    public IntegrationLogErrorResponse createIntegrationLogErrorResponse() {
        return new IntegrationLogErrorResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetAllByProduct }
     * 
     */
    public StockKeepingUnitGetAllByProduct createStockKeepingUnitGetAllByProduct() {
        return new StockKeepingUnitGetAllByProduct();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetByEanResponse }
     * 
     */
    public StockKeepingUnitGetByEanResponse createStockKeepingUnitGetByEanResponse() {
        return new StockKeepingUnitGetByEanResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitDTO }
     * 
     */
    public StockKeepingUnitDTO createStockKeepingUnitDTO() {
        return new StockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link ProductActive }
     * 
     */
    public ProductActive createProductActive() {
        return new ProductActive();
    }

    /**
     * Create an instance of {@link GiftListGetByClientEmail }
     * 
     */
    public GiftListGetByClientEmail createGiftListGetByClientEmail() {
        return new GiftListGetByClientEmail();
    }

    /**
     * Create an instance of {@link OrderStatusGetAllResponse }
     * 
     */
    public OrderStatusGetAllResponse createOrderStatusGetAllResponse() {
        return new OrderStatusGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderStatusDTO }
     * 
     */
    public ArrayOfOrderStatusDTO createArrayOfOrderStatusDTO() {
        return new ArrayOfOrderStatusDTO();
    }

    /**
     * Create an instance of {@link OrderGetByStatusByQuantityResponse }
     * 
     */
    public OrderGetByStatusByQuantityResponse createOrderGetByStatusByQuantityResponse() {
        return new OrderGetByStatusByQuantityResponse();
    }

    /**
     * Create an instance of {@link AddressByAddressClientResponse }
     * 
     */
    public AddressByAddressClientResponse createAddressByAddressClientResponse() {
        return new AddressByAddressClientResponse();
    }

    /**
     * Create an instance of {@link OrderGetNext50FromIdV3 }
     * 
     */
    public OrderGetNext50FromIdV3 createOrderGetNext50FromIdV3() {
        return new OrderGetNext50FromIdV3();
    }

    /**
     * Create an instance of {@link GiftListGetTypeResponse }
     * 
     */
    public GiftListGetTypeResponse createGiftListGetTypeResponse() {
        return new GiftListGetTypeResponse();
    }

    /**
     * Create an instance of {@link GiftListTypeDTO }
     * 
     */
    public GiftListTypeDTO createGiftListTypeDTO() {
        return new GiftListTypeDTO();
    }

    /**
     * Create an instance of {@link BrandInsertUpdate }
     * 
     */
    public BrandInsertUpdate createBrandInsertUpdate() {
        return new BrandInsertUpdate();
    }

    /**
     * Create an instance of {@link BrandDTO }
     * 
     */
    public BrandDTO createBrandDTO() {
        return new BrandDTO();
    }

    /**
     * Create an instance of {@link OrderGetInteractions }
     * 
     */
    public OrderGetInteractions createOrderGetInteractions() {
        return new OrderGetInteractions();
    }

    /**
     * Create an instance of {@link GiftListSearchWithSurname }
     * 
     */
    public GiftListSearchWithSurname createGiftListSearchWithSurname() {
        return new GiftListSearchWithSurname();
    }

    /**
     * Create an instance of {@link ServiceInsertUpdateResponse }
     * 
     */
    public ServiceInsertUpdateResponse createServiceInsertUpdateResponse() {
        return new ServiceInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link StoreList }
     * 
     */
    public StoreList createStoreList() {
        return new StoreList();
    }

    /**
     * Create an instance of {@link ClientGetV3Response }
     * 
     */
    public ClientGetV3Response createClientGetV3Response() {
        return new ClientGetV3Response();
    }

    /**
     * Create an instance of {@link ImageListByStockKeepingUnitIdResponse }
     * 
     */
    public ImageListByStockKeepingUnitIdResponse createImageListByStockKeepingUnitIdResponse() {
        return new ImageListByStockKeepingUnitIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfImageDTO }
     * 
     */
    public ArrayOfImageDTO createArrayOfImageDTO() {
        return new ArrayOfImageDTO();
    }

    /**
     * Create an instance of {@link GiftListMemberDeleteResponse }
     * 
     */
    public GiftListMemberDeleteResponse createGiftListMemberDeleteResponse() {
        return new GiftListMemberDeleteResponse();
    }

    /**
     * Create an instance of {@link ServicePriceGetResponse }
     * 
     */
    public ServicePriceGetResponse createServicePriceGetResponse() {
        return new ServicePriceGetResponse();
    }

    /**
     * Create an instance of {@link IntegrationLogEventResponse }
     * 
     */
    public IntegrationLogEventResponse createIntegrationLogEventResponse() {
        return new IntegrationLogEventResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitDeleteByParent }
     * 
     */
    public StockKeepingUnitKitDeleteByParent createStockKeepingUnitKitDeleteByParent() {
        return new StockKeepingUnitKitDeleteByParent();
    }

    /**
     * Create an instance of {@link ServicePriceGet }
     * 
     */
    public ServicePriceGet createServicePriceGet() {
        return new ServicePriceGet();
    }

    /**
     * Create an instance of {@link ProductEspecificationListByProductId }
     * 
     */
    public ProductEspecificationListByProductId createProductEspecificationListByProductId() {
        return new ProductEspecificationListByProductId();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetAllByProductResponse }
     * 
     */
    public StockKeepingUnitGetAllByProductResponse createStockKeepingUnitGetAllByProductResponse() {
        return new StockKeepingUnitGetAllByProductResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitDTO }
     * 
     */
    public ArrayOfStockKeepingUnitDTO createArrayOfStockKeepingUnitDTO() {
        return new ArrayOfStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link UpdateNotifyShipping }
     * 
     */
    public UpdateNotifyShipping createUpdateNotifyShipping() {
        return new UpdateNotifyShipping();
    }

    /**
     * Create an instance of {@link OrderInvoiceDTO }
     * 
     */
    public OrderInvoiceDTO createOrderInvoiceDTO() {
        return new OrderInvoiceDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetByManufacturerCode }
     * 
     */
    public StockKeepingUnitGetByManufacturerCode createStockKeepingUnitGetByManufacturerCode() {
        return new StockKeepingUnitGetByManufacturerCode();
    }

    /**
     * Create an instance of {@link ProductGetByRefIdResponse }
     * 
     */
    public ProductGetByRefIdResponse createProductGetByRefIdResponse() {
        return new ProductGetByRefIdResponse();
    }

    /**
     * Create an instance of {@link ProductEspecificationTextInsertByFieldIdResponse }
     * 
     */
    public ProductEspecificationTextInsertByFieldIdResponse createProductEspecificationTextInsertByFieldIdResponse() {
        return new ProductEspecificationTextInsertByFieldIdResponse();
    }

    /**
     * Create an instance of {@link BrandGetResponse }
     * 
     */
    public BrandGetResponse createBrandGetResponse() {
        return new BrandGetResponse();
    }

    /**
     * Create an instance of {@link ProductGetResponse }
     * 
     */
    public ProductGetResponse createProductGetResponse() {
        return new ProductGetResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitActiveResponse }
     * 
     */
    public StockKeepingUnitActiveResponse createStockKeepingUnitActiveResponse() {
        return new StockKeepingUnitActiveResponse();
    }

    /**
     * Create an instance of {@link WareHouseIStockableUpdateV3Response }
     * 
     */
    public WareHouseIStockableUpdateV3Response createWareHouseIStockableUpdateV3Response() {
        return new WareHouseIStockableUpdateV3Response();
    }

    /**
     * Create an instance of {@link FreightGetAll }
     * 
     */
    public FreightGetAll createFreightGetAll() {
        return new FreightGetAll();
    }

    /**
     * Create an instance of {@link ImageServiceCopyAllImagesFromSkuToSku }
     * 
     */
    public ImageServiceCopyAllImagesFromSkuToSku createImageServiceCopyAllImagesFromSkuToSku() {
        return new ImageServiceCopyAllImagesFromSkuToSku();
    }

    /**
     * Create an instance of {@link FreightGetAllResponse }
     * 
     */
    public FreightGetAllResponse createFreightGetAllResponse() {
        return new FreightGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFreightDTO }
     * 
     */
    public ArrayOfFreightDTO createArrayOfFreightDTO() {
        return new ArrayOfFreightDTO();
    }

    /**
     * Create an instance of {@link StoreGet }
     * 
     */
    public StoreGet createStoreGet() {
        return new StoreGet();
    }

    /**
     * Create an instance of {@link GiftListGetAllFromCreatedDateAndId }
     * 
     */
    public GiftListGetAllFromCreatedDateAndId createGiftListGetAllFromCreatedDateAndId() {
        return new GiftListGetAllFromCreatedDateAndId();
    }

    /**
     * Create an instance of {@link ImageServiceInsertUpdateResponse }
     * 
     */
    public ImageServiceInsertUpdateResponse createImageServiceInsertUpdateResponse() {
        return new ImageServiceInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ClientGetByEmailV3 }
     * 
     */
    public ClientGetByEmailV3 createClientGetByEmailV3() {
        return new ClientGetByEmailV3();
    }

    /**
     * Create an instance of {@link IntegrationLogEvent }
     * 
     */
    public IntegrationLogEvent createIntegrationLogEvent() {
        return new IntegrationLogEvent();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceGetResponse }
     * 
     */
    public StockKeepingUnitServiceGetResponse createStockKeepingUnitServiceGetResponse() {
        return new StockKeepingUnitServiceGetResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationListBySkuIdResponse }
     * 
     */
    public StockKeepingUnitEspecificationListBySkuIdResponse createStockKeepingUnitEspecificationListBySkuIdResponse() {
        return new StockKeepingUnitEspecificationListBySkuIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFieldDTO }
     * 
     */
    public ArrayOfFieldDTO createArrayOfFieldDTO() {
        return new ArrayOfFieldDTO();
    }

    /**
     * Create an instance of {@link ProductActiveResponse }
     * 
     */
    public ProductActiveResponse createProductActiveResponse() {
        return new ProductActiveResponse();
    }

    /**
     * Create an instance of {@link ClientGetByGuidV3 }
     * 
     */
    public ClientGetByGuidV3 createClientGetByGuidV3() {
        return new ClientGetByGuidV3();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitDeleteByParentResponse }
     * 
     */
    public StockKeepingUnitKitDeleteByParentResponse createStockKeepingUnitKitDeleteByParentResponse() {
        return new StockKeepingUnitKitDeleteByParentResponse();
    }

    /**
     * Create an instance of {@link GiftListGetAllFromCreatedDateAndIdResponse }
     * 
     */
    public GiftListGetAllFromCreatedDateAndIdResponse createGiftListGetAllFromCreatedDateAndIdResponse() {
        return new GiftListGetAllFromCreatedDateAndIdResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGet }
     * 
     */
    public StockKeepingUnitGet createStockKeepingUnitGet() {
        return new StockKeepingUnitGet();
    }

    /**
     * Create an instance of {@link IntegrationSettingsResponse }
     * 
     */
    public IntegrationSettingsResponse createIntegrationSettingsResponse() {
        return new IntegrationSettingsResponse();
    }

    /**
     * Create an instance of {@link IntegrationDTO }
     * 
     */
    public IntegrationDTO createIntegrationDTO() {
        return new IntegrationDTO();
    }

    /**
     * Create an instance of {@link AddressGetByClientIdV2Response }
     * 
     */
    public AddressGetByClientIdV2Response createAddressGetByClientIdV2Response() {
        return new AddressGetByClientIdV2Response();
    }

    /**
     * Create an instance of {@link ArrayOfAddressDTO2 }
     * 
     */
    public ArrayOfAddressDTO2 createArrayOfAddressDTO2() {
        return new ArrayOfAddressDTO2();
    }

    /**
     * Create an instance of {@link StockKeepingUnitInsertUpdateResponse }
     * 
     */
    public StockKeepingUnitInsertUpdateResponse createStockKeepingUnitInsertUpdateResponse() {
        return new StockKeepingUnitInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ClientGetV3 }
     * 
     */
    public ClientGetV3 createClientGetV3() {
        return new ClientGetV3();
    }

    /**
     * Create an instance of {@link ServiceGetResponse }
     * 
     */
    public ServiceGetResponse createServiceGetResponse() {
        return new ServiceGetResponse();
    }

    /**
     * Create an instance of {@link GiftListGetByClientCpfResponse }
     * 
     */
    public GiftListGetByClientCpfResponse createGiftListGetByClientCpfResponse() {
        return new GiftListGetByClientCpfResponse();
    }

    /**
     * Create an instance of {@link ProductGetByRefId }
     * 
     */
    public ProductGetByRefId createProductGetByRefId() {
        return new ProductGetByRefId();
    }

    /**
     * Create an instance of {@link BrandInsertUpdateResponse }
     * 
     */
    public BrandInsertUpdateResponse createBrandInsertUpdateResponse() {
        return new BrandInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitImageRemoveByName }
     * 
     */
    public StockKeepingUnitImageRemoveByName createStockKeepingUnitImageRemoveByName() {
        return new StockKeepingUnitImageRemoveByName();
    }

    /**
     * Create an instance of {@link ClientGetByGuidV3Response }
     * 
     */
    public ClientGetByGuidV3Response createClientGetByGuidV3Response() {
        return new ClientGetByGuidV3Response();
    }

    /**
     * Create an instance of {@link WareHouseIStockableUpdateResponse }
     * 
     */
    public WareHouseIStockableUpdateResponse createWareHouseIStockableUpdateResponse() {
        return new WareHouseIStockableUpdateResponse();
    }

    /**
     * Create an instance of {@link GiftListMemberInsertUpdate }
     * 
     */
    public GiftListMemberInsertUpdate createGiftListMemberInsertUpdate() {
        return new GiftListMemberInsertUpdate();
    }

    /**
     * Create an instance of {@link ArrayOfGiftListMemberDTO }
     * 
     */
    public ArrayOfGiftListMemberDTO createArrayOfGiftListMemberDTO() {
        return new ArrayOfGiftListMemberDTO();
    }

    /**
     * Create an instance of {@link GiftListGetByClientEmailResponse }
     * 
     */
    public GiftListGetByClientEmailResponse createGiftListGetByClientEmailResponse() {
        return new GiftListGetByClientEmailResponse();
    }

    /**
     * Create an instance of {@link GiftCardGetResponse }
     * 
     */
    public GiftCardGetResponse createGiftCardGetResponse() {
        return new GiftCardGetResponse();
    }

    /**
     * Create an instance of {@link GiftListGetByModifiedDateResponse }
     * 
     */
    public GiftListGetByModifiedDateResponse createGiftListGetByModifiedDateResponse() {
        return new GiftListGetByModifiedDateResponse();
    }

    /**
     * Create an instance of {@link GiftListSkuSetPurchased }
     * 
     */
    public GiftListSkuSetPurchased createGiftListSkuSetPurchased() {
        return new GiftListSkuSetPurchased();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationInsertByFieldId }
     * 
     */
    public StockKeepingUnitEspecificationInsertByFieldId createStockKeepingUnitEspecificationInsertByFieldId() {
        return new StockKeepingUnitEspecificationInsertByFieldId();
    }

    /**
     * Create an instance of {@link StockKeepingUnitPriceUpdateResponse }
     * 
     */
    public StockKeepingUnitPriceUpdateResponse createStockKeepingUnitPriceUpdateResponse() {
        return new StockKeepingUnitPriceUpdateResponse();
    }

    /**
     * Create an instance of {@link GiftCardGetByRedeptionCodeResponse }
     * 
     */
    public GiftCardGetByRedeptionCodeResponse createGiftCardGetByRedeptionCodeResponse() {
        return new GiftCardGetByRedeptionCodeResponse();
    }

    /**
     * Create an instance of {@link WareHouseIStockableGetByStockKeepingUnitV3 }
     * 
     */
    public WareHouseIStockableGetByStockKeepingUnitV3 createWareHouseIStockableGetByStockKeepingUnitV3() {
        return new WareHouseIStockableGetByStockKeepingUnitV3();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertResponse }
     * 
     */
    public ProductEspecificationInsertResponse createProductEspecificationInsertResponse() {
        return new ProductEspecificationInsertResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetAllFromUpdatedDateResponse }
     * 
     */
    public StockKeepingUnitGetAllFromUpdatedDateResponse createStockKeepingUnitGetAllFromUpdatedDateResponse() {
        return new StockKeepingUnitGetAllFromUpdatedDateResponse();
    }

    /**
     * Create an instance of {@link OrderGetByClientCpfResponse }
     * 
     */
    public OrderGetByClientCpfResponse createOrderGetByClientCpfResponse() {
        return new OrderGetByClientCpfResponse();
    }

    /**
     * Create an instance of {@link UpdateNotifyShippingResponse }
     * 
     */
    public UpdateNotifyShippingResponse createUpdateNotifyShippingResponse() {
        return new UpdateNotifyShippingResponse();
    }

    /**
     * Create an instance of {@link OrderGetByStatus }
     * 
     */
    public OrderGetByStatus createOrderGetByStatus() {
        return new OrderGetByStatus();
    }

    /**
     * Create an instance of {@link GiftListSearch }
     * 
     */
    public GiftListSearch createGiftListSearch() {
        return new GiftListSearch();
    }

    /**
     * Create an instance of {@link GiftListGetAllBetweenEventDateIntervalAndIdResponse }
     * 
     */
    public GiftListGetAllBetweenEventDateIntervalAndIdResponse createGiftListGetAllBetweenEventDateIntervalAndIdResponse() {
        return new GiftListGetAllBetweenEventDateIntervalAndIdResponse();
    }

    /**
     * Create an instance of {@link OrderChangeTrackingNumberV3Response }
     * 
     */
    public OrderChangeTrackingNumberV3Response createOrderChangeTrackingNumberV3Response() {
        return new OrderChangeTrackingNumberV3Response();
    }

    /**
     * Create an instance of {@link StockKeepingUnitImageRemoveByNameResponse }
     * 
     */
    public StockKeepingUnitImageRemoveByNameResponse createStockKeepingUnitImageRemoveByNameResponse() {
        return new StockKeepingUnitImageRemoveByNameResponse();
    }

    /**
     * Create an instance of {@link ClientGetAllFromCreatedDateAndId }
     * 
     */
    public ClientGetAllFromCreatedDateAndId createClientGetAllFromCreatedDateAndId() {
        return new ClientGetAllFromCreatedDateAndId();
    }

    /**
     * Create an instance of {@link GiftListGetAllBetweenEventDateIntervalAndId }
     * 
     */
    public GiftListGetAllBetweenEventDateIntervalAndId createGiftListGetAllBetweenEventDateIntervalAndId() {
        return new GiftListGetAllBetweenEventDateIntervalAndId();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertByList }
     * 
     */
    public ProductEspecificationInsertByList createProductEspecificationInsertByList() {
        return new ProductEspecificationInsertByList();
    }

    /**
     * Create an instance of {@link ArrayOfProductFieldNameDTO }
     * 
     */
    public ArrayOfProductFieldNameDTO createArrayOfProductFieldNameDTO() {
        return new ArrayOfProductFieldNameDTO();
    }

    /**
     * Create an instance of {@link GiftListSearchResponse }
     * 
     */
    public GiftListSearchResponse createGiftListSearchResponse() {
        return new GiftListSearchResponse();
    }

    /**
     * Create an instance of {@link GiftListSkuGetResponse }
     * 
     */
    public GiftListSkuGetResponse createGiftListSkuGetResponse() {
        return new GiftListSkuGetResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGiftListStockKeepingUnitDTO }
     * 
     */
    public ArrayOfGiftListStockKeepingUnitDTO createArrayOfGiftListStockKeepingUnitDTO() {
        return new ArrayOfGiftListStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link ProductSetSimilarCategoryResponse }
     * 
     */
    public ProductSetSimilarCategoryResponse createProductSetSimilarCategoryResponse() {
        return new ProductSetSimilarCategoryResponse();
    }

    /**
     * Create an instance of {@link GiftListSkuDeleteByListResponse }
     * 
     */
    public GiftListSkuDeleteByListResponse createGiftListSkuDeleteByListResponse() {
        return new GiftListSkuDeleteByListResponse();
    }

    /**
     * Create an instance of {@link OrderChangeTrackingNumberResponse }
     * 
     */
    public OrderChangeTrackingNumberResponse createOrderChangeTrackingNumberResponse() {
        return new OrderChangeTrackingNumberResponse();
    }

    /**
     * Create an instance of {@link ProductGet }
     * 
     */
    public ProductGet createProductGet() {
        return new ProductGet();
    }

    /**
     * Create an instance of {@link OrderChangeTrackingNumber }
     * 
     */
    public OrderChangeTrackingNumber createOrderChangeTrackingNumber() {
        return new OrderChangeTrackingNumber();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationInsert }
     * 
     */
    public StockKeepingUnitEspecificationInsert createStockKeepingUnitEspecificationInsert() {
        return new StockKeepingUnitEspecificationInsert();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertByListFieldIds }
     * 
     */
    public ProductEspecificationInsertByListFieldIds createProductEspecificationInsertByListFieldIds() {
        return new ProductEspecificationInsertByListFieldIds();
    }

    /**
     * Create an instance of {@link ArrayOfProductFieldIdDTO }
     * 
     */
    public ArrayOfProductFieldIdDTO createArrayOfProductFieldIdDTO() {
        return new ArrayOfProductFieldIdDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetByManufacturerCodeResponse }
     * 
     */
    public StockKeepingUnitGetByManufacturerCodeResponse createStockKeepingUnitGetByManufacturerCodeResponse() {
        return new StockKeepingUnitGetByManufacturerCodeResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitComplementInsertUpdate }
     * 
     */
    public StockKeepingUnitComplementInsertUpdate createStockKeepingUnitComplementInsertUpdate() {
        return new StockKeepingUnitComplementInsertUpdate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitComplementDTO }
     * 
     */
    public StockKeepingUnitComplementDTO createStockKeepingUnitComplementDTO() {
        return new StockKeepingUnitComplementDTO();
    }

    /**
     * Create an instance of {@link CategoryInsertUpdate }
     * 
     */
    public CategoryInsertUpdate createCategoryInsertUpdate() {
        return new CategoryInsertUpdate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitImageRemove }
     * 
     */
    public StockKeepingUnitImageRemove createStockKeepingUnitImageRemove() {
        return new StockKeepingUnitImageRemove();
    }

    /**
     * Create an instance of {@link WareHouseIStockableUpdate }
     * 
     */
    public WareHouseIStockableUpdate createWareHouseIStockableUpdate() {
        return new WareHouseIStockableUpdate();
    }

    /**
     * Create an instance of {@link AddressInsertUpdateV3 }
     * 
     */
    public AddressInsertUpdateV3 createAddressInsertUpdateV3() {
        return new AddressInsertUpdateV3();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEspecificationInsertByFieldIdResponse }
     * 
     */
    public StockKeepingUnitEspecificationInsertByFieldIdResponse createStockKeepingUnitEspecificationInsertByFieldIdResponse() {
        return new StockKeepingUnitEspecificationInsertByFieldIdResponse();
    }

    /**
     * Create an instance of {@link ServicePriceListResponse }
     * 
     */
    public ServicePriceListResponse createServicePriceListResponse() {
        return new ServicePriceListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfServicePriceDTO }
     * 
     */
    public ArrayOfServicePriceDTO createArrayOfServicePriceDTO() {
        return new ArrayOfServicePriceDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetByRefId }
     * 
     */
    public StockKeepingUnitGetByRefId createStockKeepingUnitGetByRefId() {
        return new StockKeepingUnitGetByRefId();
    }

    /**
     * Create an instance of {@link IntegrationErrorCheckInstanceExistsResponse }
     * 
     */
    public IntegrationErrorCheckInstanceExistsResponse createIntegrationErrorCheckInstanceExistsResponse() {
        return new IntegrationErrorCheckInstanceExistsResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitListByParent }
     * 
     */
    public StockKeepingUnitKitListByParent createStockKeepingUnitKitListByParent() {
        return new StockKeepingUnitKitListByParent();
    }

    /**
     * Create an instance of {@link ClientInsertUpdateV3Response }
     * 
     */
    public ClientInsertUpdateV3Response createClientInsertUpdateV3Response() {
        return new ClientInsertUpdateV3Response();
    }

    /**
     * Create an instance of {@link GiftListGetByCreatedDate }
     * 
     */
    public GiftListGetByCreatedDate createGiftListGetByCreatedDate() {
        return new GiftListGetByCreatedDate();
    }

    /**
     * Create an instance of {@link StockKeepingUnitImageRemoveResponse }
     * 
     */
    public StockKeepingUnitImageRemoveResponse createStockKeepingUnitImageRemoveResponse() {
        return new StockKeepingUnitImageRemoveResponse();
    }

    /**
     * Create an instance of {@link GiftListMemberInsertUpdateResponse }
     * 
     */
    public GiftListMemberInsertUpdateResponse createGiftListMemberInsertUpdateResponse() {
        return new GiftListMemberInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link OrderGetV3 }
     * 
     */
    public OrderGetV3 createOrderGetV3() {
        return new OrderGetV3();
    }

    /**
     * Create an instance of {@link GiftListGetByClientCpf }
     * 
     */
    public GiftListGetByClientCpf createGiftListGetByClientCpf() {
        return new GiftListGetByClientCpf();
    }

    /**
     * Create an instance of {@link StockKeepingUnitInsertUpdate }
     * 
     */
    public StockKeepingUnitInsertUpdate createStockKeepingUnitInsertUpdate() {
        return new StockKeepingUnitInsertUpdate();
    }

    /**
     * Create an instance of {@link IntegrationInterfaceGetAllResponse }
     * 
     */
    public IntegrationInterfaceGetAllResponse createIntegrationInterfaceGetAllResponse() {
        return new IntegrationInterfaceGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationInterfaceDTO }
     * 
     */
    public ArrayOfIntegrationInterfaceDTO createArrayOfIntegrationInterfaceDTO() {
        return new ArrayOfIntegrationInterfaceDTO();
    }

    /**
     * Create an instance of {@link GiftListGetByCreatedDateResponse }
     * 
     */
    public GiftListGetByCreatedDateResponse createGiftListGetByCreatedDateResponse() {
        return new GiftListGetByCreatedDateResponse();
    }

    /**
     * Create an instance of {@link ServicePriceList }
     * 
     */
    public ServicePriceList createServicePriceList() {
        return new ServicePriceList();
    }

    /**
     * Create an instance of {@link NewsletterGetAllByDateResponse }
     * 
     */
    public NewsletterGetAllByDateResponse createNewsletterGetAllByDateResponse() {
        return new NewsletterGetAllByDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNewsletterDTO }
     * 
     */
    public ArrayOfNewsletterDTO createArrayOfNewsletterDTO() {
        return new ArrayOfNewsletterDTO();
    }

    /**
     * Create an instance of {@link GiftListGetAllFromModifiedDateAndId }
     * 
     */
    public GiftListGetAllFromModifiedDateAndId createGiftListGetAllFromModifiedDateAndId() {
        return new GiftListGetAllFromModifiedDateAndId();
    }

    /**
     * Create an instance of {@link ProductInsertUpdate }
     * 
     */
    public ProductInsertUpdate createProductInsertUpdate() {
        return new ProductInsertUpdate();
    }

    /**
     * Create an instance of {@link StoreGetResponse }
     * 
     */
    public StoreGetResponse createStoreGetResponse() {
        return new StoreGetResponse();
    }

    /**
     * Create an instance of {@link StoreDTO }
     * 
     */
    public StoreDTO createStoreDTO() {
        return new StoreDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitPriceUpdateByRefId }
     * 
     */
    public StockKeepingUnitPriceUpdateByRefId createStockKeepingUnitPriceUpdateByRefId() {
        return new StockKeepingUnitPriceUpdateByRefId();
    }

    /**
     * Create an instance of {@link IntegrationInterfaceGetAll }
     * 
     */
    public IntegrationInterfaceGetAll createIntegrationInterfaceGetAll() {
        return new IntegrationInterfaceGetAll();
    }

    /**
     * Create an instance of {@link IntegrationLogError }
     * 
     */
    public IntegrationLogError createIntegrationLogError() {
        return new IntegrationLogError();
    }

    /**
     * Create an instance of {@link ClientGetByEmailV3Response }
     * 
     */
    public ClientGetByEmailV3Response createClientGetByEmailV3Response() {
        return new ClientGetByEmailV3Response();
    }

    /**
     * Create an instance of {@link GiftListGetResponse }
     * 
     */
    public GiftListGetResponse createGiftListGetResponse() {
        return new GiftListGetResponse();
    }

    /**
     * Create an instance of {@link ClientGetResponse }
     * 
     */
    public ClientGetResponse createClientGetResponse() {
        return new ClientGetResponse();
    }

    /**
     * Create an instance of {@link GiftListV2FiltersResponse }
     * 
     */
    public GiftListV2FiltersResponse createGiftListV2FiltersResponse() {
        return new GiftListV2FiltersResponse();
    }

    /**
     * Create an instance of {@link OrderGetResponse }
     * 
     */
    public OrderGetResponse createOrderGetResponse() {
        return new OrderGetResponse();
    }

    /**
     * Create an instance of {@link OrderDTO }
     * 
     */
    public OrderDTO createOrderDTO() {
        return new OrderDTO();
    }

    /**
     * Create an instance of {@link CategoryGetByNameResponse }
     * 
     */
    public CategoryGetByNameResponse createCategoryGetByNameResponse() {
        return new CategoryGetByNameResponse();
    }

    /**
     * Create an instance of {@link BrandGetByName }
     * 
     */
    public BrandGetByName createBrandGetByName() {
        return new BrandGetByName();
    }

    /**
     * Create an instance of {@link WareHouseIStockableUpdateV3 }
     * 
     */
    public WareHouseIStockableUpdateV3 createWareHouseIStockableUpdateV3() {
        return new WareHouseIStockableUpdateV3();
    }

    /**
     * Create an instance of {@link OrderChangeTrackingNumberV3 }
     * 
     */
    public OrderChangeTrackingNumberV3 createOrderChangeTrackingNumberV3() {
        return new OrderChangeTrackingNumberV3();
    }

    /**
     * Create an instance of {@link GiftListSkuSetPurchasedResponse }
     * 
     */
    public GiftListSkuSetPurchasedResponse createGiftListSkuSetPurchasedResponse() {
        return new GiftListSkuSetPurchasedResponse();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertByListResponse }
     * 
     */
    public ProductEspecificationInsertByListResponse createProductEspecificationInsertByListResponse() {
        return new ProductEspecificationInsertByListResponse();
    }

    /**
     * Create an instance of {@link IntegrationSettings }
     * 
     */
    public IntegrationSettings createIntegrationSettings() {
        return new IntegrationSettings();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceInsertUpdateResponse }
     * 
     */
    public StockKeepingUnitServiceInsertUpdateResponse createStockKeepingUnitServiceInsertUpdateResponse() {
        return new StockKeepingUnitServiceInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ImageInsertUpdateResponse }
     * 
     */
    public ImageInsertUpdateResponse createImageInsertUpdateResponse() {
        return new ImageInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link OrderGetByStatusResponse }
     * 
     */
    public OrderGetByStatusResponse createOrderGetByStatusResponse() {
        return new OrderGetByStatusResponse();
    }

    /**
     * Create an instance of {@link IntegrationLog }
     * 
     */
    public IntegrationLog createIntegrationLog() {
        return new IntegrationLog();
    }

    /**
     * Create an instance of {@link ProductEspecificationListByProductIdResponse }
     * 
     */
    public ProductEspecificationListByProductIdResponse createProductEspecificationListByProductIdResponse() {
        return new ProductEspecificationListByProductIdResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetAllFromUpdatedDateAndIdResponse }
     * 
     */
    public StockKeepingUnitGetAllFromUpdatedDateAndIdResponse createStockKeepingUnitGetAllFromUpdatedDateAndIdResponse() {
        return new StockKeepingUnitGetAllFromUpdatedDateAndIdResponse();
    }

    /**
     * Create an instance of {@link OrderGetV3Response }
     * 
     */
    public OrderGetV3Response createOrderGetV3Response() {
        return new OrderGetV3Response();
    }

    /**
     * Create an instance of {@link GiftCardGet }
     * 
     */
    public GiftCardGet createGiftCardGet() {
        return new GiftCardGet();
    }

    /**
     * Create an instance of {@link ImageListByStockKeepingUnitId }
     * 
     */
    public ImageListByStockKeepingUnitId createImageListByStockKeepingUnitId() {
        return new ImageListByStockKeepingUnitId();
    }

    /**
     * Create an instance of {@link ProductEspecificationTextInsertByFieldId }
     * 
     */
    public ProductEspecificationTextInsertByFieldId createProductEspecificationTextInsertByFieldId() {
        return new ProductEspecificationTextInsertByFieldId();
    }

    /**
     * Create an instance of {@link IntegrationErrorGetAllByErrorTypeAndId }
     * 
     */
    public IntegrationErrorGetAllByErrorTypeAndId createIntegrationErrorGetAllByErrorTypeAndId() {
        return new IntegrationErrorGetAllByErrorTypeAndId();
    }

    /**
     * Create an instance of {@link StockKeepingUnitServiceGet }
     * 
     */
    public StockKeepingUnitServiceGet createStockKeepingUnitServiceGet() {
        return new StockKeepingUnitServiceGet();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetByRefIdResponse }
     * 
     */
    public StockKeepingUnitGetByRefIdResponse createStockKeepingUnitGetByRefIdResponse() {
        return new StockKeepingUnitGetByRefIdResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetAllFromUpdatedDateAndId }
     * 
     */
    public StockKeepingUnitGetAllFromUpdatedDateAndId createStockKeepingUnitGetAllFromUpdatedDateAndId() {
        return new StockKeepingUnitGetAllFromUpdatedDateAndId();
    }

    /**
     * Create an instance of {@link StockKeepingUnitActive }
     * 
     */
    public StockKeepingUnitActive createStockKeepingUnitActive() {
        return new StockKeepingUnitActive();
    }

    /**
     * Create an instance of {@link OrderGetByClientCpf }
     * 
     */
    public OrderGetByClientCpf createOrderGetByClientCpf() {
        return new OrderGetByClientCpf();
    }

    /**
     * Create an instance of {@link AddressGetByClientIdV3Response }
     * 
     */
    public AddressGetByClientIdV3Response createAddressGetByClientIdV3Response() {
        return new AddressGetByClientIdV3Response();
    }

    /**
     * Create an instance of {@link ArrayOfAddressDTO }
     * 
     */
    public ArrayOfAddressDTO createArrayOfAddressDTO() {
        return new ArrayOfAddressDTO();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertByFieldIdResponse }
     * 
     */
    public ProductEspecificationInsertByFieldIdResponse createProductEspecificationInsertByFieldIdResponse() {
        return new ProductEspecificationInsertByFieldIdResponse();
    }

    /**
     * Create an instance of {@link GiftCardInsertUpdateResponse }
     * 
     */
    public GiftCardInsertUpdateResponse createGiftCardInsertUpdateResponse() {
        return new GiftCardInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link GiftListGetAllFromModifiedDateAndIdResponse }
     * 
     */
    public GiftListGetAllFromModifiedDateAndIdResponse createGiftListGetAllFromModifiedDateAndIdResponse() {
        return new GiftListGetAllFromModifiedDateAndIdResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitListBySkuIdResponse }
     * 
     */
    public StockKeepingUnitKitListBySkuIdResponse createStockKeepingUnitKitListBySkuIdResponse() {
        return new StockKeepingUnitKitListBySkuIdResponse();
    }

    /**
     * Create an instance of {@link StoreListResponse }
     * 
     */
    public StoreListResponse createStoreListResponse() {
        return new StoreListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStoreDTO }
     * 
     */
    public ArrayOfStoreDTO createArrayOfStoreDTO() {
        return new ArrayOfStoreDTO();
    }

    /**
     * Create an instance of {@link ProductEspecificationInsertByListFieldIdsResponse }
     * 
     */
    public ProductEspecificationInsertByListFieldIdsResponse createProductEspecificationInsertByListFieldIdsResponse() {
        return new ProductEspecificationInsertByListFieldIdsResponse();
    }

    /**
     * Create an instance of {@link OrderGetInteractionsResponse }
     * 
     */
    public OrderGetInteractionsResponse createOrderGetInteractionsResponse() {
        return new OrderGetInteractionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderInteractionDTO }
     * 
     */
    public ArrayOfOrderInteractionDTO createArrayOfOrderInteractionDTO() {
        return new ArrayOfOrderInteractionDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetAllFromUpdatedDate }
     * 
     */
    public StockKeepingUnitGetAllFromUpdatedDate createStockKeepingUnitGetAllFromUpdatedDate() {
        return new StockKeepingUnitGetAllFromUpdatedDate();
    }

    /**
     * Create an instance of {@link ClientGetAllFromCreatedDateAndIdResponse }
     * 
     */
    public ClientGetAllFromCreatedDateAndIdResponse createClientGetAllFromCreatedDateAndIdResponse() {
        return new ClientGetAllFromCreatedDateAndIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfClientDTO }
     * 
     */
    public ArrayOfClientDTO createArrayOfClientDTO() {
        return new ArrayOfClientDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitListBySkuId }
     * 
     */
    public StockKeepingUnitKitListBySkuId createStockKeepingUnitKitListBySkuId() {
        return new StockKeepingUnitKitListBySkuId();
    }

    /**
     * Create an instance of {@link GiftListGetType }
     * 
     */
    public GiftListGetType createGiftListGetType() {
        return new GiftListGetType();
    }

    /**
     * Create an instance of {@link ZipCodeGetResponse }
     * 
     */
    public ZipCodeGetResponse createZipCodeGetResponse() {
        return new ZipCodeGetResponse();
    }

    /**
     * Create an instance of {@link ZipCodeDTO }
     * 
     */
    public ZipCodeDTO createZipCodeDTO() {
        return new ZipCodeDTO();
    }

    /**
     * Create an instance of {@link IntegrationLogErrorInsertUpdate }
     * 
     */
    public IntegrationLogErrorInsertUpdate createIntegrationLogErrorInsertUpdate() {
        return new IntegrationLogErrorInsertUpdate();
    }

    /**
     * Create an instance of {@link GiftListGetByGiftedResponse }
     * 
     */
    public GiftListGetByGiftedResponse createGiftListGetByGiftedResponse() {
        return new GiftListGetByGiftedResponse();
    }

    /**
     * Create an instance of {@link BrandGetByNameResponse }
     * 
     */
    public BrandGetByNameResponse createBrandGetByNameResponse() {
        return new BrandGetByNameResponse();
    }

    /**
     * Create an instance of {@link FreightCalculateV3 }
     * 
     */
    public FreightCalculateV3 createFreightCalculateV3() {
        return new FreightCalculateV3();
    }

    /**
     * Create an instance of {@link ArrayOfFreightStockKeepingUnitContextDTO }
     * 
     */
    public ArrayOfFreightStockKeepingUnitContextDTO createArrayOfFreightStockKeepingUnitContextDTO() {
        return new ArrayOfFreightStockKeepingUnitContextDTO();
    }

    /**
     * Create an instance of {@link GiftCardTransactionItemInsert }
     * 
     */
    public GiftCardTransactionItemInsert createGiftCardTransactionItemInsert() {
        return new GiftCardTransactionItemInsert();
    }

    /**
     * Create an instance of {@link GiftCardTransactionItemDTO }
     * 
     */
    public GiftCardTransactionItemDTO createGiftCardTransactionItemDTO() {
        return new GiftCardTransactionItemDTO();
    }

    /**
     * Create an instance of {@link GiftListSkuDeleteResponse }
     * 
     */
    public GiftListSkuDeleteResponse createGiftListSkuDeleteResponse() {
        return new GiftListSkuDeleteResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitPriceUpdateByRefIdResponse }
     * 
     */
    public StockKeepingUnitPriceUpdateByRefIdResponse createStockKeepingUnitPriceUpdateByRefIdResponse() {
        return new StockKeepingUnitPriceUpdateByRefIdResponse();
    }

    /**
     * Create an instance of {@link ClientInsertUpdateV3 }
     * 
     */
    public ClientInsertUpdateV3 createClientInsertUpdateV3() {
        return new ClientInsertUpdateV3();
    }

    /**
     * Create an instance of {@link GiftListGetByModifiedDate }
     * 
     */
    public GiftListGetByModifiedDate createGiftListGetByModifiedDate() {
        return new GiftListGetByModifiedDate();
    }

    /**
     * Create an instance of {@link ImageServiceCopyAllImagesFromSkuToSkuResponse }
     * 
     */
    public ImageServiceCopyAllImagesFromSkuToSkuResponse createImageServiceCopyAllImagesFromSkuToSkuResponse() {
        return new ImageServiceCopyAllImagesFromSkuToSkuResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitKitInsertUpdateResponse }
     * 
     */
    public StockKeepingUnitKitInsertUpdateResponse createStockKeepingUnitKitInsertUpdateResponse() {
        return new StockKeepingUnitKitInsertUpdateResponse();
    }

    /**
     * Create an instance of {@link ServicePriceInsertUpdate }
     * 
     */
    public ServicePriceInsertUpdate createServicePriceInsertUpdate() {
        return new ServicePriceInsertUpdate();
    }

    /**
     * Create an instance of {@link FreightCalculateV3Response }
     * 
     */
    public FreightCalculateV3Response createFreightCalculateV3Response() {
        return new FreightCalculateV3Response();
    }

    /**
     * Create an instance of {@link ArrayOfFreightStockKeepingUnitDTO }
     * 
     */
    public ArrayOfFreightStockKeepingUnitDTO createArrayOfFreightStockKeepingUnitDTO() {
        return new ArrayOfFreightStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link GiftListSkuDeleteByList }
     * 
     */
    public GiftListSkuDeleteByList createGiftListSkuDeleteByList() {
        return new GiftListSkuDeleteByList();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitQuantityDTO }
     * 
     */
    public ArrayOfStockKeepingUnitQuantityDTO createArrayOfStockKeepingUnitQuantityDTO() {
        return new ArrayOfStockKeepingUnitQuantityDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetResponse }
     * 
     */
    public StockKeepingUnitGetResponse createStockKeepingUnitGetResponse() {
        return new StockKeepingUnitGetResponse();
    }

    /**
     * Create an instance of {@link StockKeepingUnitGetByEan }
     * 
     */
    public StockKeepingUnitGetByEan createStockKeepingUnitGetByEan() {
        return new StockKeepingUnitGetByEan();
    }

    /**
     * Create an instance of {@link GiftCardTransactionItemInsertResponse }
     * 
     */
    public GiftCardTransactionItemInsertResponse createGiftCardTransactionItemInsertResponse() {
        return new GiftCardTransactionItemInsertResponse();
    }

    /**
     * Create an instance of {@link FreightStockKeepingUnitDTO }
     * 
     */
    public FreightStockKeepingUnitDTO createFreightStockKeepingUnitDTO() {
        return new FreightStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link FreightStockKeepingUnitContextDTO }
     * 
     */
    public FreightStockKeepingUnitContextDTO createFreightStockKeepingUnitContextDTO() {
        return new FreightStockKeepingUnitContextDTO();
    }

    /**
     * Create an instance of {@link IntegrationErrorDTO }
     * 
     */
    public IntegrationErrorDTO createIntegrationErrorDTO() {
        return new IntegrationErrorDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItemDiscountDTO }
     * 
     */
    public ArrayOfOrderItemDiscountDTO createArrayOfOrderItemDiscountDTO() {
        return new ArrayOfOrderItemDiscountDTO();
    }

    /**
     * Create an instance of {@link OrderItemServiceDTO }
     * 
     */
    public OrderItemServiceDTO createOrderItemServiceDTO() {
        return new OrderItemServiceDTO();
    }

    /**
     * Create an instance of {@link IntegrationWarehouseDTO }
     * 
     */
    public IntegrationWarehouseDTO createIntegrationWarehouseDTO() {
        return new IntegrationWarehouseDTO();
    }

    /**
     * Create an instance of {@link AddressOrderDTO }
     * 
     */
    public AddressOrderDTO createAddressOrderDTO() {
        return new AddressOrderDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitFieldNameDTO }
     * 
     */
    public StockKeepingUnitFieldNameDTO createStockKeepingUnitFieldNameDTO() {
        return new StockKeepingUnitFieldNameDTO();
    }

    /**
     * Create an instance of {@link ProductFieldNameDTO }
     * 
     */
    public ProductFieldNameDTO createProductFieldNameDTO() {
        return new ProductFieldNameDTO();
    }

    /**
     * Create an instance of {@link OrderItemDiscountDTO }
     * 
     */
    public OrderItemDiscountDTO createOrderItemDiscountDTO() {
        return new OrderItemDiscountDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDiscountDTO }
     * 
     */
    public ArrayOfOrderDiscountDTO createArrayOfOrderDiscountDTO() {
        return new ArrayOfOrderDiscountDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderInvoiceStockKeepingUnitDTO }
     * 
     */
    public ArrayOfOrderInvoiceStockKeepingUnitDTO createArrayOfOrderInvoiceStockKeepingUnitDTO() {
        return new ArrayOfOrderInvoiceStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link IntegrationInterfaceDTO }
     * 
     */
    public IntegrationInterfaceDTO createIntegrationInterfaceDTO() {
        return new IntegrationInterfaceDTO();
    }

    /**
     * Create an instance of {@link OrderDeliveryDTO }
     * 
     */
    public OrderDeliveryDTO createOrderDeliveryDTO() {
        return new OrderDeliveryDTO();
    }

    /**
     * Create an instance of {@link FreightDTO }
     * 
     */
    public FreightDTO createFreightDTO() {
        return new FreightDTO();
    }

    /**
     * Create an instance of {@link OrderItemDTO }
     * 
     */
    public OrderItemDTO createOrderItemDTO() {
        return new OrderItemDTO();
    }

    /**
     * Create an instance of {@link OrderDiscountDTO }
     * 
     */
    public OrderDiscountDTO createOrderDiscountDTO() {
        return new OrderDiscountDTO();
    }

    /**
     * Create an instance of {@link OrderInteractionDTO }
     * 
     */
    public OrderInteractionDTO createOrderInteractionDTO() {
        return new OrderInteractionDTO();
    }

    /**
     * Create an instance of {@link NewsletterDTO }
     * 
     */
    public NewsletterDTO createNewsletterDTO() {
        return new NewsletterDTO();
    }

    /**
     * Create an instance of {@link OrderPaymentDTO }
     * 
     */
    public OrderPaymentDTO createOrderPaymentDTO() {
        return new OrderPaymentDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDeliveryDTO }
     * 
     */
    public ArrayOfOrderDeliveryDTO createArrayOfOrderDeliveryDTO() {
        return new ArrayOfOrderDeliveryDTO();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitEanDTO }
     * 
     */
    public ArrayOfStockKeepingUnitEanDTO createArrayOfStockKeepingUnitEanDTO() {
        return new ArrayOfStockKeepingUnitEanDTO();
    }

    /**
     * Create an instance of {@link DistributionCenterDTO }
     * 
     */
    public DistributionCenterDTO createDistributionCenterDTO() {
        return new DistributionCenterDTO();
    }

    /**
     * Create an instance of {@link OrderStatusDTO }
     * 
     */
    public OrderStatusDTO createOrderStatusDTO() {
        return new OrderStatusDTO();
    }

    /**
     * Create an instance of {@link OrderInvoiceStockKeepingUnitDTO }
     * 
     */
    public OrderInvoiceStockKeepingUnitDTO createOrderInvoiceStockKeepingUnitDTO() {
        return new OrderInvoiceStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItemDTO }
     * 
     */
    public ArrayOfOrderItemDTO createArrayOfOrderItemDTO() {
        return new ArrayOfOrderItemDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitQuantityDTO }
     * 
     */
    public StockKeepingUnitQuantityDTO createStockKeepingUnitQuantityDTO() {
        return new StockKeepingUnitQuantityDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderInvoiceDTO }
     * 
     */
    public ArrayOfOrderInvoiceDTO createArrayOfOrderInvoiceDTO() {
        return new ArrayOfOrderInvoiceDTO();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationWarehouseDTO }
     * 
     */
    public ArrayOfIntegrationWarehouseDTO createArrayOfIntegrationWarehouseDTO() {
        return new ArrayOfIntegrationWarehouseDTO();
    }

    /**
     * Create an instance of {@link FieldDTO }
     * 
     */
    public FieldDTO createFieldDTO() {
        return new FieldDTO();
    }

    /**
     * Create an instance of {@link ProductFieldIdDTO }
     * 
     */
    public ProductFieldIdDTO createProductFieldIdDTO() {
        return new ProductFieldIdDTO();
    }

    /**
     * Create an instance of {@link GiftListMemberDTO }
     * 
     */
    public GiftListMemberDTO createGiftListMemberDTO() {
        return new GiftListMemberDTO();
    }

    /**
     * Create an instance of {@link FreightScheduledDateOptionDTO }
     * 
     */
    public FreightScheduledDateOptionDTO createFreightScheduledDateOptionDTO() {
        return new FreightScheduledDateOptionDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItemServiceDTO }
     * 
     */
    public ArrayOfOrderItemServiceDTO createArrayOfOrderItemServiceDTO() {
        return new ArrayOfOrderItemServiceDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitEanDTO }
     * 
     */
    public StockKeepingUnitEanDTO createStockKeepingUnitEanDTO() {
        return new StockKeepingUnitEanDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderPaymentDTO }
     * 
     */
    public ArrayOfOrderPaymentDTO createArrayOfOrderPaymentDTO() {
        return new ArrayOfOrderPaymentDTO();
    }

    /**
     * Create an instance of {@link PaymentDTO }
     * 
     */
    public PaymentDTO createPaymentDTO() {
        return new PaymentDTO();
    }

    /**
     * Create an instance of {@link AddressDTO2 }
     * 
     */
    public AddressDTO2 createAddressDTO2() {
        return new AddressDTO2();
    }

    /**
     * Create an instance of {@link ArrayOfFreightScheduledDateOptionDTO }
     * 
     */
    public ArrayOfFreightScheduledDateOptionDTO createArrayOfFreightScheduledDateOptionDTO() {
        return new ArrayOfFreightScheduledDateOptionDTO();
    }

    /**
     * Create an instance of {@link DateTimeOffset }
     * 
     */
    public DateTimeOffset createDateTimeOffset() {
        return new DateTimeOffset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationWarehouseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfIntegrationWarehouseDTO")
    public JAXBElement<ArrayOfIntegrationWarehouseDTO> createArrayOfIntegrationWarehouseDTO(ArrayOfIntegrationWarehouseDTO value) {
        return new JAXBElement<ArrayOfIntegrationWarehouseDTO>(_ArrayOfIntegrationWarehouseDTO_QNAME, ArrayOfIntegrationWarehouseDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderInvoiceDTO")
    public JAXBElement<ArrayOfOrderInvoiceDTO> createArrayOfOrderInvoiceDTO(ArrayOfOrderInvoiceDTO value) {
        return new JAXBElement<ArrayOfOrderInvoiceDTO>(_ArrayOfOrderInvoiceDTO_QNAME, ArrayOfOrderInvoiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FieldDTO")
    public JAXBElement<FieldDTO> createFieldDTO(FieldDTO value) {
        return new JAXBElement<FieldDTO>(_FieldDTO_QNAME, FieldDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderStatusDTO")
    public JAXBElement<OrderStatusDTO> createOrderStatusDTO(OrderStatusDTO value) {
        return new JAXBElement<OrderStatusDTO>(_OrderStatusDTO_QNAME, OrderStatusDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionCenterDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DistributionCenterDTO")
    public JAXBElement<DistributionCenterDTO> createDistributionCenterDTO(DistributionCenterDTO value) {
        return new JAXBElement<DistributionCenterDTO>(_DistributionCenterDTO_QNAME, DistributionCenterDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderItemDTO")
    public JAXBElement<ArrayOfOrderItemDTO> createArrayOfOrderItemDTO(ArrayOfOrderItemDTO value) {
        return new JAXBElement<ArrayOfOrderItemDTO>(_ArrayOfOrderItemDTO_QNAME, ArrayOfOrderItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitEanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitEanDTO")
    public JAXBElement<ArrayOfStockKeepingUnitEanDTO> createArrayOfStockKeepingUnitEanDTO(ArrayOfStockKeepingUnitEanDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitEanDTO>(_ArrayOfStockKeepingUnitEanDTO_QNAME, ArrayOfStockKeepingUnitEanDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationInterfaceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfIntegrationInterfaceDTO")
    public JAXBElement<ArrayOfIntegrationInterfaceDTO> createArrayOfIntegrationInterfaceDTO(ArrayOfIntegrationInterfaceDTO value) {
        return new JAXBElement<ArrayOfIntegrationInterfaceDTO>(_ArrayOfIntegrationInterfaceDTO_QNAME, ArrayOfIntegrationInterfaceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDeliveryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderDeliveryDTO")
    public JAXBElement<ArrayOfOrderDeliveryDTO> createArrayOfOrderDeliveryDTO(ArrayOfOrderDeliveryDTO value) {
        return new JAXBElement<ArrayOfOrderDeliveryDTO>(_ArrayOfOrderDeliveryDTO_QNAME, ArrayOfOrderDeliveryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitContextDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfFreightStockKeepingUnitContextDTO")
    public JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO> createArrayOfFreightStockKeepingUnitContextDTO(ArrayOfFreightStockKeepingUnitContextDTO value) {
        return new JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO>(_ArrayOfFreightStockKeepingUnitContextDTO_QNAME, ArrayOfFreightStockKeepingUnitContextDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInteractionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderInteractionDTO")
    public JAXBElement<OrderInteractionDTO> createOrderInteractionDTO(OrderInteractionDTO value) {
        return new JAXBElement<OrderInteractionDTO>(_OrderInteractionDTO_QNAME, OrderInteractionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListMemberDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfGiftListMemberDTO")
    public JAXBElement<ArrayOfGiftListMemberDTO> createArrayOfGiftListMemberDTO(ArrayOfGiftListMemberDTO value) {
        return new JAXBElement<ArrayOfGiftListMemberDTO>(_ArrayOfGiftListMemberDTO_QNAME, ArrayOfGiftListMemberDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeOffset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "DateTimeOffset")
    public JAXBElement<DateTimeOffset> createDateTimeOffset(DateTimeOffset value) {
        return new JAXBElement<DateTimeOffset>(_DateTimeOffset_QNAME, DateTimeOffset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightScheduledDateOptionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfFreightScheduledDateOptionDTO")
    public JAXBElement<ArrayOfFreightScheduledDateOptionDTO> createArrayOfFreightScheduledDateOptionDTO(ArrayOfFreightScheduledDateOptionDTO value) {
        return new JAXBElement<ArrayOfFreightScheduledDateOptionDTO>(_ArrayOfFreightScheduledDateOptionDTO_QNAME, ArrayOfFreightScheduledDateOptionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListTypeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListTypeDTO")
    public JAXBElement<GiftListTypeDTO> createGiftListTypeDTO(GiftListTypeDTO value) {
        return new JAXBElement<GiftListTypeDTO>(_GiftListTypeDTO_QNAME, GiftListTypeDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardTransactionItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardTransactionItemDTO")
    public JAXBElement<GiftCardTransactionItemDTO> createGiftCardTransactionItemDTO(GiftCardTransactionItemDTO value) {
        return new JAXBElement<GiftCardTransactionItemDTO>(_GiftCardTransactionItemDTO_QNAME, GiftCardTransactionItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CategoryDTO")
    public JAXBElement<CategoryDTO> createCategoryDTO(CategoryDTO value) {
        return new JAXBElement<CategoryDTO>(_CategoryDTO_QNAME, CategoryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitEanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitEanDTO")
    public JAXBElement<StockKeepingUnitEanDTO> createStockKeepingUnitEanDTO(StockKeepingUnitEanDTO value) {
        return new JAXBElement<StockKeepingUnitEanDTO>(_StockKeepingUnitEanDTO_QNAME, StockKeepingUnitEanDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentDTO")
    public JAXBElement<PaymentDTO> createPaymentDTO(PaymentDTO value) {
        return new JAXBElement<PaymentDTO>(_PaymentDTO_QNAME, PaymentDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfClientDTO")
    public JAXBElement<ArrayOfClientDTO> createArrayOfClientDTO(ArrayOfClientDTO value) {
        return new JAXBElement<ArrayOfClientDTO>(_ArrayOfClientDTO_QNAME, ArrayOfClientDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListStockKeepingUnitDTO")
    public JAXBElement<GiftListStockKeepingUnitDTO> createGiftListStockKeepingUnitDTO(GiftListStockKeepingUnitDTO value) {
        return new JAXBElement<GiftListStockKeepingUnitDTO>(_GiftListStockKeepingUnitDTO_QNAME, GiftListStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightScheduledDateOptionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightScheduledDateOptionDTO")
    public JAXBElement<FreightScheduledDateOptionDTO> createFreightScheduledDateOptionDTO(FreightScheduledDateOptionDTO value) {
        return new JAXBElement<FreightScheduledDateOptionDTO>(_FreightScheduledDateOptionDTO_QNAME, FreightScheduledDateOptionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IntegrationDTO")
    public JAXBElement<IntegrationDTO> createIntegrationDTO(IntegrationDTO value) {
        return new JAXBElement<IntegrationDTO>(_IntegrationDTO_QNAME, IntegrationDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductFieldIdDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductFieldIdDTO")
    public JAXBElement<ProductFieldIdDTO> createProductFieldIdDTO(ProductFieldIdDTO value) {
        return new JAXBElement<ProductFieldIdDTO>(_ProductFieldIdDTO_QNAME, ProductFieldIdDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationWarehouseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IntegrationWarehouseDTO")
    public JAXBElement<IntegrationWarehouseDTO> createIntegrationWarehouseDTO(IntegrationWarehouseDTO value) {
        return new JAXBElement<IntegrationWarehouseDTO>(_IntegrationWarehouseDTO_QNAME, IntegrationWarehouseDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfFreightDTO")
    public JAXBElement<ArrayOfFreightDTO> createArrayOfFreightDTO(ArrayOfFreightDTO value) {
        return new JAXBElement<ArrayOfFreightDTO>(_ArrayOfFreightDTO_QNAME, ArrayOfFreightDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationErrorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IntegrationErrorDTO")
    public JAXBElement<IntegrationErrorDTO> createIntegrationErrorDTO(IntegrationErrorDTO value) {
        return new JAXBElement<IntegrationErrorDTO>(_IntegrationErrorDTO_QNAME, IntegrationErrorDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitKitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitKitDTO")
    public JAXBElement<ArrayOfStockKeepingUnitKitDTO> createArrayOfStockKeepingUnitKitDTO(ArrayOfStockKeepingUnitKitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitKitDTO>(_ArrayOfStockKeepingUnitKitDTO_QNAME, ArrayOfStockKeepingUnitKitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfProductDTO")
    public JAXBElement<ArrayOfProductDTO> createArrayOfProductDTO(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ArrayOfProductDTO_QNAME, ArrayOfProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfGiftListDTO")
    public JAXBElement<ArrayOfGiftListDTO> createArrayOfGiftListDTO(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_ArrayOfGiftListDTO_QNAME, ArrayOfGiftListDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderDTO")
    public JAXBElement<OrderDTO> createOrderDTO(OrderDTO value) {
        return new JAXBElement<OrderDTO>(_OrderDTO_QNAME, OrderDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitKitDTO")
    public JAXBElement<StockKeepingUnitKitDTO> createStockKeepingUnitKitDTO(StockKeepingUnitKitDTO value) {
        return new JAXBElement<StockKeepingUnitKitDTO>(_StockKeepingUnitKitDTO_QNAME, StockKeepingUnitKitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipCodeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ZipCodeDTO")
    public JAXBElement<ZipCodeDTO> createZipCodeDTO(ZipCodeDTO value) {
        return new JAXBElement<ZipCodeDTO>(_ZipCodeDTO_QNAME, ZipCodeDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitComplementDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitComplementDTO")
    public JAXBElement<StockKeepingUnitComplementDTO> createStockKeepingUnitComplementDTO(StockKeepingUnitComplementDTO value) {
        return new JAXBElement<StockKeepingUnitComplementDTO>(_StockKeepingUnitComplementDTO_QNAME, StockKeepingUnitComplementDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationErrorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfIntegrationErrorDTO")
    public JAXBElement<ArrayOfIntegrationErrorDTO> createArrayOfIntegrationErrorDTO(ArrayOfIntegrationErrorDTO value) {
        return new JAXBElement<ArrayOfIntegrationErrorDTO>(_ArrayOfIntegrationErrorDTO_QNAME, ArrayOfIntegrationErrorDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TransactionAction")
    public JAXBElement<TransactionAction> createTransactionAction(TransactionAction value) {
        return new JAXBElement<TransactionAction>(_TransactionAction_QNAME, TransactionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "BrandDTO")
    public JAXBElement<BrandDTO> createBrandDTO(BrandDTO value) {
        return new JAXBElement<BrandDTO>(_BrandDTO_QNAME, BrandDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDiscountDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderDiscountDTO")
    public JAXBElement<ArrayOfOrderDiscountDTO> createArrayOfOrderDiscountDTO(ArrayOfOrderDiscountDTO value) {
        return new JAXBElement<ArrayOfOrderDiscountDTO>(_ArrayOfOrderDiscountDTO_QNAME, ArrayOfOrderDiscountDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderInvoiceStockKeepingUnitDTO")
    public JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO> createArrayOfOrderInvoiceStockKeepingUnitDTO(ArrayOfOrderInvoiceStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO>(_ArrayOfOrderInvoiceStockKeepingUnitDTO_QNAME, ArrayOfOrderInvoiceStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressDTO")
    public JAXBElement<AddressDTO> createAddressDTO(AddressDTO value) {
        return new JAXBElement<AddressDTO>(_AddressDTO_QNAME, AddressDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitFieldNameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitFieldNameDTO")
    public JAXBElement<StockKeepingUnitFieldNameDTO> createStockKeepingUnitFieldNameDTO(StockKeepingUnitFieldNameDTO value) {
        return new JAXBElement<StockKeepingUnitFieldNameDTO>(_StockKeepingUnitFieldNameDTO_QNAME, StockKeepingUnitFieldNameDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfPaymentDTO")
    public JAXBElement<ArrayOfPaymentDTO> createArrayOfPaymentDTO(ArrayOfPaymentDTO value) {
        return new JAXBElement<ArrayOfPaymentDTO>(_ArrayOfPaymentDTO_QNAME, ArrayOfPaymentDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressOrderDTO")
    public JAXBElement<AddressOrderDTO> createAddressOrderDTO(AddressOrderDTO value) {
        return new JAXBElement<AddressOrderDTO>(_AddressOrderDTO_QNAME, AddressOrderDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitQuantityDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitQuantityDTO")
    public JAXBElement<StockKeepingUnitQuantityDTO> createStockKeepingUnitQuantityDTO(StockKeepingUnitQuantityDTO value) {
        return new JAXBElement<StockKeepingUnitQuantityDTO>(_StockKeepingUnitQuantityDTO_QNAME, StockKeepingUnitQuantityDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfGiftListStockKeepingUnitDTO")
    public JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> createArrayOfGiftListStockKeepingUnitDTO(ArrayOfGiftListStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfGiftListStockKeepingUnitDTO>(_ArrayOfGiftListStockKeepingUnitDTO_QNAME, ArrayOfGiftListStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInvoiceStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderInvoiceStockKeepingUnitDTO")
    public JAXBElement<OrderInvoiceStockKeepingUnitDTO> createOrderInvoiceStockKeepingUnitDTO(OrderInvoiceStockKeepingUnitDTO value) {
        return new JAXBElement<OrderInvoiceStockKeepingUnitDTO>(_OrderInvoiceStockKeepingUnitDTO_QNAME, OrderInvoiceStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderDTO")
    public JAXBElement<ArrayOfOrderDTO> createArrayOfOrderDTO(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_ArrayOfOrderDTO_QNAME, ArrayOfOrderDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ErrorType")
    public JAXBElement<ErrorType> createErrorType(ErrorType value) {
        return new JAXBElement<ErrorType>(_ErrorType_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImageDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfImageDTO")
    public JAXBElement<ArrayOfImageDTO> createArrayOfImageDTO(ArrayOfImageDTO value) {
        return new JAXBElement<ArrayOfImageDTO>(_ArrayOfImageDTO_QNAME, ArrayOfImageDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ServicePriceDTO")
    public JAXBElement<ServicePriceDTO> createServicePriceDTO(ServicePriceDTO value) {
        return new JAXBElement<ServicePriceDTO>(_ServicePriceDTO_QNAME, ServicePriceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPaymentDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderPaymentDTO")
    public JAXBElement<OrderPaymentDTO> createOrderPaymentDTO(OrderPaymentDTO value) {
        return new JAXBElement<OrderPaymentDTO>(_OrderPaymentDTO_QNAME, OrderPaymentDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitComplementDTOComplementTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitComplementDTO.ComplementTypeEnum")
    public JAXBElement<StockKeepingUnitComplementDTOComplementTypeEnum> createStockKeepingUnitComplementDTOComplementTypeEnum(StockKeepingUnitComplementDTOComplementTypeEnum value) {
        return new JAXBElement<StockKeepingUnitComplementDTOComplementTypeEnum>(_StockKeepingUnitComplementDTOComplementTypeEnum_QNAME, StockKeepingUnitComplementDTOComplementTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDiscountDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderDiscountDTO")
    public JAXBElement<OrderDiscountDTO> createOrderDiscountDTO(OrderDiscountDTO value) {
        return new JAXBElement<OrderDiscountDTO>(_OrderDiscountDTO_QNAME, OrderDiscountDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInteractionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderInteractionDTO")
    public JAXBElement<ArrayOfOrderInteractionDTO> createArrayOfOrderInteractionDTO(ArrayOfOrderInteractionDTO value) {
        return new JAXBElement<ArrayOfOrderInteractionDTO>(_ArrayOfOrderInteractionDTO_QNAME, ArrayOfOrderInteractionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsletterDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "NewsletterDTO")
    public JAXBElement<NewsletterDTO> createNewsletterDTO(NewsletterDTO value) {
        return new JAXBElement<NewsletterDTO>(_NewsletterDTO_QNAME, NewsletterDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderItemDTO")
    public JAXBElement<OrderItemDTO> createOrderItemDTO(OrderItemDTO value) {
        return new JAXBElement<OrderItemDTO>(_OrderItemDTO_QNAME, OrderItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderPaymentDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderPaymentDTO")
    public JAXBElement<ArrayOfOrderPaymentDTO> createArrayOfOrderPaymentDTO(ArrayOfOrderPaymentDTO value) {
        return new JAXBElement<ArrayOfOrderPaymentDTO>(_ArrayOfOrderPaymentDTO_QNAME, ArrayOfOrderPaymentDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDTO2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressDTO2")
    public JAXBElement<AddressDTO2> createAddressDTO2(AddressDTO2 value) {
        return new JAXBElement<AddressDTO2>(_AddressDTO2_QNAME, AddressDTO2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfServicePriceDTO")
    public JAXBElement<ArrayOfServicePriceDTO> createArrayOfServicePriceDTO(ArrayOfServicePriceDTO value) {
        return new JAXBElement<ArrayOfServicePriceDTO>(_ArrayOfServicePriceDTO_QNAME, ArrayOfServicePriceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StoreDTO")
    public JAXBElement<StoreDTO> createStoreDTO(StoreDTO value) {
        return new JAXBElement<StoreDTO>(_StoreDTO_QNAME, StoreDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderItemServiceDTO")
    public JAXBElement<ArrayOfOrderItemServiceDTO> createArrayOfOrderItemServiceDTO(ArrayOfOrderItemServiceDTO value) {
        return new JAXBElement<ArrayOfOrderItemServiceDTO>(_ArrayOfOrderItemServiceDTO_QNAME, ArrayOfOrderItemServiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitDTO")
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitDTO(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitDTO_QNAME, StockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListMemberDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListMemberDTO")
    public JAXBElement<GiftListMemberDTO> createGiftListMemberDTO(GiftListMemberDTO value) {
        return new JAXBElement<GiftListMemberDTO>(_GiftListMemberDTO_QNAME, GiftListMemberDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderStatusDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderStatusDTO")
    public JAXBElement<ArrayOfOrderStatusDTO> createArrayOfOrderStatusDTO(ArrayOfOrderStatusDTO value) {
        return new JAXBElement<ArrayOfOrderStatusDTO>(_ArrayOfOrderStatusDTO_QNAME, ArrayOfOrderStatusDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInvoiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderInvoiceDTO")
    public JAXBElement<OrderInvoiceDTO> createOrderInvoiceDTO(OrderInvoiceDTO value) {
        return new JAXBElement<OrderInvoiceDTO>(_OrderInvoiceDTO_QNAME, OrderInvoiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWareHouseIStockableDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfWareHouseIStockableDTO")
    public JAXBElement<ArrayOfWareHouseIStockableDTO> createArrayOfWareHouseIStockableDTO(ArrayOfWareHouseIStockableDTO value) {
        return new JAXBElement<ArrayOfWareHouseIStockableDTO>(_ArrayOfWareHouseIStockableDTO_QNAME, ArrayOfWareHouseIStockableDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListDTO")
    public JAXBElement<GiftListDTO> createGiftListDTO(GiftListDTO value) {
        return new JAXBElement<GiftListDTO>(_GiftListDTO_QNAME, GiftListDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderItemServiceDTO")
    public JAXBElement<OrderItemServiceDTO> createOrderItemServiceDTO(OrderItemServiceDTO value) {
        return new JAXBElement<OrderItemServiceDTO>(_OrderItemServiceDTO_QNAME, OrderItemServiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDiscountDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfOrderItemDiscountDTO")
    public JAXBElement<ArrayOfOrderItemDiscountDTO> createArrayOfOrderItemDiscountDTO(ArrayOfOrderItemDiscountDTO value) {
        return new JAXBElement<ArrayOfOrderItemDiscountDTO>(_ArrayOfOrderItemDiscountDTO_QNAME, ArrayOfOrderItemDiscountDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightStockKeepingUnitContextDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightStockKeepingUnitContextDTO")
    public JAXBElement<FreightStockKeepingUnitContextDTO> createFreightStockKeepingUnitContextDTO(FreightStockKeepingUnitContextDTO value) {
        return new JAXBElement<FreightStockKeepingUnitContextDTO>(_FreightStockKeepingUnitContextDTO_QNAME, FreightStockKeepingUnitContextDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStoreDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStoreDTO")
    public JAXBElement<ArrayOfStoreDTO> createArrayOfStoreDTO(ArrayOfStoreDTO value) {
        return new JAXBElement<ArrayOfStoreDTO>(_ArrayOfStoreDTO_QNAME, ArrayOfStoreDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInteractionDTOStatusIdEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderInteractionDTO.StatusIdEnum")
    public JAXBElement<OrderInteractionDTOStatusIdEnum> createOrderInteractionDTOStatusIdEnum(OrderInteractionDTOStatusIdEnum value) {
        return new JAXBElement<OrderInteractionDTOStatusIdEnum>(_OrderInteractionDTOStatusIdEnum_QNAME, OrderInteractionDTOStatusIdEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightStockKeepingUnitDTO")
    public JAXBElement<FreightStockKeepingUnitDTO> createFreightStockKeepingUnitDTO(FreightStockKeepingUnitDTO value) {
        return new JAXBElement<FreightStockKeepingUnitDTO>(_FreightStockKeepingUnitDTO_QNAME, FreightStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitServiceDTO")
    public JAXBElement<ArrayOfStockKeepingUnitServiceDTO> createArrayOfStockKeepingUnitServiceDTO(ArrayOfStockKeepingUnitServiceDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitServiceDTO>(_ArrayOfStockKeepingUnitServiceDTO_QNAME, ArrayOfStockKeepingUnitServiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ServiceDTO")
    public JAXBElement<ServiceDTO> createServiceDTO(ServiceDTO value) {
        return new JAXBElement<ServiceDTO>(_ServiceDTO_QNAME, ServiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewsletterDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfNewsletterDTO")
    public JAXBElement<ArrayOfNewsletterDTO> createArrayOfNewsletterDTO(ArrayOfNewsletterDTO value) {
        return new JAXBElement<ArrayOfNewsletterDTO>(_ArrayOfNewsletterDTO_QNAME, ArrayOfNewsletterDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductFieldIdDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfProductFieldIdDTO")
    public JAXBElement<ArrayOfProductFieldIdDTO> createArrayOfProductFieldIdDTO(ArrayOfProductFieldIdDTO value) {
        return new JAXBElement<ArrayOfProductFieldIdDTO>(_ArrayOfProductFieldIdDTO_QNAME, ArrayOfProductFieldIdDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientDTO")
    public JAXBElement<ClientDTO> createClientDTO(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientDTO_QNAME, ClientDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfFreightStockKeepingUnitDTO")
    public JAXBElement<ArrayOfFreightStockKeepingUnitDTO> createArrayOfFreightStockKeepingUnitDTO(ArrayOfFreightStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfFreightStockKeepingUnitDTO>(_ArrayOfFreightStockKeepingUnitDTO_QNAME, ArrayOfFreightStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightDTO")
    public JAXBElement<FreightDTO> createFreightDTO(FreightDTO value) {
        return new JAXBElement<FreightDTO>(_FreightDTO_QNAME, FreightDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ImageDTO")
    public JAXBElement<ImageDTO> createImageDTO(ImageDTO value) {
        return new JAXBElement<ImageDTO>(_ImageDTO_QNAME, ImageDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitFieldNameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitFieldNameDTO")
    public JAXBElement<ArrayOfStockKeepingUnitFieldNameDTO> createArrayOfStockKeepingUnitFieldNameDTO(ArrayOfStockKeepingUnitFieldNameDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitFieldNameDTO>(_ArrayOfStockKeepingUnitFieldNameDTO_QNAME, ArrayOfStockKeepingUnitFieldNameDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitServiceDTO")
    public JAXBElement<StockKeepingUnitServiceDTO> createStockKeepingUnitServiceDTO(StockKeepingUnitServiceDTO value) {
        return new JAXBElement<StockKeepingUnitServiceDTO>(_StockKeepingUnitServiceDTO_QNAME, StockKeepingUnitServiceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfFieldDTO")
    public JAXBElement<ArrayOfFieldDTO> createArrayOfFieldDTO(ArrayOfFieldDTO value) {
        return new JAXBElement<ArrayOfFieldDTO>(_ArrayOfFieldDTO_QNAME, ArrayOfFieldDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfAddressDTO")
    public JAXBElement<ArrayOfAddressDTO> createArrayOfAddressDTO(ArrayOfAddressDTO value) {
        return new JAXBElement<ArrayOfAddressDTO>(_ArrayOfAddressDTO_QNAME, ArrayOfAddressDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDeliveryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderDeliveryDTO")
    public JAXBElement<OrderDeliveryDTO> createOrderDeliveryDTO(OrderDeliveryDTO value) {
        return new JAXBElement<OrderDeliveryDTO>(_OrderDeliveryDTO_QNAME, OrderDeliveryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardDTO")
    public JAXBElement<GiftCardDTO> createGiftCardDTO(GiftCardDTO value) {
        return new JAXBElement<GiftCardDTO>(_GiftCardDTO_QNAME, GiftCardDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitQuantityDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitQuantityDTO")
    public JAXBElement<ArrayOfStockKeepingUnitQuantityDTO> createArrayOfStockKeepingUnitQuantityDTO(ArrayOfStockKeepingUnitQuantityDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitQuantityDTO>(_ArrayOfStockKeepingUnitQuantityDTO_QNAME, ArrayOfStockKeepingUnitQuantityDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfAddressDTO2")
    public JAXBElement<ArrayOfAddressDTO2> createArrayOfAddressDTO2(ArrayOfAddressDTO2 value) {
        return new JAXBElement<ArrayOfAddressDTO2>(_ArrayOfAddressDTO2_QNAME, ArrayOfAddressDTO2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationInterfaceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IntegrationInterfaceDTO")
    public JAXBElement<IntegrationInterfaceDTO> createIntegrationInterfaceDTO(IntegrationInterfaceDTO value) {
        return new JAXBElement<IntegrationInterfaceDTO>(_IntegrationInterfaceDTO_QNAME, IntegrationInterfaceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductFieldNameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductFieldNameDTO")
    public JAXBElement<ProductFieldNameDTO> createProductFieldNameDTO(ProductFieldNameDTO value) {
        return new JAXBElement<ProductFieldNameDTO>(_ProductFieldNameDTO_QNAME, ProductFieldNameDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductFieldNameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfProductFieldNameDTO")
    public JAXBElement<ArrayOfProductFieldNameDTO> createArrayOfProductFieldNameDTO(ArrayOfProductFieldNameDTO value) {
        return new JAXBElement<ArrayOfProductFieldNameDTO>(_ArrayOfProductFieldNameDTO_QNAME, ArrayOfProductFieldNameDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitDTO")
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createArrayOfStockKeepingUnitDTO(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_ArrayOfStockKeepingUnitDTO_QNAME, ArrayOfStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemDiscountDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderItemDiscountDTO")
    public JAXBElement<OrderItemDiscountDTO> createOrderItemDiscountDTO(OrderItemDiscountDTO value) {
        return new JAXBElement<OrderItemDiscountDTO>(_OrderItemDiscountDTO_QNAME, OrderItemDiscountDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WareHouseIStockableDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WareHouseIStockableDTO")
    public JAXBElement<WareHouseIStockableDTO> createWareHouseIStockableDTO(WareHouseIStockableDTO value) {
        return new JAXBElement<WareHouseIStockableDTO>(_WareHouseIStockableDTO_QNAME, WareHouseIStockableDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductGetAllFromUpdatedDateAndIdResult", scope = ProductGetAllFromUpdatedDateAndIdResponse.class)
    public JAXBElement<ArrayOfProductDTO> createProductGetAllFromUpdatedDateAndIdResponseProductGetAllFromUpdatedDateAndIdResult(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ProductGetAllFromUpdatedDateAndIdResponseProductGetAllFromUpdatedDateAndIdResult_QNAME, ArrayOfProductDTO.class, ProductGetAllFromUpdatedDateAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServicePriceInsertUpdateResult", scope = ServicePriceInsertUpdateResponse.class)
    public JAXBElement<ServicePriceDTO> createServicePriceInsertUpdateResponseServicePriceInsertUpdateResult(ServicePriceDTO value) {
        return new JAXBElement<ServicePriceDTO>(_ServicePriceInsertUpdateResponseServicePriceInsertUpdateResult_QNAME, ServicePriceDTO.class, ServicePriceInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "servicePriceId", scope = ServicePriceInsertUpdateResponse.class)
    public JAXBElement<Integer> createServicePriceInsertUpdateResponseServicePriceId(Integer value) {
        return new JAXBElement<Integer>(_ServicePriceInsertUpdateResponseServicePriceId_QNAME, Integer.class, ServicePriceInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BrandGetResult", scope = BrandGetResponse.class)
    public JAXBElement<BrandDTO> createBrandGetResponseBrandGetResult(BrandDTO value) {
        return new JAXBElement<BrandDTO>(_BrandGetResponseBrandGetResult_QNAME, BrandDTO.class, BrandGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductFieldNameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listProductFieldName", scope = ProductEspecificationInsertByList.class)
    public JAXBElement<ArrayOfProductFieldNameDTO> createProductEspecificationInsertByListListProductFieldName(ArrayOfProductFieldNameDTO value) {
        return new JAXBElement<ArrayOfProductFieldNameDTO>(_ProductEspecificationInsertByListListProductFieldName_QNAME, ArrayOfProductFieldNameDTO.class, ProductEspecificationInsertByList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CategoryInsertUpdateResult", scope = CategoryInsertUpdateResponse.class)
    public JAXBElement<CategoryDTO> createCategoryInsertUpdateResponseCategoryInsertUpdateResult(CategoryDTO value) {
        return new JAXBElement<CategoryDTO>(_CategoryInsertUpdateResponseCategoryInsertUpdateResult_QNAME, CategoryDTO.class, CategoryInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IntegrationSettingsResult", scope = IntegrationSettingsResponse.class)
    public JAXBElement<IntegrationDTO> createIntegrationSettingsResponseIntegrationSettingsResult(IntegrationDTO value) {
        return new JAXBElement<IntegrationDTO>(_IntegrationSettingsResponseIntegrationSettingsResult_QNAME, IntegrationDTO.class, IntegrationSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitInsertUpdateResult", scope = StockKeepingUnitInsertUpdateResponse.class)
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitInsertUpdateResponseStockKeepingUnitInsertUpdateResult(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitInsertUpdateResponseStockKeepingUnitInsertUpdateResult_QNAME, StockKeepingUnitDTO.class, StockKeepingUnitInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServicePriceListResult", scope = ServicePriceListResponse.class)
    public JAXBElement<ArrayOfServicePriceDTO> createServicePriceListResponseServicePriceListResult(ArrayOfServicePriceDTO value) {
        return new JAXBElement<ArrayOfServicePriceDTO>(_ServicePriceListResponseServicePriceListResult_QNAME, ArrayOfServicePriceDTO.class, ServicePriceListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "imageName", scope = StockKeepingUnitImageRemoveByName.class)
    public JAXBElement<String> createStockKeepingUnitImageRemoveByNameImageName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitImageRemoveByNameImageName_QNAME, String.class, StockKeepingUnitImageRemoveByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = StoreDTO.class)
    public JAXBElement<String> createStoreDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, StoreDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = StoreDTO.class)
    public JAXBElement<Integer> createStoreDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, StoreDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = StoreDTO.class)
    public JAXBElement<Boolean> createStoreDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, StoreDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "servicePrice", scope = ServicePriceInsertUpdate.class)
    public JAXBElement<ServicePriceDTO> createServicePriceInsertUpdateServicePrice(ServicePriceDTO value) {
        return new JAXBElement<ServicePriceDTO>(_ServicePriceInsertUpdateServicePrice_QNAME, ServicePriceDTO.class, ServicePriceInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListTypeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetTypeResult", scope = GiftListGetTypeResponse.class)
    public JAXBElement<GiftListTypeDTO> createGiftListGetTypeResponseGiftListGetTypeResult(GiftListTypeDTO value) {
        return new JAXBElement<GiftListTypeDTO>(_GiftListGetTypeResponseGiftListGetTypeResult_QNAME, GiftListTypeDTO.class, GiftListGetTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetByGiftedResult", scope = GiftListGetByGiftedResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetByGiftedResponseGiftListGetByGiftedResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetByGiftedResponseGiftListGetByGiftedResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetByGiftedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationErrorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IntegrationErrorGetAllByErrorTypeAndIdResult", scope = IntegrationErrorGetAllByErrorTypeAndIdResponse.class)
    public JAXBElement<ArrayOfIntegrationErrorDTO> createIntegrationErrorGetAllByErrorTypeAndIdResponseIntegrationErrorGetAllByErrorTypeAndIdResult(ArrayOfIntegrationErrorDTO value) {
        return new JAXBElement<ArrayOfIntegrationErrorDTO>(_IntegrationErrorGetAllByErrorTypeAndIdResponseIntegrationErrorGetAllByErrorTypeAndIdResult_QNAME, ArrayOfIntegrationErrorDTO.class, IntegrationErrorGetAllByErrorTypeAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientGetByEmailV3Result", scope = ClientGetByEmailV3Response.class)
    public JAXBElement<ClientDTO> createClientGetByEmailV3ResponseClientGetByEmailV3Result(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientGetByEmailV3ResponseClientGetByEmailV3Result_QNAME, ClientDTO.class, ClientGetByEmailV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftList", scope = GiftListInsertUpdate.class)
    public JAXBElement<GiftListDTO> createGiftListInsertUpdateGiftList(GiftListDTO value) {
        return new JAXBElement<GiftListDTO>(_GiftListInsertUpdateGiftList_QNAME, GiftListDTO.class, GiftListInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nameBrand", scope = BrandGetByName.class)
    public JAXBElement<String> createBrandGetByNameNameBrand(String value) {
        return new JAXBElement<String>(_BrandGetByNameNameBrand_QNAME, String.class, BrandGetByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "imageName", scope = ImageServiceInsertUpdate.class)
    public JAXBElement<String> createImageServiceInsertUpdateImageName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitImageRemoveByNameImageName_QNAME, String.class, ImageServiceInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "urlImage", scope = ImageServiceInsertUpdate.class)
    public JAXBElement<String> createImageServiceInsertUpdateUrlImage(String value) {
        return new JAXBElement<String>(_ImageServiceInsertUpdateUrlImage_QNAME, String.class, ImageServiceInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fileId", scope = ImageServiceInsertUpdate.class)
    public JAXBElement<Integer> createImageServiceInsertUpdateFileId(Integer value) {
        return new JAXBElement<Integer>(_ImageServiceInsertUpdateFileId_QNAME, Integer.class, ImageServiceInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStoreDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StoreListResult", scope = StoreListResponse.class)
    public JAXBElement<ArrayOfStoreDTO> createStoreListResponseStoreListResult(ArrayOfStoreDTO value) {
        return new JAXBElement<ArrayOfStoreDTO>(_StoreListResponseStoreListResult_QNAME, ArrayOfStoreDTO.class, StoreListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderPaymentGetAllResult", scope = OrderPaymentGetAllResponse.class)
    public JAXBElement<ArrayOfPaymentDTO> createOrderPaymentGetAllResponseOrderPaymentGetAllResult(ArrayOfPaymentDTO value) {
        return new JAXBElement<ArrayOfPaymentDTO>(_OrderPaymentGetAllResponseOrderPaymentGetAllResult_QNAME, ArrayOfPaymentDTO.class, OrderPaymentGetAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stockKeepingUnitKit", scope = StockKeepingUnitKitInsertUpdate.class)
    public JAXBElement<StockKeepingUnitKitDTO> createStockKeepingUnitKitInsertUpdateStockKeepingUnitKit(StockKeepingUnitKitDTO value) {
        return new JAXBElement<StockKeepingUnitKitDTO>(_StockKeepingUnitKitInsertUpdateStockKeepingUnitKit_QNAME, StockKeepingUnitKitDTO.class, StockKeepingUnitKitInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wareHouseId", scope = WareHouseIStockableUpdateV3 .class)
    public JAXBElement<String> createWareHouseIStockableUpdateV3WareHouseId(String value) {
        return new JAXBElement<String>(_WareHouseIStockableUpdateV3WareHouseId_QNAME, String.class, WareHouseIStockableUpdateV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetByStatusResult", scope = OrderGetByStatusResponse.class)
    public JAXBElement<ArrayOfOrderDTO> createOrderGetByStatusResponseOrderGetByStatusResult(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_OrderGetByStatusResponseOrderGetByStatusResult_QNAME, ArrayOfOrderDTO.class, OrderGetByStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "statusOrder", scope = OrderGetByStatusByQuantity.class)
    public JAXBElement<String> createOrderGetByStatusByQuantityStatusOrder(String value) {
        return new JAXBElement<String>(_OrderGetByStatusByQuantityStatusOrder_QNAME, String.class, OrderGetByStatusByQuantity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetAllFromCreatedDateAndIdResult", scope = GiftListGetAllFromCreatedDateAndIdResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetAllFromCreatedDateAndIdResponseGiftListGetAllFromCreatedDateAndIdResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetAllFromCreatedDateAndIdResponseGiftListGetAllFromCreatedDateAndIdResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetAllFromCreatedDateAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AbacosWebService", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOAbacosWebService(String value) {
        return new JAXBElement<String>(_IntegrationDTOAbacosWebService_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IVDecryptKey", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOIVDecryptKey(String value) {
        return new JAXBElement<String>(_IntegrationDTOIVDecryptKey_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AbacosDecryptKey", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOAbacosDecryptKey(String value) {
        return new JAXBElement<String>(_IntegrationDTOAbacosDecryptKey_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AbacosKey", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOAbacosKey(String value) {
        return new JAXBElement<String>(_IntegrationDTOAbacosKey_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentIdWithoutTaxes", scope = IntegrationDTO.class)
    public JAXBElement<ArrayOfint> createIntegrationDTOPaymentIdWithoutTaxes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_IntegrationDTOPaymentIdWithoutTaxes_QNAME, ArrayOfint.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = IntegrationDTO.class)
    public JAXBElement<Integer> createIntegrationDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationWarehouseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IntegrationWarehouse", scope = IntegrationDTO.class)
    public JAXBElement<ArrayOfIntegrationWarehouseDTO> createIntegrationDTOIntegrationWarehouse(ArrayOfIntegrationWarehouseDTO value) {
        return new JAXBElement<ArrayOfIntegrationWarehouseDTO>(_IntegrationDTOIntegrationWarehouse_QNAME, ArrayOfIntegrationWarehouseDTO.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientName", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOClientName(String value) {
        return new JAXBElement<String>(_IntegrationDTOClientName_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderStatus", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOOrderStatus(String value) {
        return new JAXBElement<String>(_IntegrationDTOOrderStatus_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "VtexDecryptKey", scope = IntegrationDTO.class)
    public JAXBElement<String> createIntegrationDTOVtexDecryptKey(String value) {
        return new JAXBElement<String>(_IntegrationDTOVtexDecryptKey_QNAME, String.class, IntegrationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EmissionDate", scope = GiftCardDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftCardDTOEmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftCardDTOEmissionDate_QNAME, XMLGregorianCalendar.class, GiftCardDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StatusId", scope = GiftCardDTO.class)
    public JAXBElement<Short> createGiftCardDTOStatusId(Short value) {
        return new JAXBElement<Short>(_GiftCardDTOStatusId_QNAME, Short.class, GiftCardDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = GiftCardDTO.class)
    public JAXBElement<Integer> createGiftCardDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, GiftCardDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OwnerId", scope = GiftCardDTO.class)
    public JAXBElement<String> createGiftCardDTOOwnerId(String value) {
        return new JAXBElement<String>(_GiftCardDTOOwnerId_QNAME, String.class, GiftCardDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ExpiringDate", scope = GiftCardDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftCardDTOExpiringDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftCardDTOExpiringDate_QNAME, XMLGregorianCalendar.class, GiftCardDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RedeptionCode", scope = GiftCardDTO.class)
    public JAXBElement<String> createGiftCardDTORedeptionCode(String value) {
        return new JAXBElement<String>(_GiftCardDTORedeptionCode_QNAME, String.class, GiftCardDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitQuantityDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "skuQuantity", scope = GiftListSkuDeleteByList.class)
    public JAXBElement<ArrayOfStockKeepingUnitQuantityDTO> createGiftListSkuDeleteByListSkuQuantity(ArrayOfStockKeepingUnitQuantityDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitQuantityDTO>(_GiftListSkuDeleteByListSkuQuantity_QNAME, ArrayOfStockKeepingUnitQuantityDTO.class, GiftListSkuDeleteByList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "refId", scope = StockKeepingUnitGetByRefId.class)
    public JAXBElement<String> createStockKeepingUnitGetByRefIdRefId(String value) {
        return new JAXBElement<String>(_StockKeepingUnitGetByRefIdRefId_QNAME, String.class, StockKeepingUnitGetByRefId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddressGetByClientIdV2Result", scope = AddressGetByClientIdV2Response.class)
    public JAXBElement<ArrayOfAddressDTO2> createAddressGetByClientIdV2ResponseAddressGetByClientIdV2Result(ArrayOfAddressDTO2 value) {
        return new JAXBElement<ArrayOfAddressDTO2>(_AddressGetByClientIdV2ResponseAddressGetByClientIdV2Result_QNAME, ArrayOfAddressDTO2 .class, AddressGetByClientIdV2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductGetByRefIdResult", scope = ProductGetByRefIdResponse.class)
    public JAXBElement<ProductDTO> createProductGetByRefIdResponseProductGetByRefIdResult(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductGetByRefIdResponseProductGetByRefIdResult_QNAME, ProductDTO.class, ProductGetByRefIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stockKeepingUnitKitId", scope = StockKeepingUnitKitInsertUpdateResponse.class)
    public JAXBElement<Integer> createStockKeepingUnitKitInsertUpdateResponseStockKeepingUnitKitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitInsertUpdateResponseStockKeepingUnitKitId_QNAME, Integer.class, StockKeepingUnitKitInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitKitInsertUpdateResult", scope = StockKeepingUnitKitInsertUpdateResponse.class)
    public JAXBElement<StockKeepingUnitKitDTO> createStockKeepingUnitKitInsertUpdateResponseStockKeepingUnitKitInsertUpdateResult(StockKeepingUnitKitDTO value) {
        return new JAXBElement<StockKeepingUnitKitDTO>(_StockKeepingUnitKitInsertUpdateResponseStockKeepingUnitKitInsertUpdateResult_QNAME, StockKeepingUnitKitDTO.class, StockKeepingUnitKitInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitEspecificationListBySkuIdResult", scope = StockKeepingUnitEspecificationListBySkuIdResponse.class)
    public JAXBElement<ArrayOfFieldDTO> createStockKeepingUnitEspecificationListBySkuIdResponseStockKeepingUnitEspecificationListBySkuIdResult(ArrayOfFieldDTO value) {
        return new JAXBElement<ArrayOfFieldDTO>(_StockKeepingUnitEspecificationListBySkuIdResponseStockKeepingUnitEspecificationListBySkuIdResult_QNAME, ArrayOfFieldDTO.class, StockKeepingUnitEspecificationListBySkuIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "invoiceNumber", scope = OrderChangeTrackingNumberV3 .class)
    public JAXBElement<String> createOrderChangeTrackingNumberV3InvoiceNumber(String value) {
        return new JAXBElement<String>(_OrderChangeTrackingNumberV3InvoiceNumber_QNAME, String.class, OrderChangeTrackingNumberV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "trackingNumber", scope = OrderChangeTrackingNumberV3 .class)
    public JAXBElement<String> createOrderChangeTrackingNumberV3TrackingNumber(String value) {
        return new JAXBElement<String>(_OrderChangeTrackingNumberV3TrackingNumber_QNAME, String.class, OrderChangeTrackingNumberV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FreightCalculateV3Result", scope = FreightCalculateV3Response.class)
    public JAXBElement<ArrayOfFreightStockKeepingUnitDTO> createFreightCalculateV3ResponseFreightCalculateV3Result(ArrayOfFreightStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfFreightStockKeepingUnitDTO>(_FreightCalculateV3ResponseFreightCalculateV3Result_QNAME, ArrayOfFreightStockKeepingUnitDTO.class, FreightCalculateV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "startingStockKeepingUnitId", scope = StockKeepingUnitGetAllFromUpdatedDateAndId.class)
    public JAXBElement<Integer> createStockKeepingUnitGetAllFromUpdatedDateAndIdStartingStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitGetAllFromUpdatedDateAndIdStartingStockKeepingUnitId_QNAME, Integer.class, StockKeepingUnitGetAllFromUpdatedDateAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderId", scope = OrderDiscountDTO.class)
    public JAXBElement<Integer> createOrderDiscountDTOOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOOrderId_QNAME, Integer.class, OrderDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "SkuId", scope = OrderDiscountDTO.class)
    public JAXBElement<Integer> createOrderDiscountDTOSkuId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOSkuId_QNAME, Integer.class, OrderDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = OrderDiscountDTO.class)
    public JAXBElement<String> createOrderDiscountDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, OrderDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DiscountId", scope = OrderDiscountDTO.class)
    public JAXBElement<Integer> createOrderDiscountDTODiscountId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTODiscountId_QNAME, Integer.class, OrderDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderDiscountDTO.class)
    public JAXBElement<Integer> createOrderDiscountDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetResult", scope = OrderGetResponse.class)
    public JAXBElement<OrderDTO> createOrderGetResponseOrderGetResult(OrderDTO value) {
        return new JAXBElement<OrderDTO>(_OrderGetResponseOrderGetResult_QNAME, OrderDTO.class, OrderGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationInterfaceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IntegrationInterfaceGetAllResult", scope = IntegrationInterfaceGetAllResponse.class)
    public JAXBElement<ArrayOfIntegrationInterfaceDTO> createIntegrationInterfaceGetAllResponseIntegrationInterfaceGetAllResult(ArrayOfIntegrationInterfaceDTO value) {
        return new JAXBElement<ArrayOfIntegrationInterfaceDTO>(_IntegrationInterfaceGetAllResponseIntegrationInterfaceGetAllResult_QNAME, ArrayOfIntegrationInterfaceDTO.class, IntegrationInterfaceGetAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetResult", scope = StockKeepingUnitGetResponse.class)
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitGetResponseStockKeepingUnitGetResult(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitGetResponseStockKeepingUnitGetResult_QNAME, StockKeepingUnitDTO.class, StockKeepingUnitGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientGetByCPFResult", scope = ClientGetByCPFResponse.class)
    public JAXBElement<ClientDTO> createClientGetByCPFResponseClientGetByCPFResult(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientGetByCPFResponseClientGetByCPFResult_QNAME, ClientDTO.class, ClientGetByCPFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImageDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ImageListByStockKeepingUnitIdResult", scope = ImageListByStockKeepingUnitIdResponse.class)
    public JAXBElement<ArrayOfImageDTO> createImageListByStockKeepingUnitIdResponseImageListByStockKeepingUnitIdResult(ArrayOfImageDTO value) {
        return new JAXBElement<ArrayOfImageDTO>(_ImageListByStockKeepingUnitIdResponseImageListByStockKeepingUnitIdResult_QNAME, ArrayOfImageDTO.class, ImageListByStockKeepingUnitIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "startingClientId", scope = ClientGetAllFromCreatedDateAndId.class)
    public JAXBElement<Integer> createClientGetAllFromCreatedDateAndIdStartingClientId(Integer value) {
        return new JAXBElement<Integer>(_ClientGetAllFromCreatedDateAndIdStartingClientId_QNAME, Integer.class, ClientGetAllFromCreatedDateAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "refId", scope = ProductGetByRefId.class)
    public JAXBElement<String> createProductGetByRefIdRefId(String value) {
        return new JAXBElement<String>(_StockKeepingUnitGetByRefIdRefId_QNAME, String.class, ProductGetByRefId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "SkuId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createGiftListStockKeepingUnitDTOSkuId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOSkuId_QNAME, Integer.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InsertedByProfileSystemUserId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOInsertedByProfileSystemUserId(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOInsertedByProfileSystemUserId_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderMessage", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOOrderMessage(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOOrderMessage_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WishedByProfileSystemUserId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOWishedByProfileSystemUserId(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOWishedByProfileSystemUserId_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ItemValue", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createGiftListStockKeepingUnitDTOItemValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GiftListStockKeepingUnitDTOItemValue_QNAME, BigDecimal.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DatePurchased", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListStockKeepingUnitDTODatePurchased(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListStockKeepingUnitDTODatePurchased_QNAME, XMLGregorianCalendar.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InsertedByClientId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createGiftListStockKeepingUnitDTOInsertedByClientId(Integer value) {
        return new JAXBElement<Integer>(_GiftListStockKeepingUnitDTOInsertedByClientId_QNAME, Integer.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OmsOrderId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOOmsOrderId(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOOmsOrderId_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "_IsOrderFinished", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createGiftListStockKeepingUnitDTOIsOrderFinished(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListStockKeepingUnitDTOIsOrderFinished_QNAME, Boolean.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createGiftListStockKeepingUnitDTOOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOOrderId_QNAME, Integer.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderMessageTo", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOOrderMessageTo(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOOrderMessageTo_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateCreated", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListStockKeepingUnitDTODateCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListStockKeepingUnitDTODateCreated_QNAME, XMLGregorianCalendar.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderResponseMessage", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOOrderResponseMessage(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOOrderResponseMessage_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightAndServicesValue", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createGiftListStockKeepingUnitDTOFreightAndServicesValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GiftListStockKeepingUnitDTOFreightAndServicesValue_QNAME, BigDecimal.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createGiftListStockKeepingUnitDTOGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListStockKeepingUnitDTOGiftListId_QNAME, Integer.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListSkuId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createGiftListStockKeepingUnitDTOGiftListSkuId(Integer value) {
        return new JAXBElement<Integer>(_GiftListStockKeepingUnitDTOGiftListSkuId_QNAME, Integer.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WishedByClientId", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createGiftListStockKeepingUnitDTOWishedByClientId(Integer value) {
        return new JAXBElement<Integer>(_GiftListStockKeepingUnitDTOWishedByClientId_QNAME, Integer.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderMessageFrom", scope = GiftListStockKeepingUnitDTO.class)
    public JAXBElement<String> createGiftListStockKeepingUnitDTOOrderMessageFrom(String value) {
        return new JAXBElement<String>(_GiftListStockKeepingUnitDTOOrderMessageFrom_QNAME, String.class, GiftListStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "zipCode", scope = FreightCalculateV3 .class)
    public JAXBElement<String> createFreightCalculateV3ZipCode(String value) {
        return new JAXBElement<String>(_FreightCalculateV3ZipCode_QNAME, String.class, FreightCalculateV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitContextDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "freightSkuContext", scope = FreightCalculateV3 .class)
    public JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO> createFreightCalculateV3FreightSkuContext(ArrayOfFreightStockKeepingUnitContextDTO value) {
        return new JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO>(_FreightCalculateV3FreightSkuContext_QNAME, ArrayOfFreightStockKeepingUnitContextDTO.class, FreightCalculateV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardTransactionItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftCardTransactionItem", scope = GiftCardTransactionItemInsert.class)
    public JAXBElement<GiftCardTransactionItemDTO> createGiftCardTransactionItemInsertGiftCardTransactionItem(GiftCardTransactionItemDTO value) {
        return new JAXBElement<GiftCardTransactionItemDTO>(_GiftCardTransactionItemInsertGiftCardTransactionItem_QNAME, GiftCardTransactionItemDTO.class, GiftCardTransactionItemInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetAllBetweenEventDateIntervalAndIdResult", scope = GiftListGetAllBetweenEventDateIntervalAndIdResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetAllBetweenEventDateIntervalAndIdResponseGiftListGetAllBetweenEventDateIntervalAndIdResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetAllBetweenEventDateIntervalAndIdResponseGiftListGetAllBetweenEventDateIntervalAndIdResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetAllBetweenEventDateIntervalAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = CategoryDTO.class)
    public JAXBElement<String> createCategoryDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LomadeeCampaignCode", scope = CategoryDTO.class)
    public JAXBElement<String> createCategoryDTOLomadeeCampaignCode(String value) {
        return new JAXBElement<String>(_CategoryDTOLomadeeCampaignCode_QNAME, String.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Title", scope = CategoryDTO.class)
    public JAXBElement<String> createCategoryDTOTitle(String value) {
        return new JAXBElement<String>(_CategoryDTOTitle_QNAME, String.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = CategoryDTO.class)
    public JAXBElement<Integer> createCategoryDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AdWordsRemarketingCode", scope = CategoryDTO.class)
    public JAXBElement<String> createCategoryDTOAdWordsRemarketingCode(String value) {
        return new JAXBElement<String>(_CategoryDTOAdWordsRemarketingCode_QNAME, String.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = CategoryDTO.class)
    public JAXBElement<Boolean> createCategoryDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = CategoryDTO.class)
    public JAXBElement<String> createCategoryDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Keywords", scope = CategoryDTO.class)
    public JAXBElement<String> createCategoryDTOKeywords(String value) {
        return new JAXBElement<String>(_CategoryDTOKeywords_QNAME, String.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FatherCategoryId", scope = CategoryDTO.class)
    public JAXBElement<Integer> createCategoryDTOFatherCategoryId(Integer value) {
        return new JAXBElement<Integer>(_CategoryDTOFatherCategoryId_QNAME, Integer.class, CategoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid", scope = ClientGetByGuidV3 .class)
    public JAXBElement<String> createClientGetByGuidV3Guid(String value) {
        return new JAXBElement<String>(_ClientGetByGuidV3Guid_QNAME, String.class, ClientGetByGuidV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "fieldValues", scope = StockKeepingUnitFieldNameDTO.class)
    public JAXBElement<ArrayOfstring> createStockKeepingUnitFieldNameDTOFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_StockKeepingUnitFieldNameDTOFieldValues_QNAME, ArrayOfstring.class, StockKeepingUnitFieldNameDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "fieldName", scope = StockKeepingUnitFieldNameDTO.class)
    public JAXBElement<String> createStockKeepingUnitFieldNameDTOFieldName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitFieldNameDTOFieldName_QNAME, String.class, StockKeepingUnitFieldNameDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BrandInsertUpdateResult", scope = BrandInsertUpdateResponse.class)
    public JAXBElement<BrandDTO> createBrandInsertUpdateResponseBrandInsertUpdateResult(BrandDTO value) {
        return new JAXBElement<BrandDTO>(_BrandInsertUpdateResponseBrandInsertUpdateResult_QNAME, BrandDTO.class, BrandInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInvoiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderInvoice", scope = UpdateNotifyShipping.class)
    public JAXBElement<OrderInvoiceDTO> createUpdateNotifyShippingOrderInvoice(OrderInvoiceDTO value) {
        return new JAXBElement<OrderInvoiceDTO>(_UpdateNotifyShippingOrderInvoice_QNAME, OrderInvoiceDTO.class, UpdateNotifyShipping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductInsertUpdateResult", scope = ProductInsertUpdateResponse.class)
    public JAXBElement<ProductDTO> createProductInsertUpdateResponseProductInsertUpdateResult(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductInsertUpdateResponseProductInsertUpdateResult_QNAME, ProductDTO.class, ProductInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientIdV2", scope = AddressGetByClientIdV2 .class)
    public JAXBElement<String> createAddressGetByClientIdV2ClientIdV2(String value) {
        return new JAXBElement<String>(_AddressGetByClientIdV2ClientIdV2_QNAME, String.class, AddressGetByClientIdV2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListSearchWithSurnameResult", scope = GiftListSearchWithSurnameResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListSearchWithSurnameResponseGiftListSearchWithSurnameResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListSearchWithSurnameResponseGiftListSearchWithSurnameResult_QNAME, ArrayOfGiftListDTO.class, GiftListSearchWithSurnameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateExpectedDelivery", scope = OrderDeliveryDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderDeliveryDTODateExpectedDelivery(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDeliveryDTODateExpectedDelivery_QNAME, XMLGregorianCalendar.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderStatusId", scope = OrderDeliveryDTO.class)
    public JAXBElement<String> createOrderDeliveryDTOOrderStatusId(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOOrderStatusId_QNAME, String.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionCenterDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DistributionCenter", scope = OrderDeliveryDTO.class)
    public JAXBElement<DistributionCenterDTO> createOrderDeliveryDTODistributionCenter(DistributionCenterDTO value) {
        return new JAXBElement<DistributionCenterDTO>(_OrderDeliveryDTODistributionCenter_QNAME, DistributionCenterDTO.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ScheduledShift", scope = OrderDeliveryDTO.class)
    public JAXBElement<String> createOrderDeliveryDTOScheduledShift(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOScheduledShift_QNAME, String.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InvoiceNumber", scope = OrderDeliveryDTO.class)
    public JAXBElement<String> createOrderDeliveryDTOInvoiceNumber(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOInvoiceNumber_QNAME, String.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysForFreightDelivery", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTODaysForFreightDelivery(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTODaysForFreightDelivery_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ManagementId", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTOManagementId(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTOManagementId_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StatusAdministratorId", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTOStatusAdministratorId(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTOStatusAdministratorId_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightName", scope = OrderDeliveryDTO.class)
    public JAXBElement<String> createOrderDeliveryDTOFreightName(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOFreightName_QNAME, String.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysForDistributionCenterProcessing", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTODaysForDistributionCenterProcessing(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTODaysForDistributionCenterProcessing_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StausChangeDate", scope = OrderDeliveryDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderDeliveryDTOStausChangeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDeliveryDTOStausChangeDate_QNAME, XMLGregorianCalendar.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderStatus", scope = OrderDeliveryDTO.class)
    public JAXBElement<OrderStatusDTO> createOrderDeliveryDTOOrderStatus(OrderStatusDTO value) {
        return new JAXBElement<OrderStatusDTO>(_IntegrationDTOOrderStatus_QNAME, OrderStatusDTO.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysForStockProcessing", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTODaysForStockProcessing(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTODaysForStockProcessing_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightIdV3", scope = OrderDeliveryDTO.class)
    public JAXBElement<String> createOrderDeliveryDTOFreightIdV3(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOFreightIdV3_QNAME, String.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderId", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTOOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOOrderId_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DeliveryDate", scope = OrderDeliveryDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderDeliveryDTODeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDeliveryDTODeliveryDate_QNAME, XMLGregorianCalendar.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightTypeId", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTOFreightTypeId(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTOFreightTypeId_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ScheduledDate", scope = OrderDeliveryDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderDeliveryDTOScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDeliveryDTOScheduledDate_QNAME, XMLGregorianCalendar.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightId", scope = OrderDeliveryDTO.class)
    public JAXBElement<Integer> createOrderDeliveryDTOFreightId(Integer value) {
        return new JAXBElement<Integer>(_OrderDeliveryDTOFreightId_QNAME, Integer.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TrackingNumber", scope = OrderDeliveryDTO.class)
    public JAXBElement<String> createOrderDeliveryDTOTrackingNumber(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOTrackingNumber_QNAME, String.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderItems", scope = OrderDeliveryDTO.class)
    public JAXBElement<ArrayOfOrderItemDTO> createOrderDeliveryDTOOrderItems(ArrayOfOrderItemDTO value) {
        return new JAXBElement<ArrayOfOrderItemDTO>(_OrderDeliveryDTOOrderItems_QNAME, ArrayOfOrderItemDTO.class, OrderDeliveryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AvailablePeriods", scope = FreightScheduledDateOptionDTO.class)
    public JAXBElement<ArrayOfstring> createFreightScheduledDateOptionDTOAvailablePeriods(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_FreightScheduledDateOptionDTOAvailablePeriods_QNAME, ArrayOfstring.class, FreightScheduledDateOptionDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stockKeepintUnitRefId", scope = StockKeepingUnitPriceUpdateByRefId.class)
    public JAXBElement<String> createStockKeepingUnitPriceUpdateByRefIdStockKeepintUnitRefId(String value) {
        return new JAXBElement<String>(_StockKeepingUnitPriceUpdateByRefIdStockKeepintUnitRefId_QNAME, String.class, StockKeepingUnitPriceUpdateByRefId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = PaymentDTO.class)
    public JAXBElement<String> createPaymentDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, PaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Type", scope = PaymentDTO.class)
    public JAXBElement<String> createPaymentDTOType(String value) {
        return new JAXBElement<String>(_PaymentDTOType_QNAME, String.class, PaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RefId", scope = OrderItemDTO.class)
    public JAXBElement<String> createOrderItemDTORefId(String value) {
        return new JAXBElement<String>(_OrderItemDTORefId_QNAME, String.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderDeliveryId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOOrderDeliveryId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOOrderDeliveryId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CupomValue", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOCupomValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOCupomValue_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftDiscountId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOGiftDiscountId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOGiftDiscountId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsKit", scope = OrderItemDTO.class)
    public JAXBElement<Boolean> createOrderItemDTOIsKit(Boolean value) {
        return new JAXBElement<Boolean>(_OrderItemDTOIsKit_QNAME, Boolean.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsGift", scope = OrderItemDTO.class)
    public JAXBElement<Boolean> createOrderItemDTOIsGift(Boolean value) {
        return new JAXBElement<Boolean>(_OrderItemDTOIsGift_QNAME, Boolean.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Cost", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOCost_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ItemId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOItemId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOItemId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ParentOrderItemId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOParentOrderItemId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOParentOrderItemId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListPrice", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOListPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOListPrice_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CupomValueOff", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOCupomValueOff(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOCupomValueOff_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDiscountDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Discounts", scope = OrderItemDTO.class)
    public JAXBElement<ArrayOfOrderItemDiscountDTO> createOrderItemDTODiscounts(ArrayOfOrderItemDiscountDTO value) {
        return new JAXBElement<ArrayOfOrderItemDiscountDTO>(_OrderItemDTODiscounts_QNAME, ArrayOfOrderItemDiscountDTO.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsStockImpact", scope = OrderItemDTO.class)
    public JAXBElement<Boolean> createOrderItemDTOIsStockImpact(Boolean value) {
        return new JAXBElement<Boolean>(_OrderItemDTOIsStockImpact_QNAME, Boolean.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOProductId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOProductId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductRefId", scope = OrderItemDTO.class)
    public JAXBElement<String> createOrderItemDTOProductRefId(String value) {
        return new JAXBElement<String>(_OrderItemDTOProductRefId_QNAME, String.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ShippingCost", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOShippingCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOShippingCost_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderItemServices", scope = OrderItemDTO.class)
    public JAXBElement<ArrayOfOrderItemServiceDTO> createOrderItemDTOOrderItemServices(ArrayOfOrderItemServiceDTO value) {
        return new JAXBElement<ArrayOfOrderItemServiceDTO>(_OrderItemDTOOrderItemServices_QNAME, ArrayOfOrderItemServiceDTO.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CostOff", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOCostOff(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOCostOff_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockLikelyIdV3", scope = OrderItemDTO.class)
    public JAXBElement<String> createOrderItemDTOStockLikelyIdV3(String value) {
        return new JAXBElement<String>(_OrderItemDTOStockLikelyIdV3_QNAME, String.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockLikelyId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOStockLikelyId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOStockLikelyId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "BuyTogetherDiscountId", scope = OrderItemDTO.class)
    public JAXBElement<Integer> createOrderItemDTOBuyTogetherDiscountId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOBuyTogetherDiscountId_QNAME, Integer.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MeasurementUnit", scope = OrderItemDTO.class)
    public JAXBElement<String> createOrderItemDTOMeasurementUnit(String value) {
        return new JAXBElement<String>(_OrderItemDTOMeasurementUnit_QNAME, String.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ShippingCostOff", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOShippingCostOff(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOShippingCostOff_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UnitMultiplier", scope = OrderItemDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDTOUnitMultiplier(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOUnitMultiplier_QNAME, BigDecimal.class, OrderItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetByClientCpfResult", scope = GiftListGetByClientCpfResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetByClientCpfResponseGiftListGetByClientCpfResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetByClientCpfResponseGiftListGetByClientCpfResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetByClientCpfResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientId", scope = OrderInteractionDTO.class)
    public JAXBElement<Integer> createOrderInteractionDTOClientId(Integer value) {
        return new JAXBElement<Integer>(_OrderInteractionDTOClientId_QNAME, Integer.class, OrderInteractionDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderInteractionDTO.class)
    public JAXBElement<Integer> createOrderInteractionDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderInteractionDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Text", scope = OrderInteractionDTO.class)
    public JAXBElement<String> createOrderInteractionDTOText(String value) {
        return new JAXBElement<String>(_OrderInteractionDTOText_QNAME, String.class, OrderInteractionDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipCodeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ZipCodeGetResult", scope = ZipCodeGetResponse.class)
    public JAXBElement<ZipCodeDTO> createZipCodeGetResponseZipCodeGetResult(ZipCodeDTO value) {
        return new JAXBElement<ZipCodeDTO>(_ZipCodeGetResponseZipCodeGetResult_QNAME, ZipCodeDTO.class, ZipCodeGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientEmail", scope = GiftListGetByClientEmail.class)
    public JAXBElement<String> createGiftListGetByClientEmailClientEmail(String value) {
        return new JAXBElement<String>(_GiftListGetByClientEmailClientEmail_QNAME, String.class, GiftListGetByClientEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientGetByGuidV3Result", scope = ClientGetByGuidV3Response.class)
    public JAXBElement<ClientDTO> createClientGetByGuidV3ResponseClientGetByGuidV3Result(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientGetByGuidV3ResponseClientGetByGuidV3Result_QNAME, ClientDTO.class, ClientGetByGuidV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderId", scope = OrderGetV3 .class)
    public JAXBElement<String> createOrderGetV3OrderId(String value) {
        return new JAXBElement<String>(_OrderGetV3OrderId_QNAME, String.class, OrderGetV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitParent", scope = StockKeepingUnitKitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitKitDTOStockKeepingUnitParent(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitParent_QNAME, Integer.class, StockKeepingUnitKitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = StockKeepingUnitKitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitKitDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, StockKeepingUnitKitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Amount", scope = StockKeepingUnitKitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitKitDTOAmount(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOAmount_QNAME, Integer.class, StockKeepingUnitKitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitId", scope = StockKeepingUnitKitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitKitDTOStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitId_QNAME, Integer.class, StockKeepingUnitKitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UnitPrice", scope = StockKeepingUnitKitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitKitDTOUnitPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitKitDTOUnitPrice_QNAME, BigDecimal.class, StockKeepingUnitKitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetResult", scope = GiftListGetResponse.class)
    public JAXBElement<GiftListDTO> createGiftListGetResponseGiftListGetResult(GiftListDTO value) {
        return new JAXBElement<GiftListDTO>(_GiftListGetResponseGiftListGetResult_QNAME, GiftListDTO.class, GiftListGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stockKeepingUnitService", scope = StockKeepingUnitServiceInsertUpdate.class)
    public JAXBElement<StockKeepingUnitServiceDTO> createStockKeepingUnitServiceInsertUpdateStockKeepingUnitService(StockKeepingUnitServiceDTO value) {
        return new JAXBElement<StockKeepingUnitServiceDTO>(_StockKeepingUnitServiceInsertUpdateStockKeepingUnitService_QNAME, StockKeepingUnitServiceDTO.class, StockKeepingUnitServiceInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CategoryGetResult", scope = CategoryGetResponse.class)
    public JAXBElement<CategoryDTO> createCategoryGetResponseCategoryGetResult(CategoryDTO value) {
        return new JAXBElement<CategoryDTO>(_CategoryGetResponseCategoryGetResult_QNAME, CategoryDTO.class, CategoryGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftCardGetResult", scope = GiftCardGetResponse.class)
    public JAXBElement<GiftCardDTO> createGiftCardGetResponseGiftCardGetResult(GiftCardDTO value) {
        return new JAXBElement<GiftCardDTO>(_GiftCardGetResponseGiftCardGetResult_QNAME, GiftCardDTO.class, GiftCardGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Ean", scope = StockKeepingUnitEanDTO.class)
    public JAXBElement<String> createStockKeepingUnitEanDTOEan(String value) {
        return new JAXBElement<String>(_StockKeepingUnitEanDTOEan_QNAME, String.class, StockKeepingUnitEanDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderStatusDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderStatusGetAllResult", scope = OrderStatusGetAllResponse.class)
    public JAXBElement<ArrayOfOrderStatusDTO> createOrderStatusGetAllResponseOrderStatusGetAllResult(ArrayOfOrderStatusDTO value) {
        return new JAXBElement<ArrayOfOrderStatusDTO>(_OrderStatusGetAllResponseOrderStatusGetAllResult_QNAME, ArrayOfOrderStatusDTO.class, OrderStatusGetAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventCity", scope = GiftListSearch.class)
    public JAXBElement<String> createGiftListSearchEventCity(String value) {
        return new JAXBElement<String>(_GiftListSearchEventCity_QNAME, String.class, GiftListSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventLocation", scope = GiftListSearch.class)
    public JAXBElement<String> createGiftListSearchEventLocation(String value) {
        return new JAXBElement<String>(_GiftListSearchEventLocation_QNAME, String.class, GiftListSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientName", scope = GiftListSearch.class)
    public JAXBElement<String> createGiftListSearchClientName(String value) {
        return new JAXBElement<String>(_GiftListSearchClientName_QNAME, String.class, GiftListSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventDate", scope = GiftListSearch.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListSearchEventDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListSearchEventDate_QNAME, XMLGregorianCalendar.class, GiftListSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetAllFromModifiedDateAndIdResult", scope = GiftListGetAllFromModifiedDateAndIdResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetAllFromModifiedDateAndIdResponseGiftListGetAllFromModifiedDateAndIdResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetAllFromModifiedDateAndIdResponseGiftListGetAllFromModifiedDateAndIdResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetAllFromModifiedDateAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "client", scope = ClientInsertUpdateV3 .class)
    public JAXBElement<ClientDTO> createClientInsertUpdateV3Client(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientInsertUpdateV3Client_QNAME, ClientDTO.class, ClientInsertUpdateV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Client", scope = OrderDTO.class)
    public JAXBElement<ClientDTO> createOrderDTOClient(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_OrderDTOClient_QNAME, ClientDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientId", scope = OrderDTO.class)
    public JAXBElement<Integer> createOrderDTOClientId(Integer value) {
        return new JAXBElement<Integer>(_OrderInteractionDTOClientId_QNAME, Integer.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDiscountDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListOrderDiscount", scope = OrderDTO.class)
    public JAXBElement<ArrayOfOrderDiscountDTO> createOrderDTOListOrderDiscount(ArrayOfOrderDiscountDTO value) {
        return new JAXBElement<ArrayOfOrderDiscountDTO>(_OrderDTOListOrderDiscount_QNAME, ArrayOfOrderDiscountDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderInvoices", scope = OrderDTO.class)
    public JAXBElement<ArrayOfOrderInvoiceDTO> createOrderDTOOrderInvoices(ArrayOfOrderInvoiceDTO value) {
        return new JAXBElement<ArrayOfOrderInvoiceDTO>(_OrderDTOOrderInvoices_QNAME, ArrayOfOrderInvoiceDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "_Cost", scope = OrderDTO.class)
    public JAXBElement<BigDecimal> createOrderDTOCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderDTOCost_QNAME, BigDecimal.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Source", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOSource(String value) {
        return new JAXBElement<String>(_OrderDTOSource_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Tax", scope = OrderDTO.class)
    public JAXBElement<BigDecimal> createOrderDTOTax(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderDTOTax_QNAME, BigDecimal.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDeliveryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderDeliveries", scope = OrderDTO.class)
    public JAXBElement<ArrayOfOrderDeliveryDTO> createOrderDTOOrderDeliveries(ArrayOfOrderDeliveryDTO value) {
        return new JAXBElement<ArrayOfOrderDeliveryDTO>(_OrderDTOOrderDeliveries_QNAME, ArrayOfOrderDeliveryDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TelemarketingStoreLocatorName", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOTelemarketingStoreLocatorName(String value) {
        return new JAXBElement<String>(_OrderDTOTelemarketingStoreLocatorName_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Address", scope = OrderDTO.class)
    public JAXBElement<AddressOrderDTO> createOrderDTOAddress(AddressOrderDTO value) {
        return new JAXBElement<AddressOrderDTO>(_OrderDTOAddress_QNAME, AddressOrderDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TelemarketingObservation", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOTelemarketingObservation(String value) {
        return new JAXBElement<String>(_OrderDTOTelemarketingObservation_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Keywords", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOKeywords(String value) {
        return new JAXBElement<String>(_CategoryDTOKeywords_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TelemarketingLogin", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOTelemarketingLogin(String value) {
        return new JAXBElement<String>(_OrderDTOTelemarketingLogin_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListStockKeepingUnits", scope = OrderDTO.class)
    public JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> createOrderDTOGiftListStockKeepingUnits(ArrayOfGiftListStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfGiftListStockKeepingUnitDTO>(_OrderDTOGiftListStockKeepingUnits_QNAME, ArrayOfGiftListStockKeepingUnitDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TelemarketingId", scope = OrderDTO.class)
    public JAXBElement<Integer> createOrderDTOTelemarketingId(Integer value) {
        return new JAXBElement<Integer>(_OrderDTOTelemarketingId_QNAME, Integer.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "_CostFinal", scope = OrderDTO.class)
    public JAXBElement<BigDecimal> createOrderDTOCostFinal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderDTOCostFinal_QNAME, BigDecimal.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeOffset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PurchaseDateUtc", scope = OrderDTO.class)
    public JAXBElement<DateTimeOffset> createOrderDTOPurchaseDateUtc(DateTimeOffset value) {
        return new JAXBElement<DateTimeOffset>(_OrderDTOPurchaseDateUtc_QNAME, DateTimeOffset.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderDTO.class)
    public JAXBElement<Integer> createOrderDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IdV3", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOIdV3(String value) {
        return new JAXBElement<String>(_OrderDTOIdV3_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PurchaseDate", scope = OrderDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderDTOPurchaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDTOPurchaseDate_QNAME, XMLGregorianCalendar.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Campaign", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOCampaign(String value) {
        return new JAXBElement<String>(_OrderDTOCampaign_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientIP", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOClientIP(String value) {
        return new JAXBElement<String>(_OrderDTOClientIP_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderPaymentDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderPayments", scope = OrderDTO.class)
    public JAXBElement<ArrayOfOrderPaymentDTO> createOrderDTOOrderPayments(ArrayOfOrderPaymentDTO value) {
        return new JAXBElement<ArrayOfOrderPaymentDTO>(_OrderDTOOrderPayments_QNAME, ArrayOfOrderPaymentDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Media", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOMedia(String value) {
        return new JAXBElement<String>(_OrderDTOMedia_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TelemarketingStoreLocatorCode", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOTelemarketingStoreLocatorCode(String value) {
        return new JAXBElement<String>(_OrderDTOTelemarketingStoreLocatorCode_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StoreName", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOStoreName(String value) {
        return new JAXBElement<String>(_OrderDTOStoreName_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AffiliateId", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOAffiliateId(String value) {
        return new JAXBElement<String>(_OrderDTOAffiliateId_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Coupon", scope = OrderDTO.class)
    public JAXBElement<String> createOrderDTOCoupon(String value) {
        return new JAXBElement<String>(_OrderDTOCoupon_QNAME, String.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "fieldValues", scope = ProductFieldIdDTO.class)
    public JAXBElement<ArrayOfstring> createProductFieldIdDTOFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_StockKeepingUnitFieldNameDTOFieldValues_QNAME, ArrayOfstring.class, ProductFieldIdDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductGetSimilarCategoryResult", scope = ProductGetSimilarCategoryResponse.class)
    public JAXBElement<ArrayOfint> createProductGetSimilarCategoryResponseProductGetSimilarCategoryResult(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ProductGetSimilarCategoryResponseProductGetSimilarCategoryResult_QNAME, ArrayOfint.class, ProductGetSimilarCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceInsertUpdateResult", scope = ServiceInsertUpdateResponse.class)
    public JAXBElement<ServiceDTO> createServiceInsertUpdateResponseServiceInsertUpdateResult(ServiceDTO value) {
        return new JAXBElement<ServiceDTO>(_ServiceInsertUpdateResponseServiceInsertUpdateResult_QNAME, ServiceDTO.class, ServiceInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serviceId", scope = ServiceInsertUpdateResponse.class)
    public JAXBElement<Integer> createServiceInsertUpdateResponseServiceId(Integer value) {
        return new JAXBElement<Integer>(_ServiceInsertUpdateResponseServiceId_QNAME, Integer.class, ServiceInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stockKeepingUnitServiceId", scope = StockKeepingUnitServiceInsertUpdateResponse.class)
    public JAXBElement<Integer> createStockKeepingUnitServiceInsertUpdateResponseStockKeepingUnitServiceId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitServiceInsertUpdateResponseStockKeepingUnitServiceId_QNAME, Integer.class, StockKeepingUnitServiceInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitServiceInsertUpdateResult", scope = StockKeepingUnitServiceInsertUpdateResponse.class)
    public JAXBElement<StockKeepingUnitServiceDTO> createStockKeepingUnitServiceInsertUpdateResponseStockKeepingUnitServiceInsertUpdateResult(StockKeepingUnitServiceDTO value) {
        return new JAXBElement<StockKeepingUnitServiceDTO>(_StockKeepingUnitServiceInsertUpdateResponseStockKeepingUnitServiceInsertUpdateResult_QNAME, StockKeepingUnitServiceDTO.class, StockKeepingUnitServiceInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldName", scope = ProductEspecificationInsert.class)
    public JAXBElement<String> createProductEspecificationInsertFieldName(String value) {
        return new JAXBElement<String>(_ProductEspecificationInsertFieldName_QNAME, String.class, ProductEspecificationInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldValues", scope = ProductEspecificationInsert.class)
    public JAXBElement<ArrayOfstring> createProductEspecificationInsertFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProductEspecificationInsertFieldValues_QNAME, ArrayOfstring.class, ProductEspecificationInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stockKeepingUnitVO", scope = StockKeepingUnitInsertUpdate.class)
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitInsertUpdateStockKeepingUnitVO(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitInsertUpdateStockKeepingUnitVO_QNAME, StockKeepingUnitDTO.class, StockKeepingUnitInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetByClientEmailResult", scope = GiftListGetByClientEmailResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetByClientEmailResponseGiftListGetByClientEmailResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetByClientEmailResponseGiftListGetByClientEmailResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetByClientEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitComplements", scope = StockKeepingUnitComplementDTO.class)
    public JAXBElement<ArrayOfint> createStockKeepingUnitComplementDTOStockKeepingUnitComplements(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_StockKeepingUnitComplementDTOStockKeepingUnitComplements_QNAME, ArrayOfint.class, StockKeepingUnitComplementDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetV3Result", scope = OrderGetV3Response.class)
    public JAXBElement<OrderDTO> createOrderGetV3ResponseOrderGetV3Result(OrderDTO value) {
        return new JAXBElement<OrderDTO>(_OrderGetV3ResponseOrderGetV3Result_QNAME, OrderDTO.class, OrderGetV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "startingGiftListId", scope = GiftListGetAllBetweenEventDateIntervalAndId.class)
    public JAXBElement<Integer> createGiftListGetAllBetweenEventDateIntervalAndIdStartingGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListGetAllBetweenEventDateIntervalAndIdStartingGiftListId_QNAME, Integer.class, GiftListGetAllBetweenEventDateIntervalAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitKitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitKitListBySkuIdResult", scope = StockKeepingUnitKitListBySkuIdResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitKitDTO> createStockKeepingUnitKitListBySkuIdResponseStockKeepingUnitKitListBySkuIdResult(ArrayOfStockKeepingUnitKitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitKitDTO>(_StockKeepingUnitKitListBySkuIdResponseStockKeepingUnitKitListBySkuIdResult_QNAME, ArrayOfStockKeepingUnitKitDTO.class, StockKeepingUnitKitListBySkuIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReceiverName", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOReceiverName(String value) {
        return new JAXBElement<String>(_AddressOrderDTOReceiverName_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressType", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOAddressType(String value) {
        return new JAXBElement<String>(_AddressOrderDTOAddressType_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Country", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOCountry(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCountry_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Street", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOStreet(String value) {
        return new JAXBElement<String>(_AddressOrderDTOStreet_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = AddressOrderDTO.class)
    public JAXBElement<Integer> createAddressOrderDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Number", scope = AddressOrderDTO.class)
    public JAXBElement<Integer> createAddressOrderDTONumber(Integer value) {
        return new JAXBElement<Integer>(_AddressOrderDTONumber_QNAME, Integer.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReferencePoint", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOReferencePoint(String value) {
        return new JAXBElement<String>(_AddressOrderDTOReferencePoint_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Phone", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOPhone(String value) {
        return new JAXBElement<String>(_AddressOrderDTOPhone_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "State", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOState(String value) {
        return new JAXBElement<String>(_AddressOrderDTOState_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "More", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOMore(String value) {
        return new JAXBElement<String>(_AddressOrderDTOMore_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressName", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOAddressName(String value) {
        return new JAXBElement<String>(_AddressOrderDTOAddressName_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Neighborhood", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTONeighborhood(String value) {
        return new JAXBElement<String>(_AddressOrderDTONeighborhood_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "NumberV3", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTONumberV3(String value) {
        return new JAXBElement<String>(_AddressOrderDTONumberV3_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "City", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOCity(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCity_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ZipCode", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOZipCode(String value) {
        return new JAXBElement<String>(_AddressOrderDTOZipCode_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CelPhone", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOCelPhone(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCelPhone_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OfficePhone", scope = AddressOrderDTO.class)
    public JAXBElement<String> createAddressOrderDTOOfficePhone(String value) {
        return new JAXBElement<String>(_AddressOrderDTOOfficePhone_QNAME, String.class, AddressOrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewsletterDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NewsletterGetAllByDateResult", scope = NewsletterGetAllByDateResponse.class)
    public JAXBElement<ArrayOfNewsletterDTO> createNewsletterGetAllByDateResponseNewsletterGetAllByDateResult(ArrayOfNewsletterDTO value) {
        return new JAXBElement<ArrayOfNewsletterDTO>(_NewsletterGetAllByDateResponseNewsletterGetAllByDateResult_QNAME, ArrayOfNewsletterDTO.class, NewsletterGetAllByDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CategoryGetByNameResult", scope = CategoryGetByNameResponse.class)
    public JAXBElement<CategoryDTO> createCategoryGetByNameResponseCategoryGetByNameResult(CategoryDTO value) {
        return new JAXBElement<CategoryDTO>(_CategoryGetByNameResponseCategoryGetByNameResult_QNAME, CategoryDTO.class, CategoryGetByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<String> createStockKeepingUnitServiceDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ServiceId", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitServiceDTOServiceId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitServiceDTOServiceId_QNAME, Integer.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ServicePrice", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<ServicePriceDTO> createStockKeepingUnitServiceDTOServicePrice(ServicePriceDTO value) {
        return new JAXBElement<ServicePriceDTO>(_StockKeepingUnitServiceDTOServicePrice_QNAME, ServicePriceDTO.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitServiceDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitServiceDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ServicePriceId", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitServiceDTOServicePriceId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitServiceDTOServicePriceId_QNAME, Integer.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitId", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitServiceDTOStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitId_QNAME, Integer.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = StockKeepingUnitServiceDTO.class)
    public JAXBElement<String> createStockKeepingUnitServiceDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, StockKeepingUnitServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderId", scope = IntegrationLogEvent.class)
    public JAXBElement<Integer> createIntegrationLogEventOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderGetV3OrderId_QNAME, Integer.class, IntegrationLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "message", scope = IntegrationLogEvent.class)
    public JAXBElement<String> createIntegrationLogEventMessage(String value) {
        return new JAXBElement<String>(_IntegrationLogEventMessage_QNAME, String.class, IntegrationLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WareHouseIStockableDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "WareHouseIStockableGetByStockKeepingUnitResult", scope = WareHouseIStockableGetByStockKeepingUnitResponse.class)
    public JAXBElement<WareHouseIStockableDTO> createWareHouseIStockableGetByStockKeepingUnitResponseWareHouseIStockableGetByStockKeepingUnitResult(WareHouseIStockableDTO value) {
        return new JAXBElement<WareHouseIStockableDTO>(_WareHouseIStockableGetByStockKeepingUnitResponseWareHouseIStockableGetByStockKeepingUnitResult_QNAME, WareHouseIStockableDTO.class, WareHouseIStockableGetByStockKeepingUnitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetAllFromUpdatedDateAndIdResult", scope = StockKeepingUnitGetAllFromUpdatedDateAndIdResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createStockKeepingUnitGetAllFromUpdatedDateAndIdResponseStockKeepingUnitGetAllFromUpdatedDateAndIdResult(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_StockKeepingUnitGetAllFromUpdatedDateAndIdResponseStockKeepingUnitGetAllFromUpdatedDateAndIdResult_QNAME, ArrayOfStockKeepingUnitDTO.class, StockKeepingUnitGetAllFromUpdatedDateAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListInsertUpdateResult", scope = GiftListInsertUpdateResponse.class)
    public JAXBElement<GiftListDTO> createGiftListInsertUpdateResponseGiftListInsertUpdateResult(GiftListDTO value) {
        return new JAXBElement<GiftListDTO>(_GiftListInsertUpdateResponseGiftListInsertUpdateResult_QNAME, GiftListDTO.class, GiftListInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListSearchResult", scope = GiftListSearchResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListSearchResponseGiftListSearchResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListSearchResponseGiftListSearchResult_QNAME, ArrayOfGiftListDTO.class, GiftListSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetNext50FromIdV3Result", scope = OrderGetNext50FromIdV3Response.class)
    public JAXBElement<ArrayOfOrderDTO> createOrderGetNext50FromIdV3ResponseOrderGetNext50FromIdV3Result(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_OrderGetNext50FromIdV3ResponseOrderGetNext50FromIdV3Result_QNAME, ArrayOfOrderDTO.class, OrderGetNext50FromIdV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListPrice", scope = ServicePriceDTO.class)
    public JAXBElement<BigDecimal> createServicePriceDTOListPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOListPrice_QNAME, BigDecimal.class, ServicePriceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = ServicePriceDTO.class)
    public JAXBElement<String> createServicePriceDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, ServicePriceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ServiceId", scope = ServicePriceDTO.class)
    public JAXBElement<Integer> createServicePriceDTOServiceId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitServiceDTOServiceId_QNAME, Integer.class, ServicePriceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Service", scope = ServicePriceDTO.class)
    public JAXBElement<ServiceDTO> createServicePriceDTOService(ServiceDTO value) {
        return new JAXBElement<ServiceDTO>(_ServicePriceDTOService_QNAME, ServiceDTO.class, ServicePriceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = ServicePriceDTO.class)
    public JAXBElement<Integer> createServicePriceDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, ServicePriceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Price", scope = ServicePriceDTO.class)
    public JAXBElement<BigDecimal> createServicePriceDTOPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServicePriceDTOPrice_QNAME, BigDecimal.class, ServicePriceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductFieldIdDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listStockKeepingUnitEspecificationFieldId", scope = ProductEspecificationInsertByListFieldIds.class)
    public JAXBElement<ArrayOfProductFieldIdDTO> createProductEspecificationInsertByListFieldIdsListStockKeepingUnitEspecificationFieldId(ArrayOfProductFieldIdDTO value) {
        return new JAXBElement<ArrayOfProductFieldIdDTO>(_ProductEspecificationInsertByListFieldIdsListStockKeepingUnitEspecificationFieldId_QNAME, ArrayOfProductFieldIdDTO.class, ProductEspecificationInsertByListFieldIds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentAuthorizationId", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOPaymentAuthorizationId(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOPaymentAuthorizationId_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsValid", scope = OrderPaymentDTO.class)
    public JAXBElement<Boolean> createOrderPaymentDTOIsValid(Boolean value) {
        return new JAXBElement<Boolean>(_OrderPaymentDTOIsValid_QNAME, Boolean.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Street", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOStreet(String value) {
        return new JAXBElement<String>(_AddressOrderDTOStreet_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Number", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTONumber(Integer value) {
        return new JAXBElement<Integer>(_AddressOrderDTONumber_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReferencePoint", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOReferencePoint(String value) {
        return new JAXBElement<String>(_AddressOrderDTOReferencePoint_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Interest", scope = OrderPaymentDTO.class)
    public JAXBElement<BigDecimal> createOrderPaymentDTOInterest(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderPaymentDTOInterest_QNAME, BigDecimal.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardYear", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardYear(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardYear_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Url", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOUrl(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOUrl_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentUniqueSerialNumber", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOPaymentUniqueSerialNumber(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOPaymentUniqueSerialNumber_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Plots", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTOPlots(Integer value) {
        return new JAXBElement<Integer>(_OrderPaymentDTOPlots_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Complement", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOComplement(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOComplement_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardFirst6Numbers", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardFirst6Numbers(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardFirst6Numbers_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardNumber", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardNumber(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardNumber_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardRedemptionCode", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOGiftCardRedemptionCode(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOGiftCardRedemptionCode_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentTransactionId", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOPaymentTransactionId(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOPaymentTransactionId_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardLast4Numbers", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardLast4Numbers(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardLast4Numbers_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardName", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardName(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardName_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressType", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOAddressType(String value) {
        return new JAXBElement<String>(_AddressOrderDTOAddressType_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "HostUniqueSerialNumber", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOHostUniqueSerialNumber(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOHostUniqueSerialNumber_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Country", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCountry(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCountry_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentUniqueSerialNumberSettle", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOPaymentUniqueSerialNumberSettle(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOPaymentUniqueSerialNumberSettle_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderPaymentStatusId", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTOOrderPaymentStatusId(Integer value) {
        return new JAXBElement<Integer>(_OrderPaymentDTOOrderPaymentStatusId_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardIdV3", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOGiftCardIdV3(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOGiftCardIdV3_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CostWithInterest", scope = OrderPaymentDTO.class)
    public JAXBElement<BigDecimal> createOrderPaymentDTOCostWithInterest(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderPaymentDTOCostWithInterest_QNAME, BigDecimal.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "State", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOState(String value) {
        return new JAXBElement<String>(_AddressOrderDTOState_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InstallmentValue", scope = OrderPaymentDTO.class)
    public JAXBElement<BigDecimal> createOrderPaymentDTOInstallmentValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderPaymentDTOInstallmentValue_QNAME, BigDecimal.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderId", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTOOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOOrderId_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardSecurityCode", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardSecurityCode(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardSecurityCode_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Neighborhood", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTONeighborhood(String value) {
        return new JAXBElement<String>(_AddressOrderDTONeighborhood_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "NumberV3", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTONumberV3(String value) {
        return new JAXBElement<String>(_AddressOrderDTONumberV3_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Date", scope = OrderPaymentDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderPaymentDTODate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderPaymentDTODate_QNAME, XMLGregorianCalendar.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "PaymentId", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTOPaymentId(Integer value) {
        return new JAXBElement<Integer>(_OrderPaymentDTOPaymentId_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "City", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCity(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCity_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CardMonth", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOCardMonth(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOCardMonth_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ZipCode", scope = OrderPaymentDTO.class)
    public JAXBElement<String> createOrderPaymentDTOZipCode(String value) {
        return new JAXBElement<String>(_AddressOrderDTOZipCode_QNAME, String.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardId", scope = OrderPaymentDTO.class)
    public JAXBElement<Integer> createOrderPaymentDTOGiftCardId(Integer value) {
        return new JAXBElement<Integer>(_OrderPaymentDTOGiftCardId_QNAME, Integer.class, OrderPaymentDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientInsertUpdateV3Result", scope = ClientInsertUpdateV3Response.class)
    public JAXBElement<ClientDTO> createClientInsertUpdateV3ResponseClientInsertUpdateV3Result(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientInsertUpdateV3ResponseClientInsertUpdateV3Result_QNAME, ClientDTO.class, ClientInsertUpdateV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddressByAddressClientResult", scope = AddressByAddressClientResponse.class)
    public JAXBElement<AddressDTO> createAddressByAddressClientResponseAddressByAddressClientResult(AddressDTO value) {
        return new JAXBElement<AddressDTO>(_AddressByAddressClientResponseAddressByAddressClientResult_QNAME, AddressDTO.class, AddressByAddressClientResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = BrandDTO.class)
    public JAXBElement<String> createBrandDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LomadeeCampaignCode", scope = BrandDTO.class)
    public JAXBElement<String> createBrandDTOLomadeeCampaignCode(String value) {
        return new JAXBElement<String>(_CategoryDTOLomadeeCampaignCode_QNAME, String.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Title", scope = BrandDTO.class)
    public JAXBElement<String> createBrandDTOTitle(String value) {
        return new JAXBElement<String>(_CategoryDTOTitle_QNAME, String.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = BrandDTO.class)
    public JAXBElement<Integer> createBrandDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AdWordsRemarketingCode", scope = BrandDTO.class)
    public JAXBElement<String> createBrandDTOAdWordsRemarketingCode(String value) {
        return new JAXBElement<String>(_CategoryDTOAdWordsRemarketingCode_QNAME, String.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = BrandDTO.class)
    public JAXBElement<Boolean> createBrandDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = BrandDTO.class)
    public JAXBElement<String> createBrandDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Keywords", scope = BrandDTO.class)
    public JAXBElement<String> createBrandDTOKeywords(String value) {
        return new JAXBElement<String>(_CategoryDTOKeywords_QNAME, String.class, BrandDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderId", scope = GiftListSkuSetPurchased.class)
    public JAXBElement<Integer> createGiftListSkuSetPurchasedOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderGetV3OrderId_QNAME, Integer.class, GiftListSkuSetPurchased.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cpfCnpj", scope = OrderGetByClientCpf.class)
    public JAXBElement<String> createOrderGetByClientCpfCpfCnpj(String value) {
        return new JAXBElement<String>(_OrderGetByClientCpfCpfCnpj_QNAME, String.class, OrderGetByClientCpf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "service", scope = ServiceInsertUpdate.class)
    public JAXBElement<ServiceDTO> createServiceInsertUpdateService(ServiceDTO value) {
        return new JAXBElement<ServiceDTO>(_ServiceInsertUpdateService_QNAME, ServiceDTO.class, ServiceInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "zipCode", scope = ZipCodeGet.class)
    public JAXBElement<String> createZipCodeGetZipCode(String value) {
        return new JAXBElement<String>(_FreightCalculateV3ZipCode_QNAME, String.class, ZipCodeGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = DistributionCenterDTO.class)
    public JAXBElement<String> createDistributionCenterDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, DistributionCenterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TaxID", scope = DistributionCenterDTO.class)
    public JAXBElement<String> createDistributionCenterDTOTaxID(String value) {
        return new JAXBElement<String>(_DistributionCenterDTOTaxID_QNAME, String.class, DistributionCenterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "HandlingTimeCost", scope = DistributionCenterDTO.class)
    public JAXBElement<Integer> createDistributionCenterDTOHandlingTimeCost(Integer value) {
        return new JAXBElement<Integer>(_DistributionCenterDTOHandlingTimeCost_QNAME, Integer.class, DistributionCenterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Priority", scope = DistributionCenterDTO.class)
    public JAXBElement<Integer> createDistributionCenterDTOPriority(Integer value) {
        return new JAXBElement<Integer>(_DistributionCenterDTOPriority_QNAME, Integer.class, DistributionCenterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DistributionCenterID", scope = DistributionCenterDTO.class)
    public JAXBElement<Integer> createDistributionCenterDTODistributionCenterID(Integer value) {
        return new JAXBElement<Integer>(_DistributionCenterDTODistributionCenterID_QNAME, Integer.class, DistributionCenterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gifted", scope = GiftListGetByGifted.class)
    public JAXBElement<String> createGiftListGetByGiftedGifted(String value) {
        return new JAXBElement<String>(_GiftListGetByGiftedGifted_QNAME, String.class, GiftListGetByGifted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "startingGiftListId", scope = GiftListGetAllFromModifiedDateAndId.class)
    public JAXBElement<Integer> createGiftListGetAllFromModifiedDateAndIdStartingGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListGetAllBetweenEventDateIntervalAndIdStartingGiftListId_QNAME, Integer.class, GiftListGetAllFromModifiedDateAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListSkuInsertResult", scope = GiftListSkuInsertResponse.class)
    public JAXBElement<GiftListStockKeepingUnitDTO> createGiftListSkuInsertResponseGiftListSkuInsertResult(GiftListStockKeepingUnitDTO value) {
        return new JAXBElement<GiftListStockKeepingUnitDTO>(_GiftListSkuInsertResponseGiftListSkuInsertResult_QNAME, GiftListStockKeepingUnitDTO.class, GiftListSkuInsertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BrandGetByNameResult", scope = BrandGetByNameResponse.class)
    public JAXBElement<BrandDTO> createBrandGetByNameResponseBrandGetByNameResult(BrandDTO value) {
        return new JAXBElement<BrandDTO>(_BrandGetByNameResponseBrandGetByNameResult_QNAME, BrandDTO.class, BrandGetByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nameCategory", scope = CategoryGetByName.class)
    public JAXBElement<String> createCategoryGetByNameNameCategory(String value) {
        return new JAXBElement<String>(_CategoryGetByNameNameCategory_QNAME, String.class, CategoryGetByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchiveTypeId", scope = ImageListByStockKeepingUnitId.class)
    public JAXBElement<Integer> createImageListByStockKeepingUnitIdArchiveTypeId(Integer value) {
        return new JAXBElement<Integer>(_ImageListByStockKeepingUnitIdArchiveTypeId_QNAME, Integer.class, ImageListByStockKeepingUnitId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AvailableQuantity", scope = WareHouseIStockableDTO.class)
    public JAXBElement<Integer> createWareHouseIStockableDTOAvailableQuantity(Integer value) {
        return new JAXBElement<Integer>(_WareHouseIStockableDTOAvailableQuantity_QNAME, Integer.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReservedQuantity", scope = WareHouseIStockableDTO.class)
    public JAXBElement<Integer> createWareHouseIStockableDTOReservedQuantity(Integer value) {
        return new JAXBElement<Integer>(_WareHouseIStockableDTOReservedQuantity_QNAME, Integer.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WareHouseIdV3", scope = WareHouseIStockableDTO.class)
    public JAXBElement<String> createWareHouseIStockableDTOWareHouseIdV3(String value) {
        return new JAXBElement<String>(_WareHouseIStockableDTOWareHouseIdV3_QNAME, String.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WareHouseName", scope = WareHouseIStockableDTO.class)
    public JAXBElement<String> createWareHouseIStockableDTOWareHouseName(String value) {
        return new JAXBElement<String>(_WareHouseIStockableDTOWareHouseName_QNAME, String.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TotalQuantity", scope = WareHouseIStockableDTO.class)
    public JAXBElement<Integer> createWareHouseIStockableDTOTotalQuantity(Integer value) {
        return new JAXBElement<Integer>(_WareHouseIStockableDTOTotalQuantity_QNAME, Integer.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitId", scope = WareHouseIStockableDTO.class)
    public JAXBElement<Integer> createWareHouseIStockableDTOStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitId_QNAME, Integer.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WareHouseId", scope = WareHouseIStockableDTO.class)
    public JAXBElement<Integer> createWareHouseIStockableDTOWareHouseId(Integer value) {
        return new JAXBElement<Integer>(_WareHouseIStockableDTOWareHouseId_QNAME, Integer.class, WareHouseIStockableDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientGetResult", scope = ClientGetResponse.class)
    public JAXBElement<ClientDTO> createClientGetResponseClientGetResult(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientGetResponseClientGetResult_QNAME, ClientDTO.class, ClientGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftCardGetByRedeptionCodeResult", scope = GiftCardGetByRedeptionCodeResponse.class)
    public JAXBElement<GiftCardDTO> createGiftCardGetByRedeptionCodeResponseGiftCardGetByRedeptionCodeResult(GiftCardDTO value) {
        return new JAXBElement<GiftCardDTO>(_GiftCardGetByRedeptionCodeResponseGiftCardGetByRedeptionCodeResult_QNAME, GiftCardDTO.class, GiftCardGetByRedeptionCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "statusOrder", scope = OrderChangeStatus.class)
    public JAXBElement<String> createOrderChangeStatusStatusOrder(String value) {
        return new JAXBElement<String>(_OrderGetByStatusByQuantityStatusOrder_QNAME, String.class, OrderChangeStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Surname", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOSurname(String value) {
        return new JAXBElement<String>(_GiftListMemberDTOSurname_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListMemberId", scope = GiftListMemberDTO.class)
    public JAXBElement<Integer> createGiftListMemberDTOGiftListMemberId(Integer value) {
        return new JAXBElement<Integer>(_GiftListMemberDTOGiftListMemberId_QNAME, Integer.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientId", scope = GiftListMemberDTO.class)
    public JAXBElement<Integer> createGiftListMemberDTOClientId(Integer value) {
        return new JAXBElement<Integer>(_OrderInteractionDTOClientId_QNAME, Integer.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Title", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOTitle(String value) {
        return new JAXBElement<String>(_CategoryDTOTitle_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Text1", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOText1(String value) {
        return new JAXBElement<String>(_GiftListMemberDTOText1_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Text2", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOText2(String value) {
        return new JAXBElement<String>(_GiftListMemberDTOText2_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProfileSystemUserId", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOProfileSystemUserId(String value) {
        return new JAXBElement<String>(_GiftListMemberDTOProfileSystemUserId_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = GiftListMemberDTO.class)
    public JAXBElement<Boolean> createGiftListMemberDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListId", scope = GiftListMemberDTO.class)
    public JAXBElement<Integer> createGiftListMemberDTOGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListStockKeepingUnitDTOGiftListId_QNAME, Integer.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Mail", scope = GiftListMemberDTO.class)
    public JAXBElement<String> createGiftListMemberDTOMail(String value) {
        return new JAXBElement<String>(_GiftListMemberDTOMail_QNAME, String.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsAdmin", scope = GiftListMemberDTO.class)
    public JAXBElement<Boolean> createGiftListMemberDTOIsAdmin(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListMemberDTOIsAdmin_QNAME, Boolean.class, GiftListMemberDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInteractionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetInteractionsResult", scope = OrderGetInteractionsResponse.class)
    public JAXBElement<ArrayOfOrderInteractionDTO> createOrderGetInteractionsResponseOrderGetInteractionsResult(ArrayOfOrderInteractionDTO value) {
        return new JAXBElement<ArrayOfOrderInteractionDTO>(_OrderGetInteractionsResponseOrderGetInteractionsResult_QNAME, ArrayOfOrderInteractionDTO.class, OrderGetInteractionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitFieldNameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listStockKeepingUnitName", scope = StockKeepingUnitEspecificationInsertByList.class)
    public JAXBElement<ArrayOfStockKeepingUnitFieldNameDTO> createStockKeepingUnitEspecificationInsertByListListStockKeepingUnitName(ArrayOfStockKeepingUnitFieldNameDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitFieldNameDTO>(_StockKeepingUnitEspecificationInsertByListListStockKeepingUnitName_QNAME, ArrayOfStockKeepingUnitFieldNameDTO.class, StockKeepingUnitEspecificationInsertByList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderStatusDTO.class)
    public JAXBElement<String> createOrderStatusDTOId(String value) {
        return new JAXBElement<String>(_StoreDTOId_QNAME, String.class, OrderStatusDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = OrderStatusDTO.class)
    public JAXBElement<String> createOrderStatusDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, OrderStatusDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListMemberDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListMembers", scope = GiftListDTO.class)
    public JAXBElement<ArrayOfGiftListMemberDTO> createGiftListDTOGiftListMembers(ArrayOfGiftListMemberDTO value) {
        return new JAXBElement<ArrayOfGiftListMemberDTO>(_GiftListDTOGiftListMembers_QNAME, ArrayOfGiftListMemberDTO.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UrlFolder", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOUrlFolder(String value) {
        return new JAXBElement<String>(_GiftListDTOUrlFolder_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateModified", scope = GiftListDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListDTODateModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListDTODateModified_QNAME, XMLGregorianCalendar.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientId", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOClientId(Integer value) {
        return new JAXBElement<Integer>(_OrderInteractionDTOClientId_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FileId", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOFileId(Integer value) {
        return new JAXBElement<Integer>(_GiftListDTOFileId_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Version", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOVersion(Integer value) {
        return new JAXBElement<Integer>(_GiftListDTOVersion_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ClientAddressId", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOClientAddressId(Integer value) {
        return new JAXBElement<Integer>(_GiftListDTOClientAddressId_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListTypeId", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOGiftListTypeId(Integer value) {
        return new JAXBElement<Integer>(_GiftListDTOGiftListTypeId_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsPublic", scope = GiftListDTO.class)
    public JAXBElement<Boolean> createGiftListDTOIsPublic(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListDTOIsPublic_QNAME, Boolean.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProfileSystemUserAddressName", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOProfileSystemUserAddressName(String value) {
        return new JAXBElement<String>(_GiftListDTOProfileSystemUserAddressName_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Gifted", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOGifted(String value) {
        return new JAXBElement<String>(_GiftListDTOGifted_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EventCity", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOEventCity(String value) {
        return new JAXBElement<String>(_GiftListDTOEventCity_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateCreated", scope = GiftListDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListDTODateCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListStockKeepingUnitDTODateCreated_QNAME, XMLGregorianCalendar.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProfileSystemUserId", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOProfileSystemUserId(String value) {
        return new JAXBElement<String>(_GiftListMemberDTOProfileSystemUserId_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Message", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOMessage(String value) {
        return new JAXBElement<String>(_GiftListDTOMessage_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EventLocation", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOEventLocation(String value) {
        return new JAXBElement<String>(_GiftListDTOEventLocation_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = GiftListDTO.class)
    public JAXBElement<Boolean> createGiftListDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListId", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListStockKeepingUnitDTOGiftListId_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardId", scope = GiftListDTO.class)
    public JAXBElement<Integer> createGiftListDTOGiftCardId(Integer value) {
        return new JAXBElement<Integer>(_OrderPaymentDTOGiftCardId_QNAME, Integer.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EventState", scope = GiftListDTO.class)
    public JAXBElement<String> createGiftListDTOEventState(String value) {
        return new JAXBElement<String>(_GiftListDTOEventState_QNAME, String.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EventDate", scope = GiftListDTO.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListDTOEventDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListDTOEventDate_QNAME, XMLGregorianCalendar.class, GiftListDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftListStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftListSku", scope = GiftListSkuInsert.class)
    public JAXBElement<GiftListStockKeepingUnitDTO> createGiftListSkuInsertGiftListSku(GiftListStockKeepingUnitDTO value) {
        return new JAXBElement<GiftListStockKeepingUnitDTO>(_GiftListSkuInsertGiftListSku_QNAME, GiftListStockKeepingUnitDTO.class, GiftListSkuInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitServiceGetResult", scope = StockKeepingUnitServiceGetResponse.class)
    public JAXBElement<StockKeepingUnitServiceDTO> createStockKeepingUnitServiceGetResponseStockKeepingUnitServiceGetResult(StockKeepingUnitServiceDTO value) {
        return new JAXBElement<StockKeepingUnitServiceDTO>(_StockKeepingUnitServiceGetResponseStockKeepingUnitServiceGetResult_QNAME, StockKeepingUnitServiceDTO.class, StockKeepingUnitServiceGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetByModifiedDateResult", scope = GiftListGetByModifiedDateResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetByModifiedDateResponseGiftListGetByModifiedDateResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetByModifiedDateResponseGiftListGetByModifiedDateResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetByModifiedDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Courier", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOCourier(String value) {
        return new JAXBElement<String>(_OrderInvoiceDTOCourier_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnits", scope = OrderInvoiceDTO.class)
    public JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO> createOrderInvoiceDTOStockKeepingUnits(ArrayOfOrderInvoiceStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO>(_OrderInvoiceDTOStockKeepingUnits_QNAME, ArrayOfOrderInvoiceStockKeepingUnitDTO.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TrackingUrl", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOTrackingUrl(String value) {
        return new JAXBElement<String>(_OrderInvoiceDTOTrackingUrl_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IssuanceDate", scope = OrderInvoiceDTO.class)
    public JAXBElement<XMLGregorianCalendar> createOrderInvoiceDTOIssuanceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderInvoiceDTOIssuanceDate_QNAME, XMLGregorianCalendar.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EmbeddedInvoice", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOEmbeddedInvoice(String value) {
        return new JAXBElement<String>(_OrderInvoiceDTOEmbeddedInvoice_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InvoiceNumber", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOInvoiceNumber(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOInvoiceNumber_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InvoiceUrl", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOInvoiceUrl(String value) {
        return new JAXBElement<String>(_OrderInvoiceDTOInvoiceUrl_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TrackingNumber", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOTrackingNumber(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOTrackingNumber_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderIdV3", scope = OrderInvoiceDTO.class)
    public JAXBElement<String> createOrderInvoiceDTOOrderIdV3(String value) {
        return new JAXBElement<String>(_OrderInvoiceDTOOrderIdV3_QNAME, String.class, OrderInvoiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Email", scope = ClientGetByEmailV3 .class)
    public JAXBElement<String> createClientGetByEmailV3Email(String value) {
        return new JAXBElement<String>(_ClientGetByEmailV3Email_QNAME, String.class, ClientGetByEmailV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateLastSuccess", scope = IntegrationInterfaceDTO.class)
    public JAXBElement<XMLGregorianCalendar> createIntegrationInterfaceDTODateLastSuccess(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IntegrationInterfaceDTODateLastSuccess_QNAME, XMLGregorianCalendar.class, IntegrationInterfaceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateLastError", scope = IntegrationInterfaceDTO.class)
    public JAXBElement<XMLGregorianCalendar> createIntegrationInterfaceDTODateLastError(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IntegrationInterfaceDTODateLastError_QNAME, XMLGregorianCalendar.class, IntegrationInterfaceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InterfaceName", scope = IntegrationInterfaceDTO.class)
    public JAXBElement<String> createIntegrationInterfaceDTOInterfaceName(String value) {
        return new JAXBElement<String>(_IntegrationInterfaceDTOInterfaceName_QNAME, String.class, IntegrationInterfaceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InterfaceEnum", scope = IntegrationInterfaceDTO.class)
    public JAXBElement<ErrorType> createIntegrationInterfaceDTOInterfaceEnum(ErrorType value) {
        return new JAXBElement<ErrorType>(_IntegrationInterfaceDTOInterfaceEnum_QNAME, ErrorType.class, IntegrationInterfaceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instance", scope = IntegrationErrorCheckInstanceExists.class)
    public JAXBElement<String> createIntegrationErrorCheckInstanceExistsInstance(String value) {
        return new JAXBElement<String>(_IntegrationErrorCheckInstanceExistsInstance_QNAME, String.class, IntegrationErrorCheckInstanceExists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "startingGiftListId", scope = GiftListGetAllFromCreatedDateAndId.class)
    public JAXBElement<Integer> createGiftListGetAllFromCreatedDateAndIdStartingGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListGetAllBetweenEventDateIntervalAndIdStartingGiftListId_QNAME, Integer.class, GiftListGetAllFromCreatedDateAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FreightGetAllResult", scope = FreightGetAllResponse.class)
    public JAXBElement<ArrayOfFreightDTO> createFreightGetAllResponseFreightGetAllResult(ArrayOfFreightDTO value) {
        return new JAXBElement<ArrayOfFreightDTO>(_FreightGetAllResponseFreightGetAllResult_QNAME, ArrayOfFreightDTO.class, FreightGetAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductEspecificationListByProductIdResult", scope = ProductEspecificationListByProductIdResponse.class)
    public JAXBElement<ArrayOfFieldDTO> createProductEspecificationListByProductIdResponseProductEspecificationListByProductIdResult(ArrayOfFieldDTO value) {
        return new JAXBElement<ArrayOfFieldDTO>(_ProductEspecificationListByProductIdResponseProductEspecificationListByProductIdResult_QNAME, ArrayOfFieldDTO.class, ProductEspecificationListByProductIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idClientV3", scope = ClientGetV3 .class)
    public JAXBElement<String> createClientGetV3IdClientV3(String value) {
        return new JAXBElement<String>(_ClientGetV3IdClientV3_QNAME, String.class, ClientGetV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListMemberDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftListMember", scope = GiftListMemberInsertUpdate.class)
    public JAXBElement<ArrayOfGiftListMemberDTO> createGiftListMemberInsertUpdateGiftListMember(ArrayOfGiftListMemberDTO value) {
        return new JAXBElement<ArrayOfGiftListMemberDTO>(_GiftListMemberInsertUpdateGiftListMember_QNAME, ArrayOfGiftListMemberDTO.class, GiftListMemberInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "manufacturer", scope = StockKeepingUnitGetByManufacturerCode.class)
    public JAXBElement<String> createStockKeepingUnitGetByManufacturerCodeManufacturer(String value) {
        return new JAXBElement<String>(_StockKeepingUnitGetByManufacturerCodeManufacturer_QNAME, String.class, StockKeepingUnitGetByManufacturerCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetAllFromUpdatedDateResult", scope = StockKeepingUnitGetAllFromUpdatedDateResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createStockKeepingUnitGetAllFromUpdatedDateResponseStockKeepingUnitGetAllFromUpdatedDateResult(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_StockKeepingUnitGetAllFromUpdatedDateResponseStockKeepingUnitGetAllFromUpdatedDateResult_QNAME, ArrayOfStockKeepingUnitDTO.class, StockKeepingUnitGetAllFromUpdatedDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListMemberDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListMemberInsertUpdateResult", scope = GiftListMemberInsertUpdateResponse.class)
    public JAXBElement<ArrayOfGiftListMemberDTO> createGiftListMemberInsertUpdateResponseGiftListMemberInsertUpdateResult(ArrayOfGiftListMemberDTO value) {
        return new JAXBElement<ArrayOfGiftListMemberDTO>(_GiftListMemberInsertUpdateResponseGiftListMemberInsertUpdateResult_QNAME, ArrayOfGiftListMemberDTO.class, GiftListMemberInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "trackingNumber", scope = OrderChangeTrackingNumber.class)
    public JAXBElement<String> createOrderChangeTrackingNumberTrackingNumber(String value) {
        return new JAXBElement<String>(_OrderChangeTrackingNumberV3TrackingNumber_QNAME, String.class, OrderChangeTrackingNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitComplementDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objStockKeepingUnitComplementDTO", scope = StockKeepingUnitComplementInsertUpdate.class)
    public JAXBElement<StockKeepingUnitComplementDTO> createStockKeepingUnitComplementInsertUpdateObjStockKeepingUnitComplementDTO(StockKeepingUnitComplementDTO value) {
        return new JAXBElement<StockKeepingUnitComplementDTO>(_StockKeepingUnitComplementInsertUpdateObjStockKeepingUnitComplementDTO_QNAME, StockKeepingUnitComplementDTO.class, StockKeepingUnitComplementInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = NewsletterDTO.class)
    public JAXBElement<String> createNewsletterDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, NewsletterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = NewsletterDTO.class)
    public JAXBElement<Integer> createNewsletterDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, NewsletterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Data", scope = NewsletterDTO.class)
    public JAXBElement<XMLGregorianCalendar> createNewsletterDTOData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NewsletterDTOData_QNAME, XMLGregorianCalendar.class, NewsletterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Email", scope = NewsletterDTO.class)
    public JAXBElement<String> createNewsletterDTOEmail(String value) {
        return new JAXBElement<String>(_NewsletterDTOEmail_QNAME, String.class, NewsletterDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetByEanResult", scope = StockKeepingUnitGetByEanResponse.class)
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitGetByEanResponseStockKeepingUnitGetByEanResult(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitGetByEanResponseStockKeepingUnitGetByEanResult_QNAME, StockKeepingUnitDTO.class, StockKeepingUnitGetByEanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsSMSNewsReceiver", scope = ClientDTO.class)
    public JAXBElement<Boolean> createClientDTOIsSMSNewsReceiver(Boolean value) {
        return new JAXBElement<Boolean>(_ClientDTOIsSMSNewsReceiver_QNAME, Boolean.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Password", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOPassword(String value) {
        return new JAXBElement<String>(_ClientDTOPassword_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RewardGiftCardId", scope = ClientDTO.class)
    public JAXBElement<Integer> createClientDTORewardGiftCardId(Integer value) {
        return new JAXBElement<Integer>(_ClientDTORewardGiftCardId_QNAME, Integer.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Age", scope = ClientDTO.class)
    public JAXBElement<Integer> createClientDTOAge(Integer value) {
        return new JAXBElement<Integer>(_ClientDTOAge_QNAME, Integer.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Phone", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOPhone(String value) {
        return new JAXBElement<String>(_AddressOrderDTOPhone_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CompanyName", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOCompanyName(String value) {
        return new JAXBElement<String>(_ClientDTOCompanyName_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CreateDate", scope = ClientDTO.class)
    public JAXBElement<XMLGregorianCalendar> createClientDTOCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientDTOCreateDate_QNAME, XMLGregorianCalendar.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsCorporate", scope = ClientDTO.class)
    public JAXBElement<Boolean> createClientDTOIsCorporate(Boolean value) {
        return new JAXBElement<Boolean>(_ClientDTOIsCorporate_QNAME, Boolean.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsFraud", scope = ClientDTO.class)
    public JAXBElement<Boolean> createClientDTOIsFraud(Boolean value) {
        return new JAXBElement<Boolean>(_ClientDTOIsFraud_QNAME, Boolean.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Gender", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOGender(String value) {
        return new JAXBElement<String>(_ClientDTOGender_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsStateInscriptionImmune", scope = ClientDTO.class)
    public JAXBElement<Boolean> createClientDTOIsStateInscriptionImmune(Boolean value) {
        return new JAXBElement<Boolean>(_ClientDTOIsStateInscriptionImmune_QNAME, Boolean.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = ClientDTO.class)
    public JAXBElement<Boolean> createClientDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StateInscription", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOStateInscription(String value) {
        return new JAXBElement<String>(_ClientDTOStateInscription_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UserGUID", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOUserGUID(String value) {
        return new JAXBElement<String>(_ClientDTOUserGUID_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CelPhone", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOCelPhone(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCelPhone_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Email", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOEmail(String value) {
        return new JAXBElement<String>(_NewsletterDTOEmail_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OfficePhone", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOOfficePhone(String value) {
        return new JAXBElement<String>(_AddressOrderDTOOfficePhone_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LastLogonDate", scope = ClientDTO.class)
    public JAXBElement<XMLGregorianCalendar> createClientDTOLastLogonDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientDTOLastLogonDate_QNAME, XMLGregorianCalendar.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = ClientDTO.class)
    public JAXBElement<Integer> createClientDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LastName", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOLastName(String value) {
        return new JAXBElement<String>(_ClientDTOLastName_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsNewsReceiver", scope = ClientDTO.class)
    public JAXBElement<Boolean> createClientDTOIsNewsReceiver(Boolean value) {
        return new JAXBElement<Boolean>(_ClientDTOIsNewsReceiver_QNAME, Boolean.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "NickName", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTONickName(String value) {
        return new JAXBElement<String>(_ClientDTONickName_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateBirth", scope = ClientDTO.class)
    public JAXBElement<XMLGregorianCalendar> createClientDTODateBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientDTODateBirth_QNAME, XMLGregorianCalendar.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ChangeDate", scope = ClientDTO.class)
    public JAXBElement<XMLGregorianCalendar> createClientDTOChangeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientDTOChangeDate_QNAME, XMLGregorianCalendar.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FirstName", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOFirstName(String value) {
        return new JAXBElement<String>(_ClientDTOFirstName_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CompanyNickName", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOCompanyNickName(String value) {
        return new JAXBElement<String>(_ClientDTOCompanyNickName_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CpfCnpj", scope = ClientDTO.class)
    public JAXBElement<String> createClientDTOCpfCnpj(String value) {
        return new JAXBElement<String>(_ClientDTOCpfCnpj_QNAME, String.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressClientId", scope = ClientDTO.class)
    public JAXBElement<Integer> createClientDTOAddressClientId(Integer value) {
        return new JAXBElement<Integer>(_ClientDTOAddressClientId_QNAME, Integer.class, ClientDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitServiceId", scope = OrderItemServiceDTO.class)
    public JAXBElement<Integer> createOrderItemServiceDTOStockKeepingUnitServiceId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemServiceDTOStockKeepingUnitServiceId_QNAME, Integer.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListPrice", scope = OrderItemServiceDTO.class)
    public JAXBElement<BigDecimal> createOrderItemServiceDTOListPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOListPrice_QNAME, BigDecimal.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderItemId", scope = OrderItemServiceDTO.class)
    public JAXBElement<Integer> createOrderItemServiceDTOOrderItemId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemServiceDTOOrderItemId_QNAME, Integer.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArchiveId", scope = OrderItemServiceDTO.class)
    public JAXBElement<Integer> createOrderItemServiceDTOArchiveId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemServiceDTOArchiveId_QNAME, Integer.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = OrderItemServiceDTO.class)
    public JAXBElement<Integer> createOrderItemServiceDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Price", scope = OrderItemServiceDTO.class)
    public JAXBElement<BigDecimal> createOrderItemServiceDTOPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServicePriceDTOPrice_QNAME, BigDecimal.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardFrom", scope = OrderItemServiceDTO.class)
    public JAXBElement<String> createOrderItemServiceDTOGiftCardFrom(String value) {
        return new JAXBElement<String>(_OrderItemServiceDTOGiftCardFrom_QNAME, String.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardMessage", scope = OrderItemServiceDTO.class)
    public JAXBElement<String> createOrderItemServiceDTOGiftCardMessage(String value) {
        return new JAXBElement<String>(_OrderItemServiceDTOGiftCardMessage_QNAME, String.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitService", scope = OrderItemServiceDTO.class)
    public JAXBElement<StockKeepingUnitServiceDTO> createOrderItemServiceDTOStockKeepingUnitService(StockKeepingUnitServiceDTO value) {
        return new JAXBElement<StockKeepingUnitServiceDTO>(_OrderItemServiceDTOStockKeepingUnitService_QNAME, StockKeepingUnitServiceDTO.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardTo", scope = OrderItemServiceDTO.class)
    public JAXBElement<String> createOrderItemServiceDTOGiftCardTo(String value) {
        return new JAXBElement<String>(_OrderItemServiceDTOGiftCardTo_QNAME, String.class, OrderItemServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Width", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOWidth(Integer value) {
        return new JAXBElement<Integer>(_ImageDTOWidth_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Tag", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOTag(String value) {
        return new JAXBElement<String>(_ImageDTOTag_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArchiveParentId", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOArchiveParentId(Integer value) {
        return new JAXBElement<Integer>(_ImageDTOArchiveParentId_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArchiveTypeId", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOArchiveTypeId(Integer value) {
        return new JAXBElement<Integer>(_ImageDTOArchiveTypeId_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Height", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOHeight(Integer value) {
        return new JAXBElement<Integer>(_ImageDTOHeight_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FileLocation", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOFileLocation(String value) {
        return new JAXBElement<String>(_ImageDTOFileLocation_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "HeightUnitMeasure", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOHeightUnitMeasure(String value) {
        return new JAXBElement<String>(_ImageDTOHeightUnitMeasure_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateLastModified", scope = ImageDTO.class)
    public JAXBElement<XMLGregorianCalendar> createImageDTODateLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImageDTODateLastModified_QNAME, XMLGregorianCalendar.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WidthUnitMeasure", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOWidthUnitMeasure(String value) {
        return new JAXBElement<String>(_ImageDTOWidthUnitMeasure_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Url", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOUrl(String value) {
        return new JAXBElement<String>(_OrderPaymentDTOUrl_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsMain", scope = ImageDTO.class)
    public JAXBElement<Boolean> createImageDTOIsMain(Boolean value) {
        return new JAXBElement<Boolean>(_ImageDTOIsMain_QNAME, Boolean.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Label", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTOLabel(String value) {
        return new JAXBElement<String>(_ImageDTOLabel_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArchiveFormatId", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOArchiveFormatId(Integer value) {
        return new JAXBElement<Integer>(_ImageDTOArchiveFormatId_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitId", scope = ImageDTO.class)
    public JAXBElement<Integer> createImageDTOStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitId_QNAME, Integer.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = ImageDTO.class)
    public JAXBElement<String> createImageDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, ImageDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightTypeId", scope = FreightStockKeepingUnitDTO.class)
    public JAXBElement<String> createFreightStockKeepingUnitDTOFreightTypeId(String value) {
        return new JAXBElement<String>(_OrderDeliveryDTOFreightTypeId_QNAME, String.class, FreightStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightAdditionalInfo", scope = FreightStockKeepingUnitDTO.class)
    public JAXBElement<String> createFreightStockKeepingUnitDTOFreightAdditionalInfo(String value) {
        return new JAXBElement<String>(_FreightStockKeepingUnitDTOFreightAdditionalInfo_QNAME, String.class, FreightStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightType", scope = FreightStockKeepingUnitDTO.class)
    public JAXBElement<String> createFreightStockKeepingUnitDTOFreightType(String value) {
        return new JAXBElement<String>(_FreightStockKeepingUnitDTOFreightType_QNAME, String.class, FreightStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreightScheduledDateOptionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightScheduledDateOptions", scope = FreightStockKeepingUnitDTO.class)
    public JAXBElement<ArrayOfFreightScheduledDateOptionDTO> createFreightStockKeepingUnitDTOFreightScheduledDateOptions(ArrayOfFreightScheduledDateOptionDTO value) {
        return new JAXBElement<ArrayOfFreightScheduledDateOptionDTO>(_FreightStockKeepingUnitDTOFreightScheduledDateOptions_QNAME, ArrayOfFreightScheduledDateOptionDTO.class, FreightStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "redeptionCode", scope = GiftCardGetByRedeptionCode.class)
    public JAXBElement<String> createGiftCardGetByRedeptionCodeRedeptionCode(String value) {
        return new JAXBElement<String>(_GiftCardGetByRedeptionCodeRedeptionCode_QNAME, String.class, GiftCardGetByRedeptionCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WarehouseAbacosKey", scope = IntegrationWarehouseDTO.class)
    public JAXBElement<String> createIntegrationWarehouseDTOWarehouseAbacosKey(String value) {
        return new JAXBElement<String>(_IntegrationWarehouseDTOWarehouseAbacosKey_QNAME, String.class, IntegrationWarehouseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = IntegrationWarehouseDTO.class)
    public JAXBElement<Integer> createIntegrationWarehouseDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, IntegrationWarehouseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = AddressInsertUpdateV3 .class)
    public JAXBElement<AddressDTO> createAddressInsertUpdateV3Address(AddressDTO value) {
        return new JAXBElement<AddressDTO>(_AddressInsertUpdateV3Address_QNAME, AddressDTO.class, AddressInsertUpdateV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productVO", scope = ProductInsertUpdate.class)
    public JAXBElement<ProductDTO> createProductInsertUpdateProductVO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductInsertUpdateProductVO_QNAME, ProductDTO.class, ProductInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftcard", scope = GiftCardInsertUpdate.class)
    public JAXBElement<GiftCardDTO> createGiftCardInsertUpdateGiftcard(GiftCardDTO value) {
        return new JAXBElement<GiftCardDTO>(_GiftCardInsertUpdateGiftcard_QNAME, GiftCardDTO.class, GiftCardInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instance", scope = IntegrationLogErrorInsertUpdate.class)
    public JAXBElement<String> createIntegrationLogErrorInsertUpdateInstance(String value) {
        return new JAXBElement<String>(_IntegrationErrorCheckInstanceExistsInstance_QNAME, String.class, IntegrationLogErrorInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "errorDetail", scope = IntegrationLogErrorInsertUpdate.class)
    public JAXBElement<String> createIntegrationLogErrorInsertUpdateErrorDetail(String value) {
        return new JAXBElement<String>(_IntegrationLogErrorInsertUpdateErrorDetail_QNAME, String.class, IntegrationLogErrorInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "error", scope = IntegrationLogErrorInsertUpdate.class)
    public JAXBElement<String> createIntegrationLogErrorInsertUpdateError(String value) {
        return new JAXBElement<String>(_IntegrationLogErrorInsertUpdateError_QNAME, String.class, IntegrationLogErrorInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsStockKeepingUnit", scope = FieldDTO.class)
    public JAXBElement<Boolean> createFieldDTOIsStockKeepingUnit(Boolean value) {
        return new JAXBElement<Boolean>(_FieldDTOIsStockKeepingUnit_QNAME, Boolean.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = FieldDTO.class)
    public JAXBElement<String> createFieldDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FieldTypeId", scope = FieldDTO.class)
    public JAXBElement<Integer> createFieldDTOFieldTypeId(Integer value) {
        return new JAXBElement<Integer>(_FieldDTOFieldTypeId_QNAME, Integer.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FieldId", scope = FieldDTO.class)
    public JAXBElement<Integer> createFieldDTOFieldId(Integer value) {
        return new JAXBElement<Integer>(_FieldDTOFieldId_QNAME, Integer.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FieldValueId", scope = FieldDTO.class)
    public JAXBElement<Integer> createFieldDTOFieldValueId(Integer value) {
        return new JAXBElement<Integer>(_FieldDTOFieldValueId_QNAME, Integer.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FieldTypeName", scope = FieldDTO.class)
    public JAXBElement<String> createFieldDTOFieldTypeName(String value) {
        return new JAXBElement<String>(_FieldDTOFieldTypeName_QNAME, String.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = FieldDTO.class)
    public JAXBElement<Boolean> createFieldDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CategoryId", scope = FieldDTO.class)
    public JAXBElement<Integer> createFieldDTOCategoryId(Integer value) {
        return new JAXBElement<Integer>(_FieldDTOCategoryId_QNAME, Integer.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = FieldDTO.class)
    public JAXBElement<String> createFieldDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsRequired", scope = FieldDTO.class)
    public JAXBElement<Boolean> createFieldDTOIsRequired(Boolean value) {
        return new JAXBElement<Boolean>(_FieldDTOIsRequired_QNAME, Boolean.class, FieldDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitServiceListResult", scope = StockKeepingUnitServiceListResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitServiceDTO> createStockKeepingUnitServiceListResponseStockKeepingUnitServiceListResult(ArrayOfStockKeepingUnitServiceDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitServiceDTO>(_StockKeepingUnitServiceListResponseStockKeepingUnitServiceListResult_QNAME, ArrayOfStockKeepingUnitServiceDTO.class, StockKeepingUnitServiceListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressType", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOAddressType(String value) {
        return new JAXBElement<String>(_AddressOrderDTOAddressType_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Country", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOCountry(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCountry_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Street", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOStreet(String value) {
        return new JAXBElement<String>(_AddressOrderDTOStreet_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RecipientName", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTORecipientName(String value) {
        return new JAXBElement<String>(_AddressDTORecipientName_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = AddressDTO.class)
    public JAXBElement<Integer> createAddressDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Number", scope = AddressDTO.class)
    public JAXBElement<Integer> createAddressDTONumber(Integer value) {
        return new JAXBElement<Integer>(_AddressOrderDTONumber_QNAME, Integer.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReferencePoint", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOReferencePoint(String value) {
        return new JAXBElement<String>(_AddressOrderDTOReferencePoint_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressGUID", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOAddressGUID(String value) {
        return new JAXBElement<String>(_AddressDTOAddressGUID_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressNameV3", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOAddressNameV3(String value) {
        return new JAXBElement<String>(_AddressDTOAddressNameV3_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "State", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOState(String value) {
        return new JAXBElement<String>(_AddressOrderDTOState_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "More", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOMore(String value) {
        return new JAXBElement<String>(_AddressOrderDTOMore_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Neighborhood", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTONeighborhood(String value) {
        return new JAXBElement<String>(_AddressOrderDTONeighborhood_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "City", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOCity(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCity_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UserGUID", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOUserGUID(String value) {
        return new JAXBElement<String>(_ClientDTOUserGUID_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ZipCode", scope = AddressDTO.class)
    public JAXBElement<String> createAddressDTOZipCode(String value) {
        return new JAXBElement<String>(_AddressOrderDTOZipCode_QNAME, String.class, AddressDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "error", scope = IntegrationLogError.class)
    public JAXBElement<String> createIntegrationLogErrorError(String value) {
        return new JAXBElement<String>(_IntegrationLogErrorInsertUpdateError_QNAME, String.class, IntegrationLogError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventCity", scope = GiftListSearchWithSurname.class)
    public JAXBElement<String> createGiftListSearchWithSurnameEventCity(String value) {
        return new JAXBElement<String>(_GiftListSearchEventCity_QNAME, String.class, GiftListSearchWithSurname.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventLocation", scope = GiftListSearchWithSurname.class)
    public JAXBElement<String> createGiftListSearchWithSurnameEventLocation(String value) {
        return new JAXBElement<String>(_GiftListSearchEventLocation_QNAME, String.class, GiftListSearchWithSurname.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientName", scope = GiftListSearchWithSurname.class)
    public JAXBElement<String> createGiftListSearchWithSurnameClientName(String value) {
        return new JAXBElement<String>(_GiftListSearchClientName_QNAME, String.class, GiftListSearchWithSurname.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientSurname", scope = GiftListSearchWithSurname.class)
    public JAXBElement<String> createGiftListSearchWithSurnameClientSurname(String value) {
        return new JAXBElement<String>(_GiftListSearchWithSurnameClientSurname_QNAME, String.class, GiftListSearchWithSurname.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventDate", scope = GiftListSearchWithSurname.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListSearchWithSurnameEventDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListSearchEventDate_QNAME, XMLGregorianCalendar.class, GiftListSearchWithSurname.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StoreGetResult", scope = StoreGetResponse.class)
    public JAXBElement<StoreDTO> createStoreGetResponseStoreGetResult(StoreDTO value) {
        return new JAXBElement<StoreDTO>(_StoreGetResponseStoreGetResult_QNAME, StoreDTO.class, StoreGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsVisible", scope = ProductDTO.class)
    public JAXBElement<Boolean> createProductDTOIsVisible(Boolean value) {
        return new JAXBElement<Boolean>(_ProductDTOIsVisible_QNAME, Boolean.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RefId", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTORefId(String value) {
        return new JAXBElement<String>(_OrderItemDTORefId_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ShowWithoutStock", scope = ProductDTO.class)
    public JAXBElement<Boolean> createProductDTOShowWithoutStock(Boolean value) {
        return new JAXBElement<Boolean>(_ProductDTOShowWithoutStock_QNAME, Boolean.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LinkId", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOLinkId(String value) {
        return new JAXBElement<String>(_ProductDTOLinkId_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DepartmentId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTODepartmentId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTODepartmentId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AdWordsRemarketingCode", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOAdWordsRemarketingCode(String value) {
        return new JAXBElement<String>(_CategoryDTOAdWordsRemarketingCode_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TaxCode", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOTaxCode(String value) {
        return new JAXBElement<String>(_ProductDTOTaxCode_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "SupplierId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOSupplierId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTOSupplierId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DescriptionShort", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTODescriptionShort(String value) {
        return new JAXBElement<String>(_ProductDTODescriptionShort_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListStoreId", scope = ProductDTO.class)
    public JAXBElement<ArrayOfint> createProductDTOListStoreId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ProductDTOListStoreId_QNAME, ArrayOfint.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "BrandId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOBrandId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTOBrandId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "KeyWords", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOKeyWords(String value) {
        return new JAXBElement<String>(_ProductDTOKeyWords_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReleaseDate", scope = ProductDTO.class)
    public JAXBElement<XMLGregorianCalendar> createProductDTOReleaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductDTOReleaseDate_QNAME, XMLGregorianCalendar.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LomadeeCampaignCode", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOLomadeeCampaignCode(String value) {
        return new JAXBElement<String>(_CategoryDTOLomadeeCampaignCode_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Title", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOTitle(String value) {
        return new JAXBElement<String>(_CategoryDTOTitle_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = ProductDTO.class)
    public JAXBElement<Boolean> createProductDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CategoryId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOCategoryId(Integer value) {
        return new JAXBElement<Integer>(_FieldDTOCategoryId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MetaTagDescription", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOMetaTagDescription(String value) {
        return new JAXBElement<String>(_ProductDTOMetaTagDescription_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "category", scope = CategoryInsertUpdate.class)
    public JAXBElement<CategoryDTO> createCategoryInsertUpdateCategory(CategoryDTO value) {
        return new JAXBElement<CategoryDTO>(_CategoryInsertUpdateCategory_QNAME, CategoryDTO.class, CategoryInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListGetByCreatedDateResult", scope = GiftListGetByCreatedDateResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListGetByCreatedDateResponseGiftListGetByCreatedDateResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListGetByCreatedDateResponseGiftListGetByCreatedDateResult_QNAME, ArrayOfGiftListDTO.class, GiftListGetByCreatedDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddressGetByClientIdV3Result", scope = AddressGetByClientIdV3Response.class)
    public JAXBElement<ArrayOfAddressDTO> createAddressGetByClientIdV3ResponseAddressGetByClientIdV3Result(ArrayOfAddressDTO value) {
        return new JAXBElement<ArrayOfAddressDTO>(_AddressGetByClientIdV3ResponseAddressGetByClientIdV3Result_QNAME, ArrayOfAddressDTO.class, AddressGetByClientIdV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CpfCnpj", scope = ClientGetByCPF.class)
    public JAXBElement<String> createClientGetByCPFCpfCnpj(String value) {
        return new JAXBElement<String>(_ClientGetByCPFCpfCnpj_QNAME, String.class, ClientGetByCPF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetAllByProductResult", scope = StockKeepingUnitGetAllByProductResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createStockKeepingUnitGetAllByProductResponseStockKeepingUnitGetAllByProductResult(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_StockKeepingUnitGetAllByProductResponseStockKeepingUnitGetAllByProductResult_QNAME, ArrayOfStockKeepingUnitDTO.class, StockKeepingUnitGetAllByProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = ServiceDTO.class)
    public JAXBElement<String> createServiceDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = ServiceDTO.class)
    public JAXBElement<Integer> createServiceDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsGiftCard", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsGiftCard(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceDTOIsGiftCard_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsVisibleOnProduct", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsVisibleOnProduct(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceDTOIsVisibleOnProduct_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsVisibleOnCart", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsVisibleOnCart(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceDTOIsVisibleOnCart_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsVisibleOnService", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsVisibleOnService(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceDTOIsVisibleOnService_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsFile", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsFile(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceDTOIsFile_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsRequired", scope = ServiceDTO.class)
    public JAXBElement<Boolean> createServiceDTOIsRequired(Boolean value) {
        return new JAXBElement<Boolean>(_FieldDTOIsRequired_QNAME, Boolean.class, ServiceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitKitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitKitListByParentResult", scope = StockKeepingUnitKitListByParentResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitKitDTO> createStockKeepingUnitKitListByParentResponseStockKeepingUnitKitListByParentResult(ArrayOfStockKeepingUnitKitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitKitDTO>(_StockKeepingUnitKitListByParentResponseStockKeepingUnitKitListByParentResult_QNAME, ArrayOfStockKeepingUnitKitDTO.class, StockKeepingUnitKitListByParentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListSkuGetResult", scope = GiftListSkuGetResponse.class)
    public JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> createGiftListSkuGetResponseGiftListSkuGetResult(ArrayOfGiftListStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfGiftListStockKeepingUnitDTO>(_GiftListSkuGetResponseGiftListSkuGetResult_QNAME, ArrayOfGiftListStockKeepingUnitDTO.class, GiftListSkuGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "image", scope = ImageInsertUpdate.class)
    public JAXBElement<ImageDTO> createImageInsertUpdateImage(ImageDTO value) {
        return new JAXBElement<ImageDTO>(_ImageInsertUpdateImage_QNAME, ImageDTO.class, ImageInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetByStatusByQuantityResult", scope = OrderGetByStatusByQuantityResponse.class)
    public JAXBElement<ArrayOfOrderDTO> createOrderGetByStatusByQuantityResponseOrderGetByStatusByQuantityResult(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_OrderGetByStatusByQuantityResponseOrderGetByStatusByQuantityResult_QNAME, ArrayOfOrderDTO.class, OrderGetByStatusByQuantityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StateFullName", scope = ZipCodeDTO.class)
    public JAXBElement<String> createZipCodeDTOStateFullName(String value) {
        return new JAXBElement<String>(_ZipCodeDTOStateFullName_QNAME, String.class, ZipCodeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Neighborhood", scope = ZipCodeDTO.class)
    public JAXBElement<String> createZipCodeDTONeighborhood(String value) {
        return new JAXBElement<String>(_AddressOrderDTONeighborhood_QNAME, String.class, ZipCodeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Street", scope = ZipCodeDTO.class)
    public JAXBElement<String> createZipCodeDTOStreet(String value) {
        return new JAXBElement<String>(_AddressOrderDTOStreet_QNAME, String.class, ZipCodeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Value", scope = ZipCodeDTO.class)
    public JAXBElement<String> createZipCodeDTOValue(String value) {
        return new JAXBElement<String>(_ZipCodeDTOValue_QNAME, String.class, ZipCodeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "City", scope = ZipCodeDTO.class)
    public JAXBElement<String> createZipCodeDTOCity(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCity_QNAME, String.class, ZipCodeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "State", scope = ZipCodeDTO.class)
    public JAXBElement<String> createZipCodeDTOState(String value) {
        return new JAXBElement<String>(_AddressOrderDTOState_QNAME, String.class, ZipCodeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysToEventMin", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTODaysToEventMin(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTODaysToEventMin_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MemberMax", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTOMemberMax(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTOMemberMax_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsMessageAvailable", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOIsMessageAvailable(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListTypeDTOIsMessageAvailable_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Version", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTOVersion(Integer value) {
        return new JAXBElement<Integer>(_GiftListDTOVersion_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftListTypeId", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTOGiftListTypeId(Integer value) {
        return new JAXBElement<Integer>(_GiftListDTOGiftListTypeId_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysToExpireToMembers", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTODaysToExpireToMembers(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTODaysToExpireToMembers_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "GiftCardRechargeSkuId", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTOGiftCardRechargeSkuId(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTOGiftCardRechargeSkuId_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MemberTitle", scope = GiftListTypeDTO.class)
    public JAXBElement<String> createGiftListTypeDTOMemberTitle(String value) {
        return new JAXBElement<String>(_GiftListTypeDTOMemberTitle_QNAME, String.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsPublic", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOIsPublic(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListDTOIsPublic_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsUnique", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOIsUnique(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListTypeDTOIsUnique_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysToExpireToVisitors", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTODaysToExpireToVisitors(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTODaysToExpireToVisitors_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ShipToListOwner", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOShipToListOwner(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListTypeDTOShipToListOwner_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = GiftListTypeDTO.class)
    public JAXBElement<String> createGiftListTypeDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DaysToEventMax", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTODaysToEventMax(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTODaysToEventMax_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TextTitle1", scope = GiftListTypeDTO.class)
    public JAXBElement<String> createGiftListTypeDTOTextTitle1(String value) {
        return new JAXBElement<String>(_GiftListTypeDTOTextTitle1_QNAME, String.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsStockImpact", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOIsStockImpact(Boolean value) {
        return new JAXBElement<Boolean>(_OrderItemDTOIsStockImpact_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MemberMin", scope = GiftListTypeDTO.class)
    public JAXBElement<Integer> createGiftListTypeDTOMemberMin(Integer value) {
        return new JAXBElement<Integer>(_GiftListTypeDTOMemberMin_QNAME, Integer.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TextTitle2", scope = GiftListTypeDTO.class)
    public JAXBElement<String> createGiftListTypeDTOTextTitle2(String value) {
        return new JAXBElement<String>(_GiftListTypeDTOTextTitle2_QNAME, String.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsProtected", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOIsProtected(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListTypeDTOIsProtected_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = GiftListTypeDTO.class)
    public JAXBElement<Boolean> createGiftListTypeDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = GiftListTypeDTO.class)
    public JAXBElement<String> createGiftListTypeDTODescription(String value) {
        return new JAXBElement<String>(_CategoryDTODescription_QNAME, String.class, GiftListTypeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientIdV3", scope = AddressGetByClientIdV3 .class)
    public JAXBElement<String> createAddressGetByClientIdV3ClientIdV3(String value) {
        return new JAXBElement<String>(_AddressGetByClientIdV3ClientIdV3_QNAME, String.class, AddressGetByClientIdV3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productid", scope = ProductGetAllFromUpdatedDateAndId.class)
    public JAXBElement<Integer> createProductGetAllFromUpdatedDateAndIdProductid(Integer value) {
        return new JAXBElement<Integer>(_ProductGetAllFromUpdatedDateAndIdProductid_QNAME, Integer.class, ProductGetAllFromUpdatedDateAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetByClientCpfResult", scope = OrderGetByClientCpfResponse.class)
    public JAXBElement<ArrayOfOrderDTO> createOrderGetByClientCpfResponseOrderGetByClientCpfResult(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_OrderGetByClientCpfResponseOrderGetByClientCpfResult_QNAME, ArrayOfOrderDTO.class, OrderGetByClientCpfResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetByRefIdResult", scope = StockKeepingUnitGetByRefIdResponse.class)
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitGetByRefIdResponseStockKeepingUnitGetByRefIdResult(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitGetByRefIdResponseStockKeepingUnitGetByRefIdResult_QNAME, StockKeepingUnitDTO.class, StockKeepingUnitGetByRefIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Width", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOWidth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ImageDTOWidth_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RefId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTORefId(String value) {
        return new JAXBElement<String>(_OrderItemDTORefId_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CostPrice", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOCostPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOCostPrice_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Height", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOHeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ImageDTOHeight_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsAvaiable", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitDTOIsAvaiable(Boolean value) {
        return new JAXBElement<Boolean>(_StockKeepingUnitDTOIsAvaiable_QNAME, Boolean.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsKit", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitDTOIsKit(Boolean value) {
        return new JAXBElement<Boolean>(_OrderItemDTOIsKit_QNAME, Boolean.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ModalId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOModalId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOModalId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealHeight", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealHeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealHeight_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RewardValue", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORewardValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORewardValue_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListPrice", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOListPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOListPrice_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EstimatedDateArrival", scope = StockKeepingUnitDTO.class)
    public JAXBElement<XMLGregorianCalendar> createStockKeepingUnitDTOEstimatedDateArrival(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StockKeepingUnitDTOEstimatedDateArrival_QNAME, XMLGregorianCalendar.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOProductId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemDTOProductId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ManufacturerCode", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOManufacturerCode(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOManufacturerCode_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductName", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOProductName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOProductName_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StoreDTOIsActive_QNAME, Boolean.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitEanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitEans", scope = StockKeepingUnitDTO.class)
    public JAXBElement<ArrayOfStockKeepingUnitEanDTO> createStockKeepingUnitDTOStockKeepingUnitEans(ArrayOfStockKeepingUnitEanDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitEanDTO>(_StockKeepingUnitDTOStockKeepingUnitEans_QNAME, ArrayOfStockKeepingUnitEanDTO.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOId(Integer value) {
        return new JAXBElement<Integer>(_StoreDTOId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CubicWeight", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOCubicWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOCubicWeight_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Length", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOLength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOLength_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Price", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServicePriceDTOPrice_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WeightKg", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOWeightKg(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOWeightKg_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealWidth", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealWidth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealWidth_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealLength", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealLength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealLength_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InternalNote", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOInternalNote(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOInternalNote_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealWeightKg", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealWeightKg(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealWeightKg_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CommercialConditionId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOCommercialConditionId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOCommercialConditionId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateUpdated", scope = StockKeepingUnitDTO.class)
    public JAXBElement<XMLGregorianCalendar> createStockKeepingUnitDTODateUpdated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StockKeepingUnitDTODateUpdated_QNAME, XMLGregorianCalendar.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MeasurementUnit", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOMeasurementUnit(String value) {
        return new JAXBElement<String>(_OrderItemDTOMeasurementUnit_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ModalType", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOModalType(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOModalType_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UnitMultiplier", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOUnitMultiplier(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemDTOUnitMultiplier_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftListDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftListV2FiltersResult", scope = GiftListV2FiltersResponse.class)
    public JAXBElement<ArrayOfGiftListDTO> createGiftListV2FiltersResponseGiftListV2FiltersResult(ArrayOfGiftListDTO value) {
        return new JAXBElement<ArrayOfGiftListDTO>(_GiftListV2FiltersResponseGiftListV2FiltersResult_QNAME, ArrayOfGiftListDTO.class, GiftListV2FiltersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EAN13", scope = StockKeepingUnitGetByEan.class)
    public JAXBElement<String> createStockKeepingUnitGetByEanEAN13(String value) {
        return new JAXBElement<String>(_StockKeepingUnitGetByEanEAN13_QNAME, String.class, StockKeepingUnitGetByEan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWareHouseIStockableDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "WareHouseIStockableGetByStockKeepingUnitV3Result", scope = WareHouseIStockableGetByStockKeepingUnitV3Response.class)
    public JAXBElement<ArrayOfWareHouseIStockableDTO> createWareHouseIStockableGetByStockKeepingUnitV3ResponseWareHouseIStockableGetByStockKeepingUnitV3Result(ArrayOfWareHouseIStockableDTO value) {
        return new JAXBElement<ArrayOfWareHouseIStockableDTO>(_WareHouseIStockableGetByStockKeepingUnitV3ResponseWareHouseIStockableGetByStockKeepingUnitV3Result_QNAME, ArrayOfWareHouseIStockableDTO.class, WareHouseIStockableGetByStockKeepingUnitV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StockKeepingUnitGetByManufacturerCodeResult", scope = StockKeepingUnitGetByManufacturerCodeResponse.class)
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createStockKeepingUnitGetByManufacturerCodeResponseStockKeepingUnitGetByManufacturerCodeResult(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_StockKeepingUnitGetByManufacturerCodeResponseStockKeepingUnitGetByManufacturerCodeResult_QNAME, ArrayOfStockKeepingUnitDTO.class, StockKeepingUnitGetByManufacturerCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServicePriceGetResult", scope = ServicePriceGetResponse.class)
    public JAXBElement<ServicePriceDTO> createServicePriceGetResponseServicePriceGetResult(ServicePriceDTO value) {
        return new JAXBElement<ServicePriceDTO>(_ServicePriceGetResponseServicePriceGetResult_QNAME, ServicePriceDTO.class, ServicePriceGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Value", scope = OrderItemDiscountDTO.class)
    public JAXBElement<BigDecimal> createOrderItemDiscountDTOValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ZipCodeDTOValue_QNAME, BigDecimal.class, OrderItemDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DiscountName", scope = OrderItemDiscountDTO.class)
    public JAXBElement<String> createOrderItemDiscountDTODiscountName(String value) {
        return new JAXBElement<String>(_OrderItemDiscountDTODiscountName_QNAME, String.class, OrderItemDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsPercentual", scope = OrderItemDiscountDTO.class)
    public JAXBElement<Boolean> createOrderItemDiscountDTOIsPercentual(Boolean value) {
        return new JAXBElement<Boolean>(_OrderItemDiscountDTOIsPercentual_QNAME, Boolean.class, OrderItemDiscountDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GiftCardInsertUpdateResult", scope = GiftCardInsertUpdateResponse.class)
    public JAXBElement<GiftCardDTO> createGiftCardInsertUpdateResponseGiftCardInsertUpdateResult(GiftCardDTO value) {
        return new JAXBElement<GiftCardDTO>(_GiftCardInsertUpdateResponseGiftCardInsertUpdateResult_QNAME, GiftCardDTO.class, GiftCardInsertUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientCpfCnpj", scope = GiftListGetByClientCpf.class)
    public JAXBElement<String> createGiftListGetByClientCpfClientCpfCnpj(String value) {
        return new JAXBElement<String>(_GiftListGetByClientCpfClientCpfCnpj_QNAME, String.class, GiftListGetByClientCpf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Description", scope = ProductEspecificationTextInsertByFieldId.class)
    public JAXBElement<String> createProductEspecificationTextInsertByFieldIdDescription(String value) {
        return new JAXBElement<String>(_ProductEspecificationTextInsertByFieldIdDescription_QNAME, String.class, ProductEspecificationTextInsertByFieldId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = FreightDTO.class)
    public JAXBElement<String> createFreightDTOName(String value) {
        return new JAXBElement<String>(_StoreDTOName_QNAME, String.class, FreightDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightTypeID", scope = FreightDTO.class)
    public JAXBElement<Integer> createFreightDTOFreightTypeID(Integer value) {
        return new JAXBElement<Integer>(_FreightDTOFreightTypeID_QNAME, Integer.class, FreightDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "FreightID", scope = FreightDTO.class)
    public JAXBElement<Integer> createFreightDTOFreightID(Integer value) {
        return new JAXBElement<Integer>(_FreightDTOFreightID_QNAME, Integer.class, FreightDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DistributionCenterID", scope = FreightDTO.class)
    public JAXBElement<Integer> createFreightDTODistributionCenterID(Integer value) {
        return new JAXBElement<Integer>(_DistributionCenterDTODistributionCenterID_QNAME, Integer.class, FreightDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ModalID", scope = FreightDTO.class)
    public JAXBElement<Integer> createFreightDTOModalID(Integer value) {
        return new JAXBElement<Integer>(_FreightDTOModalID_QNAME, Integer.class, FreightDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IdIntegrationError", scope = IntegrationErrorDTO.class)
    public JAXBElement<Integer> createIntegrationErrorDTOIdIntegrationError(Integer value) {
        return new JAXBElement<Integer>(_IntegrationErrorDTOIdIntegrationError_QNAME, Integer.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AwareDate", scope = IntegrationErrorDTO.class)
    public JAXBElement<XMLGregorianCalendar> createIntegrationErrorDTOAwareDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IntegrationErrorDTOAwareDate_QNAME, XMLGregorianCalendar.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Date", scope = IntegrationErrorDTO.class)
    public JAXBElement<XMLGregorianCalendar> createIntegrationErrorDTODate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderPaymentDTODate_QNAME, XMLGregorianCalendar.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Error", scope = IntegrationErrorDTO.class)
    public JAXBElement<String> createIntegrationErrorDTOError(String value) {
        return new JAXBElement<String>(_IntegrationErrorDTOError_QNAME, String.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InterfaceClass", scope = IntegrationErrorDTO.class)
    public JAXBElement<String> createIntegrationErrorDTOInterfaceClass(String value) {
        return new JAXBElement<String>(_IntegrationErrorDTOInterfaceClass_QNAME, String.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Instance", scope = IntegrationErrorDTO.class)
    public JAXBElement<String> createIntegrationErrorDTOInstance(String value) {
        return new JAXBElement<String>(_IntegrationErrorDTOInstance_QNAME, String.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ErrorDetail", scope = IntegrationErrorDTO.class)
    public JAXBElement<String> createIntegrationErrorDTOErrorDetail(String value) {
        return new JAXBElement<String>(_IntegrationErrorDTOErrorDetail_QNAME, String.class, IntegrationErrorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldValues", scope = ProductEspecificationInsertByFieldId.class)
    public JAXBElement<ArrayOfstring> createProductEspecificationInsertByFieldIdFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProductEspecificationInsertFieldValues_QNAME, ArrayOfstring.class, ProductEspecificationInsertByFieldId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Quantity", scope = OrderInvoiceStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createOrderInvoiceStockKeepingUnitDTOQuantity(Integer value) {
        return new JAXBElement<Integer>(_OrderInvoiceStockKeepingUnitDTOQuantity_QNAME, Integer.class, OrderInvoiceStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Price", scope = OrderInvoiceStockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createOrderInvoiceStockKeepingUnitDTOPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServicePriceDTOPrice_QNAME, BigDecimal.class, OrderInvoiceStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitId", scope = OrderInvoiceStockKeepingUnitDTO.class)
    public JAXBElement<Integer> createOrderInvoiceStockKeepingUnitDTOStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitId_QNAME, Integer.class, OrderInvoiceStockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldValues", scope = StockKeepingUnitEspecificationInsertByFieldId.class)
    public JAXBElement<ArrayOfstring> createStockKeepingUnitEspecificationInsertByFieldIdFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProductEspecificationInsertFieldValues_QNAME, ArrayOfstring.class, StockKeepingUnitEspecificationInsertByFieldId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressType", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2AddressType(String value) {
        return new JAXBElement<String>(_AddressOrderDTOAddressType_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Country", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2Country(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCountry_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Street", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2Street(String value) {
        return new JAXBElement<String>(_AddressOrderDTOStreet_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RecipientName", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2RecipientName(String value) {
        return new JAXBElement<String>(_AddressDTORecipientName_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2Id(String value) {
        return new JAXBElement<String>(_StoreDTOId_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Number", scope = AddressDTO2 .class)
    public JAXBElement<Integer> createAddressDTO2Number(Integer value) {
        return new JAXBElement<Integer>(_AddressOrderDTONumber_QNAME, Integer.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReferencePoint", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2ReferencePoint(String value) {
        return new JAXBElement<String>(_AddressOrderDTOReferencePoint_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressGUID", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2AddressGUID(String value) {
        return new JAXBElement<String>(_AddressDTOAddressGUID_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AddressNameV3", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2AddressNameV3(String value) {
        return new JAXBElement<String>(_AddressDTOAddressNameV3_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "State", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2State(String value) {
        return new JAXBElement<String>(_AddressOrderDTOState_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "More", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2More(String value) {
        return new JAXBElement<String>(_AddressOrderDTOMore_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Neighborhood", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2Neighborhood(String value) {
        return new JAXBElement<String>(_AddressOrderDTONeighborhood_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "City", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2City(String value) {
        return new JAXBElement<String>(_AddressOrderDTOCity_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UserGUID", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2UserGUID(String value) {
        return new JAXBElement<String>(_ClientDTOUserGUID_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ZipCode", scope = AddressDTO2 .class)
    public JAXBElement<String> createAddressDTO2ZipCode(String value) {
        return new JAXBElement<String>(_AddressOrderDTOZipCode_QNAME, String.class, AddressDTO2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftListTypeId", scope = GiftListV2Filters.class)
    public JAXBElement<Integer> createGiftListV2FiltersGiftListTypeId(Integer value) {
        return new JAXBElement<Integer>(_GiftListV2FiltersGiftListTypeId_QNAME, Integer.class, GiftListV2Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clientId", scope = GiftListV2Filters.class)
    public JAXBElement<Integer> createGiftListV2FiltersClientId(Integer value) {
        return new JAXBElement<Integer>(_GiftListV2FiltersClientId_QNAME, Integer.class, GiftListV2Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventDateUntil", scope = GiftListV2Filters.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListV2FiltersEventDateUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListV2FiltersEventDateUntil_QNAME, XMLGregorianCalendar.class, GiftListV2Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventDateSince", scope = GiftListV2Filters.class)
    public JAXBElement<XMLGregorianCalendar> createGiftListV2FiltersEventDateSince(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GiftListV2FiltersEventDateSince_QNAME, XMLGregorianCalendar.class, GiftListV2Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giftListId", scope = GiftListV2Filters.class)
    public JAXBElement<Integer> createGiftListV2FiltersGiftListId(Integer value) {
        return new JAXBElement<Integer>(_GiftListV2FiltersGiftListId_QNAME, Integer.class, GiftListV2Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "isActive", scope = GiftListV2Filters.class)
    public JAXBElement<Boolean> createGiftListV2FiltersIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_GiftListV2FiltersIsActive_QNAME, Boolean.class, GiftListV2Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "fieldValues", scope = ProductFieldNameDTO.class)
    public JAXBElement<ArrayOfstring> createProductFieldNameDTOFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_StockKeepingUnitFieldNameDTOFieldValues_QNAME, ArrayOfstring.class, ProductFieldNameDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "fieldName", scope = ProductFieldNameDTO.class)
    public JAXBElement<String> createProductFieldNameDTOFieldName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitFieldNameDTOFieldName_QNAME, String.class, ProductFieldNameDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddressInsertUpdateV3Result", scope = AddressInsertUpdateV3Response.class)
    public JAXBElement<AddressDTO> createAddressInsertUpdateV3ResponseAddressInsertUpdateV3Result(AddressDTO value) {
        return new JAXBElement<AddressDTO>(_AddressInsertUpdateV3ResponseAddressInsertUpdateV3Result_QNAME, AddressDTO.class, AddressInsertUpdateV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "statusOrder", scope = OrderGetByStatus.class)
    public JAXBElement<String> createOrderGetByStatusStatusOrder(String value) {
        return new JAXBElement<String>(_OrderGetByStatusByQuantityStatusOrder_QNAME, String.class, OrderGetByStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "brand", scope = BrandInsertUpdate.class)
    public JAXBElement<BrandDTO> createBrandInsertUpdateBrand(BrandDTO value) {
        return new JAXBElement<BrandDTO>(_BrandInsertUpdateBrand_QNAME, BrandDTO.class, BrandInsertUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientName", scope = IntegrationSettings.class)
    public JAXBElement<String> createIntegrationSettingsClientName(String value) {
        return new JAXBElement<String>(_IntegrationSettingsClientName_QNAME, String.class, IntegrationSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "OrderId", scope = GiftCardTransactionItemDTO.class)
    public JAXBElement<Integer> createGiftCardTransactionItemDTOOrderId(Integer value) {
        return new JAXBElement<Integer>(_OrderDiscountDTOOrderId_QNAME, Integer.class, GiftCardTransactionItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Value", scope = GiftCardTransactionItemDTO.class)
    public JAXBElement<BigDecimal> createGiftCardTransactionItemDTOValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ZipCodeDTOValue_QNAME, BigDecimal.class, GiftCardTransactionItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RedemptionCode", scope = GiftCardTransactionItemDTO.class)
    public JAXBElement<String> createGiftCardTransactionItemDTORedemptionCode(String value) {
        return new JAXBElement<String>(_GiftCardTransactionItemDTORedemptionCode_QNAME, String.class, GiftCardTransactionItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitId", scope = GiftCardTransactionItemDTO.class)
    public JAXBElement<Integer> createGiftCardTransactionItemDTOStockKeepingUnitId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitKitDTOStockKeepingUnitId_QNAME, Integer.class, GiftCardTransactionItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceGetResult", scope = ServiceGetResponse.class)
    public JAXBElement<ServiceDTO> createServiceGetResponseServiceGetResult(ServiceDTO value) {
        return new JAXBElement<ServiceDTO>(_ServiceGetResponseServiceGetResult_QNAME, ServiceDTO.class, ServiceGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientGetAllFromCreatedDateAndIdResult", scope = ClientGetAllFromCreatedDateAndIdResponse.class)
    public JAXBElement<ArrayOfClientDTO> createClientGetAllFromCreatedDateAndIdResponseClientGetAllFromCreatedDateAndIdResult(ArrayOfClientDTO value) {
        return new JAXBElement<ArrayOfClientDTO>(_ClientGetAllFromCreatedDateAndIdResponseClientGetAllFromCreatedDateAndIdResult_QNAME, ArrayOfClientDTO.class, ClientGetAllFromCreatedDateAndIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldName", scope = StockKeepingUnitEspecificationInsert.class)
    public JAXBElement<String> createStockKeepingUnitEspecificationInsertFieldName(String value) {
        return new JAXBElement<String>(_ProductEspecificationInsertFieldName_QNAME, String.class, StockKeepingUnitEspecificationInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldValues", scope = StockKeepingUnitEspecificationInsert.class)
    public JAXBElement<ArrayOfstring> createStockKeepingUnitEspecificationInsertFieldValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProductEspecificationInsertFieldValues_QNAME, ArrayOfstring.class, StockKeepingUnitEspecificationInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "integrationErrorId", scope = IntegrationErrorGetAllByErrorTypeAndId.class)
    public JAXBElement<Integer> createIntegrationErrorGetAllByErrorTypeAndIdIntegrationErrorId(Integer value) {
        return new JAXBElement<Integer>(_IntegrationErrorGetAllByErrorTypeAndIdIntegrationErrorId_QNAME, Integer.class, IntegrationErrorGetAllByErrorTypeAndId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClientGetV3Result", scope = ClientGetV3Response.class)
    public JAXBElement<ClientDTO> createClientGetV3ResponseClientGetV3Result(ClientDTO value) {
        return new JAXBElement<ClientDTO>(_ClientGetV3ResponseClientGetV3Result_QNAME, ClientDTO.class, ClientGetV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductGetResult", scope = ProductGetResponse.class)
    public JAXBElement<ProductDTO> createProductGetResponseProductGetResult(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductGetResponseProductGetResult_QNAME, ProductDTO.class, ProductGetResponse.class, value);
    }

}
