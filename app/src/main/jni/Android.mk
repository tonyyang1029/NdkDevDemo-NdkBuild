LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := NdkLib
LOCAL_SRC_FILES =: ndklib.c
include $(BUILD_SHARED_LIBRARY)