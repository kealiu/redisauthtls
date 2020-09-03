package com.mycompany.app;

import redis.clients.jedis.Jedis;

public final class App {
    public static void main(String[] args){
	Jedis jedis = new Jedis("master.of.redis", 6379, true);
	jedis.auth("Token");
        System.out.println(jedis.get("Hello"));
    }
}
