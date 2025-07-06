package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint: " + endpoint);
        // Simulate request logic here...
        System.out.println("Request sent successfully to: " + endpoint);		
	}
	
	// Overloaded version 2: Accepts endpoint, requestBody, and requestStatus
	private void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
	System.out.println("Sending request to endpoint: " + endpoint);
	System.out.println("Sending request body " +requestBody);
	if (requestStatus) {
		System.out.println("Request was successful");
	}
	else {
		System.out.println("Request Failed");
	}
	}

	public static void main(String[] args) {
		APIClient APIClientOptions = new APIClient();
		APIClientOptions.sendRequest("https://api.example.com/users");
		APIClientOptions.sendRequest("https://api.example.com/createUser", "Chandrika", true);
		

	}

}
