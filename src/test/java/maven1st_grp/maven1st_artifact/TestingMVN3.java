package maven1st_grp.maven1st_artifact;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestingMVN3 {
@Test
public void sum() {
	System.out.println("Sum");
	int a=10+20;
	Assert.assertEquals(30, a);
}
@Test
public void diff() {
	System.out.println("diff");
	int a=20-10;
	Assert.assertEquals(10, a);
}
@Test
public void mul() {
	System.out.println("mull");
	int a=10*20;
	Assert.assertEquals(200, a);
}
@Test
public void div() {
	System.out.println("div");
	int a=2/1;
	Assert.assertEquals(2, a);
}
}
