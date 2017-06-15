package jp.co.comster.web.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import jp.co.comster.web.model.Prefecture;

@ConfigAutowireable
@Dao
public interface PrefectureRepository {

	@Insert
	@Transactional
	int insert(Prefecture entity);

	@Update
	@Transactional
	int update(Prefecture entity);

	@Delete
	@Transactional
	int delete(Prefecture entity);

	@Select
	List<Prefecture> selectAll();

}
