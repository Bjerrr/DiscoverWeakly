package com.dw.DW.SpotifyOAuth;

public class AccessTokenResponse {
    public String access_token;
    public String token_type;
    public int expires_in;
    public String refresh_token;
    public String scope;

    public AccessTokenResponse() { }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccessTokenResponse{");
        sb.append("access_token='").append(access_token).append('\'');
        sb.append(", token_type='").append(token_type).append('\'');
        sb.append(", expires_in=").append(expires_in);
        sb.append(", refresh_token='").append(refresh_token).append('\'');
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
