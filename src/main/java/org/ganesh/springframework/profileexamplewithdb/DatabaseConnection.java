package org.ganesh.springframework.profileexamplewithdb;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public interface DatabaseConnection {
    String connect();
}

@Component
//@Profile("dev")
@Profile({"dev", "default"})
class H2DatabaseConnection implements DatabaseConnection {
    @Override
    public String connect() {
        return "H2 database connected";
    }
}

@Component
@Profile("prod")
class MySqlDatabaseConnection implements DatabaseConnection {
    @Override
    public String connect() {
        return "MySql database connected";
    }
}
