package com.yyquan.zkzx.entity;

import java.io.Serializable;
import java.util.Date;

public class tb_problem implements Serializable  {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.QuestionID
     *
     * @mbg.generated
     */

    private String questionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.ProblemName
     *
     * @mbg.generated
     */

    private String problemname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.ProblemAlias
     *
     * @mbg.generated
     */

    private String problemalias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.ManualOrder
     *
     * @mbg.generated
     */
    private String manualorder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.Phase
     *
     * @mbg.generated
     */
    private Integer phase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.UserID
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.AskTheTime
     *
     * @mbg.generated
     */
    private Date askthetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.IsDelete
     *
     * @mbg.generated
     */
    private String isdelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.ProblemFile
     *
     * @mbg.generated
     */
    private String problemfile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.QuestionID
     *
     * @return the value of tb_problem.QuestionID
     *
     * @mbg.generated
     */
	 
	 /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.ProblemContent
     *
     * @mbg.generated
     */
    private String problemcontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_problem.Conclusion
     *
     * @mbg.generated
     */
    private String conclusion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.ProblemContent
     *
     * @return the value of tb_problem.ProblemContent
     *
     * @mbg.generated
     */ 
    public String getProblemcontent() {
        return problemcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.ProblemContent
     *
     * @param problemcontent the value for tb_problem.ProblemContent
     *
     * @mbg.generated
     */
    public void setProblemcontent(String problemcontent) {
        this.problemcontent = problemcontent == null ? null : problemcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.Conclusion
     *
     * @return the value of tb_problem.Conclusion
     *
     * @mbg.generated
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.Conclusion
     *
     * @param conclusion the value for tb_problem.Conclusion
     *
     * @mbg.generated
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }
    public String getQuestionid() {
        return questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.QuestionID
     *
     * @param questionid the value for tb_problem.QuestionID
     *
     * @mbg.generated
     */
    public void setQuestionid(String questionid) {
        this.questionid = questionid == null ? null : questionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.ProblemName
     *
     * @return the value of tb_problem.ProblemName
     *
     * @mbg.generated
     */
    public String getProblemname() {
        return problemname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.ProblemName
     *
     * @param problemname the value for tb_problem.ProblemName
     *
     * @mbg.generated
     */
    public void setProblemname(String problemname) {
        this.problemname = problemname == null ? null : problemname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.ProblemAlias
     *
     * @return the value of tb_problem.ProblemAlias
     *
     * @mbg.generated
     */
    public String getProblemalias() {
        return problemalias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.ProblemAlias
     *
     * @param problemalias the value for tb_problem.ProblemAlias
     *
     * @mbg.generated
     */
    public void setProblemalias(String problemalias) {
        this.problemalias = problemalias == null ? null : problemalias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.ManualOrder
     *
     * @return the value of tb_problem.ManualOrder
     *
     * @mbg.generated
     */
    public String getManualorder() {
        return manualorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.ManualOrder
     *
     * @param manualorder the value for tb_problem.ManualOrder
     *
     * @mbg.generated
     */
    public void setManualorder(String manualorder) {
        this.manualorder = manualorder == null ? null : manualorder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.Phase
     *
     * @return the value of tb_problem.Phase
     *
     * @mbg.generated
     */
    public Integer getPhase() {
        return phase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.Phase
     *
     * @param phase the value for tb_problem.Phase
     *
     * @mbg.generated
     */
    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.UserID
     *
     * @return the value of tb_problem.UserID
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.UserID
     *
     * @param userid the value for tb_problem.UserID
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.AskTheTime
     *
     * @return the value of tb_problem.AskTheTime
     *
     * @mbg.generated
     */
    public Date getAskthetime() {
        return askthetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.AskTheTime
     *
     * @param askthetime the value for tb_problem.AskTheTime
     *
     * @mbg.generated
     */
    public void setAskthetime(Date askthetime) {
        this.askthetime = askthetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.IsDelete
     *
     * @return the value of tb_problem.IsDelete
     *
     * @mbg.generated
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.IsDelete
     *
     * @param isdelete the value for tb_problem.IsDelete
     *
     * @mbg.generated
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_problem.ProblemFile
     *
     * @return the value of tb_problem.ProblemFile
     *
     * @mbg.generated
     */
    public String getProblemfile() {
        return problemfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_problem.ProblemFile
     *
     * @param problemfile the value for tb_problem.ProblemFile
     *
     * @mbg.generated
     */
    public void setProblemfile(String problemfile) {
        this.problemfile = problemfile;
    }
}