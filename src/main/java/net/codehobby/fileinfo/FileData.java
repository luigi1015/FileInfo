package net.codehobby.fileinfo;

public class FileData
{
	private String filename = ""; 
	private long fileSize = 0;//The size of the file in bytes.

	/**
	 * Constructor with no arguments.
	 */
	public FileData()
	{
	}

	/**
	 * Returns the filename.
	 * 
	 * @return The filename
	 */
	public String getFilename()
	{
		return filename;
	}

	/**
	 * Sets the filename.
	 * 
	 * @param newFilename The nea filename value.
	 */
	public void setFilename( String newFilename )
	{
		filename = newFilename;
	}

	/**
	 * Returns the file size.
	 * 
	 * @return The file size in bytes
	 */
	public long getFileSize()
	{
		return fileSize;
	}

	/**
	 * Sets the file size.
	 * 
	 * @param newFileSize The nea file size in bytes.
	 */
	public void setFileSize( long newFileSize )
	{
		fileSize = newFileSize;
	}
}
