import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JSONToJava {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		CustomerDetails c = null;
		JSONArray ja = new JSONArray();
		ArrayList<CustomerDetails> list = new ArrayList<CustomerDetails>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "password");
		
		//create object of Statement class to execute queries
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
		
		while(rs.next())
		{
			 c = new CustomerDetails();
			c.setCourseName(rs.getString(1));
			c.setPurchaseDate(rs.getString(2));
			c.setAmount(rs.getInt(3));
			c.setLocation(rs.getString(4));
			
			list.add(c);
			
			/*
			System.out.println(c.getCourseName());
			System.out.println(c.getPurchaseDate());
			System.out.println(c.getAmount());
			System.out.println(c.getLocation());*/
			
			//System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) );
			//System.out.println("####################");
		}
		String path = System.getProperty("user.dir");
		for(int i = 0 ; i<list.size();i++)
		{
			ObjectMapper oj = new ObjectMapper();
			
			oj.writeValue(new File(path + File.separator + "cusomerInfo" +  i+ ".json"), list.get(i));  //System.getProperty("user.dir")
			//create JSON String from java object
			Gson gs = new Gson();
			String jsonString = gs.toJson(list.get(i));
			ja.add(jsonString);
			
		}
		
		
		//JSONSimple
		JSONObject jo = new JSONObject();
		jo.put("data", ja);
		System.out.println(jo.toJSONString());
		String unescapedString = StringEscapeUtils.unescapeJava(jo.toJSONString());
		System.out.println(unescapedString);
		
		String newString1 = unescapedString.replace("\"{", "{");
		String finalString = newString1.replace("}\"", "}");
		
		System.out.println(finalString);
		FileWriter file = null;
		//merging all JSON into a single JSON
		try 
		{
			 file = new FileWriter(path + File.separator + "consolidatedJson" + ".json");
			file.write(finalString);
			System.out.println("######SUCCESSFULLY COPIED JSON OBJECTS INTO A SINGLE FILE#####");
			 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			file.flush();
			file.close();
		}
	
		
		conn.close();
		
		

	}

}
