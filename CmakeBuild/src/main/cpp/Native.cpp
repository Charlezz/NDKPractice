#include <android/log.h>
#include <jni.h>
extern "C" {
JNIEXPORT jstring JNICALL Java_com_maxst_www_ndkpractice_NativeManager_getSomething
        (JNIEnv *env, jobject) {
    return env->NewStringUTF("Hello World");
}

}

