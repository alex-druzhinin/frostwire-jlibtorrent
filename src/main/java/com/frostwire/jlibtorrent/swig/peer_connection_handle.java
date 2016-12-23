/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_connection_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected peer_connection_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_connection_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_connection_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public connection_type type() {
    return connection_type.swigToEnum(libtorrent_jni.peer_connection_handle_type(swigCPtr, this));
  }

  public boolean is_seed() {
    return libtorrent_jni.peer_connection_handle_is_seed(swigCPtr, this);
  }

  public boolean upload_only() {
    return libtorrent_jni.peer_connection_handle_upload_only(swigCPtr, this);
  }

  public sha1_hash pid() {
    return new sha1_hash(libtorrent_jni.peer_connection_handle_pid(swigCPtr, this), false);
  }

  public boolean has_piece(int i) {
    return libtorrent_jni.peer_connection_handle_has_piece(swigCPtr, this, i);
  }

  public boolean is_interesting() {
    return libtorrent_jni.peer_connection_handle_is_interesting(swigCPtr, this);
  }

  public boolean is_choked() {
    return libtorrent_jni.peer_connection_handle_is_choked(swigCPtr, this);
  }

  public boolean is_peer_interested() {
    return libtorrent_jni.peer_connection_handle_is_peer_interested(swigCPtr, this);
  }

  public boolean has_peer_choked() {
    return libtorrent_jni.peer_connection_handle_has_peer_choked(swigCPtr, this);
  }

  public void choke_this_peer() {
    libtorrent_jni.peer_connection_handle_choke_this_peer(swigCPtr, this);
  }

  public void maybe_unchoke_this_peer() {
    libtorrent_jni.peer_connection_handle_maybe_unchoke_this_peer(swigCPtr, this);
  }

  public void get_peer_info(peer_info p) {
    libtorrent_jni.peer_connection_handle_get_peer_info(swigCPtr, this, peer_info.getCPtr(p), p);
  }

  public torrent_handle associated_torrent() {
    return new torrent_handle(libtorrent_jni.peer_connection_handle_associated_torrent(swigCPtr, this), true);
  }

  public tcp_endpoint remote() {
    return new tcp_endpoint(libtorrent_jni.peer_connection_handle_remote(swigCPtr, this), false);
  }

  public tcp_endpoint local_endpoint() {
    return new tcp_endpoint(libtorrent_jni.peer_connection_handle_local_endpoint(swigCPtr, this), true);
  }

  public void disconnect(error_code ec, operation_t op, int error) {
    libtorrent_jni.peer_connection_handle_disconnect__SWIG_0(swigCPtr, this, error_code.getCPtr(ec), ec, op.swigValue(), error);
  }

  public void disconnect(error_code ec, operation_t op) {
    libtorrent_jni.peer_connection_handle_disconnect__SWIG_1(swigCPtr, this, error_code.getCPtr(ec), ec, op.swigValue());
  }

  public boolean is_disconnecting() {
    return libtorrent_jni.peer_connection_handle_is_disconnecting(swigCPtr, this);
  }

  public boolean is_connecting() {
    return libtorrent_jni.peer_connection_handle_is_connecting(swigCPtr, this);
  }

  public boolean is_outgoing() {
    return libtorrent_jni.peer_connection_handle_is_outgoing(swigCPtr, this);
  }

  public boolean on_local_network() {
    return libtorrent_jni.peer_connection_handle_on_local_network(swigCPtr, this);
  }

  public boolean ignore_unchoke_slots() {
    return libtorrent_jni.peer_connection_handle_ignore_unchoke_slots(swigCPtr, this);
  }

  public boolean failed() {
    return libtorrent_jni.peer_connection_handle_failed(swigCPtr, this);
  }

  public boolean can_disconnect(error_code ec) {
    return libtorrent_jni.peer_connection_handle_can_disconnect(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public boolean has_metadata() {
    return libtorrent_jni.peer_connection_handle_has_metadata(swigCPtr, this);
  }

  public boolean in_handshake() {
    return libtorrent_jni.peer_connection_handle_in_handshake(swigCPtr, this);
  }

  public void send_buffer(String begin, int size, int flags) {
    libtorrent_jni.peer_connection_handle_send_buffer__SWIG_0(swigCPtr, this, begin, size, flags);
  }

  public void send_buffer(String begin, int size) {
    libtorrent_jni.peer_connection_handle_send_buffer__SWIG_1(swigCPtr, this, begin, size);
  }

  public long last_seen_complete() {
    return libtorrent_jni.peer_connection_handle_last_seen_complete(swigCPtr, this);
  }

  public boolean op_eq(peer_connection_handle o) {
    return libtorrent_jni.peer_connection_handle_op_eq(swigCPtr, this, peer_connection_handle.getCPtr(o), o);
  }

  public boolean op_ne(peer_connection_handle o) {
    return libtorrent_jni.peer_connection_handle_op_ne(swigCPtr, this, peer_connection_handle.getCPtr(o), o);
  }

  public boolean op_lt(peer_connection_handle o) {
    return libtorrent_jni.peer_connection_handle_op_lt(swigCPtr, this, peer_connection_handle.getCPtr(o), o);
  }

  public long get_time_of_last_unchoke() {
    return libtorrent_jni.peer_connection_handle_get_time_of_last_unchoke(swigCPtr, this);
  }

}
