package com.jk.model.whn;

import java.io.Serializable;
//这是一个询图单
public class PollingFigureSingle implements Serializable {
    private String pollingFigureSingleID;//询图单ID

    private String startDate;//开始日期

    private String undefiendStartDate;//自定义开始日期

    private String abortDate;//截止日期

    private String releaseDate;//结果公布日期

    private String contact;//联系人

    private String contactPhone;//联系电话

    private String email;//邮箱

    private String note;//备注

    private String attachment;//附件

    @Override
    public String toString() {
        return "PollingFigureSingle{" +
                "pollingFigureSingleID=" + pollingFigureSingleID +
                ", startDate='" + startDate + '\'' +
                ", undefiendStartDate='" + undefiendStartDate + '\'' +
                ", abortDate='" + abortDate + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", contact='" + contact + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", email='" + email + '\'' +
                ", note='" + note + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    public String getPollingFigureSingleID() {
        return pollingFigureSingleID;
    }

    public void setPollingFigureSingleID(String pollingFigureSingleID) {
        this.pollingFigureSingleID = pollingFigureSingleID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getUndefiendStartDate() {
        return undefiendStartDate;
    }

    public void setUndefiendStartDate(String undefiendStartDate) {
        this.undefiendStartDate = undefiendStartDate;
    }

    public String getAbortDate() {
        return abortDate;
    }

    public void setAbortDate(String abortDate) {
        this.abortDate = abortDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
