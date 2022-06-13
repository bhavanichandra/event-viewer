package com.example.filetransfer.api;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Builder
public class HttpParameters extends Parameters {
  private String method;
  private Map<String, Object> queryParams;
  private Map<String, Object> uriParams;
  private String requestPath;
}
