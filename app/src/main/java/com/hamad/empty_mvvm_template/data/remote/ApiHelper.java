package com.hamad.empty_mvvm_template.data.remote;

import com.hamad.empty_mvvm_template.data.model.api.LoginRequest;
import com.hamad.empty_mvvm_template.data.model.api.LoginResponse;
import com.hamad.empty_mvvm_template.data.model.api.LogoutResponse;

import io.reactivex.Single;



public interface ApiHelper {

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();


}
