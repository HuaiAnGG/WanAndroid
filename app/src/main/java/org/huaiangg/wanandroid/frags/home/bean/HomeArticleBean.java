package org.huaiangg.wanandroid.frags.home.bean;

import java.util.List;

/**
 * @description: 文章实体
 * @author: HuaiAngg
 * @create: 2019-07-28 16:30
 */
public class HomeArticleBean {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>最常见的就是 Application 需要设置 NEW_TASK了，为什么需要呢？<\/p><br><p>其他的 Context 呢？<\/p><br><p>能够提取出什么共性吗？<\/p><br><p>本周2/3<\/p>","envelopePic":"","fresh":false,"id":8697,"link":"https://www.wanandroid.com/wenda/show/8697","niceDate":"2019-07-18","origin":"","prefix":"","projectLink":"","publishTime":1563463495000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 哪些 Context调用 startActivity 需要设置NEW_TASK，为什么？","type":0,"userId":2,"visible":1,"zan":15}],"offset":20,"over":false,"pageCount":342,"size":20,"total":6824}
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

    @Override
    public String toString() {
        return "HomeArticleBean{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,
         * "courseId":13,"desc":"<p>最常见的就是 Application 需要设置 NEW_TASK了，为什么需要呢？<\/p><br><p>其他的
         * Context 呢？<\/p><br><p>能够提取出什么共性吗？<\/p><br><p>本周2/3<\/p>","envelopePic":"","fresh":false,
         * "id":8697,"link":"https://www.wanandroid.com/wenda/show/8697","niceDate":"2019-07-18","origin":"",
         * "prefix":"","projectLink":"","publishTime":1563463495000,"superChapterId":440,"superChapterName":"问答",
         * "tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 哪些 Context调用 startActivity
         * 需要设置NEW_TASK，为什么？","type":0,"userId":2,"visible":1,"zan":15}]
         * offset : 20
         * over : false
         * pageCount : 342
         * size : 20
         * total : 6824
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<dataList> datas;

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

        public List<dataList> getDatas() {
            return datas;
        }

        public void setDatas(List<dataList> datas) {
            this.datas = datas;
        }

        @Override
        public String toString() {
            return "ParentBean{" +
                    "curPage=" + curPage +
                    ", offset=" + offset +
                    ", over=" + over +
                    ", pageCount=" + pageCount +
                    ", size=" + size +
                    ", total=" + total +
                    ", datas=" + datas +
                    '}';
        }

        public static class dataList {
            /**
             * apkLink :
             * author : xiaoyang
             * chapterId : 440
             * chapterName : 官方
             * collect : false
             * courseId : 13
             * desc : <p>最常见的就是 Application 需要设置 NEW_TASK了，为什么需要呢？</p><br><p>其他的 Context 呢？</p><br><p>能够提取出什么共性吗？</p><br><p>本周2/3</p>
             * envelopePic :
             * fresh : false
             * id : 8697
             * link : https://www.wanandroid.com/wenda/show/8697
             * niceDate : 2019-07-18
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1563463495000
             * superChapterId : 440
             * superChapterName : 问答
             * tags : [{"name":"问答","url":"/article/list/0?cid=440"}]
             * title : 每日一问 哪些 Context调用 startActivity 需要设置NEW_TASK，为什么？
             * type : 0
             * userId : 2
             * visible : 1
             * zan : 15
             */

            private String apkLink;
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
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;

            @Override
            public String toString() {
                return "dataList{" +
                        "apkLink='" + apkLink + '\'' +
                        ", author='" + author + '\'' +
                        ", chapterId=" + chapterId +
                        ", chapterName='" + chapterName + '\'' +
                        ", collect=" + collect +
                        ", courseId=" + courseId +
                        ", desc='" + desc + '\'' +
                        ", envelopePic='" + envelopePic + '\'' +
                        ", fresh=" + fresh +
                        ", id=" + id +
                        ", link='" + link + '\'' +
                        ", niceDate='" + niceDate + '\'' +
                        ", origin='" + origin + '\'' +
                        ", prefix='" + prefix + '\'' +
                        ", projectLink='" + projectLink + '\'' +
                        ", publishTime=" + publishTime +
                        ", superChapterId=" + superChapterId +
                        ", superChapterName='" + superChapterName + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        ", userId=" + userId +
                        ", visible=" + visible +
                        ", zan=" + zan +
                        ", tags=" + tags +
                        '}';
            }

            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
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

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 问答
                 * url : /article/list/0?cid=440
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
