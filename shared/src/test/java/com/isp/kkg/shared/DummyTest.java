package com.isp.kkg.shared;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class DummyTest {
  @Test
  void testGetMessage() {
    assertFalse(Shared.getWord().isEmpty());
  }
}
