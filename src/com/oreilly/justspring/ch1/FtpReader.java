package com.oreilly.justspring.ch1;


public class FtpReader implements IReader {
  private String ftpHost = null;
  private int ftpPort = 0;
  
  
  
  public FtpReader() {

}

public FtpReader(String ftpHost, int ftpPort) {

	this.ftpHost = ftpHost;
	this.ftpPort = ftpPort;
}

@Override
  public String read() {
    return null;
  }

  public void setFtpHost(String ftpHost) {
    this.ftpHost = ftpHost;
  }

  public String getFtpHost() {
    return ftpHost;
  }

  public void setFtpPort(int ftpPort) {
    this.ftpPort = ftpPort;
  }

  public int getFtpPort() {
    return ftpPort;
  }

}
