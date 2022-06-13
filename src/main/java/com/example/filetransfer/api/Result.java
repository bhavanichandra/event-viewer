package com.example.filetransfer.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T, K> {

  private T content;
  private K parameters;

}

