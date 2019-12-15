package cn.js.today.cms.repository;

import cn.js.today.cms.domain.ArticleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ArticleDataRepository extends JpaRepository<ArticleData, String> {

}
