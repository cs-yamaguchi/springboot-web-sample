package jp.co.comster.web.model;

import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class ActorWithPref {

	@Id
	public Integer id;

	public String name;

	public Integer height;

	public String blood;

	public Date birthday;

	@Column(name = "birthplace_id")
	public Integer birthplaceId;

	@Column(name = "update_at")
	public Date updateAt;

	@Column(name = "prefecture_name")
	public String prefectureName;

}
