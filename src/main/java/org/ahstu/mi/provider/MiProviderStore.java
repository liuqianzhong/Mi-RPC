package org.ahstu.mi.provider;

import org.ahstu.mi.common.MiUtil;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by renyueliang on 17/5/15.
 */
public class MiProviderStore {

    private static Map<String,MiProviderMeta> providerMetaMap =new Hashtable<String, MiProviderMeta>();




    public static void add(MiProviderMeta insistProviderMeta){
        String serviceNameGroupVersion= MiUtil.serviceGroupVersionCreateKey(
                insistProviderMeta.getInterfaceName(),
                insistProviderMeta.getGroup(),
                insistProviderMeta.getVersion());

        add(serviceNameGroupVersion,insistProviderMeta);
    }

    public static void add(String serviceNameGroupVersion,MiProviderMeta insistProviderMeta){
        providerMetaMap.put(serviceNameGroupVersion,insistProviderMeta);
    }

    public static MiProviderMeta get(String serviceNameGroupVersion){
        return providerMetaMap.get(serviceNameGroupVersion);
    }

    public static Collection<MiProviderMeta> getAll(){
        return providerMetaMap.values();
    }


}