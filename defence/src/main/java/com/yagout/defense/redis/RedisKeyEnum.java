package com.yagout.defense.redis;

/**
 * Created by Skeyedu on 2016/11/16.
 */
public enum RedisKeyEnum {

    USER_PERMS("userPerms", "用户权限"),
    USER_ROLES("userRoles", "用户角色"),
    USER_SESSION("userSession", "用户信息");

    private RedisKeyEnum(String code, String msg) {
        this.msg=msg;
        this.code = code;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 根据编码查找枚举
     */
    public static RedisKeyEnum find(String code) {
        for (RedisKeyEnum frs : RedisKeyEnum.values()) {
            if (frs.getCode().equals(code)) {
                return frs;
            }
        }
        return null;
    }
}
