import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import schema.SupplyUserCredentialsRequest;
import schema.UserCredentialsResponse;

@Endpoint
public class UserLoginEndPoint
{
	@PayloadRoot(localPart = "SupplyUserCredentialsRequest", namespace = "http://www.gradfather.com/user")
	public UserCredentialsResponse authenticateUser(SupplyUserCredentialsRequest request) {
	UserCredentialsResponse a=new UserCredentialsResponse();
	if(request.getLoginId().equalsIgnoreCase("a") && request.getPassword().equalsIgnoreCase("a"))
	{
		a.setResult("true");
	}
	else
		a.setResult("false");
	return a;
	}
}
