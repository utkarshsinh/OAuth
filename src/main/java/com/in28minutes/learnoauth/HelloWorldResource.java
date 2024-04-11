package com.in28minutes.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	@GetMapping("/")
	public String helloWorld(Authentication authentication) {
		System.out.println(authentication);
		System.out.println(authentication.getPrincipal());
		return "Hello Google World";
	}

}

//OAuth2AuthenticationToken [Principal=Name: [115202934967094411654], Granted Authorities: [[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], User Attributes: [{at_hash=5QUfUqu66NCr_ZeXy629Zw, sub=115202934967094411654, email_verified=true, iss=https://accounts.google.com, given_name=Utkarsh, nonce=whA_5mHMDQmBSohu9RV2RTEns4p-tQh7BGGpCY-8V5A, picture=https://lh3.googleusercontent.com/a/ACg8ocJblH06tk7sacTSirqIQnY28EbFe9i4fQwLEbkVT0PS4YjvTqx69g=s96-c, aud=[430102904399-o1ohnt0630aaqa29s48apo56d48od8st.apps.googleusercontent.com], azp=430102904399-o1ohnt0630aaqa29s48apo56d48od8st.apps.googleusercontent.com, name=Utkarsh Sinh, exp=2024-04-11T19:00:30Z, family_name=Sinh, iat=2024-04-11T18:00:30Z, email=utkarshsinh96@gmail.com}], Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=0:0:0:0:0:0:0:1, SessionId=929C729329E4D3CEE5942CA28C8BA540], Granted Authorities=[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]]

//Name: [115202934967094411654], Granted Authorities: [[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], User Attributes: [{at_hash=5QUfUqu66NCr_ZeXy629Zw, sub=115202934967094411654, email_verified=true, iss=https://accounts.google.com, given_name=Utkarsh, nonce=whA_5mHMDQmBSohu9RV2RTEns4p-tQh7BGGpCY-8V5A, picture=https://lh3.googleusercontent.com/a/ACg8ocJblH06tk7sacTSirqIQnY28EbFe9i4fQwLEbkVT0PS4YjvTqx69g=s96-c, aud=[430102904399-o1ohnt0630aaqa29s48apo56d48od8st.apps.googleusercontent.com], azp=430102904399-o1ohnt0630aaqa29s48apo56d48od8st.apps.googleusercontent.com, name=Utkarsh Sinh, exp=2024-04-11T19:00:30Z, family_name=Sinh, iat=2024-04-11T18:00:30Z, email=utkarshsinh96@gmail.com}]