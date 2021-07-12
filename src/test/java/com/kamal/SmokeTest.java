package com.kamal;

import org.testng.annotations.Test;

import static com.sun.javafx.fxml.expression.Expression.multiply;

public class SmokeTest extends Class02 {

    @Test(groups = {"Smoke"})
    public void testSmoke01(){
        addition(3,5);
    }

    @Test(groups = {"Smoke"})
    public void testSmoke02(){
        multiply(45, 444);
    }

}
