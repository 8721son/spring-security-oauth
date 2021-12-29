package com.oauth.enum_package;

public enum ProviderType {
    KAKAO("카카오"),
    GOOGLE("구글"),
    APPLE("애플");

    private final String value;

    ProviderType(String value) {
        this.value = value;
    }

    public String getKey() {
        return name();
    }

    public String getValue() {
        return this.value;
    }
}