package jp.co.comster.web.model;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "prefecture")
public class Prefecture {

	@Id
	public Integer id;

	public String name;

}
