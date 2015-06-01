package com.oreilly.justspring.ch1;


public class ReaderService {
  private IReader reader = null;
  






public ReaderService() {
	
}


public IReader getReader() {
	return reader;
}


public void setReader(IReader reader) {
	this.reader = reader;
}


public ReaderService(IReader reader) {
    this.reader = reader;
  }

  public String fetchData() {
    return reader.read();
  }
}
