/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author EricMcEvoy
 * Test Object for display session variables in JSP iteratively 
 */
public class TestObject {
    private final String testAttribute;
    
    public TestObject(String name){
        this.testAttribute = name;
    }
    
    public String getName(){
        return this.testAttribute;
    }
}
