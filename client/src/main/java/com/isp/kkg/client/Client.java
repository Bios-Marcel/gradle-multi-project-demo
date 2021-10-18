package com.isp.kkg.client;

import com.isp.kkg.shared.Shared;
import com.google.common.base.Strings;
import java.util.List;

/**
 * @author msc
 * @since 11
 */
public class Client {
  public static void main(String[] args) {
    System.out.println(ClientHello.hello());
    System.out.println("Shared says: " + Shared.getWord());
    System.out.println(Strings.repeat("X", 10));
    List
    .of("a","b","c")
    .stream()
    .filter(a -> !a.isEmpty())
    .map(a -> a);
  }
}
