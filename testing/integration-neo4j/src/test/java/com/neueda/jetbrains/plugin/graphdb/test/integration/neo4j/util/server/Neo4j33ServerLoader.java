package com.neueda.jetbrains.plugin.graphdb.test.integration.neo4j.util.server;

import com.neueda.jetbrains.plugin.graphdb.test.database.neo4j.common.Neo4jServer;

public class Neo4j33ServerLoader extends Neo4jServerLoader {

    private static Neo4j33ServerLoader neo4jServer;

    public static synchronized Neo4jServer getInstance() {
        if (neo4jServer == null) {
            neo4jServer = new Neo4j33ServerLoader();
            neo4jServer.start();
        }
        return neo4jServer;
    }

    @Override
    protected String getLibraryPath() {
        return System.getProperty("neo4j-package-3.3");
    }

    @Override
    protected String getNeo4jServerClass() {
        return "com.neueda.jetbrains.plugin.graphdb.test.database.neo4j_3_3.Neo4j33Server";
    }
}
