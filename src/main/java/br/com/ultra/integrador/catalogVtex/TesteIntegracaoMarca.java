package br.com.ultra.integrador.catalogVtex;

import br.com.ultra.integrador.vtexwsclients.WSProductClient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by Jhoni on 31/01/2017.
 */
public class TesteIntegracaoMarca {

    public static void main(String[] args) throws JAXBException {
        ObjectFactory objectFactory = new ObjectFactory();
        BrandDTO brandDTO = objectFactory.createBrandDTO();
        brandDTO.setDescription(objectFactory.createBrandDTODescription("Zanela"));
        brandDTO.setName(objectFactory.createBrandDTOName("Zanela"));
        brandDTO.setIsActive(objectFactory.createBrandDTOIsActive(new Boolean(Boolean.TRUE)));
        WSProductClient wsProductClient = new WSProductClient();
        wsProductClient.sendBrandDTO("Zanela");

//        IService service = new Service().getBasicHttpBindingIService();
//        BrandDTO brandDTO1 = service.brandInsertUpdate(brandDTO);
//        System.out.println(brandDTO1.getId().getValue());
//
//
//        BrandInsertUpdate brandInsertUpdate = objectFactory.createBrandInsertUpdate();
//        brandInsertUpdate.setBrand(objectFactory.createBrandInsertUpdateBrand(brandDTO));
//
//        JAXBContext jc = JAXBContext.newInstance(BrandInsertUpdate.class);
//
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(brandInsertUpdate, System.out);
//        ObjectFactory objectFactory = new ObjectFactory();
//        IService service = new Service().getBasicHttpBindingIService();
//        service.productActive(49);
    }
}
