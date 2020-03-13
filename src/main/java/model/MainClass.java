package model;

import java.util.*;

import controller.Controller;
import view.View;


public class MainClass {
	
public static void main(String[] args) throws MyException {
		
		Model m=new Model();
		View v=new View(m);
		Controller c= new Controller(m, v);

}
}
