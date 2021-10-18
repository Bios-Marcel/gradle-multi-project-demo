package com.isp.kkg.demo;

import com.isp.kkg.client.ClientHello;
import com.isp.kkg.server.ServerHello;
import com.isp.kkg.shared.Shared;

public class DemoA {
  public static void main(String[] args) {
    System.out.println("A:");
    System.out.println(ClientHello.hello());
    System.out.println(ServerHello.hello());
    System.out.println("Shared: " + Shared.getWord());
  }
}
