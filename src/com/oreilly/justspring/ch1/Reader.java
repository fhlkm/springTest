package com.oreilly.justspring.ch1;

/**
 * This is a base interface contract for any data reading functionality. Ideally
 * the read method implements the technical details of how the data is read.
 * 
 * @author kondama
 * 
 */
public interface Reader {
  public String read();
}
