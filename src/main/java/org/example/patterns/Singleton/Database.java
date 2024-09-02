package org.example.patterns.Singleton;

public class Database {
    private static Database instance;
    private Database() {};
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
            System.out.println("Database created");
        }
        else {
            System.out.println("Database already exists");
            return instance;
        }
        return instance;
    }
}
