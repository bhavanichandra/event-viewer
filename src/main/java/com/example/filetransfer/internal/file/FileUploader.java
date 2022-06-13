package com.example.filetransfer.internal.file;

import com.example.filetransfer.api.FileParameters;
import com.example.filetransfer.api.HttpParameters;
import com.example.filetransfer.api.Result;

import java.io.InputStream;

public interface FileUploader {

  /**
   *  Read file form SFTP Server and send file stream to target systems
   *  @return {@link Result} result model indicates success
   */
  Result<InputStream, FileParameters> uploadFile(String filePath);

  /**
   *  Read file form HTTP POST Request and send file stream to target systems
   * @return {@link Result} result model indicates success
   */
  Result<InputStream, HttpParameters> uploadFile();

}
