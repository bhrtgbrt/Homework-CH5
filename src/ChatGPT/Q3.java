package ChatGPT;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Q3{
    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/posts/1"; // 測試 API

        try {
            // 建立 URL 物件
            URL url = new URL(urlString);
            
            // 開啟連線
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // 設定請求方法
            connection.setRequestMethod("GET");
            
            // 檢查回應碼
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // 成功
                // 讀取伺服器回應內容
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder responseContent = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    responseContent.append(line).append("\n");
                }
                reader.close();

                // 顯示內容
                System.out.println("Response Content:\n" + responseContent);
            } else {
                System.out.println("Failed to connect, HTTP Response Code: " + responseCode);
            }

            // 關閉連線
            connection.disconnect();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
