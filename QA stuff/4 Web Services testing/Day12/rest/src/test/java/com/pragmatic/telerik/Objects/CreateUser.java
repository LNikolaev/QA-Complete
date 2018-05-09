package com.pragmatic.telerik.Objects;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "Username", "Password", "DisplayName", "Email" })
public class CreateUser {

	@JsonProperty("Username")
	public String username;
	@JsonProperty("Password")
	public String password;
	@JsonProperty("DisplayName")
	public String displayName;
	@JsonProperty("Email")
	public String email;

}