package com.musketeers.springpoc.authservice.model;

import com.musketeers.springpoc.authservice.utils.SerializableObjectConverter;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

@Data
@Document
public class MongoRefreshToken {

    public static final String TOKEN_ID = "tokenId";

    @Id
    private String id;

    private String tokenId;
    private OAuth2RefreshToken token;
    private String authentication;


    public OAuth2Authentication getAuthentication() {
        return SerializableObjectConverter.deserialize(authentication);
    }

    public void setAuthentication(OAuth2Authentication authentication) {
        this.authentication = SerializableObjectConverter.serialize(authentication);
    }
}