package br.com.ultra.integrador.vtexwsclients;

import br.com.ultra.integrador.catalogVtex.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Jhoni on 12/01/2017.
 */
public class WSProductClient {

    public ProductResponse insertUpdateProductDTO(IService service, ProductDTO product){
        ObjectFactory objectFactory = new ObjectFactory();
//        ProductDTO product =
        ProductResponse response = new ProductResponse();
        ProductDTO productDTOSaved = null;
        IService iService = new Service().getBasicHttpBindingIService();
        try{

            productDTOSaved = iService.productInsertUpdate(product);
            response.setMessageLog("Produto Integrado na Vtex(Id) :" + productDTOSaved.getId());

        }catch (Exception e){

            String messageLog = getStackTrace(e);
            response.setMessageLog(messageLog);
            e.printStackTrace();
        }

        return response;
    }

    public void insertProductTest(){
        IService service = new Service().getBasicHttpBindingIService();
        ObjectFactory objectFactory = new ObjectFactory();

        ProductDTO productDTO = objectFactory.createProductDTO();
        productDTO.setName(objectFactory.createProductDTOName("Produto Teste 1"));
        productDTO.setIsActive(objectFactory.createProductDTOIsActive(true));
        productDTO.setIsVisible(objectFactory.createProductDTOIsVisible(true));
        productDTO.setDescription(objectFactory.createProductDTODescription("Teste de integração"));
        productDTO.setDescriptionShort(objectFactory.createProductDTODescriptionShort("Teste de Integração"));
        productDTO.setCategoryId(objectFactory.createProductDTOCategoryId(2));
        productDTO.setDepartmentId(objectFactory.createProductDTODepartmentId(1));
        productDTO.setBrandId(objectFactory.createProductDTOBrandId(2000002));
        productDTO.setLomadeeCampaignCode(objectFactory.createProductDTOLomadeeCampaignCode("PRODUTOTESTE"));
        productDTO.setRefId(objectFactory.createProductDTORefId("55001"));
//        productDTO.setTaxCode(objectFactory.createProductDTOTaxCode("5101"));
        productDTO.setSupplierId(null);
        productDTO.setShowWithoutStock(objectFactory.createProductDTOShowWithoutStock(false));
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar date2 = null;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        productDTO.setReleaseDate(objectFactory.createProductDTOReleaseDate(date2));
        productDTO.setMetaTagDescription(objectFactory.createProductDTOMetaTagDescription("produto-teste"));
        productDTO.setAdWordsRemarketingCode(objectFactory.createProductDTOAdWordsRemarketingCode("produto-teste"));
//        try{
        ProductDTO productDTOSaved = service.productInsertUpdate(productDTO);
        System.out.println("ProductDTO saved: " + productDTOSaved.getId().getValue());
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }

    public BrandDTO sendBrandDTO(String brand){
        ObjectFactory objectFactory = new ObjectFactory();
        BrandDTO brandDTO = objectFactory.createBrandDTO();
        brandDTO.setDescription(objectFactory.createBrandDTODescription(brand));
        brandDTO.setName(objectFactory.createBrandDTOName(brand));
        brandDTO.setIsActive(objectFactory.createBrandDTOIsActive(new Boolean(Boolean.TRUE)));

        Service wsClient = new Service();
        return wsClient.getBasicHttpBindingIService().brandInsertUpdate(brandDTO);
    }

    public String getStackTrace(Exception ex) {
        StringWriter errors = new StringWriter();
        ex.printStackTrace(new PrintWriter(errors));
        return errors.toString();
    }

}
