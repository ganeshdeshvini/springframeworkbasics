package org.ganesh.springframework.profileexamplewithdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseConnectionController {
    @Autowired
    private DatabaseConnection databaseConnection;

    @GetMapping("db/health")
    String getConnectedDatabase() {
        return databaseConnection.connect();
    }
}
