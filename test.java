import com.plaid.client.PlaidClient;
import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import okhttp3.OkHttpClient;
import retrofit2.Response;

public class Main {
    public static void main(String[] args) {
        String clientId = "YOUR_PLAID_CLIENT_ID";
        String secret = "YOUR_PLAID_SECRET";
        String publicToken = "REPLACE_WITH_PUBLIC_TOKEN"; // You receive this after a user logs in using Plaid Link

        PlaidService plaidService = new PlaidService(clientId, secret, "sandbox"); // Use sandbox for testing
        String accessToken = plaidService.exchangePublicToken(publicToken);
        plaidService.getAccountDetails(accessToken);
    }
}

class PlaidService {
    private PlaidClient plaidClient;

    public PlaidService(String clientId, String secret, String environment) {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        this.plaidClient = PlaidClient.newBuilder()
                .clientIdAndSecret(clientId, secret)
                .sandboxBaseUrl() // Use the appropriate environment URL
                .httpClient(httpClientBuilder.build())
                .build();
    }

    public String exchangePublicToken(String publicToken) {
        try {
            Response<ItemPublicTokenExchangeResponse> response = plaidClient.service().itemPublicTokenExchange(
                    new ItemPublicTokenExchangeRequest(publicToken)).execute();

            if (response.isSuccessful()) {
                return response.body().getAccessToken();
            } else {
                System.err.println("Could not exchange public token: " + response.errorBody().string());
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getAccountDetails(String accessToken) {
        try {
            Response<AccountsGetResponse> response = plaidClient.service().accountsGet(
                    new AccountsGetRequest(accessToken)).execute();

            if (response.isSuccessful()) {
                response.body().getAccounts().forEach(account ->
                        System.out.println("Account: " + account.getName() + ", Balance: " + account.getBalances().getAvailable()));
            } else {
                System.err.println("Error fetching account details: " + response.errorBody().string());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}