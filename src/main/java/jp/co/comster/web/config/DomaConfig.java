package jp.co.comster.web.config;

import javax.sql.DataSource;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.Naming;
import org.seasar.doma.jdbc.UnknownColumnHandler;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.entity.EntityType;
import org.seasar.doma.jdbc.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SingletonConfig
@Component
public class DomaConfig implements Config {

	private static final DomaConfig INSTANCE = new DomaConfig();

	private DomaConfig() {
	}

    @Autowired
    DataSource dataSource;

    @Autowired
    Dialect dialect;

    @Autowired
    Naming naming;

    /**
     * カラムマッピングが存在しない場合に例外とせずに無視する設定
     */
    @Override
    public UnknownColumnHandler getUnknownColumnHandler() {
        return new UnknownColumnHandler() {
            @Override
            public void handle(Query query, EntityType<?> entityType, String unknownColumnName) {
            }
        };
    }

    @Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}

    public static DomaConfig singleton() {
        return INSTANCE;
    }
}
