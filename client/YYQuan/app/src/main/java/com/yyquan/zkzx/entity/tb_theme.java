package com.yyquan.zkzx.entity;

import java.io.Serializable;
import java.util.Date;

public class tb_theme implements Serializable {
    private static final long serialVersionUID = -9031222451922849109L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.SubjectID
     *
     * @mbg.generated
     */
    private String subjectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.QuestionID
     *
     * @mbg.generated
     */
    private String questionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.QuestionName
     *
     * @mbg.generated
     */
    private String questionname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.ManualOrder
     *
     * @mbg.generated
     */
    private String manualorder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.Phase
     *
     * @mbg.generated
     */
    private Integer phase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.SpeechMode
     *
     * @mbg.generated
     */
    private Integer speechmode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.DisintegratorID
     *
     * @mbg.generated
     */
    private String disintegratorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.DisintegratorTime
     *
     * @mbg.generated
     */
    private Date disintegratortime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.IsDelete
     *
     * @mbg.generated
     */
    private String isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.SubjectID
     *
     * @return the value of tb_theme.SubjectID
     *
     * @mbg.generated
     */
	 
	 /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.QuestionContent
     *
     * @mbg.generated
     */
    private String questioncontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_theme.Conclusion
     *
     * @mbg.generated
     */
    private String conclusion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.QuestionContent
     *
     * @return the value of tb_theme.QuestionContent
     *
     * @mbg.generated
     */
    public String getQuestioncontent() {
        return questioncontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.QuestionContent
     *
     * @param questioncontent the value for tb_theme.QuestionContent
     *
     * @mbg.generated
     */
    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent == null ? null : questioncontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.Conclusion
     *
     * @return the value of tb_theme.Conclusion
     *
     * @mbg.generated
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.Conclusion
     *
     * @param conclusion the value for tb_theme.Conclusion
     *
     * @mbg.generated
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }
	
    public String getSubjectid() {
        return subjectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.SubjectID
     *
     * @param subjectid the value for tb_theme.SubjectID
     *
     * @mbg.generated
     */
    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid == null ? null : subjectid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.QuestionID
     *
     * @return the value of tb_theme.QuestionID
     *
     * @mbg.generated
     */
    public String getQuestionid() {
        return questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.QuestionID
     *
     * @param questionid the value for tb_theme.QuestionID
     *
     * @mbg.generated
     */
    public void setQuestionid(String questionid) {
        this.questionid = questionid == null ? null : questionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.QuestionName
     *
     * @return the value of tb_theme.QuestionName
     *
     * @mbg.generated
     */
    public String getQuestionname() {
        return questionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.QuestionName
     *
     * @param questionname the value for tb_theme.QuestionName
     *
     * @mbg.generated
     */
    public void setQuestionname(String questionname) {
        this.questionname = questionname == null ? null : questionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.ManualOrder
     *
     * @return the value of tb_theme.ManualOrder
     *
     * @mbg.generated
     */
    public String getManualorder() {
        return manualorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.ManualOrder
     *
     * @param manualorder the value for tb_theme.ManualOrder
     *
     * @mbg.generated
     */
    public void setManualorder(String manualorder) {
        this.manualorder = manualorder == null ? null : manualorder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.Phase
     *
     * @return the value of tb_theme.Phase
     *
     * @mbg.generated
     */
    public Integer getPhase() {
        return phase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.Phase
     *
     * @param phase the value for tb_theme.Phase
     *
     * @mbg.generated
     */
    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.SpeechMode
     *
     * @return the value of tb_theme.SpeechMode
     *
     * @mbg.generated
     */
    public Integer getSpeechmode() {
        return speechmode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.SpeechMode
     *
     * @param speechmode the value for tb_theme.SpeechMode
     *
     * @mbg.generated
     */
    public void setSpeechmode(Integer speechmode) {
        this.speechmode = speechmode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.DisintegratorID
     *
     * @return the value of tb_theme.DisintegratorID
     *
     * @mbg.generated
     */
    public String getDisintegratorid() {
        return disintegratorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.DisintegratorID
     *
     * @param disintegratorid the value for tb_theme.DisintegratorID
     *
     * @mbg.generated
     */
    public void setDisintegratorid(String disintegratorid) {
        this.disintegratorid = disintegratorid == null ? null : disintegratorid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.DisintegratorTime
     *
     * @return the value of tb_theme.DisintegratorTime
     *
     * @mbg.generated
     */
    public Date getDisintegratortime() {
        return disintegratortime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.DisintegratorTime
     *
     * @param disintegratortime the value for tb_theme.DisintegratorTime
     *
     * @mbg.generated
     */
    public void setDisintegratortime(Date disintegratortime) {
        this.disintegratortime = disintegratortime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_theme.IsDelete
     *
     * @return the value of tb_theme.IsDelete
     *
     * @mbg.generated
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_theme.IsDelete
     *
     * @param isdelete the value for tb_theme.IsDelete
     *
     * @mbg.generated
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }
}