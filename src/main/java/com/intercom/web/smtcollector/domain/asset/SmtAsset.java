package com.intercom.web.smtcollector.domain.asset;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class SmtAsset extends SmtAuditableEntity<SmtAsset> implements Comparable<SmtAsset> {

	private SmtAssetName name;
	private String mimeType;
	private long size;
	private URL originalUrl;
	private URL thumbnailUrl;
	private URL previewUrl;
	private static final String PREVIEW_URL_MAX_WIDTH_PREFIX = "maxWidth_";
	private static final String PREVIEW_URL_MAX_HEIGHT_PREFIX = "maxHeight_";
	private static final String PREVIEW_URL_MAX_WIDTH_PATTERN = (PREVIEW_URL_MAX_WIDTH_PREFIX + "([0-9]+)");
	private static final String PREVIEW_URL_MAX_HEIGHT_PATTERN = (PREVIEW_URL_MAX_HEIGHT_PREFIX + "([0-9]+)");

	protected SmtAsset() {
		super();
	}

	public SmtAsset(SmtAssetName name, String mimeType, long size, URL originalUrl, URL thumbnailUrl, URL previewUrl, Date creationDate, String creationUser) {
		super(creationDate, creationUser);
		Validate.notNull(name, "The \"name\" parameter can not be null");
		Validate.notNull(mimeType, "The \"mimeType\" parameter can not be null");
		Validate.notNull(originalUrl, "The \"originalUrl\" parameter can not be null");
		this.name = name;
		this.mimeType = mimeType;
		this.size = size;
		this.originalUrl = originalUrl;
		this.thumbnailUrl = thumbnailUrl;
		this.previewUrl = previewUrl;
	}

	@JsonProperty(value = "name")
	public SmtAssetName getName() {
		return name;
	}

	public void setName(SmtAssetName name) {
		this.name = name;
	}

	@JsonProperty(value = "mimeType")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@JsonProperty(value = "size")
	public long getSize() {
		return size;
	}

	@JsonIgnore
	public String getDisplaySize() {
		return FileUtils.byteCountToDisplaySize(size);
	}

	public void setSize(long size) {
		this.size = size;
	}

	@JsonProperty(value = "originalUrl")
	public URL getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(URL originalUrl) {
		this.originalUrl = originalUrl;
	}

	@JsonProperty(value = "thumbnailUrl")
	public URL getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(URL thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	@JsonProperty(value = "previewUrl")
	public URL getPreviewUrl() {
		return previewUrl;
	}

	public URL getPreviewUrl(int maxWidth, int maxHeight) {
		try {
			return new URL(StringUtils.replacePattern(StringUtils.replacePattern(previewUrl.toString(), PREVIEW_URL_MAX_WIDTH_PATTERN, (PREVIEW_URL_MAX_WIDTH_PREFIX + Integer.toString(maxWidth))), PREVIEW_URL_MAX_HEIGHT_PATTERN, (PREVIEW_URL_MAX_HEIGHT_PREFIX + Integer.toString(maxHeight))));
		} catch(MalformedURLException e) {
			throw new RuntimeException("Could not generate custom preview URL", e);
		}
	}

	public void setPreviewUrl(URL previewUrl) {
		this.previewUrl = previewUrl;
	}

	@Override
	public boolean sameIdentityAs(SmtAsset other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(name, other.name)
		.isEquals();
	}

	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if((object == null) || (getClass() != object.getClass())) {
			return false;
		}
		final SmtAsset other = (SmtAsset) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(name)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("name", name)
		.toString();
	}

	@Override
	public int compareTo(SmtAsset other) {
		return new CompareToBuilder()
		.append(name, other.name)
		.toComparison();
	}

}
