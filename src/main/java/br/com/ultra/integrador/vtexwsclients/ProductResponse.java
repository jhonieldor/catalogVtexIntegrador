package br.com.ultra.integrador.vtexwsclients;

import br.com.ultra.integrador.catalogVtex.ProductDTO;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Jhoni on 12/01/2017.
 */
public class ProductResponse {

    private String messageLog;

    private ProductDTO productDTO;

    public String getMessageLog() {
        return messageLog;
    }

    public void setMessageLog(String messageLog) {
        this.messageLog = messageLog;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }
}
