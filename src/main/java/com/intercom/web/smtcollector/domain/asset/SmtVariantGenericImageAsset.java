package com.intercom.web.smtcollector.domain.asset;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.variant.SmtVariant;
import java.net.URL;
import java.util.Date;
import org.apache.commons.lang3.Validate;

@JacksonXmlRootElement(localName = "genericImageAsset")
@JsonPropertyOrder({
	"name",
	"mimeType",
	"size",
	"displaySize",
	"source",
	"width",
	"height",
	"originalUrl",
	"thumbnailUrl",
	"previewUrl",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser"})
public class SmtVariantGenericImageAsset extends SmtImageAsset {

	private SmtVariant variant;

	protected SmtVariantGenericImageAsset() {
		super();
	}

	public SmtVariantGenericImageAsset(SmtAssetName name, SmtVariant variant, String mimeType, long size, URL originalUrl, URL thumbnailUrl, URL previewUrl, Source source, int width, int height, Date creationDate, String creationUser) {
		super(name, mimeType, size, originalUrl, thumbnailUrl, previewUrl, source, width, height, creationDate, creationUser);
		Validate.notNull(variant, "The \"variant\" parameter can not be null");
		this.variant = variant;
	}

	@JsonIgnore
	public SmtVariant getVariant() {
		return variant;
	}

	public void setVariant(SmtVariant variant) {
		this.variant = variant;
	}

}
