// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Customer.proto

package com.movies.rental;

public interface MovieRentalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.movies.rental.MovieRentalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string movieId = 1;</code>
   * @return The movieId.
   */
  java.lang.String getMovieId();
  /**
   * <code>string movieId = 1;</code>
   * @return The bytes for movieId.
   */
  com.google.protobuf.ByteString
      getMovieIdBytes();

  /**
   * <code>uint32 daysOfRental = 2;</code>
   * @return The daysOfRental.
   */
  int getDaysOfRental();
}