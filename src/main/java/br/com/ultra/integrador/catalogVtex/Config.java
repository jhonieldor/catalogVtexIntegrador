package br.com.ultra.integrador.catalogVtex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;

/**
 * Created by Jhoni on 31/01/2017.
 */
public class Config implements Serializable {

    private String wsdlURL;

    private String username;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWsdlURL() {
        return wsdlURL;
    }

    public void setWsdlURL(String wsdlURL) {
        this.wsdlURL = wsdlURL;
    }

    public Config getConfig(){
        Gson jsonParser = new GsonBuilder().setPrettyPrinting().create();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("config/integrationconfig.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String json = readJson(inputStream);
        return jsonParser.fromJson(json, Config.class);
    }

    public String readJson(InputStream jsonFile) {
        InputStream fis = jsonFile;
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String json = sb.toString();

        return json;
    }
}
