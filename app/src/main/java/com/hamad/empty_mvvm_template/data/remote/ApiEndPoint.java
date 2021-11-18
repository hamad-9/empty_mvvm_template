package com.hamad.empty_mvvm_template.data.remote;

import com.hamad.empty_mvvm_template.BuildConfig;



public final class ApiEndPoint {

    public static final String ENDPOINT_BLOG = BuildConfig.BASE_URL + "/5926ce9d11000096006ccb30";

    public static final String ENDPOINT_FACEBOOK_LOGIN = BuildConfig.BASE_URL + "/588d15d3100000ae072d2944";

    public static final String ENDPOINT_GOOGLE_LOGIN = BuildConfig.BASE_URL + "/588d14f4100000a9072d2943";

    public static final String ENDPOINT_LOGOUT = BuildConfig.BASE_URL + "/588d161c100000a9072d2946";

    public static final String ENDPOINT_OPEN_SOURCE = BuildConfig.BASE_URL + "/5926c34212000035026871cd";

    public static final String ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "/588d15f5100000a8072d2945";

    private ApiEndPoint() {
        // This class is not publicly instantiable
    }
}
