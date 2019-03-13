package effectivejava;

import java.util.List;


/**
 * GsonFormat插件生成的javaBean
 * <br>
 *     {
 *     "total": 9,
 *     "rows": [{
 *         "roleId": 1,
 *         "roleName": "管理员",
 *         "remark": "管理员",
 *         "createTime": 1514362991000,
 *         "modifyTime": 1519459305000
 *     }, {
 *         "roleId": 2,
 *         "roleName": "测试账号",
 *         "remark": "测试账号",
 *         "createTime": 1514363109000,
 *         "modifyTime": 1516669871000
 *     }, {
 *         "roleId": 3,
 *         "roleName": "注册账户",
 *         "remark": "注册账户，只可查看，不可操作",
 *         "createTime": 1514534415000,
 *         "modifyTime": 1519464825000
 *     }, {
 *         "roleId": 23,
 *         "roleName": "用户管理员",
 *         "remark": "负责用户的增删改操作",
 *         "createTime": 1515483161000,
 *         "modifyTime": null
 *     }, {
 *         "roleId": 24,
 *         "roleName": "系统监控员",
 *         "remark": "可查看系统监控信息，但不可操作",
 *         "createTime": 1515484321000,
 *         "modifyTime": 1520420733000
 *     }, {
 *         "roleId": 25,
 *         "roleName": "用户查看",
 *         "remark": "查看用户，无相应操作权限",
 *         "createTime": 1515484590000,
 *         "modifyTime": null
 *     }, {
 *         "roleId": 63,
 *         "roleName": "影院工作者",
 *         "remark": "可查看影视信息",
 *         "createTime": 1517878108000,
 *         "modifyTime": 1520420726000
 *     }, {
 *         "roleId": 64,
 *         "roleName": "天气预报员",
 *         "remark": "可查看天气预报信息",
 *         "createTime": 1519692424000,
 *         "modifyTime": null
 *     }, {
 *         "roleId": 65,
 *         "roleName": "文章审核",
 *         "remark": "文章类",
 *         "createTime": 1519692481000,
 *         "modifyTime": 1520911234000
 *     }]
 *     }
 * <br>
 *
 * @author 16033
 */
public class JsonTest {


    /**
     * total : 9
     * rows : [{"roleId":1,"roleName":"管理员","remark":"管理员","createTime":1514362991000,"modifyTime":1519459305000},{"roleId":2,"roleName":"测试账号","remark":"测试账号","createTime":1514363109000,"modifyTime":1516669871000},{"roleId":3,"roleName":"注册账户","remark":"注册账户，只可查看，不可操作","createTime":1514534415000,"modifyTime":1519464825000},{"roleId":23,"roleName":"用户管理员","remark":"负责用户的增删改操作","createTime":1515483161000,"modifyTime":null},{"roleId":24,"roleName":"系统监控员","remark":"可查看系统监控信息，但不可操作","createTime":1515484321000,"modifyTime":1520420733000},{"roleId":25,"roleName":"用户查看","remark":"查看用户，无相应操作权限","createTime":1515484590000,"modifyTime":null},{"roleId":63,"roleName":"影院工作者","remark":"可查看影视信息","createTime":1517878108000,"modifyTime":1520420726000},{"roleId":64,"roleName":"天气预报员","remark":"可查看天气预报信息","createTime":1519692424000,"modifyTime":null},{"roleId":65,"roleName":"文章审核","remark":"文章类","createTime":1519692481000,"modifyTime":1520911234000}]
     */

    private int total;
    private List<RowsBean> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * roleId : 1
         * roleName : 管理员
         * remark : 管理员
         * createTime : 1514362991000
         * modifyTime : 1519459305000
         */

        private int roleId;
        private String roleName;
        private String remark;
        private long createTime;
        private long modifyTime;

        public int getRoleId() {
            return roleId;
        }

        public void setRoleId(int roleId) {
            this.roleId = roleId;
        }

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(long modifyTime) {
            this.modifyTime = modifyTime;
        }
    }
}
