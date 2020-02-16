/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gtl.notisfo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesLoader {

    private static final Properties properties = new Properties();

    private PropertiesLoader() {
    }

    public static void initialise() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propertiesInputStream = null;
        try {
            propertiesInputStream = classLoader.getResourceAsStream("notisfo.properties");
            properties.load(propertiesInputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (propertiesInputStream != null) {
                propertiesInputStream.close();
            }
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
