package hqr.ms.domian;

/**
 * @author vanyouseea
 * Save the appId, appPwf, uri in domain
 *
 */

public class AppInfo {
	private String appId;
	private String appPwd;
	private String redirectUri;
	private String accessToken;
	private String refreshToken;
	
	private static AppInfo appInfo;
	public static AppInfo getInstance() {
		if(appInfo==null) {
			appInfo = new AppInfo();
		}
		return appInfo;
	}
	
	private AppInfo() {}
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppPwd() {
		return appPwd;
	}
	public void setAppPwd(String appPwd) {
		this.appPwd = appPwd;
	}
	public String getRedirectUri() {
		return redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}
