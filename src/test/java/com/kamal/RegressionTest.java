package com.kamal;

import com.kamal.Class01;
import org.testng.annotations.Test;

public class RegressionTest extends Class01 {

    @Test(groups = {"Regression"})
    public void TestRegression01(){
        run();

    }

    @Test(groups = {"Regression"})
    public void  TestRegression02(){
        walk();
    }

}
