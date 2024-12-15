package com.mozhimen.libk.huawei.basic.optins

/**
 * @ClassName OPlugin_ClassPath_GmsGoogleServices
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/6/12
 * @Version 1.0
 */
/**
 * * What went wrong:
 * An exception occurred applying plugin request [id: 'com.huawei.agconnect']
 * > Failed to apply plugin 'com.huawei.agconnect'.
 *    > API 'android.registerTransform' is removed.
 *
 * Finally I found the solution here..
 * Just add this property to gradle.properties
 * apmsInstrumentationEnabled=false
 */
@RequiresOptIn("""
为了确保 Huawei SDK 可以访问 agconnect-services.json 配置文件中的值，您需要具有 Huawei 服务 Gradle 插件 (agconnect-services)。
在您的根级（项目级）Gradle 文件（<project>/build.gradle.kts 或 <project>/build.gradle）中，将 Huawei 服务插件添加为依赖项：

```Groovy
plugins {
  id 'com.android.application' version '8.2.2' apply false
  // ...

  // huawei push need
  classpath 'com.huawei.agconnect:agcp:1.6.0.300'
}
```

在您的模块（应用级）Gradle 文件（通常是 <project>/<app-module>/build.gradle.kts 或 <project>/<app-module>/build.gradle）中，添加 Huawei 服务插件：

```Groovy
plugins {
  id 'com.android.application'
  // ...
  
  // huawei push need，不需要 huawei 通道，则删除
  //id 'com.huawei.agconnect'
}
```
""")
annotation class OPlugin_ClassPath_HmsHuaweiServices
