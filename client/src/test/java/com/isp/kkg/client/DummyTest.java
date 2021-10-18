package com.isp.kkg.client;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.isp.kkg.shared.Shared;
import org.junit.jupiter.api.Test;

class DummyTest {
  @Test
  void testGetMessage() {
    assertFalse(Shared.getWord().isEmpty());
  }
}
