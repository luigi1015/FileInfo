package net.codehobby.fileinfo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FileDataTest
{
	@Test public void testGetFilenameMethod()
	{
		String filename = "testfile";
		FileData fd = new FileData();
		fd.setFilename( filename );
		assertTrue( "getFilename should return the filename", filename.equals(fd.getFilename()) );
	}
}
