package com.example.demo.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
    public class MongoDbConfig extends AbstractMongoClientConfiguration {

        @Override
        protected String getDatabaseName() {
            return "cluster0";
        }

        @Override
        public MongoClient mongoClient() {
            ConnectionString connectionString = new ConnectionString("mongodb+srv://fabiofrt:fabiofrt@cluster0.7i8oipr.mongodb.net/?retryWrites=true&w=majority");
            MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                    .applyConnectionString(connectionString)
                    .build();

            return MongoClients.create(mongoClientSettings);
        }

        @Override
        public Collection getMappingBasePackages() {
            return Collections.singleton("com.example.demo");
        }
    }

