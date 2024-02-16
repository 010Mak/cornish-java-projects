import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Windchill {
    public static void main(String[] args) {

        String MakWeatherAPI = "https://api.openweathermap.org/data/3.0/onecall?lat=40.9379&lon=-73.83167&exclude=hourly,daily&appid=1f8ab53b4768b635a31e3e2e2f95224c";

        
        
        try {
            URL url = new URL(MakWeatherAPI);
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            

            //bufferreader to get the API response

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder responseContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
            
            JSONObject jsonObject = new JSONObject(responseContent.toString());

            // WIND SPEED FROM API RESPONSE
            double windSpeed = jsonObject.getJSONObject("current").getDouble("wind_speed");
            
            // AIR TEMPERATURE FROM API RESPONSE
            double airTemperature = jsonObject.getJSONObject("current").getDouble("temp");
            
            double airTemperatureF = (airTemperature - 273.15) * 9/5 + 32;
            
            
            // WIND CHILL CALCULATION
            
            double windChill = 35.74 + 0.6215 * airTemperatureF - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * airTemperatureF * Math.pow(windSpeed, 0.16);
            
            
    
            
            
            System.out.println("Wind Speed: " + windSpeed);

            System.out.println("Air Temperature: " + airTemperatureF);

            System.out.println("Wind Chill: " + windChill);
            
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
