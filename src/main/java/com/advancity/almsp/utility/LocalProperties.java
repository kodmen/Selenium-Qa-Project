package com.advancity.almsp.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LocalProperties {
    String result = "";
    static InputStream inputStream;
    static Properties prop;
    static String propFileName;

    static{
        prop = new Properties();
        propFileName = "local.properties";

        inputStream = LocalProperties.class.getClassLoader().getResourceAsStream(propFileName);
        if (inputStream != null) {
            try{
                prop.load(inputStream);
            }catch (IOException e){
                System.out.printf("dosya yüklenemedi");
            }

        } else {
            System.out.printf("dosya yok");
            //throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }
    }

    public static String getGridBrowser() {
        if (System.getProperty("gridBrowser") != null) {
            return System.getProperty("gridBrowser");
        } else {
            return prop.getProperty("gridBrowser");
        }
    }

    public static String getUserName() {
        if (System.getProperty("kullanici") != null) {
            return System.getProperty("kullanici");
        } else {
            return prop.getProperty("kullanici");
        }
    }

    public static String getPassword() {
        if (System.getProperty("sifre") != null) {
            return System.getProperty("sifre");
        } else {
            return prop.getProperty("sifre");
        }
    }

    public static String getUrl() {
        if (System.getProperty("webSayfasi") != null) {
            return System.getProperty("webSayfasi");
        } else {
            return prop.getProperty("webSayfasi");
        }
    }

    public static String getProfilUrl() {
        if (System.getProperty("profil") != null) {
            return System.getProperty("profil");
        } else {
            return prop.getProperty("profil");
        }
    }
}
