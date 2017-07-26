package com.qishui.zhou.gank.bean;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * 作者：Created by zhou on 2017/7/25 23:14
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class DayBean extends DataSupport {
    private int id;

    /**
     * category : ["Android","前端","休息视频","瞎推荐","iOS","福利"]
     * error : false
     * results : {"Android":[{"_id":"5964c8ff421aa90ca3bb6ae1","createdAt":"2017-07-11T20:47:59.353Z","desc":"理解与设计自适应图标 \u2014\u2014 自适应图标入门指南","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"Android","url":"https://zhuanlan.zhihu.com/p/27814686","used":true,"who":"galois"},{"_id":"5969a267421aa90ca209c46a","createdAt":"2017-07-15T13:04:39.224Z","desc":"Android源码完全解析\u2014\u2014View的Measure过程","publishedAt":"2017-07-21T12:39:43.370Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/4a68f9dc8f7c","used":true,"who":null},{"_id":"5971719e421aa97de5c7c97d","createdAt":"2017-07-21T11:14:38.609Z","desc":"一款非常漂亮的 Material Design 风格的音乐播放器！超棒！","images":["http://img.gank.io/9f05efe7-3196-4de4-af65-24e0a919a584"],"publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"Android","url":"https://github.com/aliumujib/Orin","used":true,"who":"代码家"}],"iOS":[{"_id":"59717207421aa90ca3bb6b4a","createdAt":"2017-07-21T11:16:23.422Z","desc":"iOS 功能健全的侧栏 Panel 效果。","images":["http://img.gank.io/ff07f1a6-8270-4c4e-997f-1eb75beb7b74"],"publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"iOS","url":"https://github.com/fahidattique55/FAPanels","used":true,"who":"代码家"}],"休息视频":[{"_id":"596f5dde421aa90c9203d3c4","createdAt":"2017-07-19T21:25:50.652Z","desc":"【谷阿莫】5分鐘看完2017當主角就是爽的電影《新木乃伊》","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"休息视频","url":"http://www.bilibili.com/video/av12361744/","used":true,"who":"LHF"}],"前端":[{"_id":"596ddaa2421aa90ca3bb6b29","createdAt":"2017-07-18T17:53:38.592Z","desc":"基于 Webpack 3 的 Vue.js 工程项目脚手架从属于笔者的 Web 前端入门与工程实践，是笔者基于兄弟项目 React 脚手架改造而来，二者在 Webpack 配置层面差异不大。更多关于 Vue.js 或者前端开发相关的资料链接可以参考Vue.js 学习与实践资料索引，Vue.js 与前端工程化实践系列文章以及 Webpack 学习与资料索引，对于其中浅薄的工程化的思考可以参考 2016-我的前端之路:工具化与工程化。","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/27960679","used":true,"who":"王下邀月熊"}],"瞎推荐":[{"_id":"59716014421aa90ca209c4a9","createdAt":"2017-07-21T09:59:48.926Z","desc":"AI中英文词汇对照","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"瞎推荐","url":"https://github.com/jiqizhixin/AI-Terminology-page","used":true,"who":"LHF"}],"福利":[{"_id":"5971760e421aa90ca209c4af","createdAt":"2017-07-21T11:33:34.104Z","desc":"7-21","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034ly1fhrcmgo6p0j20u00u00uu.jpg","used":true,"who":"daimajia"}]}
     */

    private boolean error;
    private ResultsBean results;
    private List<String> category;

    @Override
    public String toString() {
        return "DayBean{" +
                "id=" + id +
                ", error=" + error +
                ", results=" + results +
                ", category=" + category +
                '}';
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public boolean getError() {
        return error;
    }

    public ResultsBean getResults() {
        return results;
    }

    public List<String> getCategory() {
        return category;
    }

    public static class ResultsBean {
        @Override
        public String toString() {
            return "ResultsBean{" +
                    "Android=" + Android +
                    ", iOS=" + iOS +
                    ", 休息视频=" + 休息视频 +
                    ", 前端=" + 前端 +
                    ", 瞎推荐=" + 瞎推荐 +
                    ", 福利=" + 福利 +
                    '}';
        }

        /**
         * Android : [{"_id":"5964c8ff421aa90ca3bb6ae1","createdAt":"2017-07-11T20:47:59.353Z","desc":"理解与设计自适应图标 \u2014\u2014 自适应图标入门指南","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"Android","url":"https://zhuanlan.zhihu.com/p/27814686","used":true,"who":"galois"},{"_id":"5969a267421aa90ca209c46a","createdAt":"2017-07-15T13:04:39.224Z","desc":"Android源码完全解析\u2014\u2014View的Measure过程","publishedAt":"2017-07-21T12:39:43.370Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/4a68f9dc8f7c","used":true,"who":null},{"_id":"5971719e421aa97de5c7c97d","createdAt":"2017-07-21T11:14:38.609Z","desc":"一款非常漂亮的 Material Design 风格的音乐播放器！超棒！","images":["http://img.gank.io/9f05efe7-3196-4de4-af65-24e0a919a584"],"publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"Android","url":"https://github.com/aliumujib/Orin","used":true,"who":"代码家"}]
         * iOS : [{"_id":"59717207421aa90ca3bb6b4a","createdAt":"2017-07-21T11:16:23.422Z","desc":"iOS 功能健全的侧栏 Panel 效果。","images":["http://img.gank.io/ff07f1a6-8270-4c4e-997f-1eb75beb7b74"],"publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"iOS","url":"https://github.com/fahidattique55/FAPanels","used":true,"who":"代码家"}]
         * 休息视频 : [{"_id":"596f5dde421aa90c9203d3c4","createdAt":"2017-07-19T21:25:50.652Z","desc":"【谷阿莫】5分鐘看完2017當主角就是爽的電影《新木乃伊》","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"休息视频","url":"http://www.bilibili.com/video/av12361744/","used":true,"who":"LHF"}]
         * 前端 : [{"_id":"596ddaa2421aa90ca3bb6b29","createdAt":"2017-07-18T17:53:38.592Z","desc":"基于 Webpack 3 的 Vue.js 工程项目脚手架从属于笔者的 Web 前端入门与工程实践，是笔者基于兄弟项目 React 脚手架改造而来，二者在 Webpack 配置层面差异不大。更多关于 Vue.js 或者前端开发相关的资料链接可以参考Vue.js 学习与实践资料索引，Vue.js 与前端工程化实践系列文章以及 Webpack 学习与资料索引，对于其中浅薄的工程化的思考可以参考 2016-我的前端之路:工具化与工程化。","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/27960679","used":true,"who":"王下邀月熊"}]
         * 瞎推荐 : [{"_id":"59716014421aa90ca209c4a9","createdAt":"2017-07-21T09:59:48.926Z","desc":"AI中英文词汇对照","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"瞎推荐","url":"https://github.com/jiqizhixin/AI-Terminology-page","used":true,"who":"LHF"}]
         * 福利 : [{"_id":"5971760e421aa90ca209c4af","createdAt":"2017-07-21T11:33:34.104Z","desc":"7-21","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034ly1fhrcmgo6p0j20u00u00uu.jpg","used":true,"who":"daimajia"}]
         */


        private List<AndroidBean> Android;
        private List<IOSBean> iOS;
        private List<休息视频Bean> 休息视频;
        private List<前端Bean> 前端;
        private List<瞎推荐Bean> 瞎推荐;
        private List<福利Bean> 福利;

        public void setAndroid(List<AndroidBean> Android) {
            this.Android = Android;
        }

        public void setIOS(List<IOSBean> iOS) {
            this.iOS = iOS;
        }

        public void set休息视频(List<休息视频Bean> 休息视频) {
            this.休息视频 = 休息视频;
        }

        public void set前端(List<前端Bean> 前端) {
            this.前端 = 前端;
        }

        public void set瞎推荐(List<瞎推荐Bean> 瞎推荐) {
            this.瞎推荐 = 瞎推荐;
        }

        public void set福利(List<福利Bean> 福利) {
            this.福利 = 福利;
        }

        public List<AndroidBean> getAndroid() {
            return Android;
        }

        public List<IOSBean> getIOS() {
            return iOS;
        }

        public List<休息视频Bean> get休息视频() {
            return 休息视频;
        }

        public List<前端Bean> get前端() {
            return 前端;
        }

        public List<瞎推荐Bean> get瞎推荐() {
            return 瞎推荐;
        }

        public List<福利Bean> get福利() {
            return 福利;
        }

        public static class AndroidBean {
            /**
             * _id : 5964c8ff421aa90ca3bb6ae1
             * createdAt : 2017-07-11T20:47:59.353Z
             * desc : 理解与设计自适应图标 —— 自适应图标入门指南
             * publishedAt : 2017-07-21T12:39:43.370Z
             * source : chrome
             * type : Android
             * url : https://zhuanlan.zhihu.com/p/27814686
             * used : true
             * who : galois
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

            @Override
            public String toString() {
                return "AndroidBean{" +
                        "_id='" + _id + '\'' +
                        ", createdAt='" + createdAt + '\'' +
                        ", desc='" + desc + '\'' +
                        ", publishedAt='" + publishedAt + '\'' +
                        ", source='" + source + '\'' +
                        ", type='" + type + '\'' +
                        ", url='" + url + '\'' +
                        ", used=" + used +
                        ", who='" + who + '\'' +
                        '}';
            }

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
        }

        public static class IOSBean {
            @Override
            public String toString() {
                return "IOSBean{" +
                        "_id='" + _id + '\'' +
                        ", createdAt='" + createdAt + '\'' +
                        ", desc='" + desc + '\'' +
                        ", publishedAt='" + publishedAt + '\'' +
                        ", source='" + source + '\'' +
                        ", type='" + type + '\'' +
                        ", url='" + url + '\'' +
                        ", used=" + used +
                        ", who='" + who + '\'' +
                        ", images=" + images +
                        '}';
            }

            /**
             * _id : 59717207421aa90ca3bb6b4a
             * createdAt : 2017-07-21T11:16:23.422Z
             * desc : iOS 功能健全的侧栏 Panel 效果。
             * images : ["http://img.gank.io/ff07f1a6-8270-4c4e-997f-1eb75beb7b74"]
             * publishedAt : 2017-07-21T12:39:43.370Z
             * source : chrome
             * type : iOS
             * url : https://github.com/fahidattique55/FAPanels
             * used : true
             * who : 代码家
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

        public static class 休息视频Bean {
            /**
             * _id : 596f5dde421aa90c9203d3c4
             * createdAt : 2017-07-19T21:25:50.652Z
             * desc : 【谷阿莫】5分鐘看完2017當主角就是爽的電影《新木乃伊》
             * publishedAt : 2017-07-21T12:39:43.370Z
             * source : chrome
             * type : 休息视频
             * url : http://www.bilibili.com/video/av12361744/
             * used : true
             * who : LHF
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
        }

        public static class 前端Bean {
            @Override
            public String toString() {
                return "前端Bean{" +
                        "_id='" + _id + '\'' +
                        ", createdAt='" + createdAt + '\'' +
                        ", desc='" + desc + '\'' +
                        ", publishedAt='" + publishedAt + '\'' +
                        ", source='" + source + '\'' +
                        ", type='" + type + '\'' +
                        ", url='" + url + '\'' +
                        ", used=" + used +
                        ", who='" + who + '\'' +
                        '}';
            }

            /**
             * _id : 596ddaa2421aa90ca3bb6b29
             * createdAt : 2017-07-18T17:53:38.592Z
             * desc : 基于 Webpack 3 的 Vue.js 工程项目脚手架从属于笔者的 Web 前端入门与工程实践，是笔者基于兄弟项目 React 脚手架改造而来，二者在 Webpack 配置层面差异不大。更多关于 Vue.js 或者前端开发相关的资料链接可以参考Vue.js 学习与实践资料索引，Vue.js 与前端工程化实践系列文章以及 Webpack 学习与资料索引，对于其中浅薄的工程化的思考可以参考 2016-我的前端之路:工具化与工程化。
             * publishedAt : 2017-07-21T12:39:43.370Z
             * source : chrome
             * type : 前端
             * url : https://zhuanlan.zhihu.com/p/27960679
             * used : true
             * who : 王下邀月熊
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
        }

        public static class 瞎推荐Bean {
            /**
             * _id : 59716014421aa90ca209c4a9
             * createdAt : 2017-07-21T09:59:48.926Z
             * desc : AI中英文词汇对照
             * publishedAt : 2017-07-21T12:39:43.370Z
             * source : chrome
             * type : 瞎推荐
             * url : https://github.com/jiqizhixin/AI-Terminology-page
             * used : true
             * who : LHF
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
        }

        public static class 福利Bean {
            @Override
            public String toString() {
                return "福利Bean{" +
                        "_id='" + _id + '\'' +
                        ", createdAt='" + createdAt + '\'' +
                        ", desc='" + desc + '\'' +
                        ", publishedAt='" + publishedAt + '\'' +
                        ", source='" + source + '\'' +
                        ", type='" + type + '\'' +
                        ", url='" + url + '\'' +
                        ", used=" + used +
                        ", who='" + who + '\'' +
                        '}';
            }

            /**
             * _id : 5971760e421aa90ca209c4af
             * createdAt : 2017-07-21T11:33:34.104Z
             * desc : 7-21
             * publishedAt : 2017-07-21T12:39:43.370Z
             * source : chrome
             * type : 福利
             * url : http://ww1.sinaimg.cn/large/610dc034ly1fhrcmgo6p0j20u00u00uu.jpg
             * used : true
             * who : daimajia
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
        }
    }
}
