package condition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class condition_test{
    @Test
    public void TestWhenInputScore_80_ShouldReturn_A() {
        char score = condition.gradeCal(81);
        assertEquals('A', score);
    }

    @Test
    public void TestWhenInputScore_75_ShouldReturn_B() {
        char score = condition.gradeCal(75);
        assertEquals('B', score);
    }

    @Test
    public void TestWhenInputScore_55_ShouldReturn_F() {
        char score = condition.gradeCal(55);
        assertEquals('F', score);
    }

    //Show message my grade
    @Test
    public void TestWhenInputGrade_A_ShouldReturn_MessageForGrade_A() {
        char score = condition.gradeCal(81);
        String grade = condition.showGrade(score);
        assertEquals("Your grade is A", grade);
    }

    @Test
    public void TestWhenInputGrade_B_ShouldReturn_MessageForGrade_B() {
        char score = condition.gradeCal(75);
        String grade = condition.showGrade(score);
        assertEquals("Your grade is B", grade);
    }

    @Test
    public void TestWhenInputGrade_F_ShouldReturn_MessageForGrade_F() {
        char score = condition.gradeCal(55);
        String grade = condition.showGrade(score);
        assertEquals("Your grade is F", grade);
    }

    //Test device status input
    @Test
    public void TestWhenInput_0_ShouldReturnMessage_TurnOff() {
        String status = condition.isStatus(0); 
        assertEquals("Device turn off", status);
    }

    @Test
    public void TestWhenInput_1_ShouldReturnMessage_TurnOn() {
        String status = condition.isStatus(1); 
        assertEquals("Device turn on", status);
    }

}