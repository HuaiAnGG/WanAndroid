package org.huaiangg.wanandroid.frags.system;

import java.util.List;

/**
 * @author huaian
 */
public class SystemArticleBean {


    /**
     * data : [{"children":[{"children":[],"courseId":13,"id":60,"name":"Android Studio相关",
     * "order":1000,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],
     * "courseId":13,"id":169,"name":"gradle","order":1001,"parentChapterId":150,
     * "userControlSetTop":false,"visible":1},{"children":[],"courseId":13,
     * "id":495,"name":"booster","order":220009,"parentChapterId":460,"userControlSetTop":false,
     * "visible":1}],"courseId":13,"id":460,"name":"常见开源库源码解析","order":220,"parentChapterId":0,
     * "userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":463,
     * "name":"掘金翻译计划","order":225000,"parentChapterId":462,"userControlSetTop":false,"visible":1
     * }],"courseId":13,"id":462,"name":"翻译","order":225,"parentChapterId":0,
     * "userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":470,
     * "name":"协程","order":230000,"parentChapterId":469,"userControlSetTop":false,"visible":1}],
     * "courseId":13,"id":469,"name":"Kotlin","order":230,"parentChapterId":0,
     * "userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":494,
     * "name":"广场","order":235000,"parentChapterId":493,"userControlSetTop":false,"visible":1}],
     * "courseId":13,"id":493,"name":"广场Tab","order":235,"parentChapterId":0,
     * "userControlSetTop":false,"visible":1}]
     * errorCode : 0
     * errorMsg :
     */

    private int errorCode;
    private String errorMsg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * children : [{"children":[],"courseId":13,"id":60,"name":"Android Studio相关",
         * "order":1000,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children
         * ":[],"courseId":13,"id":169,"name":"gradle","order":1001,"parentChapterId":150,
         * "userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":269,
         * "name":"官方发布","order":1002,"parentChapterId":150,"userControlSetTop":false,"visible":1}]
         * courseId : 13
         * id : 150
         * name : 开发环境
         * order : 1
         * parentChapterId : 0
         * userControlSetTop : false
         * visible : 1
         */

        private int courseId;
        private int id;
        private String name;
        private int order;
        private int parentChapterId;
        private boolean userControlSetTop;
        private int visible;
        private List<ChildrenBean> children;

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getParentChapterId() {
            return parentChapterId;
        }

        public void setParentChapterId(int parentChapterId) {
            this.parentChapterId = parentChapterId;
        }

        public boolean isUserControlSetTop() {
            return userControlSetTop;
        }

        public void setUserControlSetTop(boolean userControlSetTop) {
            this.userControlSetTop = userControlSetTop;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        public static class ChildrenBean {
            /**
             * children : []
             * courseId : 13
             * id : 60
             * name : Android Studio相关
             * order : 1000
             * parentChapterId : 150
             * userControlSetTop : false
             * visible : 1
             */

            private int courseId;
            private int id;
            private String name;
            private int order;
            private int parentChapterId;
            private boolean userControlSetTop;
            private int visible;
            private List<?> children;

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getParentChapterId() {
                return parentChapterId;
            }

            public void setParentChapterId(int parentChapterId) {
                this.parentChapterId = parentChapterId;
            }

            public boolean isUserControlSetTop() {
                return userControlSetTop;
            }

            public void setUserControlSetTop(boolean userControlSetTop) {
                this.userControlSetTop = userControlSetTop;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public List<?> getChildren() {
                return children;
            }

            public void setChildren(List<?> children) {
                this.children = children;
            }
        }
    }
}
