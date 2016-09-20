package net.codehobby.fileinfo;

import java.io.File;

/**
* Class to get file information.
*
* @author Jeff
*/
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

	/**
	 * Gets some data from the directory referred to by the provided filename.
	 * 
	 * @param filename The name of the directory.
	 * @return 
	 */
	public static void getDirectoryInfo( String filename )
	{
		File folder = new File( filename );
		File[] folderFiles = folder.listFiles();

		for( File file : folderFiles )
		{
			if( file.isFile() )
			{
				System.out.println( "File: " + file.getName() );
			}
			else if( file.isDirectory() )
			{
				System.out.println( "Directory: " + file.getName() );
			}
		}
	}
}
