import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

  WaterBottle waterbottle;

  @Before
  public void before(){ waterbottle = new WaterBottle(); }

  @Test
  public void initialVolumeIs100(){ assertEquals(100, waterbottle.getVolume()); }

  @Test
  public void volume90AfterDrink(){
    waterbottle.drink();
    assertEquals(90, waterbottle.getVolume());
  }

  @Test
  public void volume0WhenEmpty(){
    waterbottle.empty();
    assertEquals(0, waterbottle.getVolume());
  }

  @Test
  public void volume100AfterRefill(){
    waterbottle.drink();
    waterbottle.drink();
    waterbottle.fill();
    assertEquals(100, waterbottle.getVolume());
  }

}
