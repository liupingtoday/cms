package cn.js.today.cms.repository;

import cn.js.today.cms.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {

}
