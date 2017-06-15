package jp.co.comster.web.model;

import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "actor")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	public String name;

	public Integer height;

	public String blood;

	public Date birthday;

	@Column(name = "birthplace_id")
	public Integer birthplaceId;

	@Column(name = "update_at")
	public Date updateAt;

}
