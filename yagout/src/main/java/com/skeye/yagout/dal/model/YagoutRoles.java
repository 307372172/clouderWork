package com.skeye.yagout.dal.model;

public class YagoutRoles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yagout_roles.role_no
     *
     * @mbggenerated
     */
    private Integer roleNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yagout_roles.role_name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yagout_roles.role_desc
     *
     * @mbggenerated
     */
    private String roleDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yagout_roles.role_no
     *
     * @return the value of yagout_roles.role_no
     *
     * @mbggenerated
     */
    public Integer getRoleNo() {
        return roleNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yagout_roles.role_no
     *
     * @param roleNo the value for yagout_roles.role_no
     *
     * @mbggenerated
     */
    public void setRoleNo(Integer roleNo) {
        this.roleNo = roleNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yagout_roles.role_name
     *
     * @return the value of yagout_roles.role_name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yagout_roles.role_name
     *
     * @param roleName the value for yagout_roles.role_name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yagout_roles.role_desc
     *
     * @return the value of yagout_roles.role_desc
     *
     * @mbggenerated
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yagout_roles.role_desc
     *
     * @param roleDesc the value for yagout_roles.role_desc
     *
     * @mbggenerated
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}