package com.bytelegend;

import com.github.hcsp.test.helper.JavaASTReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ChallengeTest {
    @Test
    public void test() {
        int a = new Random().nextInt(10);
        Assertions.assertTrue(Challenge.isLeapYear(a * 400));
        Assertions.assertTrue(Challenge.isLeapYear(a * 100 + 4));
        Assertions.assertFalse(Challenge.isLeapYear(a * 400 + 3));
        Assertions.assertFalse(Challenge.isLeapYear(a * 400 + 100));
    }

    @Test
    public void noIfElse() {
        Assertions.assertTrue(
                JavaASTReader.findAll(Challenge.class, com.github.javaparser.ast.stmt.IfStmt.class)
                        .isEmpty());
    }
}
