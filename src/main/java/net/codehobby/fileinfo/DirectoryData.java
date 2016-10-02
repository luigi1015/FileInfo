package net.codehobby.fileinfo;

import java.util.ArrayList;

/**
* Directory DAO class.
*
* @author Jeff
*/
public class DirectoryData
{
	private String filename = ""; 
	private List<FileData> files;

	/**
	 * Constructor with no arguments.
	 */
	public DirectoryData()
	{
		files = new
	}

	/**
	 * Returns the filename of the directory.
	 * 
	 * @return The filename
	 */
	public String getFilename()
	{
		return filename;
	}

	/**
	 * Sets the filename of the directory.
	 * 
	 * @param newFilename The new filename value.
	 */
	public void setFilename( String newFilename )
	{
		filename = newFilename;
	}

	/**
	 * Returns the number of files in the directory.
	 * 
	 * @return The number of files
	 */
	public int getNumberOfFiles()
	{
		return files.size();
	}

	/**
	 * Returns whether the directory is empty.
	 * 
	 * @return The true if the directory is empty, false otherwise
	 */
	public boolean isEmpty()
	{
		return files.isEmpty();
	}

	/**
	 * Returns a list of Files in the directory.
	 * 
	 * @return The list of files in the directory.
	 */
	public boolean getFiles()
	{
		return files;
	}

	/**
	 * Adds a file to the directory.
	 * 
	 * @param newFile The file to add.
	 */
	public void addFile( FileData newFile )
	{
		files.add( newFile );
	}

	/**
	 * Removes a file to the directory.
	 * 
	 * @param newFile The file to delete.
	 * @return True if the file existed and was deleted, false otherwise.
	 */
	public void removeFile( FileData fileToRemove )
	{
		return files.remove( fileToRemove );
	}
}
