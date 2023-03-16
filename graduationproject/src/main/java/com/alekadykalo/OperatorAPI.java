  /*
   * OperatorAPI
   *
   * 1.52
   *
   * 16/03/2023
   *
   * Alessandro Kadykalo
   */

package com.alekadykalo;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperatorAPI {

    private final String hostURL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&json";
    private final String charset = "UTF-8";
    private final byte MAX_LENGTH = 9;
    private final String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";


    public String getHostURL() {
        return hostURL;
    }

    public String getCharset() {
        return charset;
    }

    public byte getMAX_LENGTH() {
        return MAX_LENGTH;
    }

    public String getAlphaNumericString() {
        return AlphaNumericString;
    }
    public String GetCurrentCourseUAHtoDollar() throws UnsupportedEncodingException {

    StringBuilder IDjsonObject = new StringBuilder(getMAX_LENGTH());
        for (int i = 0; i < getMAX_LENGTH(); i++) {
        int index = (int)(getAlphaNumericString().length() * Math.random());
        IDjsonObject.append(getAlphaNumericString().charAt(index));
    }

    String query = String.format("IDjsonObject=%s", URLEncoder.encode(String.valueOf(IDjsonObject), getCharset()));
    HttpResponse<JsonNode> jsonResponse = Unirest.get(getHostURL() + "?" + query).asJson();

    String text = jsonResponse.getBody().toString();

    String result = null;

    String regex = "\"rate\":\\d+(\\.\\d+)";
    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
             result = matcher.group();
        }
        return result;
    }

    private Double beautifyCurrentCourse() throws UnsupportedEncodingException {

        String result = null;
        String regex = "\\d+(\\.\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.GetCurrentCourseUAHtoDollar());
        while (matcher.find()) {
            result = matcher.group();
        }
        return Double.parseDouble(result);

    }

    public Double convertUAHtoDollar(Double inputMoney) throws UnsupportedEncodingException {
        return inputMoney / beautifyCurrentCourse();
    }

    public Double convertDollartoUAH(Double inputMoney) throws UnsupportedEncodingException {
        return inputMoney * beautifyCurrentCourse();
    }

}
