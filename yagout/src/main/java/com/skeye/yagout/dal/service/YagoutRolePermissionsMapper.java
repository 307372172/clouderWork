package com.skeye.yagout.dal.service;

import com.skeye.yagout.dal.model.YagoutRolePermissionsExample;
import com.skeye.yagout.dal.model.YagoutRolePermissionsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YagoutRolePermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int countByExample(YagoutRolePermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int deleteByExample(YagoutRolePermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(YagoutRolePermissionsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int insert(YagoutRolePermissionsKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int insertSelective(YagoutRolePermissionsKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    List<YagoutRolePermissionsKey> selectByExample(YagoutRolePermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YagoutRolePermissionsKey record, @Param("example") YagoutRolePermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_role_permissions
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YagoutRolePermissionsKey record, @Param("example") YagoutRolePermissionsExample example);
}