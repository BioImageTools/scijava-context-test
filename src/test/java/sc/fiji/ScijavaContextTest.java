package sc.fiji;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ScijavaContextTest
{
	@Test
	void testContext()
	{
		for ( int i = 0; i < 100; i++ )
			try (org.scijava.Context context = new org.scijava.Context())
			{

			}
		assertTrue( true, "Successfully created and closed 500 contexts without running out of resources." );
	}
}
