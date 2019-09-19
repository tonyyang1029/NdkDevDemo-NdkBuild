//
// Created by TonyYang on 2019-09-19.
//

#include <stdio.h>
#include <string.h>

#include "com_ty_android_ndkdevdemo_NdkLib.h"

JNIEXPORT jstring JNICALL
Java_com_ty_android_ndkdevdemo_NdkLib_getData(JNIEnv *env, jobject thiz) {
    jclass clazz;
    jfieldID id;

    int number = 0;
    char data[50] = {0};

    clazz = (*env)->GetObjectClass(env, thiz);
    id = (*env)->GetFieldID(env, clazz, "number", "I");
    number = (*env)->GetIntField(env, thiz, id);

    sprintf(data, "No.%d ", number);
    strcpy((data + strlen(data)), "data from native library.");

    return (*env)->NewStringUTF(env, data);
}

JNIEXPORT void JNICALL
Java_com_ty_android_ndkdevdemo_NdkLib_updateData(JNIEnv *env, jobject thiz) {
    jclass clazz;
    jfieldID id;
    int number;

    clazz = (*env)->GetObjectClass(env, thiz);
    id = (*env)->GetFieldID(env, clazz, "number", "I");
    number = (*env)->GetIntField(env, thiz, id);
    number++;
    (*env)->SetIntField(env, thiz, id, number);
}

