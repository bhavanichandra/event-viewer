package com.example.filetransfer.api;

import lombok.Builder;
import lombok.Data;

@Builder
public class FileParameters extends Parameters {
  private String fileName;
  private String path;
  private boolean isDirectory;
}
