package com.choe.practice.boot.booya.entity.mysql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserWidIsNull() {
            addCriterion("user_wid is null");
            return (Criteria) this;
        }

        public Criteria andUserWidIsNotNull() {
            addCriterion("user_wid is not null");
            return (Criteria) this;
        }

        public Criteria andUserWidEqualTo(Long value) {
            addCriterion("user_wid =", value, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidNotEqualTo(Long value) {
            addCriterion("user_wid <>", value, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidGreaterThan(Long value) {
            addCriterion("user_wid >", value, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidGreaterThanOrEqualTo(Long value) {
            addCriterion("user_wid >=", value, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidLessThan(Long value) {
            addCriterion("user_wid <", value, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidLessThanOrEqualTo(Long value) {
            addCriterion("user_wid <=", value, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidIn(List<Long> values) {
            addCriterion("user_wid in", values, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidNotIn(List<Long> values) {
            addCriterion("user_wid not in", values, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidBetween(Long value1, Long value2) {
            addCriterion("user_wid between", value1, value2, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserWidNotBetween(Long value1, Long value2) {
            addCriterion("user_wid not between", value1, value2, "userWid");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNull() {
            addCriterion("leave_type is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNotNull() {
            addCriterion("leave_type is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeEqualTo(String value) {
            addCriterion("leave_type =", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotEqualTo(String value) {
            addCriterion("leave_type <>", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThan(String value) {
            addCriterion("leave_type >", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("leave_type >=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThan(String value) {
            addCriterion("leave_type <", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThanOrEqualTo(String value) {
            addCriterion("leave_type <=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLike(String value) {
            addCriterion("leave_type like", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotLike(String value) {
            addCriterion("leave_type not like", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIn(List<String> values) {
            addCriterion("leave_type in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotIn(List<String> values) {
            addCriterion("leave_type not in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeBetween(String value1, String value2) {
            addCriterion("leave_type between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotBetween(String value1, String value2) {
            addCriterion("leave_type not between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNull() {
            addCriterion("is_out is null");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNotNull() {
            addCriterion("is_out is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutEqualTo(Boolean value) {
            addCriterion("is_out =", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotEqualTo(Boolean value) {
            addCriterion("is_out <>", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThan(Boolean value) {
            addCriterion("is_out >", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_out >=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThan(Boolean value) {
            addCriterion("is_out <", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThanOrEqualTo(Boolean value) {
            addCriterion("is_out <=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutIn(List<Boolean> values) {
            addCriterion("is_out in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotIn(List<Boolean> values) {
            addCriterion("is_out not in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutBetween(Boolean value1, Boolean value2) {
            addCriterion("is_out between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_out not between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileIsNull() {
            addCriterion("urgency_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileIsNotNull() {
            addCriterion("urgency_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileEqualTo(String value) {
            addCriterion("urgency_mobile =", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileNotEqualTo(String value) {
            addCriterion("urgency_mobile <>", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileGreaterThan(String value) {
            addCriterion("urgency_mobile >", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileGreaterThanOrEqualTo(String value) {
            addCriterion("urgency_mobile >=", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileLessThan(String value) {
            addCriterion("urgency_mobile <", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileLessThanOrEqualTo(String value) {
            addCriterion("urgency_mobile <=", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileLike(String value) {
            addCriterion("urgency_mobile like", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileNotLike(String value) {
            addCriterion("urgency_mobile not like", value, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileIn(List<String> values) {
            addCriterion("urgency_mobile in", values, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileNotIn(List<String> values) {
            addCriterion("urgency_mobile not in", values, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileBetween(String value1, String value2) {
            addCriterion("urgency_mobile between", value1, value2, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andUrgencyMobileNotBetween(String value1, String value2) {
            addCriterion("urgency_mobile not between", value1, value2, "urgencyMobile");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysIsNull() {
            addCriterion("leave_days is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysIsNotNull() {
            addCriterion("leave_days is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysEqualTo(Integer value) {
            addCriterion("leave_days =", value, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysNotEqualTo(Integer value) {
            addCriterion("leave_days <>", value, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysGreaterThan(Integer value) {
            addCriterion("leave_days >", value, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_days >=", value, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysLessThan(Integer value) {
            addCriterion("leave_days <", value, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysLessThanOrEqualTo(Integer value) {
            addCriterion("leave_days <=", value, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysIn(List<Integer> values) {
            addCriterion("leave_days in", values, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysNotIn(List<Integer> values) {
            addCriterion("leave_days not in", values, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysBetween(Integer value1, Integer value2) {
            addCriterion("leave_days between", value1, value2, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andLeaveDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_days not between", value1, value2, "leaveDays");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNull() {
            addCriterion("approver_id is null");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNotNull() {
            addCriterion("approver_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproverIdEqualTo(String value) {
            addCriterion("approver_id =", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotEqualTo(String value) {
            addCriterion("approver_id <>", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThan(String value) {
            addCriterion("approver_id >", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThanOrEqualTo(String value) {
            addCriterion("approver_id >=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThan(String value) {
            addCriterion("approver_id <", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThanOrEqualTo(String value) {
            addCriterion("approver_id <=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLike(String value) {
            addCriterion("approver_id like", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotLike(String value) {
            addCriterion("approver_id not like", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdIn(List<String> values) {
            addCriterion("approver_id in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotIn(List<String> values) {
            addCriterion("approver_id not in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdBetween(String value1, String value2) {
            addCriterion("approver_id between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotBetween(String value1, String value2) {
            addCriterion("approver_id not between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverWidIsNull() {
            addCriterion("approver_wid is null");
            return (Criteria) this;
        }

        public Criteria andApproverWidIsNotNull() {
            addCriterion("approver_wid is not null");
            return (Criteria) this;
        }

        public Criteria andApproverWidEqualTo(Long value) {
            addCriterion("approver_wid =", value, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidNotEqualTo(Long value) {
            addCriterion("approver_wid <>", value, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidGreaterThan(Long value) {
            addCriterion("approver_wid >", value, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidGreaterThanOrEqualTo(Long value) {
            addCriterion("approver_wid >=", value, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidLessThan(Long value) {
            addCriterion("approver_wid <", value, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidLessThanOrEqualTo(Long value) {
            addCriterion("approver_wid <=", value, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidIn(List<Long> values) {
            addCriterion("approver_wid in", values, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidNotIn(List<Long> values) {
            addCriterion("approver_wid not in", values, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidBetween(Long value1, Long value2) {
            addCriterion("approver_wid between", value1, value2, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverWidNotBetween(Long value1, Long value2) {
            addCriterion("approver_wid not between", value1, value2, "approverWid");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNull() {
            addCriterion("approver_name is null");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNotNull() {
            addCriterion("approver_name is not null");
            return (Criteria) this;
        }

        public Criteria andApproverNameEqualTo(String value) {
            addCriterion("approver_name =", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotEqualTo(String value) {
            addCriterion("approver_name <>", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThan(String value) {
            addCriterion("approver_name >", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThanOrEqualTo(String value) {
            addCriterion("approver_name >=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThan(String value) {
            addCriterion("approver_name <", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThanOrEqualTo(String value) {
            addCriterion("approver_name <=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLike(String value) {
            addCriterion("approver_name like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotLike(String value) {
            addCriterion("approver_name not like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameIn(List<String> values) {
            addCriterion("approver_name in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotIn(List<String> values) {
            addCriterion("approver_name not in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameBetween(String value1, String value2) {
            addCriterion("approver_name between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotBetween(String value1, String value2) {
            addCriterion("approver_name not between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNull() {
            addCriterion("leave_reason is null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNotNull() {
            addCriterion("leave_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonEqualTo(String value) {
            addCriterion("leave_reason =", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotEqualTo(String value) {
            addCriterion("leave_reason <>", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThan(String value) {
            addCriterion("leave_reason >", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("leave_reason >=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThan(String value) {
            addCriterion("leave_reason <", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThanOrEqualTo(String value) {
            addCriterion("leave_reason <=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLike(String value) {
            addCriterion("leave_reason like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotLike(String value) {
            addCriterion("leave_reason not like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIn(List<String> values) {
            addCriterion("leave_reason in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotIn(List<String> values) {
            addCriterion("leave_reason not in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonBetween(String value1, String value2) {
            addCriterion("leave_reason between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotBetween(String value1, String value2) {
            addCriterion("leave_reason not between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionIsNull() {
            addCriterion("approver_opinion is null");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionIsNotNull() {
            addCriterion("approver_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionEqualTo(String value) {
            addCriterion("approver_opinion =", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionNotEqualTo(String value) {
            addCriterion("approver_opinion <>", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionGreaterThan(String value) {
            addCriterion("approver_opinion >", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("approver_opinion >=", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionLessThan(String value) {
            addCriterion("approver_opinion <", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionLessThanOrEqualTo(String value) {
            addCriterion("approver_opinion <=", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionLike(String value) {
            addCriterion("approver_opinion like", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionNotLike(String value) {
            addCriterion("approver_opinion not like", value, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionIn(List<String> values) {
            addCriterion("approver_opinion in", values, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionNotIn(List<String> values) {
            addCriterion("approver_opinion not in", values, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionBetween(String value1, String value2) {
            addCriterion("approver_opinion between", value1, value2, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andApproverOpinionNotBetween(String value1, String value2) {
            addCriterion("approver_opinion not between", value1, value2, "approverOpinion");
            return (Criteria) this;
        }

        public Criteria andReportCommentIsNull() {
            addCriterion("report_comment is null");
            return (Criteria) this;
        }

        public Criteria andReportCommentIsNotNull() {
            addCriterion("report_comment is not null");
            return (Criteria) this;
        }

        public Criteria andReportCommentEqualTo(String value) {
            addCriterion("report_comment =", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotEqualTo(String value) {
            addCriterion("report_comment <>", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentGreaterThan(String value) {
            addCriterion("report_comment >", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentGreaterThanOrEqualTo(String value) {
            addCriterion("report_comment >=", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentLessThan(String value) {
            addCriterion("report_comment <", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentLessThanOrEqualTo(String value) {
            addCriterion("report_comment <=", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentLike(String value) {
            addCriterion("report_comment like", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotLike(String value) {
            addCriterion("report_comment not like", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentIn(List<String> values) {
            addCriterion("report_comment in", values, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotIn(List<String> values) {
            addCriterion("report_comment not in", values, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentBetween(String value1, String value2) {
            addCriterion("report_comment between", value1, value2, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotBetween(String value1, String value2) {
            addCriterion("report_comment not between", value1, value2, "reportComment");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsPressIsNull() {
            addCriterion("is_press is null");
            return (Criteria) this;
        }

        public Criteria andIsPressIsNotNull() {
            addCriterion("is_press is not null");
            return (Criteria) this;
        }

        public Criteria andIsPressEqualTo(Boolean value) {
            addCriterion("is_press =", value, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressNotEqualTo(Boolean value) {
            addCriterion("is_press <>", value, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressGreaterThan(Boolean value) {
            addCriterion("is_press >", value, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_press >=", value, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressLessThan(Boolean value) {
            addCriterion("is_press <", value, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressLessThanOrEqualTo(Boolean value) {
            addCriterion("is_press <=", value, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressIn(List<Boolean> values) {
            addCriterion("is_press in", values, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressNotIn(List<Boolean> values) {
            addCriterion("is_press not in", values, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressBetween(Boolean value1, Boolean value2) {
            addCriterion("is_press between", value1, value2, "isPress");
            return (Criteria) this;
        }

        public Criteria andIsPressNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_press not between", value1, value2, "isPress");
            return (Criteria) this;
        }

        public Criteria andReportLocationIsNull() {
            addCriterion("report_location is null");
            return (Criteria) this;
        }

        public Criteria andReportLocationIsNotNull() {
            addCriterion("report_location is not null");
            return (Criteria) this;
        }

        public Criteria andReportLocationEqualTo(String value) {
            addCriterion("report_location =", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotEqualTo(String value) {
            addCriterion("report_location <>", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationGreaterThan(String value) {
            addCriterion("report_location >", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationGreaterThanOrEqualTo(String value) {
            addCriterion("report_location >=", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationLessThan(String value) {
            addCriterion("report_location <", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationLessThanOrEqualTo(String value) {
            addCriterion("report_location <=", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationLike(String value) {
            addCriterion("report_location like", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotLike(String value) {
            addCriterion("report_location not like", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationIn(List<String> values) {
            addCriterion("report_location in", values, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotIn(List<String> values) {
            addCriterion("report_location not in", values, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationBetween(String value1, String value2) {
            addCriterion("report_location between", value1, value2, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotBetween(String value1, String value2) {
            addCriterion("report_location not between", value1, value2, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}