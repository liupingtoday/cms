package cn.js.today.cms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple to Introduction
 *
 * @Description: 一句话描述该类的功能
 * @Author: liuping
 * @Since 2019-12-14
 * @UpdateUser: liuping
 * @UpdateDate: 2019-12-14
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
@Entity
@Table(name = "js_cms_article_data")
public class ArticleData {

    private static final long serialVersionUID = 1L;

    @Column(name = "content")
    private String content; 		// 文章内容

    @Column(name = "relation")
    private String relation; 		// 相关文章

    @Column(name = "is_can_comment")
    private String isCanComment; 	// 是否允许评论

    private Extend extend; 			// 扩展字段

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getIsCanComment() {
        return isCanComment;
    }

    public void setIsCanComment(String isCanComment) {
        this.isCanComment = isCanComment;
    }

    public Extend getExtend() {
        return extend;
    }

    public void setExtend(Extend extend) {
        this.extend = extend;
    }
}
