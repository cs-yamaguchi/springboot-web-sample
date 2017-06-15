package jp.co.comster.web.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import jp.co.comster.web.model.Actor;
import jp.co.comster.web.model.ActorWithPref;

@ConfigAutowireable
@Dao
public interface ActorRepository {

	@Insert
	@Transactional
	int insert(Actor entity);

	@Update
	@Transactional
	int update(Actor entity);

	@Delete
	@Transactional
	int delete(Actor entity);

	@Select
	List<ActorWithPref> findActors(String name);

	@Select
	List<Actor> selectAll();

	@Select
	Actor selectById(Integer id);

	@Select
	List<ActorWithPref> selectAllWithPref();

	@Select
	ActorWithPref selectByIdWithPref(Integer id);

}
