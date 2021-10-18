package com.isp.kkg.server;

import com.isp.kkg.shared.Shared;

public class Server {
  public static void main(String[] args) {
    System.out.println(ServerHello.hello());
    System.out.println("Shared says: " + Shared.getWord());
  }
}
