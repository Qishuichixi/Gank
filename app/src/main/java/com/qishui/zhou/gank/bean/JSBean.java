package com.qishui.zhou.gank.bean;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * 作者：Created by zhou on 2017/7/25 22:45
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class JSBean extends DataSupport{

    private int id;


    /**
     * error : false
     * results : [{"_id":"59759750421aa90c9203d3f5","createdAt":"2017-07-24T14:44:32.993Z","desc":"基于 Vue 2.x 和 GitHub Issue 实现的博客系统","images":["http://img.gank.io/94b512c9-becd-4dc4-899d-e7356aef13b4"],"publishedAt":"2017-07-25T15:25:42.391Z","source":"web","type":"前端","url":"https://github.com/bingoogolapple/BGAIssueBlog","used":true,"who":"王浩"},{"_id":"5975ad23421aa90ca209c4cd","createdAt":"2017-07-24T16:17:39.631Z","desc":"一个优雅的 Hyper Terminal 主题","images":["http://img.gank.io/a2c0e90c-e01c-4b1f-81c3-fc055b15de0a"],"publishedAt":"2017-07-25T15:25:42.391Z","source":"web","type":"前端","url":"https://github.com/wl9739/hyper-qing","used":true,"who":null},{"_id":"5975b228421aa90ca3bb6b63","createdAt":"2017-07-24T16:39:04.501Z","desc":"前端每周清单第 23 期：React 内部原理与实现，自定义基于 JavaScript 的 16 位虚拟机","publishedAt":"2017-07-25T15:25:42.391Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/28076241","used":true,"who":"王下邀月熊"},{"_id":"597419f8421aa97de5c7c994","createdAt":"2017-07-23T11:37:28.310Z","desc":"基于 Vue 2.x 实现的 back-top 组件，支持多种自定义属性配置，以及通过 slot 插桩的方式深度定制要显示的内容","images":["http://img.gank.io/71d065d5-5b88-43e5-aef1-3dc89f42af53"],"publishedAt":"2017-07-24T12:13:11.280Z","source":"web","type":"前端","url":"https://github.com/bingoogolapple/bga-back-top-vue","used":true,"who":"王浩"},{"_id":"5974502f421aa90c9203d3ec","createdAt":"2017-07-23T15:28:47.287Z","desc":"JavaScript 语法树与代码转化实践 ","publishedAt":"2017-07-24T12:13:11.280Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/28054817","used":true,"who":"王下邀月熊"},{"_id":"596ddaa2421aa90ca3bb6b29","createdAt":"2017-07-18T17:53:38.592Z","desc":"基于 Webpack 3 的 Vue.js 工程项目脚手架从属于笔者的 Web 前端入门与工程实践，是笔者基于兄弟项目 React 脚手架改造而来，二者在 Webpack 配置层面差异不大。更多关于 Vue.js 或者前端开发相关的资料链接可以参考Vue.js 学习与实践资料索引，Vue.js 与前端工程化实践系列文章以及 Webpack 学习与资料索引，对于其中浅薄的工程化的思考可以参考 2016-我的前端之路:工具化与工程化。","publishedAt":"2017-07-21T12:39:43.370Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/27960679","used":true,"who":"王下邀月熊"},{"_id":"596f931e421aa90ca209c496","createdAt":"2017-07-20T01:13:02.708Z","desc":"如何优雅地写js异步循环","images":["http://img.gank.io/dc57e549-894d-4203-9fab-69adf38d6de6"],"publishedAt":"2017-07-20T15:11:16.10Z","source":"chrome","type":"前端","url":"https://iammapping.com/write-js-async-loop-gracefully/","used":true,"who":"IamMapping"},{"_id":"5951d306421aa90ca3bb6a70","createdAt":"2017-06-27T11:37:42.991Z","desc":"前端每周清单第 19 期： Vue的优势与劣势；Node.js有望超越Java；JS在嵌入式及物联网的应用现状","publishedAt":"2017-07-19T13:23:20.375Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/27577316","used":true,"who":"王下邀月熊"},{"_id":"596e2079421aa97de5c7c966","createdAt":"2017-07-18T22:51:37.21Z","desc":"使用Karma测试AngularJS(Karma -> Karma + AngularJS -> Karma + RequireJS -> Karma + AngularJS + RequireJS, 含源码)","images":["http://img.gank.io/899f0377-d74c-4f5b-9dbc-ec19d1c369f3"],"publishedAt":"2017-07-19T13:23:20.375Z","source":"web","type":"前端","url":"http://miaoyunze.com/2017/07/17/karma-test/","used":true,"who":"Miao"},{"_id":"5965dca8421aa90c9203d37b","createdAt":"2017-07-12T16:24:08.704Z","desc":"ECMAScript 2017 或 ES8 与 2017 年六月底由 TC39 正式发布，可以在这里浏览完整的版本；而 ES8 中代表性的特征包括了字符串填充、对象值遍历、对象的属性描述符获取、 函数参数列表与调用中的尾部逗号、异步函数、共享内存与原子操作等。","publishedAt":"2017-07-14T13:24:31.177Z","source":"chrome","type":"前端","url":"https://zhuanlan.zhihu.com/p/27844393","used":true,"who":"王下邀月熊"}]
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
         * _id : 59759750421aa90c9203d3f5
         * createdAt : 2017-07-24T14:44:32.993Z
         * desc : 基于 Vue 2.x 和 GitHub Issue 实现的博客系统
         * images : ["http://img.gank.io/94b512c9-becd-4dc4-899d-e7356aef13b4"]
         * publishedAt : 2017-07-25T15:25:42.391Z
         * source : web
         * type : 前端
         * url : https://github.com/bingoogolapple/BGAIssueBlog
         * used : true
         * who : 王浩
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
