package it.ised.prosa;

import org.json.simple.JSONObject;
import org.junit.Test;

public class TestProtocollazioneTest {
	
  @SuppressWarnings("unchecked")
	@Test
  public void invokeHandleRequest() {
		JSONObject jo_input = new JSONObject();
		jo_input.put("submissionid", "235413246");
		
		JSONObject jo_output = new JSONObject();
		
		TestProtocollazione ociFunction = new TestProtocollazione();
		jo_output = ociFunction.handleRequest(jo_input);
		
		System.out.println(jo_output.toJSONString());
		
		
  }
}
