package osu.cs362.URLValidator;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import static org.mockito.Mockito.*;

public class DomainValidatorTest {

  @Test
  public void Test1() {
    DomainValidator dv = mock(DomainValidator.class);
    DomainValidator domv = dv.getInstance(true);
    String localDomain = "127.0.0.1";
    assertTrue(domv.isValid(localDomain) == true);
  }

  @Test
  public void Test2() {
    DomainValidator dv = mock(DomainValidator.class);
    DomainValidator domv = dv.getInstance(false);
    String localDomain = "127.0.0.1";
    assertTrue(domv.isValid(localDomain) == false);
  }

  
}
