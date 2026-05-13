package com.netflix.contentservice.model;

/*

tracks the video processing lifecycle

flow
pending - uploaded -> encoding -> ready -> failed
 */

public enum VideoStatus {
    PENDING, // movies added but not uploaded yet
    UPLOADED, // raw video uploaded to s3
    ENCODING, // FFmpeg is encoding the video
    ENCODED, // ffmpeg has encoded the video
    READY, // HLS plalylist ready and can be streamed
    FAILED // encoding is failed
}
