# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in F:\sdk\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

-dontwarn com.squareup.okhttp.internal.**
-dontwarn com.squareup.picasso.OkHttpDownloader
-dontwarn com.aapbd.**
-dontwarn com.squareup.**
-dontwarn javax.servlet.**
-dontwarn org.joda.time.**
-dontwarn org.w3c.dom.**
-dontwarn org.xmlpull.v1.**
-dontwarn okhttp3.**
-keep class okhttp3.** { *; }
-dontwarn okio.**
-dontwarn javax.annotation.Nullable
-dontwarn javax.annotation.ParametersAreNonnullByDefault
-dontwarn com.google.android.gms.**
-dontwarn com.google.firebase.auth.**
-ignorewarnings
-keep class * {
    public private *;
}



# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
