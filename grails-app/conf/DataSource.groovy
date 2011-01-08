dataSource {
    pooled = true
    driverClassName = "org.hsqldb.jdbcDriver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            url = "jdbc:hsqldb:mem:devDB"
        }
    }
    test {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
	    driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost:3306/contactmgrtest"
	    username = "contactmgr_appl"
	    password = "contactmgr_appl"
        }
    }
    production {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
	    driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost:3306/contactmgr"
	    username = "contactmgr_appl"
	    password = "contactmgr_appl"
        }
    }
}
