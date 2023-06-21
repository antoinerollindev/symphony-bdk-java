package com.symphony.bdk.app.spring.auth.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * App Token generated by the application.
 */

public record AppToken(String appToken) {

  @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
  public AppToken(@JsonProperty("appToken") String appToken) {
    this.appToken = appToken;
  }
}
