package com.qishui.zhou.gank.bean;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * 作者：Created by zhou on 2017/7/25 22:45
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class IOSBean extends DataSupport {

    private int id;

    /**
     * error : false
     * results : [{"_id":"5964651c421aa90c9203d369","createdAt":"2017-07-11T13:41:48.543Z","desc":"轻量级 iOS 主题切换功能。","images":["http://img.gank.io/e9fca020-6fae-4fae-8eea-1f183ecdc955"],"publishedAt":"2017-07-11T13:46:33.911Z","source":"chrome","type":"iOS","url":"https://github.com/regexident/Gestalt","used":true,"who":"S"},{"_id":"596305ce421aa90ca3bb6ad5","createdAt":"2017-07-10T12:42:54.269Z","desc":"iOS 11 新特性 Demo 集合。","images":["http://img.gank.io/551e5a51-eeab-4678-a025-ff2b1fcf4b9f"],"publishedAt":"2017-07-10T12:48:49.297Z","source":"chrome","type":"iOS","url":"https://github.com/artemnovichkov/iOS-11-by-Examples","used":true,"who":"S"},{"_id":"595efb1a421aa90c9203d340","createdAt":"2017-07-07T11:08:10.658Z","desc":"macOS 下的数字货币查看工具。","images":["http://img.gank.io/d8de97f9-68c7-4082-af57-e95fbd88a815"],"publishedAt":"2017-07-07T12:14:57.685Z","source":"chrome","type":"iOS","url":"https://github.com/DingdingKim/CoinNow","used":true,"who":"代码家"},{"_id":"595efb65421aa90ca209c40a","createdAt":"2017-07-07T11:09:25.758Z","desc":"Simple AR game made with ARKit and SpriteKit. ","images":["http://img.gank.io/17edc452-1dac-4c73-b53c-30b8ff6ee5c1"],"publishedAt":"2017-07-07T12:14:57.685Z","source":"chrome","type":"iOS","url":"https://github.com/eh3rrera/ARKitGameSpriteKit","used":true,"who":"S"},{"_id":"594fa143421aa90c9203d2e7","createdAt":"2017-06-25T19:40:51.444Z","desc":"iOS逆向工程之插件开发","images":["http://img.gank.io/62e5f7a5-1f98-44d6-8150-f011ce9ff0f9"],"publishedAt":"2017-07-06T11:57:03.770Z","source":"chrome","type":"iOS","url":"http://www.imlifengfeng.com/blog/?p=677","used":true,"who":"feng"},{"_id":"595d0f3f421aa90cb4724b71","createdAt":"2017-07-06T00:09:35.131Z","desc":"iOS逆向工程之fishhook","images":["http://img.gank.io/82fa177f-1d81-4b35-b1a9-975d5b87862a"],"publishedAt":"2017-07-06T11:57:03.770Z","source":"chrome","type":"iOS","url":"http://www.imlifengfeng.com/blog/?p=692","used":true,"who":"f"},{"_id":"595da4b7421aa90cb4724b74","createdAt":"2017-07-06T10:47:19.408Z","desc":"iOS 11 人脸识别 Demo。","images":["http://img.gank.io/dd32d1cb-e49c-4904-aa60-f525ab748041"],"publishedAt":"2017-07-06T11:57:03.770Z","source":"chrome","type":"iOS","url":"https://github.com/cocoa-ai/FacesVisionDemo","used":true,"who":"代码家"},{"_id":"595da4df421aa90ca3bb6aad","createdAt":"2017-07-06T10:47:59.320Z","desc":"macOS 和 iOS 的图标生成器。","images":["http://img.gank.io/f389534d-1ab7-498e-bacb-ea01cca107dd"],"publishedAt":"2017-07-06T11:57:03.770Z","source":"chrome","type":"iOS","url":"https://github.com/kuyawa/AppIcons","used":true,"who":"S"},{"_id":"59488174421aa90f1036ac4e","createdAt":"2017-06-20T09:59:16.804Z","desc":"Core ML and Vision Framework on iOS 11","images":["http://img.gank.io/dfd161ed-e02d-47ff-a69b-47c383690e97"],"publishedAt":"2017-07-05T11:15:30.556Z","source":"web","type":"iOS","url":"http://yulingtianxia.com/blog/2017/06/19/Core-ML-and-Vision-Framework-on-iOS-11/","used":true,"who":"杨萧玉"},{"_id":"594c871a421aa90c9203d2db","createdAt":"2017-06-23T11:12:26.868Z","desc":"调试神器 - 快速访问调试中 iOS 应用内文件系统 Documents, Media 等目录及文件","images":["http://img.gank.io/548b5440-53b3-42e5-b28c-2e8c7dd91cce"],"publishedAt":"2017-07-05T11:15:30.556Z","source":"chrome","type":"iOS","url":"https://github.com/luckytianyiyan/TySimulator","used":true,"who":"Dear宅学长"},{"_id":"595c302f421aa90c9203d329","createdAt":"2017-07-05T08:17:51.643Z","desc":"基于 iOS AR 实现的俄罗斯方块，越来越多的 AR 项目冒出来了。","images":["http://img.gank.io/e9a559da-cb7d-41f3-ba8b-e472d2749c25"],"publishedAt":"2017-07-05T11:15:30.556Z","source":"chrome","type":"iOS","url":"https://github.com/exyte/ARTetris","used":true,"who":"代码家"},{"_id":"595ad2ce421aa90ca3bb6a93","createdAt":"2017-07-04T07:27:10.110Z","desc":"这个气泡效果，好漂亮。","images":["http://img.gank.io/02b89acd-330e-4600-b3bd-72c1a9389c56"],"publishedAt":"2017-07-04T11:50:36.484Z","source":"chrome","type":"iOS","url":"https://github.com/goldmoment/Bubble","used":true,"who":"S"},{"_id":"595ad81b421aa90cb4724b5d","createdAt":"2017-07-04T07:49:47.186Z","desc":"轻量级顶部 Slider。","images":["http://img.gank.io/0164b306-703c-47fa-a350-a8077a7d001c"],"publishedAt":"2017-07-04T11:50:36.484Z","source":"chrome","type":"iOS","url":"https://github.com/MagicLab-team/BannerView","used":true,"who":"S"},{"_id":"595ad8d6421aa90ca3bb6a94","createdAt":"2017-07-04T07:52:54.915Z","desc":"一个仿的很完整的 ofo....","images":["http://img.gank.io/4fe1f8b8-64a8-4ac2-8597-17e2c4db4b5b"],"publishedAt":"2017-07-04T11:50:36.484Z","source":"chrome","type":"iOS","url":"https://github.com/XiongJoJo/OFO","used":true,"who":"S"},{"_id":"593f20e5421aa92c73b64806","createdAt":"2017-06-13T07:16:53.166Z","desc":"在 iOS 上运行 keras 深度学习组件。","publishedAt":"2017-06-15T13:55:57.947Z","source":"chrome","type":"iOS","url":"https://github.com/atveit/keras2ios","used":true,"who":"S"},{"_id":"5942001e421aa92c7be61c17","createdAt":"2017-06-15T11:33:50.991Z","desc":"low poly 图像效果 c 版本的实现，http://www.jianshu.com/p/2438c99e519e 这是实现思路说明的文章","images":["http://img.gank.io/4f0e7653-ecf0-4d21-be4a-468686fe7556"],"publishedAt":"2017-06-15T13:55:57.947Z","source":"web","type":"iOS","url":"https://github.com/DevinShine/Porygon","used":true,"who":"DevinShine"},{"_id":"59422071421aa92c73b6481d","createdAt":"2017-06-15T13:51:45.955Z","desc":"一个不错的 iOS 上做视觉的教程实现。","images":["http://img.gank.io/834bbb00-f6aa-476c-bc6d-6f5b82e403e1","http://img.gank.io/f8864a4c-b7de-4f06-9169-ab0129423222"],"publishedAt":"2017-06-15T13:55:57.947Z","source":"chrome","type":"iOS","url":"https://github.com/jeffreybergier/Blog-Getting-Started-with-Vision","used":true,"who":"S"},{"_id":"593f20c0421aa92c794633b8","createdAt":"2017-06-13T07:16:16.920Z","desc":"还记得硅谷里的热狗检测 App 么？哈哈，有人实现了一份。","images":["http://img.gank.io/cbbd4c80-90d6-42ec-a0b4-9ac5770fc4a2"],"publishedAt":"2017-06-14T11:34:54.556Z","source":"chrome","type":"iOS","url":"https://github.com/alicanbatur/HotDogDetector","used":true,"who":"S"},{"_id":"593f211a421aa92c7be61c02","createdAt":"2017-06-13T07:17:46.877Z","desc":"基于 Swift 实现的炫酷的主题切换效果。","images":["http://img.gank.io/8381741e-c95b-441a-87ca-bdded463fb7b"],"publishedAt":"2017-06-14T11:34:54.556Z","source":"chrome","type":"iOS","url":"https://github.com/Boerworz/Gagat","used":true,"who":"S"},{"_id":"593f223c421aa92c7be61c03","createdAt":"2017-06-13T07:22:36.542Z","desc":"可能是仿真 iOS 原生 App 中最像的。","images":["http://img.gank.io/e3bb09fa-4c35-4cf7-950e-66654d9a2769"],"publishedAt":"2017-06-14T11:34:54.556Z","source":"chrome","type":"iOS","url":"https://github.com/SwiftTsubame/iOS11Weather","used":true,"who":"代码家"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public boolean getError() {
        return error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public static class ResultsBean {
        /**
         * _id : 5964651c421aa90c9203d369
         * createdAt : 2017-07-11T13:41:48.543Z
         * desc : 轻量级 iOS 主题切换功能。
         * images : ["http://img.gank.io/e9fca020-6fae-4fae-8eea-1f183ecdc955"]
         * publishedAt : 2017-07-11T13:46:33.911Z
         * source : chrome
         * type : iOS
         * url : https://github.com/regexident/Gestalt
         * used : true
         * who : S
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getSource() {
            return source;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean getUsed() {
            return used;
        }

        public String getWho() {
            return who;
        }

        public List<String> getImages() {
            return images;
        }
    }
}
