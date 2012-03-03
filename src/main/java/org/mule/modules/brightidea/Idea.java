/**
 * Mule BrightIdea Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.brightidea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IDEA")
public class Idea {

    @XmlElement(name = "ID")
    private String id;
    @XmlElement(name = "CODE")
    private String code;
    @XmlElement(name = "CAMPAIGN_ID")
    private String campaignId;
    @XmlElement(name = "SCORE")
    private String score;
    @XmlElement(name = "DESCRIPTION")
    private String description;
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement(name = "DATE")
    private Date date;
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement(name = "DATE_MODIFIED")
    private Date dateModified;
    @XmlElement(name = "MEMBER_ID")
    private String memberId;
    @XmlElement(name = "MEMBER_NAME")
    private String memberName;
    @XmlElement(name = "CATEGORY_ID")
    private String categoryId;
    @XmlElement(name = "STATUS_ID")
    private String statusId;
    @XmlElement(name = "ANONYMOUS")
    private Boolean anonymous;
    @XmlElement(name = "VISIBLE")
    private Boolean visible;
    @XmlElement(name = "URL")
    private String url;
    @XmlElement(name = "TITLE")
    private String title;

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "anonymous=" + anonymous +
                ", id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", campaignId='" + campaignId + '\'' +
                ", score='" + score + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", dateModified=" + dateModified +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", statusId='" + statusId + '\'' +
                ", visible=" + visible +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}