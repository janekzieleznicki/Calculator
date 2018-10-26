#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_learning_calc_calculator_CalcActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_learning_calc_calculator_CalcActivity_otherStringFromJNI(
        JNIEnv *env,
        jobject){
    std::string hello = "I made it myself";
    return env->NewStringUTF(hello.c_str());
}