package net.codehobby.fileinfo;

import java.io.File;

public class FileInfo
{
	/**
	 * Gets some file data from the file referred to by the provided filename.
	 * 
	 * @param filename The name of the file.
	 * @return A FileData class with data of the file.
	 */
	public static FileData getFileInfo( String filename )
	{
		File file = null;
		FileData data = new FileData();

		try
		{
			file = new File( filename );
			data.setFilename( file.getAbsolutePath() );
			data.setFileSize( file.length() );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}

		return data;
	}
}
