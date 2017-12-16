/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetCode;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

/**
 *
 * @author apprajapati
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
 */
public class StringToJsonObject {

    public static void main(String[] args) {

        
        String jsonStr = "[{\"No\":\"1\",\"Name\":\"ABC\"},{\"No\":\"2\",\"Name\":\"PQR\"},{\"No\":\"3\",\"Name\":\"XYZ\"}]";

        JsonParser parse = new JsonParser();
        JsonElement element = parse.parse(jsonStr); //Need to Add Gson library to use this.
        
       
        System.out.println(element.toString());
       
  
    }

    public class JsonObject {
        String id;
        String name;
        String salary;
    }

}
