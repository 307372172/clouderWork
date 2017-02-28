package com.yagout.defense.biz.bean;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class UserLogBean implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.event_time
     *
     * @mbggenerated
     */
    private Date eventTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.event_type
     *
     * @mbggenerated
     */
    private Integer eventType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.event_result
     *
     * @mbggenerated
     */
    private Integer eventResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.event_verbose
     *
     * @mbggenerated
     */
    private String eventVerbose;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_log.log_exception
     *
     * @mbggenerated
     */
    private String logException;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.id
     *
     * @return the value of user_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.id
     *
     * @param id the value for user_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.user_id
     *
     * @return the value of user_log.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.user_id
     *
     * @param userId the value for user_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.event_time
     *
     * @return the value of user_log.event_time
     *
     * @mbggenerated
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.event_time
     *
     * @param eventTime the value for user_log.event_time
     *
     * @mbggenerated
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.event_type
     *
     * @return the value of user_log.event_type
     *
     * @mbggenerated
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.event_type
     *
     * @param eventType the value for user_log.event_type
     *
     * @mbggenerated
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.event_result
     *
     * @return the value of user_log.event_result
     *
     * @mbggenerated
     */
    public Integer getEventResult() {
        return eventResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.event_result
     *
     * @param eventResult the value for user_log.event_result
     *
     * @mbggenerated
     */
    public void setEventResult(Integer eventResult) {
        this.eventResult = eventResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.event_verbose
     *
     * @return the value of user_log.event_verbose
     *
     * @mbggenerated
     */
    public String getEventVerbose() {
        return eventVerbose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.event_verbose
     *
     * @param eventVerbose the value for user_log.event_verbose
     *
     * @mbggenerated
     */
    public void setEventVerbose(String eventVerbose) {
        this.eventVerbose = eventVerbose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_log.log_exception
     *
     * @return the value of user_log.log_exception
     *
     * @mbggenerated
     */
    public String getLogException() {
        return logException;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_log.log_exception
     *
     * @param logException the value for user_log.log_exception
     *
     * @mbggenerated
     */
    public void setLogException(String logException) {
        this.logException = logException;
    }
}