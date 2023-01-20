package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BlogEntity.BlogPojo;

public interface BlogRepository extends JpaRepository<BlogPojo,String> {

}
