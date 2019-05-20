package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Register_page;

public class Register_test {

	@Test
	public void testregister_page() {
		Register_page obj = new Register_page();
		assertEquals(true,obj.calltoOpenHome("newuser", "get626", "8757566", "1234","abc@yaho.com"));
	}
	@Test
	public void testhome() {
		Home obj = new Home();
		assertEquals(obj.f.isVisible(),true);
	}
	@Test
	public void testlanding_page() {
		Landing_page obj = new Landing_page();

		assertEquals(obj.jf.isVisible(),true);
		assertEquals(obj.jf.isVisible(),true);
		
	}
	@Test
	public void testlogin_page() {
		Login_page obj = new Login_page();
		assertEquals(true,obj.validateData("user", "pass"));

		
	}

}
