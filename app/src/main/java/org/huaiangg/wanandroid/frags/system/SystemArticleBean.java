package org.huaiangg.wanandroid.frags.system;

import java.util.List;

public class SystemArticleBean {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"星星y","chapterId":486,
     * "chapterName":"LiveData","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9104,"link":"https://www.jianshu.com/p/34fb6ffaa684",
     * "niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1568043858000,"shareDate":null,"shareUser":"","superChapterId":423,
     * "superChapterName":"Jetpack","tags":[],"title":"LiveData+Retrofit网络请求实战","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"yukilzw","chapterId":402,
     * "chapterName":"跨平台应用","collect":false,"courseId":13,
     * "desc":"包含功能： - 开播列表上拉加载、下拉刷新 - 渐进式导航头部 - 封装HTTP、IO缓存操作 - 页面路由传值
     * - bloc全局状态管理 - 礼物横幅动画队列 - 弹幕消息滚动 - 静态视频流 - 九宫格抽奖游戏 - 照片选择
     * - 全屏、窗口webView - ...（持续增加中）",
     * "envelopePic":"https://www.wanandroid.com/blogimgs/ffb41ede-7f1d-4368-beb8-e9ccc0422902.png",
     * "fresh":false,"id":9101,"link":"http://www.wanandroid.com/blog/show/2670","niceDate":"2019-09-09",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"https://github.com/yukilzw/dy_flutter",
     * "publishTime":1568043629000,"shareDate":null,"shareUser":"","superChapterId":294,
     * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],
     * "title":"使用flutter重构斗鱼APP - dy_flutter","type":0,"userId":-1,"visible":1,"zan":0}],
     * "offset":20,"over":false,"pageCount":358,"size":20,"total":7143}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"星星y","chapterId":486,"chapterName":"LiveData","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9104,"link":"https://www.jianshu.com/p/34fb6ffaa684","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1568043858000,"shareDate":null,"shareUser":"","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"LiveData+Retrofit网络请求实战","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"yukilzw","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"包含功能： - 开播列表上拉加载、下拉刷新 - 渐进式导航头部 - 封装HTTP、IO缓存操作 - 页面路由传值 - bloc全局状态管理 - 礼物横幅动画队列 - 弹幕消息滚动 - 静态视频流 - 九宫格抽奖游戏 - 照片选择 - 全屏、窗口webView - ...（持续增加中）","envelopePic":"https://www.wanandroid.com/blogimgs/ffb41ede-7f1d-4368-beb8-e9ccc0422902.png","fresh":false,"id":9101,"link":"http://www.wanandroid.com/blog/show/2670","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"https://github.com/yukilzw/dy_flutter","publishTime":1568043629000,"shareDate":null,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"使用flutter重构斗鱼APP - dy_flutter","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 358
         * size : 20
         * total : 7143
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author : 星星y
             * chapterId : 486
             * chapterName : LiveData
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : false
             * id : 9104
             * link : https://www.jianshu.com/p/34fb6ffaa684
             * niceDate : 2019-09-09
             * niceShareDate : 未知时间
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1568043858000
             * shareDate : null
             * shareUser :
             * superChapterId : 423
             * superChapterName : Jetpack
             * tags : []
             * title : LiveData+Retrofit网络请求实战
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private Object shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public Object getShareDate() {
                return shareDate;
            }

            public void setShareDate(Object shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
