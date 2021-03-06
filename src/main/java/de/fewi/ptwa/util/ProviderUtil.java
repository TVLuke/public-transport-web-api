package de.fewi.ptwa.util;

import de.schildbach.pte.NetworkProvider;

public class ProviderUtil {

    public static NetworkProvider getObjectForProvider(String providerName) {
        if(providerName == null || providerName.length() < 1)
            return null;
        try {
            Class<?> providerClass = Class.forName("de.schildbach.pte." + providerName + "Provider");
            return (NetworkProvider)providerClass.newInstance();
        } catch (ClassNotFoundException e) {
            return null;
        } catch (InstantiationException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        }
    }
}
