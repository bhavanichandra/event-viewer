package com.example.filetransfer.api;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Parameters {
  private String contentType;
  private String contentLength;
}

