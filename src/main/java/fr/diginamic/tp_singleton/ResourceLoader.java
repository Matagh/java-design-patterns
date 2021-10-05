package fr.diginamic.tp_singleton;

import java.util.ResourceBundle;

public class ResourceLoader {

    private ResourceBundle configuration = null;

    private ResourceLoader(){
        this.configuration = ResourceBundle.getBundle("configuration");
    }

    private static ResourceLoader INSTANCE = null;

    public static ResourceLoader getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ResourceLoader();
        }
        return INSTANCE;
    }

    // Getter
    public ResourceBundle getConfiguration(){
        return this.configuration;
    }
}
