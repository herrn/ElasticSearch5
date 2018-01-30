package com.es;

import com.sun.istack.internal.logging.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EsClient {
    private static Logger logger = Logger.getLogger(EsClient.class);
    private static String host = "172.16.234.130";
    private static int prot = 9300;

    public static void main(String[] args) throws UnknownHostException {
        @SuppressWarnings("resource")
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(EsClient.host), prot));
        System.out.println(client);
        client.close();
    }



    public static TransportClient getEsclient(){
        TransportClient client = null;

        try {
            logger.info("开始连接ES!");
            client = new PreBuiltTransportClient(Settings.EMPTY)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(EsClient.host), prot));
        }catch (Exception e){
            logger.info("连接ES失败！\n"+e);
        }

        return client;
    }

}
