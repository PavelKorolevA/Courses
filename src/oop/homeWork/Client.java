package oop.homeWork;

import interfaces.homeWork.Server;

public class Client {

    public void order(Server server, String dish) {
        server.bringTheOrder(dish);
    }

}
