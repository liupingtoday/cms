package cn.js.today.cms.repository;

import cn.js.today.cms.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}
