import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WeatherAnalysisTool {
    private static final String FILE_PATH = "/mnt/data/McQN_ALL_2023.csv";
    private static final Map<String, List<WeatherData>> weatherDataMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Data Buoy Analytical Tool");
        loadWeatherData();
        System.out.println("data loaded in with " + weatherDataMap.size() + " entries.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options: weatherOnDay, minTempOnDay, maxTempOnDay, rainOnDay, snowOnDay, rainForMonth, maxTempEachYear, exit");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("exit")) {
                System.out.println("quitting tool.");
                break;
            }

            System.out.println("Enter the date (YYYY-MM-DD) or month and year (YYYY-MM):");
            String input = scanner.nextLine();
            handleOption(option, input);
        }
    }

    private static void loadWeatherData() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String dateTime = values[0];
                String date = dateTime.split(" ")[0];

                int temp = Integer.parseInt(values[1]);
                double rain = Double.parseDouble(values[8]);

                WeatherData data = new WeatherData(date, temp, temp, rain, 0.0);
                weatherDataMap.computeIfAbsent(date, k -> new ArrayList<>()).add(data);
            }
        } catch (IOException e) {
            System.err.println("Error loading weather data: " + e.getMessage());
        }
    }

    private static void handleOption(String option, String input) {
        switch (option) {
            case "weatherOnDay":
                System.out.println(weatherOnDay(input));
                break;
            case "minTempOnDay":
                System.out.println(minTempOnDay(input));
                break;
            case "maxTempOnDay":
                System.out.println(maxTempOnDay(input));
                break;
            case "rainOnDay":
                System.out.println(rainOnDay(input));
                break;
            case "snowOnDay":
                System.out.println(snowOnDay(input));
                break;
            case "rainForMonth":
                String[] monthYear = input.split("-");
                System.out.println(rainForMonth(monthYear[1], Integer.parseInt(monthYear[0])));
                break;
            case "maxTempEachYear":
                System.out.println(Arrays.toString(maxTempEachYear(input)));
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public static String weatherOnDay(String date) {
        List<WeatherData> data = weatherDataMap.get(date);
        return data != null ? data.toString() : "No data for this date.";
    }

    public static int minTempOnDay(String date) {
        return weatherDataMap.getOrDefault(date, new ArrayList<>()).stream()
                .mapToInt(WeatherData::getMinTemp)
                .min()
                .orElse(Integer.MIN_VALUE);
    }

    public static int maxTempOnDay(String date) {
        return weatherDataMap.getOrDefault(date, new ArrayList<>()).stream()
                .mapToInt(WeatherData::getMaxTemp)
                .max()
                .orElse(Integer.MAX_VALUE);
    }

    public static double rainOnDay(String date) {
        return weatherDataMap.getOrDefault(date, new ArrayList<>()).stream()
                .mapToDouble(WeatherData::getRain)
                .sum();
    }

    public static double snowOnDay(String date) {
        return weatherDataMap.getOrDefault(date, new ArrayList<>()).stream()
                .mapToDouble(WeatherData::getSnow)
                .sum();
    }

    public static double rainForMonth(String month, int year) {
        String prefix = year + "-" + month;
        return weatherDataMap.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith(prefix))
                .flatMap(entry -> entry.getValue().stream())
                .mapToDouble(WeatherData::getRain)
                .sum();
    }

    public static int[] maxTempEachYear(String month) {
        Map<Integer, Integer> maxTemps = new HashMap<>();
        weatherDataMap.forEach((date, dataList) -> {
            String[] dateParts = date.split("-");
            int year = Integer.parseInt(dateParts[0]);
            if (dateParts[1].equals(month)) {
                int maxTemp = dataList.stream().mapToInt(WeatherData::getMaxTemp).max().orElse(Integer.MIN_VALUE);
                maxTemps.put(year, Math.max(maxTemps.getOrDefault(year, Integer.MIN_VALUE), maxTemp));
            }
        });
        return maxTemps.values().stream().mapToInt(Integer::intValue).toArray();
    }
}

class WeatherData {
    private final String date;
    private final int minTemp;
    private final int maxTemp;
    private final double rain;
    private final double snow;

    public WeatherData(String date, int minTemp, int maxTemp, double rain, double snow) {
        this.date = date;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.rain = rain;
        this.snow = snow;
    }

    public String getDate() {
        return date;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public double getRain() {
        return rain;
    }

    public double getSnow() {
        return snow;
    }

    @Override
    public String toString() {
        return "Date: " + date +
               ", Min Temp: " + minTemp +
               ", Max Temp: " + maxTemp +
               ", Rain: " + rain +
               ", Snow: " + snow;
    }
}
