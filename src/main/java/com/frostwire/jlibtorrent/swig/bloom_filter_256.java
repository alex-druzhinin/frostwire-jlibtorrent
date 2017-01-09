/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class bloom_filter_256 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected bloom_filter_256(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bloom_filter_256 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_bloom_filter_256(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean find(sha1_hash k) {
    return libtorrent_jni.bloom_filter_256_find(swigCPtr, this, sha1_hash.getCPtr(k), k);
  }

  public void set(sha1_hash k) {
    libtorrent_jni.bloom_filter_256_set(swigCPtr, this, sha1_hash.getCPtr(k), k);
  }

  public void clear() {
    libtorrent_jni.bloom_filter_256_clear(swigCPtr, this);
  }

  public float size() {
    return libtorrent_jni.bloom_filter_256_size(swigCPtr, this);
  }

  public bloom_filter_256() {
    this(libtorrent_jni.new_bloom_filter_256(), true);
  }

  public byte_vector to_bytes() {
    return new byte_vector(libtorrent_jni.bloom_filter_256_to_bytes(swigCPtr, this), true);
  }

  public void from_bytes(byte_vector v) {
    libtorrent_jni.bloom_filter_256_from_bytes(swigCPtr, this, byte_vector.getCPtr(v), v);
  }

}
