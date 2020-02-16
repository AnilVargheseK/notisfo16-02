package com.gtl.notisfo.service;

import com.gtl.notisfo.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.sql.SQLException;
import javax.net.ssl.HttpsURLConnection;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

public class TradeInquiryService {

    private static final String DATA_FORMAT = "CSV:CSV";
    private static final String VERSION = "1.0";

    private static String getAllTradeData(String nonce) throws Exception {

        String authorization = Util.getInqAuthorization();

        System.out.println(nonce + "<- nonce");

        String postData = TradeInquiryService.getAllTradeRequestData();
        System.out.println("post Data  : " + postData);
        String tradeInquirytHost = "www.devconnect2nse.com";
        String tradeInquiryEndpoint = "/inquiry-fo/trades-inquiry";
        String urlString = "https://" + tradeInquirytHost + tradeInquiryEndpoint;

        URL url = new URL(urlString);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", authorization);
        connection.setRequestProperty("nonce", nonce);
        connection.setDoOutput(true);

        try ( OutputStream os = connection.getOutputStream()) {
            byte[] input = postData.getBytes("utf-8");
            os.write(input, 0, input.length);
            os.flush();
            os.close();
        }

        String responseLine = "";
        StringBuilder respone = new StringBuilder();
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            responseLine = null;
            while ((responseLine = br.readLine()) != null) {
//                    System.out.println(responseLine);
                respone.append(responseLine.trim());
            }
            System.out.println("respone  : " + respone.toString());
//                br.close();
        }
        System.out.println("resLine......");
        return respone.toString();
    }

    /////   
    public static String getAllTradeRequestData() throws Exception {

//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println("*****");
//        ObjectNode data1 = mapper.createObjectNode();
//        data1.put("msgId", Util.getMsgId());
//        System.out.println("Messegeid");
//        data1.put("dataFormat", DATA_FORMAT);
//        data1.put("tradesInquiry", "0,ALL,,");
//        ObjectNode jsonData = mapper.createObjectNode();
//        jsonData.put("version", VERSION);
//        jsonData.put("data", data1.toString());

        JSONObject j = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("msgId", Util.getMsgId());
        data.put("dataFormat", DATA_FORMAT);
        data.put("tradesInquiry", "0,ALL,,");
        j.put("version", VERSION);
        j.put("data", data);

        System.out.println("trade request data: " + j);

        return j.toString();
    }
    
    public static String getTradeRes() throws IOException, SQLException, Exception {

        String json = getAllTradeData(Util.getinstance().getNonce1());

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
//        System.out.println(jsonNode.toString());

        JsonNode status = jsonNode.path("status");
//        String status1 = status.asText();

        JsonNode drNode = jsonNode.path("data");
        JsonNode get = drNode.get("tradesInquiry");
        String tradesInquiry = get.asText();

        return tradesInquiry;
    }

}
