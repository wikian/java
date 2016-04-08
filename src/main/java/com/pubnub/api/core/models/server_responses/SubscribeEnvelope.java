package com.pubnub.api.core.models.server_responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class SubscribeEnvelope {

    @JsonProperty("m")
    List<SubscribeMessage> messages;

    @JsonProperty("t")
    SubscribeMetadata metadata;

}
