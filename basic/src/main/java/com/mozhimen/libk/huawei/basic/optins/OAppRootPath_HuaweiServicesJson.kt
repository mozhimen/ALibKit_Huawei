package com.mozhimen.libk.huawei.basic.optins

/**
 * @ClassName OAppRootPath_GoogleServicesJson
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/6/12
 * @Version 1.0
 */
@RequiresOptIn("""
huawei通道需要agconnect-services.json文件，配置在应用的 module 目录下，请在huawei通道控制台获取
https://developer.huawei.com/consumer/cn/console#/serviceCards/
""", RequiresOptIn.Level.WARNING)
annotation class OAppRootPath_HuaweiServicesJson