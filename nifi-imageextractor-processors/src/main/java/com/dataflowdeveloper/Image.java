package com.dataflowdeveloper;

import java.io.Serializable;

/***
 * 
 * @author tspann
 *
 */
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -174238451874437160L;
	private String imgSrc;

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Image [imgSrc=");
		builder.append(imgSrc);
		builder.append("]");
		return builder.toString();
	}

	public Image(String imgSrc) {
		super();
		this.imgSrc = imgSrc;
	}

	public Image() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imgSrc == null) ? 0 : imgSrc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (imgSrc == null) {
			if (other.imgSrc != null)
				return false;
		} else if (!imgSrc.equals(other.imgSrc))
			return false;
		return true;
	}
	

}