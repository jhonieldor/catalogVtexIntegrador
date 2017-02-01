/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Jhoni
 */
public class TesteIntegracaoProduto {
    
    public static void main(String[] args){
        IService service = new Service().getBasicHttpBindingIService();
        ObjectFactory objectFactory = new ObjectFactory();
        
        ProductDTO productDTO = objectFactory.createProductDTO();
        
        productDTO.setName(objectFactory.createProductDTOName("Produto Teste 2"));
        productDTO.setIsActive(objectFactory.createProductDTOIsActive(true));
        productDTO.setIsVisible(objectFactory.createProductDTOIsVisible(true));
        productDTO.setDescription(objectFactory.createProductDTODescription("Teste de integração"));
        productDTO.setDescriptionShort(objectFactory.createProductDTODescriptionShort("Teste de Integração"));
        productDTO.setCategoryId(objectFactory.createProductDTOCategoryId(2));
        productDTO.setDepartmentId(objectFactory.createProductDTODepartmentId(1));
        productDTO.setBrandId(objectFactory.createProductDTOBrandId(2000002));
        productDTO.setLomadeeCampaignCode(objectFactory.createProductDTOLomadeeCampaignCode("PRODUTOTESTE2"));
        productDTO.setTaxCode(objectFactory.createProductDTOTaxCode("5101"));
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
        
        ProductDTO productDTOSaved = service.productInsertUpdate(productDTO);
        
        StockKeepingUnitDTO skuDTO = objectFactory.createStockKeepingUnitDTO();
        skuDTO.setProductId(objectFactory.createStockKeepingUnitDTOProductId(productDTOSaved.getId().getValue()));
        skuDTO.setRefId(objectFactory.createStockKeepingUnitDTORefId("55001_1"));
        skuDTO.setIsActive(objectFactory.createStockKeepingUnitDTOIsActive(true));
        skuDTO.setPrice(objectFactory.createStockKeepingUnitDTOPrice(new BigDecimal(45.00)));

//        String descricaoClass = produtoClass.getDescricaoProdutoClass();
//        if (produtoClass.getLinha() != null && produtoClass.getColuna() != null) {
//            descricaoClass = descricaoClass + " " + labelLinha + " " + produtoClass.getLinha() +
//                    " " + labelColuna + " " + produtoClass.getColuna();
//        }
        String descricaoClass = "Produto Teste 2 Tamanho Médio Cor Azul";
        skuDTO.setName(objectFactory.createStockKeepingUnitDTOName(descricaoClass));
        skuDTO.setProductName(objectFactory.createStockKeepingUnitDTOProductName("Produto Teste 2"));
        skuDTO.setIsAvaiable(objectFactory.createStockKeepingUnitDTOIsAvaiable(true));
        skuDTO.setHeight(objectFactory.createStockKeepingUnitDTOHeight(new BigDecimal(0.00)));
        skuDTO.setLength(objectFactory.createStockKeepingUnitDTOLength(new BigDecimal(0.00)));
        skuDTO.setWidth(objectFactory.createStockKeepingUnitDTOWidth(new BigDecimal(0.00)));
        skuDTO.setWeightKg(objectFactory.createStockKeepingUnitDTOWeightKg(new BigDecimal(0.00)));
        skuDTO.setCubicWeight(objectFactory.createStockKeepingUnitDTOCubicWeight(new BigDecimal(0.00)));
        skuDTO.setModalId(objectFactory.createStockKeepingUnitDTOModalId(1));
        skuDTO.setIsKit(objectFactory.createStockKeepingUnitDTOIsKit(false));
//        if (produtoClass.getComprimento() != null)
//            skuDTO.setLength(objectFactory.createStockKeepingUnitDTOLength(new BigDecimal(produtoClass.getComprimento())));
//
//        if (produtoClass.getLargura() != null)
//            skuDTO.setWidth(objectFactory.createStockKeepingUnitDTOWidth(new BigDecimal(produtoClass.getLargura())));
        StockKeepingUnitDTO  skuDTOSaved = service.stockKeepingUnitInsertUpdate(skuDTO);
//        service.stockKeepingUnitInsertUpdate(skuDTO)
//        service.stock

        System.out.println("Sku Saved: " + skuDTOSaved.getId().getValue());
    }
    
    
    
}
